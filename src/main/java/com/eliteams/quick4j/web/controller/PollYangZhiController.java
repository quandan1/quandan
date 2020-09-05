package com.eliteams.quick4j.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.PollSource;
import com.eliteams.quick4j.web.model.PollYangZhi;
import com.eliteams.quick4j.web.service.PollYangZhiService;
import com.eliteams.quick4j.web.service.RoleService;
import com.google.gson.Gson;

 

 

@Controller
@RequestMapping(value="/pyz")
public class PollYangZhiController {

    @Resource
    private PollYangZhiService pollYangZhiService;
   
    @Resource
    private RoleService roleService;
    /**  
     * gis图 
     */  
    @RequestMapping("/getCity")
	public void getCity(HttpServletRequest request,HttpServletResponse response) {

    	String roleSign = (String) request.getParameter("roleSign");
    	PrintWriter out = null;  
        try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();	
		}
    	if (roleSign == null){
	        out.write("err");    		
    	}else{
			if (roleSign.equals("2")) {
				String sql = "SELECT DISTINCT XZQHMC FROM poll_yangzhi WHERE DZ_S = '"+(String) request.getParameter("loc_city")+"' AND TJNF = '"+(String) request.getParameter("tjnf")+"' ";
				PreparedStatement pstmt;
				List<String> rlt=new ArrayList<String>();
				List<String> list=new ArrayList<String>();
				try{  
		            Class.forName("com.mysql.jdbc.Driver");  
		            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","18342212808y");
		            pstmt = (PreparedStatement)conn.prepareStatement(sql);
		            ResultSet rs = pstmt.executeQuery();
		            int col = rs.getMetaData().getColumnCount();
		            while (rs.next()) {
		                for (int i = 1; i <= col; i++) {
		                    //System.out.print(rs.getString(i) + "\t");
		                	rlt.add(rs.getString(i));
		                 }
		            }
		            for(int i = 0; i < rlt.size(); i++){
		            	boolean unique = true;
		            	for(int j = 0; j < list.size(); j++){
		            		if(list.get(j).toString().replaceAll("[市区县]", "").equals(
		            				rlt.get(i).toString().replaceAll("[市区县]", ""))){
		            			unique = false;
		            		}
		            	}
		            	if(unique){
		            		list.add(rlt.get(i).toString());
		            	}
		            }
		            rlt = null;
		            conn.close();         	
		        }catch(ClassNotFoundException e){  
		            e.printStackTrace();  
		        }catch(SQLException e){  
		            e.printStackTrace();  
		        } 	
		    	Gson gson = new Gson();
		        out.write(gson.toJson(list));//写入字符串
			}else{
				out.write("ZeroChildren");    		
			}
    	}
    }   
    @RequestMapping(value = "/getInitialExtent")
    public void getInitialExtent(HttpServletRequest request, HttpServletResponse response) {
        String rolename = roleService.getRoleNameByUname((String) request.getSession().getAttribute("userName"));
        if (rolename.contains("_")) {
            rolename = rolename.substring(0, rolename.indexOf("_"));
        }
        System.out.println("rolenameya:" + rolename);
        String result = "";
        switch (rolename.trim()) {
            case "admin":
                result = "117.309229,39.137731,129.957720,43.380153";
                break;
            case "辽宁":
                result = "117.309229,39.137731,129.957720,43.380153";
                break;
            case "沈阳":
                result = "120.344180,41.038634,126.162792,43.148180";
                break;
            case "大连":
                result = "120.304673,38.684751,124.589340,40.245249";
                break;
            case "鞍山":
                result = "120.654886,40.025895,125.149073,41.654445";
                break;
            case "抚顺":
                result = "122.925499,41.209812,126.512294,42.482913";
                break;
            case "本溪":
                result = "123.398631,40.740022,125.936511,41.637172";
                break;
            case "丹东":
                result = "122.309634,39.673381,126.586062,41.213798";
                break;
            case "锦州":
                result = "119.431423,40.729618,123.581508,42.211277";
                break;
            case "营口":
                result = "120.694250,39.753728,124.190971,41.048150";
                break;
            case "阜新":
                result = "119.195495,41.535575,124.155844,43.299593";
                break;
            case "辽阳":
                result = "121.430973,40.460256,125.309147,41.800736";
                break;
            case "盘锦":
                result = "120.835854,40.610362,123.252882,41.494596";
                break;
            case "铁岭":
                result = "121.683328,41.840331,126.582710,43.573067";
                break;
            case "朝阳":
                result = "117.205270,40.391405,123.074377,42.504821";
                break;
            case "葫芦岛":
                result = "118.172417,39.834530,122.336235,41.369228";
                break;
        }
        try {
            response.getWriter().write(result.trim()+"*"+rolename.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/searchAllPyz")
    @ResponseBody
    public List<PollYangZhi> searchAllPyz(HttpServletRequest request){
    	Map<String,String> map = new HashMap<String, String>();
    	
		map.put("tjnf",(String) request.getParameter("TJNF"));
        
    	map.put("xzqhmc",(String)request.getParameter("XZQHMC"));
    	map.put("yzcbm",(String)request.getParameter("YZCBM"));
    	map.put("yzcmc",(String)request.getParameter("YZCMC"));
    	map.put("kzdm",(String)request.getParameter("KZDM"));
    	map.put("kzdy",(String)request.getParameter("KZDY"));
    	map.put("jd",(String)request.getParameter("JD"));
    	map.put("wd",(String)request.getParameter("WD"));
    	map.put("dzS",(String)request.getParameter("DZ_S"));
    	map.put("dzX",(String)request.getParameter("DZ_X"));
    	map.put("xz",(String)request.getParameter("XZ"));
    	map.put("jc",(String)request.getParameter("JC"));
    	map.put("szlymc",(String)request.getParameter("SZLYMC"));
    	map.put("snstmc",(String)request.getParameter("SNSTMC"));
    	map.put("xqzl",(String)request.getParameter("XQZL"));
    	map.put("syl",(String)request.getParameter("SYL"));
    	map.put("pflHxxyl",(String)request.getParameter("PFL_HXXYL"));
    	map.put("pflZd",(String)request.getParameter("PFL_ZD"));
    	map.put("pflZl",(String)request.getParameter("PFL_ZL"));
    	map.put("pflAd",(String)request.getParameter("PFL_AD"));
    	map.put("qclHxxyl",(String)request.getParameter("QCL_HXXYL"));
    	map.put("qclZd",(String)request.getParameter("QCL_ZD"));
    	map.put("qclZl",(String)request.getParameter("QCL_ZL"));
    	map.put("qclAd",(String)request.getParameter("QCL_AD"));

		map.put("username",(String) request.getSession().getAttribute("userName"));

		if(request.getParameter("ID")!=null){
	    	
	    	map.put("id",(String)request.getParameter("id"));
		}
    	List<PollYangZhi> allList = pollYangZhiService.selectForMap(map);
        return allList;
    }
    
    
    
    @RequestMapping("/search") 
    @ResponseBody
    public ModelAndView search(HttpServletRequest request, ModelAndView m){  

		Map<String,String> map = new HashMap<String, String>();
    	
		map.put("tjnf",(String) request.getParameter("TJNF"));
		
		map.put("xzqhmc",(String)request.getParameter("XZQHMC"));
    	map.put("yzcbm",(String)request.getParameter("YZCBM"));
    	map.put("yzcmc",(String)request.getParameter("YZCMC"));
    	map.put("kzdm",(String)request.getParameter("KZDM"));
    	map.put("kzdy",(String)request.getParameter("KZDY"));
    	map.put("jd",(String)request.getParameter("JD"));
    	map.put("wd",(String)request.getParameter("WD"));
    	map.put("dzS",(String)request.getParameter("DZ_S"));
    	map.put("dzX",(String)request.getParameter("DZ_X"));
    	map.put("xz",(String)request.getParameter("XZ"));
    	map.put("jc",(String)request.getParameter("JC"));
    	map.put("szlymc",(String)request.getParameter("SZLYMC"));
    	map.put("snstmc",(String)request.getParameter("SNSTMC"));
    	map.put("xqzl",(String)request.getParameter("XQZL"));
    	map.put("syl",(String)request.getParameter("SYL"));
    	map.put("pflHxxyl",(String)request.getParameter("PFL_HXXYL"));
    	map.put("pflZd",(String)request.getParameter("PFL_ZD"));
    	map.put("pflZl",(String)request.getParameter("PFL_ZL"));
    	map.put("pflAd",(String)request.getParameter("PFL_AD"));
    	map.put("qclHxxyl",(String)request.getParameter("QCL_HXXYL"));
    	map.put("qclZd",(String)request.getParameter("QCL_ZD"));
    	map.put("qclZl",(String)request.getParameter("QCL_ZL"));
    	map.put("qclAd",(String)request.getParameter("QCL_AD"));
    	
		map.put("username",(String) request.getSession().getAttribute("userName"));
 
		if(request.getParameter("ID")!=null){
			map.put("id",(String)request.getParameter("id"));
		}
		
        String pageNow = request.getParameter("pageNow");        
        List<PollYangZhi> list = pollYangZhiService.searchByPage(pageNow,map);
        for(int i=0;i<list.size();i++){System.out.println("~~~~~~"+list.get(i).getId());}
        Page page = pollYangZhiService.getSearchPage(pageNow,map);
	    m.addObject("list",list);
	    m.addObject("page",page);
	    m.setViewName("pollYangZhi/listPollYangZhi_S");
        return m;
    }
    
    /**  
     * 查询用户列表  oksearchAllPyz
     */  
    @RequestMapping("/list") 
    public String userList(HttpServletRequest request,Model model){ 
        String pageNow = request.getParameter("pageNow");        
        List<PollYangZhi> list = pollYangZhiService.selectByPage(pageNow);
        Page page = pollYangZhiService.getPage(pageNow);
	    model.addAttribute("list",list);
	    model.addAttribute("page",page);	    
        return "pollYangZhi/listPollYangZhi"; 
    }
      
    /**  
     * 查询修改用户信息的id  
     */  
    @RequestMapping("/id") 
    public String updateid(HttpServletRequest request,Integer id,Model model){  
    	System.out.println("------------id");
    	PollYangZhi pollYangZhi = pollYangZhiService.selectById(id);
        request.setAttribute("pollYangZhi", pollYangZhi);
        model.addAttribute("pollYangZhi", pollYangZhi);
        return "pollYangZhi/editPollYangZhi";
    }  
    
    /**  
     * 修改用户信息  
     */  
    @RequestMapping(value="/update") 
    @ResponseBody  
    public String update(HttpServletRequest request, PollYangZhi pollYangZhi){      
        //pollfactory.setCityNumber(Integer.valueOf(999));	
        int result = pollYangZhiService.update(pollYangZhi);    
        System.out.println("------------update:"+result);
        request.setAttribute("result", result);    
        return "success";
    }  
     
    /**  
     * 添加用户信息  
     */  
    @RequestMapping(value="/insert")
    @ResponseBody
    public String insert(HttpServletRequest request, PollYangZhi pollYangZhi){  
    	System.out.println("------------insert");
    	int result = pollYangZhiService.insert(pollYangZhi);  
    	request.setAttribute("result", result);  
        return "success";
    }      
    /**  
     * 删除用户 ，根据id删除  ,ok
     */  
    @RequestMapping(value="/delete")  
    @ResponseBody
    public String delete(HttpServletRequest request,Integer id){  
    	System.out.println("------------delete");
    	int result=pollYangZhiService.delete(id);  
    	System.out.println("------------result:"+result);
    	request.setAttribute("result", result);
    	return "success";
    }  

    
    @RequestMapping("/getTableName")
	public void getTableName(HttpServletRequest request,HttpServletResponse response) {

		String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='poll_yangzhi';";
		PreparedStatement pstmt;
		List<String> list=new ArrayList<String>();
		
		try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env","root","18342212808y");
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                 }
            }
            conn.close();         	
        }catch(ClassNotFoundException e){  
            e.printStackTrace();  
        }catch(SQLException e){  
            e.printStackTrace();  
        }
		    	
    	Gson gson = new Gson();  
    	String str = gson.toJson(list); 
    	PrintWriter out = null;  
        try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();	
		}  
        out.write(str);
	}
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException{
    	
		Map<String,String> map = new HashMap<String, String>();
    	
		map.put("tjnf",(String) request.getParameter("TJNF"));	
		
		map.put("xzqhmc",(String)request.getParameter("XZQHMC"));
    	map.put("yzcbm",(String)request.getParameter("YZCBM"));
    	map.put("yzcmc",(String)request.getParameter("YZCMC"));
    	map.put("kzdm",(String)request.getParameter("KZDM"));
    	map.put("kzdy",(String)request.getParameter("KZDY"));
    	map.put("jd",(String)request.getParameter("JD"));
    	map.put("wd",(String)request.getParameter("WD"));
    	map.put("dzS",(String)request.getParameter("DZ_S"));
    	map.put("dzX",(String)request.getParameter("DZ_X"));
    	map.put("xz",(String)request.getParameter("XZ"));
    	map.put("jc",(String)request.getParameter("JC"));
    	map.put("szlymc",(String)request.getParameter("SZLYMC"));
    	map.put("snstmc",(String)request.getParameter("SNSTMC"));
    	map.put("xqzl",(String)request.getParameter("XQZL"));
    	map.put("syl",(String)request.getParameter("SYL"));
    	map.put("pflHxxyl",(String)request.getParameter("PFL_HXXYL"));
    	map.put("pflZd",(String)request.getParameter("PFL_ZD"));
    	map.put("pflZl",(String)request.getParameter("PFL_ZL"));
    	map.put("pflAd",(String)request.getParameter("PFL_AD"));
    	map.put("qclHxxyl",(String)request.getParameter("QCL_HXXYL"));
    	map.put("qclZd",(String)request.getParameter("QCL_ZD"));
    	map.put("qclZl",(String)request.getParameter("QCL_ZL"));
    	map.put("qclAd",(String)request.getParameter("QCL_AD"));
		map.put("username",(String) request.getSession().getAttribute("userName"));
 
		if(request.getParameter("ID")!=null){
			map.put("id",(String) request.getParameter("ID"));
		}
    	List<PollYangZhi> allList = pollYangZhiService.selectForMap(map);
    	
		ArrayList<String> title = new ArrayList<String>();
		Field[] fields=allList.get(0).getClass().getDeclaredFields();  

		for(int i = 0;i < 22;i ++ ){
			title.add(i+"");
		}
	    
	    response.setContentType("application/binary;charset=UTF-8");
	    String fileName=new String("temp".getBytes(),"UTF-8");
	    String path = request.getSession().getServletContext().getRealPath("export/poll");
        try{
            ServletOutputStream out=response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcel(allList,title, out, fields,path);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
	@RequestMapping("/upload") 
    public ResponseEntity<byte[]> upload(HttpSession session,HttpServletRequest request) throws IOException{
    	File file=new File(request.getSession().getServletContext().getRealPath("export/poll")+"/temp.xls");  
        HttpHeaders headers = new HttpHeaders();    
        headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis())+".xls");   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
        file.delete();
        return re;
	}
    
    private void genExcel(List<PollYangZhi> allList,ArrayList<String> title,ServletOutputStream out,Field[] fields,String path){
    	HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("污染源管理-畜禽养殖");
		HSSFRow row;
		HSSFCell cell;
	
		row = sheet.createRow(0);//创建表格行
	    for(int j = 0; j < title.size(); j++) {
	        cell = row.createCell(j);//根据表格行创建单元格
	        cell.setCellValue(String.valueOf(title.get(j)));
	    }
	    
		try {
			for(int i = 0; i < allList.size(); i++) {
			    row = sheet.createRow(i+1);//创建表格行    
			    PollYangZhi temp = allList.get(i);	  
				for(int j=0;j<fields.length-1;j++){
			       Field f = temp.getClass().getDeclaredField(fields[j].getName());  
			       f.setAccessible(true);  
			       Object o = f.get(temp);  
			       cell = row.createCell(j);
			       cell.setCellValue(o.toString());
				}  
			}
		} catch (Exception e) {
			System.out.println("error1");
		}
		
		try {
            FileOutputStream fileOutputStream = new FileOutputStream(path+"/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
