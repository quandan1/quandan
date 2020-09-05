package com.eliteams.quick4j.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.eliteams.quick4j.web.service.RoleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eliteams.quick4j.web.model.ControlUnit;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.security.PermissionSign;
import com.eliteams.quick4j.web.security.RoleSign;
import com.eliteams.quick4j.web.service.ControlUnitService;
import com.eliteams.quick4j.web.service.UserService;

/**
 * 用户控制器
 * 
 * @author StarZou
 * @since 2014年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private ControlUnitService controlUnitService;
    @Resource
    private RoleService roleService;
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 用户登录
     *
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {//String usercity,String county
        
        String sub_role = "";
        sub_role = "辽宁";
        try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                return "redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login";
            }
            // 身份验证
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));

            String rolename = roleService.getRoleNameByUname(user.getUsername());
            System.out.println("rolename:" + rolename);
            if (rolename.equals(sub_role) || rolename.equals("admin")) {
                // 验证成功在Session中保存用户信息
                final User authUserInfo = userService.selectByUsername(user.getUsername());
                request.getSession().setAttribute("userInfo", authUserInfo);
                request.getSession().setAttribute("userName", authUserInfo.getUsername());
                String name = this.userOfMap(request);
                request.getSession().setAttribute("name", name);
                String role = controlUnitService.getRoleSign(authUserInfo.getUsername());

                System.out.println("role------------->>>>" + role);
                request.getSession().setAttribute("role", role);
                Long user_id = userService.getIdByName(authUserInfo.getUsername());
                String role_name = userService.selectRoleNameById(user_id);
                System.out.println("实际名称:" + role_name);
                request.getSession().setAttribute("role_name", role_name);
            } else {
                subject.logout();
                model.addAttribute("wrong", "参数错误！");
                return "login";
            }
        } catch (ExcessiveAttemptsException e) { //AuthenticationException
            // 验证密码
            model.addAttribute("error", e.getMessage());

            return "login";
        } catch (UnknownAccountException e) {
            // 验证用户名
            model.addAttribute("error", e.getMessage());
            return "login";
        } catch (LockedAccountException e) {
            // 用户名锁定
            model.addAttribute("error", e.getMessage());
            return "login";
        }


        return "redirect:/";
    }


    /**
     * 找回密码
     * @param username
     * @param email
     * @param model
     * @return
     */
    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String find(String username ,String email ,Model model , HttpServletRequest request){
        if ("".equals(username) || username == null){
            model.addAttribute("msg","请输入要找回的用户名");
            return "find";
        }else {
            String e = userService.findByUsername(username);
            if (e == null){
                model.addAttribute("msg","用户名输入错误!");
                return "find";
            }else if (e.equals(email)){
                request.getSession().setAttribute("username",username);
                return "update";
            }else {
                model.addAttribute("msg","请输入正确的邮箱");
                return "find";
            }
        }

    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update( String pwd1 , String pwd2 ,Model model ,HttpServletRequest requset){
        Object username = requset.getSession().getAttribute("username");
        if ("".equals(pwd1) || pwd1 == null ){
            model.addAttribute("msg","请输入密码");
            return "update";
        }else if ("".equals(pwd2) || pwd2==null){
            model.addAttribute("msg","请再次输入密码");
            return "update";
        }else if (!pwd1.equals(pwd2)){
            model.addAttribute("msg","请输入正确的密码");
            return "update";
        }
        Object password = new SimpleHash("md5", pwd1, ByteSource.Util.bytes(username), 1024);
        String pwd = String.valueOf(password);
        userService.updatePwd(pwd);
        return "login";

    }
    
    /**
     * 根据用户权限筛选控制单元显示内容
     */
    public String userOfMap(HttpServletRequest request){
        Map<String,String> map = new HashMap<String,String>();
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
		    map.put("username",(String) request.getSession().getAttribute("userName"));
		    map.put("id",null);
        //为地图查询数据
        List<ControlUnit> listForMap = controlUnitService.selectForMap(map);
        int i=0;
        int j=listForMap.size();
        String name="";
        for(ControlUnit c:listForMap){
     	   i++;
            if(i<j){
               name = name+"单元名称='"+c.getUnitName()+"' or ";       	   
            }else{
         	  name = name+"单元名称='"+c.getUnitName()+"'";
            }
        }
        try {
			name = URLEncoder.encode(name, "UTF-8").replace("+","%20");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return name;
    }
    
    /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        session.removeAttribute("userName");
        session.removeAttribute("name");
        session.removeAttribute("role");
        // 登出操作
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }
    
    @RequestMapping("/isAdmin")
   	public void isAdmin(HttpServletRequest request,HttpServletResponse response) {
    	String username = request.getSession().getAttribute("userName").toString();
       	int result = userService.isAdmin(username);
       	PrintWriter out = null;  
        try {
        	out = response.getWriter();
   		} catch (IOException e) {
   			e.printStackTrace();	
   		}  
        out.write(String.valueOf(result));
   	}
    
    /**  
     * 添加用户信息  
     * @throws ParseException 
     * @throws NoSuchAlgorithmException 
     */  
    @RequestMapping("/insert") 
    @ResponseBody
    public String insert(HttpServletRequest request ) throws ParseException, NoSuchAlgorithmException{ 	
    	User user = new User();
    	String username = request.getParameter("username"); 
    	String password = request.getParameter("password"); 
    	String city = request.getParameter("city"); 
    	String county = request.getParameter("county"); 
    	
    	user.setUsername(username);
    	
    	byte[] bt = password.getBytes();
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	md.update(bt);
    	String strDes = bytes2Hex(md.digest());
    	user.setPassword(strDes);
    	user.setCreateTime(new Date());
    	int result = userService.insert(user);
    	
    	String role;
    	if(county.equals("")){
    		role = city;
    	}else{
    		role = city+"_"+county;
    	}
    	int result2 = userService.setRole(username,role);
    	
        request.setAttribute("result", result);  
        if(result>0){
      	  return "success";
      	}else{
      	  return "error";
      	}
    }
    
    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
      
    /**  
     * 删除用户 ，根据id删除  
     */  
    @RequestMapping("/delete")  
    @ResponseBody
    public String delete(HttpServletRequest request,Integer id){  
    	int result=userService.delete(id);  
    	request.setAttribute("result", result);
    	if(result>0){
    	  return "success";
    	}else{
    	  return "error";
    	}
    }
    
    @RequestMapping("/list") 
    public String userList(HttpServletRequest request,Model model){
    	String pageNow = request.getParameter("pageNow"); 
        model = userService.selectUserByPage(pageNow, model);  
        return "user/userList";
    }
    
    
    @RequestMapping("/getCounty") 
    public void getCounty(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
    	String cityName = request.getParameter("cityName"); 
       	List<String> result = userService.getCountyByCity(cityName);
       	PrintWriter out = null;  
           try {
   			out = response.getWriter();
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
        //String xmString = new String(result.toString().getBytes("UTF-8"));
        String u = URLEncoder.encode(result.toString(), "UTF-8");

        out.write(u);
    }

    /**
     * 查询管辖区域：市/县
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getRegions")
    public @ResponseBody List<String> getRegions(HttpServletRequest request,HttpServletResponse response){
        String userName= (String) request.getSession().getAttribute("userName");
        List<String> citylist = new ArrayList<>();
        String sql = "SELECT role_sign from role WHERE id in(SELECT role_id FROM user_role " +
                "WHERE user_id in(SELECT id from user where username=?))";
        //根据用户名获取权限标识
        String role_sign=jdbcTemplate.queryForObject(sql, new String[]{userName}, String.class);
        if ("1".equals(role_sign) || "admin".equals(role_sign)) {
            List<Map<String, Object>> list=jdbcTemplate.queryForList("select role_name from role where role_sign='2'");
            for (Map<String, Object> map : list) {
                for (Map.Entry<String, Object> entry : map.entrySet()){
                    citylist.add(entry.getValue().toString());
                }
            }
        } else if ("2".equals(role_sign)) {
            citylist=userService.getCountyByCity(roleService.getRoleNameByUname(userName));
        }
        return citylist;
    }



}
