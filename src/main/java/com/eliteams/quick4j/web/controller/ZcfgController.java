package com.eliteams.quick4j.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.eliteams.quick4j.web.service.ControlUnitService;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.eliteams.quick4j.web.model.Zcfg;
import com.eliteams.quick4j.web.service.ZcfgService;
import com.google.gson.Gson;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

@Controller
@RequestMapping("/Zcfg")
public class ZcfgController {
	@Resource
	private ZcfgService zcfgService;

	 /**  
     * 查询国家级问责
     */  
    @RequestMapping("/list")
    public String zCFGList(HttpServletRequest request,Model model){
    	//System.out.println("1");
		//List<ZCFG> list = zCFGService.listAll();
		//model.addAttribute("zlist", list);
		//request.setAttribute("zlist", list);
		String pageNow = request.getParameter("pageNow");
		model = zcfgService.selectCUByPage(pageNow, model);
		return "zcfg/wzglGJJList";
    }
    
    /*
     * 查询省级问责管理
     */
    @RequestMapping("/listSJ")
    public String listSJ(HttpServletRequest request,Model model){
    	//System.out.println("1");
		//List<ZCFG> list = zCFGService.listAll();
		//model.addAttribute("zlist", list);
		//request.setAttribute("zlist", list);
		String pageNow = request.getParameter("pageNow");
		model = zcfgService.selectSJByPage(pageNow, model);
		return "zcfg/wzglSJList";
    }
    
    
    /**  
     * 查询修改用户信息的id  
     */  
    @RequestMapping("/id") 
    public String updateid(HttpServletRequest request,Integer id,Model model){
    	//System.out.println(id);
    	Zcfg zcfg = zcfgService.selectById(id);
        //request.setAttribute("controlUnit", controlUnit);
        model.addAttribute("zcfg", zcfg);
        return "zcfg/editZcfg";  
    }  
    
    /**  
     * 查询修改政策内容信息的id  
     */  
    @RequestMapping("/show") 
    public String showContent(HttpServletRequest request,Integer id,Model model){
    	//System.out.println(id);
    	Zcfg zcfg = zcfgService.selectById(id);
        //request.setAttribute("controlUnit", controlUnit);
    	System.out.println("\n\n\n"+zcfg.getName()+"\n\n\n\n");
        model.addAttribute("zcfg", zcfg);
        return "zcfg/show";  
    }  
    
    /**  
     * 修改用户信息  
     * @throws ParseException 
     */  
    @RequestMapping("/update")
    @ResponseBody
    public String update(HttpServletRequest request, Zcfg zcfg,Model model) throws ParseException{  
    	zcfg.setPublishDate(request.getParameter("publish").toString());
    	zcfg.setGenerateDate(request.getParameter("generate").toString());
    	zcfg.setContent(request.getParameter("cont"));
    	int result = zcfgService.update(zcfg);          
        model.addAttribute("result", result);
        if(result>0){
      	  return "success";
      	}else{
      	  return "error";
      	}
    }  
      
    /**  
     * 添加用户信息  
     * @throws ParseException 
     */ 
    @RequestMapping("/insert") 
    @ResponseBody
    public String insert(HttpServletRequest request, Zcfg zcfg) throws ParseException{
		zcfg.setPublishDate(request.getParameter("publish").toString());
		zcfg.setGenerateDate();
		//zcfg.setName("txt");
		zcfg.setContent(request.getParameter("myContent"));
		zcfg.setTitle(request.getParameter("title").replace(",", ""));
        String path = request.getSession().getServletContext().getRealPath("upload/zcfg/") + "\\" + request.getParameter("title").replace(",", "") + ".txt";
		if((new File(path)).exists()){
			return "existant";
		}
		
		
    	int result = zcfgService.insert(zcfg);  
        request.setAttribute("result", result);  

        try {  
        	FileWriter fw=new FileWriter(path);
        	if(request.getParameter("myContent")!=null)
	        	fw.write(request.getParameter("myContent"));
        	else 
        		fw.write("");
            fw.flush();
            fw.close();
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        if(result>0){
      	  return "success";
      	}else{
      	  return "error";
      	}
    }  
      
    /**  
     * 删除用户 ，根据id删除  
     */  
    @RequestMapping("/delete")  
    @ResponseBody
    public String delete(HttpServletRequest request,Integer id){  
    	int result=zcfgService.delete(id);  
    	request.setAttribute("result", result);
    	
    	String path = request.getSession().getServletContext().getRealPath("upload/zcfg/") + "\\" + request.getParameter("delfile");
    	File f = new File(path);
		if(f.exists()){
			f.delete();
		}

    	if(result>0){
    	  return "success";
    	}else{
    	  return "error";
    	}
    }  
    /*
     * 根据名字查询数据信息
     */
	@RequestMapping("/select")
	public String select(HttpServletRequest request,String name,Model model){
		try {
			name = URLDecoder.decode(name,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(name);
		Zcfg zcfg = zcfgService.selectByName(name);
		List<Zcfg> list = new ArrayList<Zcfg>();
		list.add(zcfg);
		//System.out.println(zcfg.getName());
		model.addAttribute("zlist", list);
		//request.setAttribute("zlist", list);
		return "zcfg/zcfgList";
	}

    /*
     * 查询课题成果政策法规
     */
    @RequestMapping("/selectKTCG")
    public String selectKTCG(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
        System.out.println("type:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String new_type = '"'+type+'"';
        System.out.println(new_type);
        //System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        System.out.println("thsi_type:");
        System.out.println(type);
        model = zcfgService.selectByType(pageNow,model,type);
        return "zcfg/zcfgktcgList";
    }
    /*
     * 查询课题成果文件夹政策法规
     */
    @RequestMapping("/selectKTCGA")
    public String selectKTCGA(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
        System.out.println("type:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String new_type = '"'+type+'"';
        System.out.println(new_type);
        //System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        model = zcfgService.selectByType(pageNow,model,type);
        return "zcfg/zcfgktcgAList";
    }



	/*
     * 查询国家级政策法规
     */
	@RequestMapping("/selectGJJ")
	public String selectGJJ(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
		System.out.println("type:");
		System.out.println(type);
		try {
			type = URLDecoder.decode(type,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String new_type = '"'+type+'"';
		System.out.println(new_type);
		//System.out.println(name);
		String pageNow = request.getParameter("pageNow");
        model = zcfgService.selectByType(pageNow,model,type);
		return "zcfg/zcfggjjList";
	}
	/*
     * 查询国家级文件夹政策法规
     */
	@RequestMapping("/selectGJJA")
	public String selectGJJA(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
		System.out.println("type:");
		System.out.println(type);
		try {
			type = URLDecoder.decode(type,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String new_type = '"'+type+'"';
		System.out.println(new_type);
		//System.out.println(name);
		String pageNow = request.getParameter("pageNow");
        model = zcfgService.selectByType(pageNow,model,type);
		return "zcfg/zcfggjjAList";
	}


    /*
     * 查询省级级政策法规
     */
    @RequestMapping("/selectSJ")
    public String selectSJ(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
        System.out.println("type:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String new_type = '"'+type+'"';
        System.out.println(new_type);
        //System.out.println(name);
		String pageNow = request.getParameter("pageNow");
        model = zcfgService.selectByType(pageNow,model,type);
        return "zcfg/zcfgsjList";
    }

    /*
     * 查询省级级政策法规
     */
    @RequestMapping("/selectSJB")
    public String selectSJB(@RequestParam(value = "type") String type,  HttpServletRequest request,Model model){
        System.out.println("type:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String new_type = '"'+type+'"';
        System.out.println(new_type);
		String pageNow = request.getParameter("pageNow");
        model = zcfgService.selectByType(pageNow,model,type);
        return "zcfg/zcfgsjBList";
    }



    /*
     * 查询市级级政策法规
     */
    @RequestMapping("/selectSHJ")
    public String selectSHJ(@RequestParam(value = "type") String type,  HttpServletRequest request, Model model){
        System.out.println("type:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
            System.out.println("encode_type:");
            System.out.println(type);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		String pageNow = request.getParameter("pageNow");

        if(type.equals("管理员")){
            model = zcfgService.selectByTypeWithoutGJAndS(pageNow,model);
            //model.addAttribute("zlist", zcfg);
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjList";
        }
        else if(type.equals("省级")){
            model = zcfgService.selectByTypeWithoutGJAndS(pageNow,model);
            //model.addAttribute("zlist", zcfg);
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjList";
        }else{
            String new_type = '"'+type+'"';
            System.out.println(new_type);
            model = zcfgService.selectByTypeForSH(pageNow,model,type,"市");
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjList";
        }

    }
    
    /*
     * 查询市级文件夹政策法规
     */
    @RequestMapping("/selectSHJC")
    public String selectSHJC(@RequestParam(value = "type") String type,  HttpServletRequest request, Model model){
        System.out.println("liuxintype:");
        System.out.println(type);
        try {
            type = URLDecoder.decode(type,"utf-8");
            System.out.println("encode_type:");
            System.out.println(type);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		String pageNow = request.getParameter("pageNow");
        String[] str = type.split("_");
        String size =  Integer.toString(str.length-1);
        String type_final = "市_";
        for(int i=0;i<str.length;i++){
              if(i!=0&&i==str.length-1){
            	  type_final += str[i];
              }else if(i!=0&&i<str.length-1){
            	  type_final += str[i]+"_";
              }
        }
        System.out.println("lllllllllllllllllll"+type_final);
        if(type.contains("管理员")){
            model = zcfgService.selectByTypeForFolder(type_final,pageNow,model);
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjCList";
        }
        else if(type.contains("省级")){
            model = zcfgService.selectByTypeForFolder(type_final,pageNow,model);
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjCList";
        }else{
            String new_type = '"'+type+'"';
            System.out.println(new_type);
            model = zcfgService.selectByTypeForSH(pageNow,model,type,type_final);
            request.setAttribute("role_name", type);
            return "zcfg/zcfgshjCList";
        }

    }

    @RequestMapping("/exsit")
    @ResponseBody
    public String exsit(HttpServletRequest request){
    	
    	String path = request.getSession().getServletContext().getRealPath("upload/zcfg/") + "\\" + request.getParameter("jsfile");

		if((new File(path)).exists()){
			return "true";
		}
		return "false";
    } 
    
  
    /*
     * 保存数据
     */
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam(value="type") String type, HttpServletRequest request) throws Exception{
        //request.setCharacterEncoding("utf-8");
    	System.out.println(type);
        String newType = URLDecoder.decode(type,"utf-8");
        System.out.println("刘欣:"+newType);

        Map<String, Object> err = new HashMap<String, Object>();
        err.put("status", "myerror");
        Gson gson = new Gson();

        long  startTime=System.currentTimeMillis();
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
        String dir = request.getSession().getServletContext().getRealPath("upload/zcfg/");

        if(multipartResolver.isMultipart(request)){

        	UUID uuid = UUID.randomUUID();
        	
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            Iterator<?> iter=multiRequest.getFileNames();
            while(iter.hasNext()){

                MultipartFile file=multiRequest.getFile(iter.next().toString());
                String path = "";
                String filename = "\\";

                if(file!=null){
                    //String TIME = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(java.util.Calendar.getInstance().getTime());


                    String fopt1 = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
                    String fopt0 = file.getOriginalFilename().replace("."+fopt1, "");
                    
                    String realname = fopt0;
                    //fopt[0] += TIME + String.valueOf(((int) (Math.random()*1000)));

                    filename += uuid.toString() + '.' + fopt1;
                    path = dir + filename;
                    File fff = new File(path);
                    //if(fff.exists())System.out.println("\n\n\n 11111111111 \n\n\n\n\n\n\n\n\n");
                    //上传
                    file.transferTo(fff);
                    String filecontent = "";

                    switch (fopt1) {
                        case "doc":
                        case "DOC":
                            filecontent = getDocText(path); break;
                        case "docx":
                        case "DOCX":
                            filecontent = getDocxText(path); break;
                        case "pdf":
                        case "PDF":
                            filecontent = path;
                            break;
                        case "txt":
                        case "TXT":
                            filecontent = getTxtText(path); break;
                        default:
                            err.put("exception", "houzhui="+fopt1);
                            return gson.toJson(err);
                    }
                    System.out.println(filecontent);
                    if(filecontent.toCharArray()[0]=='e'){
                        err.put("exception", "filecontent="+filecontent);
                        return gson.toJson(err);
                    }else if(filecontent!=""){
                        //入库
                        try{
//        	    		    if()
                            java.util.Date a = new java.util.Date();
                            java.sql.Date date = new java.sql.Date(a.getTime());
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","18342212808y");
                            PreparedStatement pstmt = conn.prepareStatement("insert into zcfg (name,generate_date,content,title,publish_date,type) values (?,?,?,?,?,?);");
                            pstmt.setString(1,  uuid.toString()+"."+fopt1);
                            pstmt.setDate(2, date);
                            pstmt.setString(3, filecontent);
                            pstmt.setString(4, realname);
                            pstmt.setDate(5, date);
                            pstmt.setString(6, newType);
                            pstmt.executeUpdate();
                            conn.close();
                        }catch(Exception e){
                            err.put("exception", e.getMessage());
                            return gson.toJson(err);
                            //e.printStackTrace();
                        }
                    }else{

                    }
                }else{

                }
            }
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("上传花费时间："+String.valueOf(endTime-startTime)+"ms");

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "success");

        return gson.toJson(result);
    }


    private static String getDocText(String path){
    	String re = null;
    	try{
		    FileInputStream fis = new FileInputStream( new File(path));
		    HWPFDocument doc = new HWPFDocument(fis);
		    StringBuilder str = doc.getText();
		    StringReader reader = new StringReader(str.toString());
		    BufferedReader r = new BufferedReader(reader);
		    StringBuilder b = new StringBuilder();
		    String line;
		    b.append("<p>");
		    while((line=r.readLine())!=null) {
		       b.append(line);
		       b.append("<br/>"); 
		    }
		    b.append("</p>"); 
		    re = b.toString();
		   	fis.close();reader.close();r.close();
    	} catch(Exception e){
    		
    		return "err"+e.getMessage();
    		//e.printStackTrace();
    	}
       	return re;
    }
    private static String getDocxText(String path){
    	String re = null;
        try {
            FileInputStream fis = new FileInputStream( new File(path));
            XWPFDocument xdoc = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
        
            StringReader reader = new StringReader(extractor.getText());
            BufferedReader r = new BufferedReader(reader);
            StringBuilder b = new StringBuilder();
            String line;
            b.append("<p>");
            while((line=r.readLine())!=null) {
               b.append(line);
               b.append("<br/>"); 
            }
            b.append("</p>"); 
      
            re = b.toString();
            fis.close();reader.close();r.close();
        } catch (Exception e) {
        	return "err"+e.getMessage();
            //e.printStackTrace();
        }
        return re;  	
    }
    private static String getPdfText(String path){
    	String re = null;
    	try{
	    	PdfReader reader = new PdfReader(path);  
		    PdfReaderContentParser parser = new PdfReaderContentParser(reader);  
		    StringBuffer buff = new StringBuffer();  
		    TextExtractionStrategy strategy;  
		    for (int i = 1; i <= reader.getNumberOfPages(); i++) {  
			   strategy = parser.processContent(i, new SimpleTextExtractionStrategy());  
		  	   buff.append(strategy.getResultantText());       
		    }  
	        StringReader rd = new StringReader(buff.toString());
	        BufferedReader r = new BufferedReader(rd);
	        StringBuilder b = new StringBuilder();
	        String line;
	        b.append("<p>");
	        while((line=r.readLine())!=null) {
	           b.append(line);
	           b.append("<br/>"); 
	        }
	        b.append("</p>"); 
	        re = b.toString();
	        reader.close();rd.close();r.close();
    	} catch(Exception e){
    		return "err"+e.getMessage();
    		//e.printStackTrace();
    	}
    	return re;
    }
    private static String getTxtText(String path){
    	 String re = null;
    	 try{
	 		 InputStreamReader read = new InputStreamReader(new FileInputStream(path));
	         BufferedReader bufferedReader = new BufferedReader(read);
	         String lineTxt = null;
	         re = "<p>";
	         while((lineTxt = bufferedReader.readLine()) != null){
	            re += lineTxt;
	            re += "<br/>";
	         }
	         re += "</p>";
	         read.close(); 
    	 } catch(Exception e){
     		return "err"+e.getMessage();
     		//e.printStackTrace();
    	 }
		 return re;    	
    }
    
}
