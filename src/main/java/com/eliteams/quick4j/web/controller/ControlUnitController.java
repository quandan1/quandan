package com.eliteams.quick4j.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;
 

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.QmpMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;
import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.Dmzljs;
import com.eliteams.quick4j.web.model.Qmp;
import com.eliteams.quick4j.web.service.ControlUnitService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/controlunit")
public class ControlUnitController {

	@Resource
	private UserMapper userMapper;
	@Resource
	private RoleMapper roleMapper;
    @Resource
    private ControlUnitService controlUnitService;

    /**
     * 查询用户列表
     */
    @RequestMapping("/list")
    public String controlUnitList(HttpServletRequest request, Model model) {
        //System.out.println("1");
        //List<ControlUnit> list = controlUnitService.listAll();  
        //model.addAttribute("clist", list);
        //request.setAttribute("clist", list);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        System.out.println("测试");
        model = controlUnitService.selectCUByPage(pageNow, model, userName);
        return "cu/cUnitList";
    }


    /**
     * 查询修改用户信息的id
     */
    @RequestMapping("/id")
    public String updateid(HttpServletRequest request, Integer id, Model model) {
        //System.out.println(id);
        ControlUnit controlUnit = controlUnitService.selectById(id);
        //request.setAttribute("controlUnit", controlUnit);
        model.addAttribute("controlUnit", controlUnit);
        return "cu/editCUnit";
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("/update")
    @ResponseBody
    public String update(HttpServletRequest request, ControlUnit controlUnit, Model model) {
        int result = controlUnitService.update(controlUnit);
        model.addAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 添加用户信息
     */
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(HttpServletRequest request, ControlUnit controlUnit) {
        int result = controlUnitService.insert(controlUnit);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 删除用户 ，根据id删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(HttpServletRequest request, Integer id) {
        int result = controlUnitService.delete(id);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/select")
    public String select(HttpServletRequest request, String name, Model model) {
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //System.out.println(name);
        ControlUnit controlUnit = controlUnitService.selectByName(name);
        List<ControlUnit> list = new ArrayList<ControlUnit>();
        list.add(controlUnit);
        //System.out.println(controlUnit.getName());
        model.addAttribute("clist", list);
        //request.setAttribute("clist", list);
        return "cu/cUnitList";
    }

    @RequestMapping("/getTableName")
    public void getTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='control_unit';";
        PreparedStatement pstmt;
        List list = new ArrayList<String>();

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "18342212808y");
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    list.add(rs.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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

    @RequestMapping("/search")
    @ResponseBody
    public ModelAndView search(HttpServletRequest request, ModelAndView m) {
        System.out.println(request.getParameter("include_section"));
        Map<String, String> map = new HashMap<String, String>();
        map.put("unit_name", (String) request.getParameter("unit_name"));
        map.put("include_section", (String) request.getParameter("include_section"));
        map.put("watershed", (String) request.getParameter("watershed"));
        map.put("loc_province", (String) request.getParameter("loc_province"));
        map.put("involve_city", (String) request.getParameter("involve_city"));
        map.put("involve_county", (String) request.getParameter("involve_county"));
        map.put("involve_village", (String) request.getParameter("involve_village"));
        map.put("village_amount", (String) request.getParameter("village_amount"));
        map.put("involve_river", (String) request.getParameter("involve_river"));
        map.put("unit_type", (String) request.getParameter("unit_type"));
        map.put("water_resource", (String) request.getParameter("water_resource"));
        map.put("hr_river", (String) request.getParameter("hr_river"));
        map.put("username", (String) request.getSession().getAttribute("userName"));


        map.put("include_sx", (String) request.getParameter("include_sx"));
        map.put("include_gl", (String) request.getParameter("include_gl"));
        map.put("include_1jzl", (String) request.getParameter("include_1jzl"));
        map.put("include_2jzl", (String) request.getParameter("include_2jzl"));
        map.put("include_3jzl", (String) request.getParameter("include_3jzl"));
        map.put("include_4jzl", (String) request.getParameter("include_4jzl"));
        map.put("kzdy_time", (String) request.getParameter("kzdy_time"));


        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        String pageNow = request.getParameter("pageNow");
        List<ControlUnit> list = controlUnitService.searchByPage(pageNow, map);
        Page page = controlUnitService.getSearchPage(pageNow, map);

        //为地图查询数据
        List<ControlUnit> listForMap = controlUnitService.selectForMap(map);
        int i = 0;
        int j = listForMap.size();
        String name = "";
        for (ControlUnit c : listForMap) {
            i++;
            if (i < j) {
                name = name + "单元名称='" + c.getUnitName().split("（")[0] + "' or ";
            } else {
                name = name + "单元名称='" + c.getUnitName().split("（")[0] + "'";
            }
        }
        m.addObject("name", name);
        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("cu/cUnitList_S");
        return m;
    }

    /**
     * 查询地图信息
     */
    @RequestMapping("/userForMap")
    @ResponseBody
    public String userForMap(HttpServletRequest request, Model model) {
//    	   Map<String,String> map = new HashMap<String,String>();
//      		map.put("unit_name",null);
//      		map.put("include_section",null);
//      		map.put("watershed",null);
//      		map.put("loc_province",null);
//      		map.put("involve_city",null);
//      		map.put("involve_county",null);
//      		map.put("involve_village",null);
//      		map.put("village_amount",null);
//      		map.put("involve_river",null);	
//      		map.put("unit_type",null);	
//      		map.put("water_resource",null);	
//   		    map.put("username",(String) request.getSession().getAttribute("userName"));
//   		    map.put("id",null);
//            //为地图查询数据
//            List<ControlUnit> listForMap = controlUnitService.selectForMap(map);
//            int i=0;
//            int j=listForMap.size();
//            String name="";
//            for(ControlUnit c:listForMap){
//         	   i++;
//                if(i<j){
//                   name = name+"单元名称='"+c.getUnitName()+"' or ";       	   
//                }else{
//             	  name = name+"单元名称='"+c.getUnitName()+"'";
//                }
//            }
//            try {
//				name = URLEncoder.encode(name, "UTF-8").replace("+","%20");
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        String role = (String) request.getSession().getAttribute("role");
        String json = "";
        if (role.equals("1") || role.equals("admin")) {
            String n = "1=1";
            try {
                n = URLEncoder.encode(n, "UTF-8").replace("+", "%20");
                Map map = new HashMap();
                map.put("result", n);
                Gson gson = new Gson();
                json = gson.toJson(map);
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return json;
        } else {
            String name = (String) request.getSession().getAttribute("name");
            Map m = new HashMap();
            m.put("result", name);
            Gson gson = new Gson();
            json = gson.toJson(m);
            return json;
        }
    }

    /**
     * 控制单元总量计算
     */
    @RequestMapping("/total")
    public String kzdyTotal(HttpServletRequest request, Model model) {
    	Map map = new HashMap();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));


        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));




		map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
		System.out.println("优控"+map.get("youkong"));
		List<String> list_youkong = controlUnitService.searchCu_youkong(map);
    	
        String pageNow = request.getParameter("pageNow");
        String sy = request.getParameter("sy");
        Map<String,String> map_sy = new HashMap<String,String>();
        map_sy.put("sy", sy);

        //List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        String userName = (String) request.getSession().getAttribute("userName");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);


        List<Map<String, String>> list = constructkzdmTotal(pageNow,userName,map_sy,list_youkong,list_kzdy);
        List<Map<String, String>> alllist = constructkzdmTotal(null,userName,map_sy,list_youkong,list_kzdy);
        //water = controlUnitService.selectWater();
        Page page = controlUnitService.getKzdyPage(pageNow, userName,map_sy,list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);        
        System.out.println(sy);
        //model.addAttribute("cu/kzdy");
        return "cu/kzdySource";
    }

    public List<Map<String, String>> constructkzdmTotal(String pageNow,String userName,Map<String,String> map_sy,List<String> list_youkong,List<ControlUnit> list_kzdy){
        List<Map<String, String>> list = null;
        list = (pageNow!=null ? controlUnitService.selectKzdyTotal(pageNow, userName,map_sy,list_youkong)
                : controlUnitService.selectKzdyTotal(userName,map_sy,list_youkong));
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }


    
    
    /**
     * 控制单元总量选择
     */
    @RequestMapping("/selectTotal")
    public String selectTotal(HttpServletRequest request, String name, Model model) {
    	Map map = new HashMap();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));



        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));



        map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);
        List<Map<String, String>> list = constructTotal(pageNow,name,userName,list_kzdy);
        List<Map<String, String>> alllist = constructTotal(null,name,userName,list_kzdy);

        Page page = controlUnitService.getKzdyPageByName(pageNow, name, userName);
        //List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        //water = controlUnitService.selectWater();
        //model.addAttribute("water", water);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", list);
        model.addAttribute("page", page);
        //model.addAttribute("cu/kzdy");
        return "cu/kzdySource";
    }

    public List<Map<String, String>> constructTotal(String pageNow,String name,String userName,List<ControlUnit> list_kzdy){
        List<Map<String, String>> list = null;
        list=(pageNow==null?controlUnitService.selectKzdyTotalByName(pageNow, name, userName)
                        :controlUnitService.selectKzdyTotalByName(name, userName));
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }
    
    //控制单元水域选择
    @RequestMapping("/water")
    public String water(HttpServletRequest request, String name, Model model) {
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = controlUnitService.selectWater();
        model.addAttribute("water", water);
        return "cu/watershed";
    }
    
    //控制单元水域选择
    @RequestMapping("/waterYangZhi")
    public String waterYangZhi(HttpServletRequest request, String name, Model model) {
    	System.out.println("调用");
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = controlUnitService.selectWaterYangZhi();
        model.addAttribute("water", water);
        return "cu/watershed";
    }
    
    //控制单元水域选择
    @RequestMapping("/waterFactory")
    public String waterFactory(HttpServletRequest request, String name, Model model) {
    	System.out.println("调用");
        List<Map<String, String>> water = new ArrayList<Map<String, String>>();
        water = controlUnitService.selectWaterFactory();
        model.addAttribute("water", water);
        return "cu/watershed";
    }

    /**
     * 定制计算控制单元总量
     */
    @RequestMapping("/compute")
    @ResponseBody
    public String compute(HttpServletRequest request, Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("prop", (String) request.getParameter("prop"));
        map.put("kzdy", (String) request.getParameter("kzdy"));
        String result = String.valueOf(controlUnitService.computeKzdyTotal(map));
        return result;
    }

    /**
     * 增加info内容
     */
    @RequestMapping("/info")
    @ResponseBody
    public String selectForInfo(HttpServletRequest request, Model model) {
        ControlUnit controlUnit = controlUnitService.selectForInfo(request.getParameter("name"));
        Map map = new HashMap();
        //Map<String,String> map = new HashMap<String, String>();
        map.put("id", controlUnit.getId());
        map.put("unitName", controlUnit.getUnitName());
        map.put("includeSection", controlUnit.getIncludeSection());
        map.put("waterShed", controlUnit.getWatershed());
        map.put("locProvince", controlUnit.getLocProvince());
        map.put("involveCity", controlUnit.getInvolveCity());
        map.put("involveCounty", controlUnit.getInvolveCounty());
        map.put("involveVillage", controlUnit.getInvolveVillage());
        map.put("villageAmount", controlUnit.getVillageAmount());
        map.put("involveRiver", controlUnit.getInvolveRiver());
        map.put("waterResource", controlUnit.getWaterResource());
        map.put("hrRiver", controlUnit.getHrRiver());


        map.put("include_sx", controlUnit.getIncludeSx());
        map.put("include_gl", controlUnit.getIncludeGl());
        map.put("include_1jzl", controlUnit.getInclude1jzl());
        map.put("include_2jzl", controlUnit.getInclude2jzl());
        map.put("include_3jzl", controlUnit.getInclude3jzl());
        map.put("include_4jzl", controlUnit.getInclude4jzl());
        map.put("kzdy_time", controlUnit.getKzdyTime());

        Gson gson = new Gson();
        String json = gson.toJson(map);
        return json;
    }

    /**
     * 为左侧菜单筛选内容
     */
    @RequestMapping("/left")
    @ResponseBody
    public List<ControlUnit> selectAllForLeft(HttpServletRequest request, Model model) {
        Map map = new HashMap();
        map.put("username", (String) request.getSession().getAttribute("userName"));
        List<ControlUnit> list = controlUnitService.selectAllForLeft(map);
        return list;
    }


    /**
     * 保存数据
     */
    private String fileUploadName;
    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    private String fileUploadPath;

    public String getFileUploadPath() {
        return fileUploadPath;
    }

    public void setFileUploadPath(String fileUploadPath) {
        this.fileUploadPath = fileUploadPath;
    }


    private String fileUploadTime;
    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUploadCu(HttpServletRequest request) throws Exception{
//        QmpController qmp = new QmpController();
        Map<String, Object> err = new HashMap<String, Object>();
        err.put("status", "myerror");
        Gson gson = new Gson();
        long  startTime=System.currentTimeMillis();
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
        String dir = request.getSession().getServletContext().getRealPath("upload/cu");

        if(multipartResolver.isMultipart(request)){

            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            Iterator<?> iter=multiRequest.getFileNames();
            while(iter.hasNext()){

                MultipartFile file=multiRequest.getFile(iter.next().toString());
                String path = "";
                String filename_forPath = "\\";

                if(file!=null){
                    String TIME = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(java.util.Calendar.getInstance().getTime());
                    this.setFileUploadTime(TIME);
                    String[] fopt = file.getOriginalFilename().split("\\.");
                    System.out.println("orifilename:");
                    System.out.println(file.getOriginalFilename());
                    fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
                    filename_forPath += fopt[0]+'_'+TIME + '.' + fopt[1];
                    String filename = fopt[0]+'_'+TIME + '.' + fopt[1];
                    this.setFileUploadName(filename);
                    System.out.println("filename:");
                    System.out.println(filename);
                    path = dir + filename_forPath;
                    this.setFileUploadPath(path);
                    System.out.println("path:");
                    System.out.println(path);
                    File newFile = new File(path);
                    //上传
                    file.transferTo(newFile);

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
    @RequestMapping("/bulkImport")
    @ResponseBody
    public String bulkImportCu(HttpServletRequest request) throws Exception {
        long startTime=System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcelCu.poiExceltoSql(oriFileName,fileName,filePath,fileUploadTime);
        String[] message = msg.split(" ");
        long  endTime=System.currentTimeMillis();
        String timeCost = String.valueOf(endTime-startTime)+"ms";
        System.out.println("批量导入花费时间："+timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg",message[0]);
        result.put("updateCount",message[1]);
        result.put("insertCount",message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time",timeCost);
        return gson.toJson(result);


    }

    /**
     * 畜禽养殖控制单元总量计算
     */
    @RequestMapping("/yangZhiTotal")
    public String kzdyYangZhiTotal(HttpServletRequest request, Model model) {
        Map<String,String> map = new HashMap<String, String>();
    	//Map map = new HashMap();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));



        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));



        map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
		System.out.println("优控"+map.get("youkong"));
		List<String> list_youkong = controlUnitService.searchCu_youkong(map);
    	
        String pageNow = request.getParameter("pageNow");
        String sy = request.getParameter("sy");
        Map<String,String> map_sy = new HashMap<String,String>();
        map_sy.put("sy", sy);
        String userName = (String) request.getSession().getAttribute("userName");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);

        List<Map<String, String>> list = constructkzdyYangZhiTotal(pageNow,userName,map_sy,list_youkong,list_kzdy);
        List<Map<String, String>> alllist = constructkzdyYangZhiTotal(null,userName,map_sy,list_youkong,list_kzdy);

        Page page = controlUnitService.getKzdyYangZhiPage(pageNow, userName, map_sy,list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        //model.addAttribute("cu/kzdy");
        return "cu/kzdyYangZhi";
    }

    public List<Map<String, String>>
    constructkzdyYangZhiTotal(String pageNow,String userName,Map<String,String> map_sy,List<String> list_youkong,List<ControlUnit> list_kzdy){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list = (pageNow!=null?controlUnitService.selectKzdyYangZhiTotal(pageNow, userName, map_sy,list_youkong)
        :controlUnitService.selectKzdyYangZhiTotal(userName, map_sy,list_youkong));
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }

    /**
     * 畜禽养殖控制单元总量选择
     */
    @RequestMapping("/selectYangZhiTotal")
    public String selectYangZhiTotal(HttpServletRequest request, String name, Model model) {
        Map<String,String> map = new HashMap<String, String>();
       // Map map = new HashMap();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));



        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));


        map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);
        String userName = (String) request.getSession().getAttribute("userName");

        List<Map<String, String>> list = constructYangZhiTotal(pageNow,name,userName,list_kzdy);
        List<Map<String, String>> alllist = constructYangZhiTotal(null,name,userName,list_kzdy);

        Page page = controlUnitService.getKzdyYangZhiPageByName(pageNow, name, userName);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "cu/kzdyYangZhi";
    }

    public List<Map<String, String>>
    constructYangZhiTotal(String pageNow,String name,String userName,List<ControlUnit> list_kzdy){
        List<Map<String, String>> list = null;
        list = (pageNow!=null?controlUnitService.selectKzdyYangZhiTotalByName(pageNow, name, userName)
                            :controlUnitService.selectKzdyYangZhiTotalByName(name, userName));
        //List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }

    /**
     * 污水处理厂控制单元总量计算
     */
    @RequestMapping("/factoryTotal")
    public String kzdyFactoryTotal(HttpServletRequest request, Model model) {
    	//Map map = new HashMap();
        Map<String,String> map = new HashMap<String, String>();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));




        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));


        map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
		System.out.println("优控"+map.get("youkong"));
		List<String> list_youkong = controlUnitService.searchCu_youkong(map);
    	
        String pageNow = request.getParameter("pageNow");
        String sy = request.getParameter("sy");

        Map<String,String> map_sy = new HashMap<String,String>();
        map_sy.put("sy", sy);
        String userName = (String) request.getSession().getAttribute("userName");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);
        List<Map<String, String>> list = constructkzdmFactoryTotal(pageNow,userName,list_kzdy,map_sy,list_youkong);
        List<Map<String, String>> alllist = constructkzdmFactoryTotal(null,userName,list_kzdy,map_sy,list_youkong);

        Page page = controlUnitService.getKzdyFactoryPage(pageNow, userName, map_sy,list_youkong);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "cu/kzdyFactory";
    }

    public List<Map<String, String>>
        constructkzdmFactoryTotal(String pageNow,String userName,List<ControlUnit> list_kzdy,
                          Map<String,String> map_sy,List<String> list_youkong){
        List<Map<String, String>>list = null;
        list = (pageNow!=null?controlUnitService.selectKzdyFactoryTotal(pageNow, userName, map_sy,list_youkong)
                :controlUnitService.selectKzdyFactoryAll(userName,map_sy,list_youkong));
        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }




    /**
     * 污水处理厂控制单元总量选择
     */
    @RequestMapping("/selectFactoryTotal")
    public String selectFactoryTotal(HttpServletRequest request, String name, Model model) {
    	//Map map = new HashMap();
        Map<String,String> map = new HashMap<String, String>();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));



        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));


        map.put("username",(String) request.getSession().getAttribute("userName"));
		//System.out.println("优控："+map.get("youkong"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
        try {
            name = URLDecoder.decode(name, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);

        List<Map<String, String>> list = constructFactoryTotal(pageNow,name,userName,list_kzdy);
        List<Map<String, String>> alllist = constructFactoryTotal(null,name,userName,list_kzdy);

        Page page = controlUnitService.getKzdyFactoryPageByName(pageNow, name, userName);
        model.addAttribute("clist", list);
        model.addAttribute("alllist", alllist);
        model.addAttribute("page", page);
        return "cu/kzdyFactory";
    }

    public List<Map<String, String>>
    constructFactoryTotal(String pageNow,String name,String userName,List<ControlUnit> list_kzdy){
        List<Map<String, String>> list = null;
        list = (pageNow!=null?controlUnitService.selectKzdyFactoryTotalByName(pageNow, name, userName)
                :controlUnitService.selectKzdyFactoryTotalByName(name, userName));

        for(int i=0;i<list.size();i++){
            String kzdy = list.get(i).get("KZDY");
            for(int j=0;j<list_kzdy.size();j++){
                if(kzdy.equals(list_kzdy.get(j).getUnitName())){
                    list.get(i).put("involve_city", list_kzdy.get(j).getInvolveCity());
                    list.get(i).put("involve_county", list_kzdy.get(j).getInvolveCounty());
                }
            }
        }
        return list;
    }

    
    @RequestMapping("/searchYoukong") 
    @ResponseBody
    public ModelAndView searchYoukong(HttpServletRequest request, ModelAndView m){  
		//Map map = new HashMap();
        Map<String,String> map = new HashMap<String, String>();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));	
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));



        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));


        map.put("username",(String) request.getSession().getAttribute("userName"));
		
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
		
        String pageNow = request.getParameter("pageNow");        
        List<ControlUnit> list = controlUnitService.searchByPage_youkong(pageNow,map);
        List<ControlUnit> alllist = controlUnitService.searchByPage_youkong(map);
        Page page = controlUnitService.getSearchPage_youkong(pageNow,map);
       
	    m.addObject("list",list);
        m.addObject("alllist",alllist);
	    m.addObject("page",page);
	    m.setViewName("cu/cUnitList_YK");
        return m;
    }
    

    /**
     * 求和总量计算
     */
    @RequestMapping("/sum")
    public String kzdySum(HttpServletRequest request, Model model) {
        Map<String,String> map = new HashMap<String, String>();
		map.put("youkong",(String) request.getParameter("youkong"));
		map.put("unit_name",null);
		map.put("include_section",null);
		map.put("watershed",null);
		map.put("loc_province",null);
		map.put("involve_city",null);
		map.put("involve_county",null);
		map.put("involve_village",null);
		map.put("village_amount",null);
		map.put("involve_river",null);	
		map.put("unit_type",null);	
		map.put("water_resource",null);

        map.put("include_sx",null);
        map.put("linclude_gl",null);
        map.put("include_1jzl",null);
        map.put("include_2jzl",null);
        map.put("include_3jzl",null);
        map.put("include_4jzl",null);
        map.put("kzdy_time",null);

		//map.put("id",null);
		map.put("username",(String) request.getSession().getAttribute("userName"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
        System.out.println("111111111111111111111111111111111");
		List<String> list_youkong = controlUnitService.searchCu_youkong(map);
        List<Map<String, String>> list = new LinkedList<Map<String, String>>();
        List<Map<String, String>> list1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> list3 = new ArrayList<Map<String, String>>();
        list1 = controlUnitService.selectKzdySumSource(map);
        System.out.println("444444444444444444444444444444");
        list2 = controlUnitService.selectKzdySumYangZhi(map);
        System.out.println("22222222222222222222222222222");
        list3 = controlUnitService.selectKzdySumFactory(map);
        System.out.println("333333333333333333333333333");
        List<ControlUnit> list_kzdy = controlUnitService.selectForMap(map);
        for(int i=0;i<list_kzdy.size();i++){
           Map<String,String> m = new HashMap<String,String>();
           String k = list_kzdy.get(i).getUnitName();
           String involve_city = list_kzdy.get(i).getInvolveCity();
           String involve_country = list_kzdy.get(i).getInvolveCounty();
           m.put("KZDY", k);
           m.put("involve_city", involve_city);
           m.put("involve_country", involve_country);
           m.put("HXXYL", "0");
           m.put("ADPFL", "0");
           list.add(m);
        }
        //求和
        for(int i=0;i<list1.size();i++){
        	String kzdy_s = String.valueOf(list1.get(i).get("KZDY"));
        	for(int j=0;j<list.size();j++){
        		String kzdy = String.valueOf(list.get(j).get("KZDY"));
        		if(kzdy_s.equals(kzdy)){
        			int HXXYL = Integer.parseInt(String.valueOf(list1.get(i).get("HXXYLPFL_D")))+Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
        			int ADPFL = Integer.parseInt(String.valueOf(list1.get(i).get("ADPFL_D")))+Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
        			list.get(j).put("HXXYL", String.valueOf(HXXYL));
        			list.get(j).put("ADPFL", String.valueOf(ADPFL));
        		}
        	}
        }
        for(int i=0;i<list2.size();i++){
        	String kzdy_s = list2.get(i).get("KZDY");
        	for(int j=0;j<list.size();j++){
        		String kzdy = list.get(j).get("KZDY");
        		if(kzdy_s.equals(kzdy)){
        			int HXXYL = Integer.parseInt(String.valueOf(list2.get(i).get("PFL_HXXYL")))+Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
        			int ADPFL = Integer.parseInt(String.valueOf(list2.get(i).get("PFL_AD")))+Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
        			list.get(j).put("HXXYL", String.valueOf(HXXYL));
        			list.get(j).put("ADPFL", String.valueOf(ADPFL));
        		}
        	}
        }
        for(int i=0;i<list3.size();i++){
        	String kzdy_s = list3.get(i).get("KZDY");
        	for(int j=0;j<list.size();j++){
        		String kzdy = list.get(j).get("KZDY");
        		if(kzdy_s.equals(kzdy)){
        			int HXXYL = Integer.parseInt(String.valueOf(list3.get(i).get("HXXYLQCL_D")))+Integer.parseInt(String.valueOf(list.get(j).get("HXXYL")));
        			int ADPFL = Integer.parseInt(String.valueOf(list3.get(i).get("ADQCL_D")))+Integer.parseInt(String.valueOf(list.get(j).get("ADPFL")));
        			list.get(j).put("HXXYL", String.valueOf(HXXYL));
        			list.get(j).put("ADPFL", String.valueOf(ADPFL));
        		}
        	}
        }
        String name = request.getParameter("name");
        //优控选择
        List<Map<String,String>> list_total = new LinkedList<Map<String,String>>();
        if(list_youkong.size()!=0){
	        for(int i=0;i<list_youkong.size();i++){
	        	String kzdy_youkong = list_youkong.get(i);
	        	for(int j=0;j<list.size();j++){
	        		String kzdy = list.get(j).get("KZDY");
	        		if(kzdy_youkong.equals(kzdy)){
	        			list_total.add(list.get(j));
	        		}
	        	}
	        }
        }else{
        	list_total = list;
        }
        //查询功能
        List<Map<String,String>> list_select = new LinkedList<Map<String,String>>();
        if(("").equals(name)||name==null){
        	list_select = list_total; 
        }else{
        	for(int i=0;i<list_total.size();i++){
        		String kzdy = list_total.get(i).get("KZDY");
        		if(kzdy.contains(name)){
        			list_select.add(list_total.get(i));
        		}
        	}
        }
        //分页
        List<Map<String,String>> list_final = new LinkedList<Map<String,String>>();
		Page page = null;
        String pageNow = request.getParameter("pageNow");
        int totalCount = list_select.size();
        if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	    } else {  
	        page = new Page(totalCount, 1);  
	    } 
        int start = page.getStartPosZcfg();
        int end = start+page.getZcfgPageSize();
        int len = list_select.size();
        for(int i=0;i<len;i++){
        	if(i+1>start&&i+1<=end){
        		list_final.add(list_select.get(i));
        	}
        }

        model.addAttribute("list",list_final);
        model.addAttribute("alllist",list_select);
        model.addAttribute("page",page);
    	return "cu/kzdyTotal";
    }
    
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException{
    	
    	//Map map = new HashMap();
        Map<String,String> map = new HashMap<String, String>();
    	map.put("watershed",(String) request.getParameter("watershed"));
		map.put("river_name",(String) request.getParameter("river_name"));
		map.put("river_level",(String) request.getParameter("river_level"));
		map.put("river_to",(String) request.getParameter("river_to"));
		map.put("section_name",(String) request.getParameter("section_name"));
		map.put("section_property",(String) request.getParameter("section_property"));
		map.put("loc_province",(String) request.getParameter("loc_province"));
		map.put("loc_city",(String) request.getParameter("loc_city"));
		map.put("loc_county",(String) request.getParameter("loc_county"));	
		map.put("test_by",(String) request.getParameter("test_by"));	
		map.put("section_level",(String) request.getParameter("section_level"));	
		map.put("section_type",(String) request.getParameter("section_type"));	
		map.put("is_urban",(String) request.getParameter("is_urban"));
		map.put("is_addition",(String) request.getParameter("is_addition"));
		map.put("test_frequency",(String) request.getParameter("test_frequency"));
		map.put("test_items",(String) request.getParameter("test_items"));
		map.put("loc_lon_d",(String) request.getParameter("loc_lon_d"));
		map.put("loc_lon_m",(String) request.getParameter("loc_lon_m"));
		map.put("loc_lon_s",(String) request.getParameter("loc_lon_s"));
		map.put("loc_lat_d",(String) request.getParameter("loc_lat_d"));
		map.put("loc_lat_m",(String) request.getParameter("loc_lat_m"));
		map.put("loc_lat_s",(String) request.getParameter("loc_lat_s"));


        map.put("section_bh",(String) request.getParameter("section_bh"));
        map.put("section_dybh",(String) request.getParameter("section_dybh"));
        map.put("section_dymc",(String) request.getParameter("section_dymc"));
        map.put("loc_lon",(String) request.getParameter("loc_lon"));
        map.put("loc_lat",(String) request.getParameter("loc_lat"));
        map.put("section_shhl",(String) request.getParameter("section_shhl"));



        map.put("username",(String) request.getSession().getAttribute("userName"));
		if(request.getParameter("id")!=null){
			map.put("id",(String) request.getParameter("id"));
		}
    	List<ControlUnit> allList = controlUnitService.selectForMap(map);
    	
		ArrayList<String> title = new ArrayList<String>();
		Field[] fields=allList.get(0).getClass().getDeclaredFields();  
	    title.add("序号");
	    title.add("控制单元名称");
	    title.add("所含控制断面名称");
	    title.add("流域");
	    title.add("所属省份");
	    title.add("涉及地市");
	    title.add("涉及区（县）名称");
	    title.add("涉及乡镇名称");
	    title.add("乡镇个数");
	    title.add("涉及河流名称");
	    title.add("控制单元类别");
	    title.add("水资源区");
	    title.add("汇入河流");

        title.add("包含水系");
        title.add("所含干流");
        title.add("所含一级支流");
        title.add("所含二级支流");
        title.add("所含三级支流");
        title.add("所含四级支流");
        title.add("控制单元划分时间");

	    
	    response.setContentType("application/binary;charset=UTF-8");
	    String fileName=new String(("temp").getBytes(),"UTF-8");
	    String path = request.getSession().getServletContext().getRealPath("export/cu");
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
    	File file=new File(request.getSession().getServletContext().getRealPath("export/cu")+"/temp.xls");  
        HttpHeaders headers = new HttpHeaders();    
        headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis())+".xls");   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
        file.delete();
        return re;
	}
    
    private void genExcel(List<ControlUnit> allList,ArrayList<String> title,ServletOutputStream out,Field[] fields,String path){
    	HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("控制单元");
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
			    ControlUnit temp = allList.get(i);	  
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
    
    @RequestMapping("/county")
    @ResponseBody
    public List<String> getRoleNameOfCountry(HttpServletRequest request, Model model) {
        String username = (String) request.getSession().getAttribute("userName");
        List<String> list = controlUnitService.getRoleNameOfCountry(username);
        System.out.println(list);
        return list;
    }
    
    /**
     * 控制单元面源计算
     * @throws UnsupportedEncodingException 
     */
    @RequestMapping("/cuMianyuan")
    @ResponseBody
    public String cuMianyuan(HttpServletRequest request, String name, Model model) throws UnsupportedEncodingException{
    	List<ControlUnit> cuAndQmp = new ArrayList<ControlUnit>();
    	cuAndQmp = controlUnitService.selectCuAndQmp();
    	String target = request.getParameter("target");
    	List<Dmzljs> dm = new ArrayList<Dmzljs>();
    	Map<String,String> map = new HashMap<String,String>();
    	map.put("zhibiao", target);
		map.put("username",(String) request.getSession().getAttribute("userName"));
    	dm = controlUnitService.getCuMianyuan(map);
    	List<Dmzljs> dm_final = new ArrayList<Dmzljs>();
    	java.text.DecimalFormat myformat=new java.text.DecimalFormat("0.000");
    	for(int i=0;i<cuAndQmp.size();i++){
    		String qmp = cuAndQmp.get(i).getIncludeSection();
    		Dmzljs dmzljs = new Dmzljs();
    	    double apr = 0;
    	    double may = 0;
    		double june = 0;
    	    double july = 0;
    	    double aug = 0;
    		double sept = 0;
    		double oct = 0;
    		double nov = 0;
    		for(int j = 0;j<dm.size();j++){
    			if(qmp.contains(dm.get(j).getName())){
    				if(dm.get(j).getApr()==null || "".equals(dm.get(j).getApr())){
    					
    				}else{
    				   apr += Double.parseDouble(dm.get(j).getApr());
    				}
                    if(dm.get(j).getMay()==null || "".equals(dm.get(j).getMay())){
    					
    				}else{
    				   may += Double.parseDouble(dm.get(j).getMay());
    				}
                    if(dm.get(j).getJune()==null || "".equals(dm.get(j).getJune())){
    					
    				}else{
    				    june += Double.parseDouble(dm.get(j).getJune());
    				}
                    if(dm.get(j).getJuly()==null || "".equals(dm.get(j).getJuly())){
    					
    				}else{
    				    july += Double.parseDouble(dm.get(j).getJuly());
    				}
                    if(dm.get(j).getAug()==null || "".equals(dm.get(j).getAug())){
    					
    				}else{
    				    aug += Double.parseDouble(dm.get(j).getAug());
    				}
                    if(dm.get(j).getSept()==null || "".equals(dm.get(j).getSept())){
    					
    				}else{
    				    sept += Double.parseDouble(dm.get(j).getSept());
    				}
                    if(dm.get(j).getOct()==null || "".equals(dm.get(j).getOct())){
    					
    				}else{
    				    oct += Double.parseDouble(dm.get(j).getOct());
    				}
    				if(dm.get(j).getNov()==null || "".equals(dm.get(j).getNov())){
    					
    				}else{
    				    nov += Double.parseDouble(dm.get(j).getNov());
    				}
    			}
    		}
    		dmzljs.setName(cuAndQmp.get(i).getUnitName());
    		if(apr<0){
    		   dmzljs.setApr("error");
    		}else{
    		   dmzljs.setApr(myformat.format(apr));
    		}
    		if(may<0){
     		   dmzljs.setMay("error");
     		}else{
    		   dmzljs.setMay(myformat.format(may));
     		}
    		if(june<0){
      		   dmzljs.setJune("error");
      		}else{
    		   dmzljs.setJune(myformat.format(june));
      		}
    		if(july<0){
       		   dmzljs.setJuly("error");
       		}else{
    		   dmzljs.setJuly(myformat.format(july));
       		}
    		if(aug<0){
        	   dmzljs.setAug("error");
            }else{
    		   dmzljs.setAug(myformat.format(aug));
            }
    		if(sept<0){
         	   dmzljs.setSept("error");
            }else{
    		   dmzljs.setSept(myformat.format(sept));
            }
    		if(oct<0){
          	   dmzljs.setOct("error");
            }else{
    		   dmzljs.setOct(myformat.format(oct));
            }
    		if(nov<0){
           	   dmzljs.setNov("error");
            }else{
    		   dmzljs.setNov(myformat.format(nov));
            }
    		dm_final.add(dmzljs);
        }
    	for(int i=0;i<dm_final.size();i++){
    		dm_final.get(i).setName(URLEncoder.encode(dm_final.get(i).getName(), "UTF-8").replace("+","%20"));
    	}
    	
    	Gson gson = new Gson();
        return gson.toJson(dm_final);
    }    
    @RequestMapping("/DMrate")
    @ResponseBody
    public String getDMrate(HttpServletRequest request, HttpServletResponse response, Model model) throws UnsupportedEncodingException {
    
    	String polls = request.getParameter("polls");
    	String year = request.getParameter("year");

		Long userId = userMapper.getIdByName((String) request.getSession().getAttribute("userName").toString().trim());
		Long roleId = roleMapper.getRoleIdByUserId(userId);
		String roleSign = roleMapper.getRoleSignByID(roleId);
		
		String roleStr = "";
		
		if (roleSign.equals("1")) {
		} else if (roleSign.equals("2")) {
			String roleName = roleMapper.getRoleNameByID(roleId);
			roleStr = "and loc_city like '%"+roleName+"%' ";
			 
		} else if (roleSign.equals("3")) {
			String role = roleMapper.getRoleNameByID(roleId);
			String[] arr = role.split("_");
			roleStr = "and loc_city like '%"+arr[0]+"%' ";
			roleStr = "and loc_county like '%"+arr[1]+"%' ";
 
		}

		String sql1 = "select unit_name,include_section from control_unit where loc_province like '%辽宁%' "+roleStr;
		
	    String sql2 = "select section_name,month,flow_rate,"+polls
	    		+" from qmp_wrxx where  year = '"+year+"'";
	    
	    PreparedStatement pstmt1,pstmt2;
        List list = new ArrayList<String>();
        List name = new ArrayList<String>();

        List<String> tmp1 = new ArrayList<String>();
        List<String> tmp2 = new ArrayList<String>();
        List<String> unitName = new ArrayList<String>();
        List<String> uSections = new ArrayList<String>();
        
        int col=0;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env?useUnicode=true&characterEncoding=utf8&useSSL=true", "root" , "18342212808y");

            pstmt1 = (PreparedStatement) conn.prepareStatement(sql1);
            ResultSet rs1 = pstmt1.executeQuery();
      
            String SectionName = "";
            while (rs1.next()) {
            	tmp1.add(rs1.getString(1));
            	tmp2.add(rs1.getString(2));
            	
            }          
       
			for(int i=0;i < tmp2.size();i++){
				if(tmp2.get(i)!=""){
					unitName.add(tmp1.get(i));
					uSections.add(tmp2.get(i));
				}
			}
            
            pstmt2 = (PreparedStatement) conn.prepareStatement(sql2);
            ResultSet rs2 = pstmt2.executeQuery();
            col = rs2.getMetaData().getColumnCount();
            while (rs2.next()) {
                for (int i = 1; i <= col; i++) {
                    //System.out.print(rs2.getString(i) + "\t");
                    list.add(rs2.getString(i));
                    name.add(rs2.getString(1));
                }
            }
            
            pstmt1 = (PreparedStatement) conn.prepareStatement(sql2);
            pstmt1.close();
            rs1.close();
            pstmt2 = (PreparedStatement) conn.prepareStatement(sql2);
            pstmt2.close();
            rs2.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		HashSet h = new HashSet(name);      
		name.clear();      
		name.addAll(h);   
        Map<String,Double> map = new LinkedHashMap<String,Double>();
        int pp=0;
        while(true){
        	//打印
        	for(int j=0;j<col;j++){
        		if((list.get(pp+j).equals("-")||list.get(pp+j).equals("无")||list.get(pp+j).equals(""))){
        			//System.out.print(0+"\t");
        			list.set(pp+j, 0+"");
        		}else{
        			////System.out.print(list.get(pp+j)+"\t");
        		}
        		
        	}
        	//计算
        	map.put(list.get(pp+0)+","+list.get(pp+1), 
        			Double.valueOf((String)list.get(pp+2))*Double.valueOf((String)list.get(pp+3))*2.592);

        	
        	pp = pp + col;
        	//System.out.println();
        	if(pp>=list.size())break;
        } 
	    Set set = map.entrySet();     
	    Iterator iterator = set.iterator();     
	    while(iterator.hasNext()){     
	        Map.Entry mapentry = (Map.Entry) iterator.next();     
	        //System.out.println(mapentry.getKey() + "\t\t" + ((Double)mapentry.getValue()));      
	    }    
	     
	    //5个月份平均值-点源
	    int avg[] = {12,1,2,3,4};
	    //其余月份面源
	    int mian[] = {5,6,7,8,9,10,11};
	    //Map<String,Double> mianp = new LinkedHashMap<String,Double>();
	    
	    int allmn[] = {5,6,7,8,9,10,11};

        Gson gson = new Gson();
        List<Rate> rate = new ArrayList<Rate>();
        Map<String,String> dianGxl = new LinkedHashMap<String,String>();
        
	    for(int i=0;i<name.size();i++){
	    	String thisname = (String) name.get(i);
	     
	    	double a=0;
	    	for(int k = 0; k < avg.length; k++){ //五个月份平均值-点源
	    		if(map.get(thisname+","+avg[k])==null)continue;
	    		a += ((Double)map.get(thisname+","+avg[k]));
	    	}
	    	a = a/5;
	    	
	    	//for(int k = 0; k < mian.length; k++){ //其余月份面源
	    	//	mianp.put(thisname+","+mian[k],(Double)map.get(thisname+","+mian[k])-a );
	    		////System.out.println(thisname+","+mian[k]+"\t\t"+ (Double)map.get(thisname+","+mian[k])+"-"+a+"="+((Double)map.get(thisname+","+mian[k])-a));
	    	//}
	    	
	    	for(int k = 0; k < allmn.length; k++){ 
	    	
	    		if(map.get(thisname+","+allmn[k])==null)continue;
	     
 		    		//rate.add(test.new Rate(thisname+","+allmn[k],
		    		//		String.valueOf(a/((Double)map.get(thisname+","+allmn[k]))),
		    		//		String.valueOf(1-(a/((Double)map.get(thisname+","+allmn[k]))))));*/
		    		dianGxl.put(thisname+","+allmn[k],a/(Double)map.get(thisname+","+allmn[k])+"" );//点源贡献率
		    		//mianyuangxl.put(thisname+","+allmn[k],1-a/(Double)map.get(thisname+","+allmn[k]) );//面源贡献率
		    		////System.out.println(thisname+","+allmn[k]+"\t\t"+a +"/"+(Double)map.get(thisname+","+allmn[k])+"="+a/(Double)map.get(thisname+","+allmn[k]) );
		    }
	    	
	    }
	    

	    System.out.println(unitName.size()+" "+uSections.size());
		
			
	    for(int i=0;i<unitName.size();i++){
	    	String uName = unitName.get(i);
	    	for(int d = 0;d < allmn.length;d++){
	    		if(uSections.get(i)!=null){ 
	    		
	    			String arr[] = uSections.get(i).split("、");	
		    		double avgs = 0;
		    		for(int k = 0; k < arr.length; k++){
		    			 
		    			
		    			if(dianGxl.get(arr[k]+","+allmn[d]) != null)
		    				avgs += Double.parseDouble(dianGxl.get(arr[k]+","+allmn[d]));
		    		}
	    			if(avgs!=0){ 
	 		    		rate.add(new Rate(URLEncoder.encode(uName+","+allmn[d], "UTF-8").replace("+","%20"),
			    				String.valueOf(avgs/arr.length),
			    				String.valueOf(1-(avgs/arr.length)))); 
	    			}	
	    		}
	    	}		
		    //System.out.println(gson.toJson(rate)); 
        }
	    return gson.toJson(rate); 
    }    
    
    public class Rate {
    	private String name;
        private String dRate;
        private String mRate;
        public Rate(String name, String dRate, String mRate) {
        	super();
			this.name = name;
			this.dRate = dRate;
			this.mRate = mRate;
		}
    }
}
