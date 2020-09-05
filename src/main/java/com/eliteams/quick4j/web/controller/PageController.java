package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.service.ControlUnitService;
import com.eliteams.quick4j.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author StarZou
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/page")
public class PageController {
	@Resource
	private UserService userService;
	@Resource
	private ControlUnitService controlUnitService;

	/**
	 * 找回密码界面
	 * @return
	 */
	@RequestMapping("/find")
	public String findPwd(){
		return "find";
	}

	/**
	 * 测试页
	 */
	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	/**
	 * 登录页
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * dashboard页
	 */
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	/**
	 * demo页
	 */
	@RequestMapping("/demo")
	public String demo() {
		return "demo";
	}

	/**
	 * addQmp页
	 */
	@RequestMapping("/addQmp")
	public String addQmp() {
		return "qmp/addQmp";
	}

    /**
     * addQmpSzxz页
     */
    @RequestMapping("/addQmpSzxz")
    public String addQmpSzxz() {
        return "qmp/addQmpSzxz";
    }

	/**
	 * qmpList页
	 */
	@RequestMapping("/qmpList")
	public String qmpList() {
		return "redirect:/rest/qmp/list";
	}

	/**
	 * searchQmp页
	 */
	@RequestMapping("/searchQmp")
	public String searchQmp() {
		return "qmp/searchQmp";
	}

	/**
	 * newQmp页
	 */
	@RequestMapping("/newQmp")
	public String newQmp() {
		return "qmp/qmp";
	}

	@RequestMapping("/kzdmwater")
	public String kzdmwater() {
		return "qmp/kzdmwater";
	}

	/**
	 * qmpAnalysis页
	 */
	@RequestMapping("/qmpAnalysis")
	public String qmpAnalysis() {
		return "qmp/qmpAnalysis";
	}

	/**
     * bulkImportQmp页
     */
    @RequestMapping("/bulkImportQmp")
    public String bulkImportQmp() {
        return "qmp/bulkImportQmp";
    }


    /**
     * searchQmpSzxz页
     */
    @RequestMapping("/searchQmpSzxz")
    public String searchQmpSzxz() {
        return "qmp/searchQmpSzxz";
    }

	/**
	 * bulkImportQmpSzxz页
	 */
	@RequestMapping("/bulkImportQmpSzxz")
	public String bulkImportQmpSzxz() {
		return "qmp/bulkImportQmpSzxz";
	}


	// /**
	// * qmpfileUpload页
	// */
	// @RequestMapping("/qmpfileUpload")
	// public String fileUpload() {
	// return "qmp/fileUpload";
	// }

	/****************************************/
	// addPollSource.page
	@RequestMapping("/addPollSource")
	public String addPollSource() {
		return "pollsource/addPollSource";
	}

	// listPollSource.page
	@RequestMapping("/listPollSource")
	public String listPollSource() {
		return "redirect:/rest/psrc/list";
	}

	// editPollSource.page
	@RequestMapping("/editPollSource")
	public String editPollSource() {
		return "pollsource/editPollSource";
	}

	// searchPollSource页
	@RequestMapping("/searchPollSource")
	public String searchPollSource() {
		return "pollsource/searchPollSource";
	}

	// newPollSource页
	@RequestMapping("/newPollSource")
	public String newPollSource() {
		return "pollsource/pollsource";
	}

	// ----------------------------------------
	// addPollF.page
	@RequestMapping("/addPollFactory")
	public String addPollFactory() {
		return "pollfactory/addPollFactory";
	}

	// listPollF.page
	@RequestMapping("/listPollFactory")
	public String listPollFactory() {
		return "redirect:/rest/pfty/list";
	}

	// editPollF.page
	@RequestMapping("/editPollFactory")
	public String editPollFactory() {
		return "pollfactory/editPollFactory";
	}

	// searchPollF
	@RequestMapping("/searchPollFactory")
	public String searchPollFactory() {
		return "pollfactory/searchPollFactory";
	}
	// ****************************************

	// ----------------------------------------
	// addPollY.page
	@RequestMapping("/addPollYangZhi")
	public String addPollYangZhi() {
		return "pollYangZhi/addPollYangZhi";
	}

	// listPollY.page
	@RequestMapping("/listPollYangZhi")
	public String listPollYangZhi() {
		return "redirect:/rest/pyz/list";
	}

	// editPollY.page
	@RequestMapping("/editPollYangZhi")
	public String editPollYangZhi() {
		return "pollYangZhi/editPollYangZhi";
	}

	// searchPollY
	@RequestMapping("/searchPollYangZhi")
	public String searchPollYangZhi() {
		return "pollYangZhi/searchPollYangZhi";
	}
	// ****************************************

	/**
	 * bulkImportCU页
	 */
	@RequestMapping("/bulkImportCu")
	public String bulkImportCu() {
		return "cu/bulkImportCu";
	}

	/**
	 * bulkImportPoll_download页
	 */
	@RequestMapping("/bulkImportPoll_download")
	public String bulkImportPoll_download() {
		return "pollsource/bulkImportpoll_download";
	}

	/**
	 * bulkImportPoll页
	 */
	@RequestMapping("/bulkImportPoll")
	public String bulkImportPoll() {
		return "pollsource/bulkImportpoll";
	}

	/**
	 * qmpfileUpload页
	 */
	@RequestMapping("/fileUploadCu")
	public String fileUploadCu() {
		return "controlunit/fileUpload";
	}

	/**
	 * addControlUnit
	 */
	@RequestMapping("/addCUnit")
	public String addCUnit() {
		return "cu/addCUnit";
	}

	/**
	 * controlUnitList
	 */
	@RequestMapping("/CUnitList")
	public String CUnitList() {
		return "redirect:/rest/controlunit/list";
	}

	/**
	 * editControlUnit
	 */
	@RequestMapping("/editCUnit")
	public String editCUnit() {
		return "cu/editCUnit";
	}

	/**
	 * addZcfg
	 */
	@RequestMapping("/addZcfg")
	public String addZcfg() {
		return "zcfg/addZcfg";
	}
	/**
	 * addZcfgKtcg
	 */
	@RequestMapping("/addZcfgKtcg")
	public String addZcfgKtcg() {
		return "zcfg/addZcfgKtcg";
	}


	/**
	 * addZcfgGjj
	 */
	@RequestMapping("/addZcfgGjj")
	public String addZcfgGjj() {
		return "zcfg/addZcfgGjj";
	}

	/**
	 * addZcfgSj
	 */
	@RequestMapping("/addZcfgSj")
	public String addZcfgSj() {
		return "zcfg/addZcfgSj";
	}

	/**
	 * addZcfgShj
	 */
	@RequestMapping("/addZcfgShj")
	public String addZcfgShj(Model model, @RequestParam(value = "rolename") String rolename)
			throws UnsupportedEncodingException {
		System.out.println(rolename);
		String newrolename = URLDecoder.decode(rolename, "utf-8");
		model.addAttribute("role_name", newrolename);
		return "zcfg/addZcfgShj";
	}

	/**
	 * zcfgList
	 */
	@RequestMapping("/zcfgList")
	public String zcfgList() {

		return "redirect:/rest/Zcfg/list";
	}

	/**
	 * editZcfg
	 */
	@RequestMapping("/editZcfg")
	public String editZcfg() {
		return "zcfg/editZcfg";
	}

	/**
	 * wzglGJJ
	 */
	@RequestMapping("/wzglGJJ")
	public String wzglGJJ() {
		return "zcfg/wzglGJJ";
	}

	/**
	 * wzglSJ
	 */
	@RequestMapping("/wzglSJ")
	public String wzglSJ() {
		return "zcfg/wzglSJ";
	}
	/**
	 * zcfgKtcg 返回课题成果政策法规
	 */

	@RequestMapping("/zcfgKtcg")
	public String zcfgKtcg(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);
		return "zcfg/zcfgktcg";
	}
	/**
	 * zcfgGjj 返回国家级政策法规
	 */
	@RequestMapping("/zcfgGjj")
	public String zcfgGjj(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		// String role_sign = controlUnitService.getRoleSign(name);
		//
		// Long user_id = userService.getIdByName(name);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);
		return "zcfg/zcfggjj";
	}

	/**
	 * zcfgKtcg返回课题成果文件夹政策法规
	 */
	@RequestMapping("/zcfgKtcgA")
	public String zcfgKtcgS(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		// String role_sign = controlUnitService.getRoleSign(name);
		//
		// Long user_id = userService.getIdByName(name);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);

		return "zcfg/zcfgktcgA";
	}
	/**
	 * zcfgGjj 返回国家级文件夹政策法规
	 */
	@RequestMapping("/zcfgGjjA")
	public String zcfgGjjS(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		// String role_sign = controlUnitService.getRoleSign(name);
		//
		// Long user_id = userService.getIdByName(name);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);

		return "zcfg/zcfggjjA";
	}

	/**
	 * zcfgSj 返回省级政策法规
	 */
	@RequestMapping("/zcfgSj")
	public String zcfgSj(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		// String role_sign = controlUnitService.getRoleSign(name);
		//
		// Long user_id = userService.getIdByName(name);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);
		return "zcfg/zcfgsj";
	}

	/**
	 * zcfgSj 返回省级文件夹政策法规
	 */
	@RequestMapping("/zcfgSjB")
	public String zcfgSjB(HttpServletRequest request, Model model) {
		String name = (String) request.getSession().getAttribute("userName");
		// String role_sign = controlUnitService.getRoleSign(name);
		//
		// Long user_id = userService.getIdByName(name);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", name);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);
		return "zcfg/zcfgsjB";
	}

	/**
	 * zcfgShj 返回市级政策法规
	 */
	@RequestMapping("/zcfgShj")
	public String zcfgShj(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
		String username = (String) request.getSession().getAttribute("userName");
		// System.out.println(username);
		// String role_sign = controlUnitService.getRoleSign(username);
		// Long user_id = userService.getIdByName(username);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", username);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);
		return "zcfg/zcfgshj";
	}

	/**
	 * zcfgShj 返回市级文件夹政策法规
	 */
	@RequestMapping("/zcfgShjC")
	public String zcfgShjC(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
		String username = (String) request.getSession().getAttribute("userName");

		// System.out.println(username);
		// String role_sign = controlUnitService.getRoleSign(username);
		//
		// Long user_id = userService.getIdByName(username);
		// System.out.println(user_id);
		// String role_name = userService.selectRoleNameById(user_id);
		// System.out.println(role_name);
		String role_name = (String) request.getSession().getAttribute("role_name");
		System.out.println("实际名称:" + role_name);
		String role_sign = (String) request.getSession().getAttribute("role");
		model.addAttribute("name", username);
		model.addAttribute("role_name", role_name);
		model.addAttribute("role_sign", role_sign);

		return "zcfg/zcfgshjC";
	}

	/**
	 * 404页
	 */
	@RequestMapping("/404")
	public String error404() {
		return "404";
	}

	/**
	 * 401页
	 */
	@RequestMapping("/401")
	public String error401() {
		return "401";
	}

	/**
	 * 500页
	 */
	@RequestMapping("/500")
	public String error500() {
		return "500";
	}

	/**
	 * newCuҳ
	 */
	@RequestMapping("/newCu")
	public String newCu() {
		return "cu/cu";
	}

	/**
	 * searchCu页
	 */
	@RequestMapping("/searchCu")
	public String searchCu() {
		return "cu/searchCu";
	}

	/**
	 * kzdy
	 */
	@RequestMapping("/kzdyTotal")
	public String kzdyTotal() {
		return "cu/kzdy";
	}

	@RequestMapping("/newUser")
	public String newUser() {
		return "user/user";
	}

	@RequestMapping("/addUser")
	public String addUser() {
		return "user/addUser";
	}

	/**
	 * kzdm
	 */
	@RequestMapping("/kzdmTotal")
	public String kzdmTotal() {
		return "qmp/kzdm";
	}

	/**
	 * 排污许可证
	 */
	@RequestMapping("/pwxkz")
	public String pwxkz() {
		return "pwxk/pwxkz";
	}

	/**
	 * 断面面源总量计算
	 */
	@RequestMapping("/qmpMianyuan")
	public String qmpMianyuan() {
		return "qmp/qmpMianyuan";
	}

	/**
	 * 单元面源总量计算
	 */
	@RequestMapping("/cuMianyuan")
	public String cuMianyuan() {
		return "cu/cuMianyuan";
	}

	/**
	 * 单元点面源贡献率
	 */
	@RequestMapping("/DMrate")
	public String DMrate() {
		return "cu/DMrate";
	}
	
	/**
	 * 断面点面源贡献率
	 */
	@RequestMapping("/qmpDMrate")
	public String qmpDMrate() {
		return "qmp/qmpDMrate";
	}

	@RequestMapping("/qmpZijinCount")
	public String qmpZijinCount(){
		return "qmp/qmpZijinCount";
	}

	@RequestMapping("/qmpBczjtz")
	public String qmpBczjtz(){
		return "qmp/qmpBczjtz";
	}

	@RequestMapping("/qmpSzxz")
	public String qmpSzxz(){
		return "qmp/qmpSzxz";
	}

	@RequestMapping("/qmpTestData")
	public String qmpTestData(){
		return "qmp/qmpTestData";
	}

	@RequestMapping("/newQmpCount")
	public String newQmpCount(){
		return "qmp/newQmpCount";
	}

	@RequestMapping("/addNewQmpCount")
	public String addNewQmpCount(){
		return "qmp/addNewQmpCount";
	}

	@RequestMapping("/searchNewQmpCount")
	public String searchNewQmpCount(){
		return "qmp/searchNewQmpCount";
	}

	@RequestMapping("/bulkImportQmpBas")
	public String bulkImportQmpBas(){
		return "qmp/bulkImportQmpBas";
	}



	/**
	 * 测试页面
	 * **/
	@RequestMapping("/mike")
	public  String miketest(){return "mike/mikeTest"; }
	@RequestMapping("/mikeTwo")
	public  String miketesttwo(){return "mike/mikeTestTwo"; }
	@RequestMapping("/shuJu")
	public  String shuju(){return "mike/mikeShuJu"; }

	@RequestMapping("/xzpf")
	public  String xzpf(){return "mike/mikeXzpf"; }


}
