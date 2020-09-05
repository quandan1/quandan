package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.service.PollFactoryService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;


@Controller
@RequestMapping(value="/poll")
public class PollController {

    @Resource
    private PollFactoryService pollfactoryService;

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	private String fileType;



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
	public String fileUpload(HttpServletRequest request) throws Exception{
		String checkFileType = this.getFileType();
		System.out.println(checkFileType);
		String dir = "";
		//文件存储路径
		String path;
		//带"/"的文件名，用来生成路径
		String filename_forPath = "\\";
		//用来记录文件名
		String filename;
		String zpqy = "zpqy";
		String wsclc = "wsclc";
		String gmhxqyz = "gmhxqyz";
		String baseDir = "upload/poll/";
		String chooseThisDir;
		//判断文件类型
		if(checkFileType.equals("zpqy")){
			chooseThisDir = zpqy;
			dir = request.getSession().getServletContext().getRealPath(baseDir+zpqy);
		}else if (checkFileType.equals("wsclc")){
			chooseThisDir = wsclc;
			dir = request.getSession().getServletContext().getRealPath(baseDir+wsclc);
		}else{
			chooseThisDir = gmhxqyz;
			dir = request.getSession().getServletContext().getRealPath(baseDir+gmhxqyz);
		}
		System.out.println(dir);
//        QmpController qmp = new QmpController();
		Map<String, Object> err = new HashMap<String, Object>();
		err.put("status", "myerror");
		Gson gson = new Gson();
		long  startTime=System.currentTimeMillis();
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
		if(multipartResolver.isMultipart(request)){

			MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
			Iterator<?> iter=multiRequest.getFileNames();
			while(iter.hasNext()){

				MultipartFile file=multiRequest.getFile(iter.next().toString());

				if(file!=null){
					String TIME = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(java.util.Calendar.getInstance().getTime());
					this.setFileUploadTime(TIME);
					String[] fopt = file.getOriginalFilename().split("\\.");
					System.out.println("orifilename:");
					System.out.println(file.getOriginalFilename());
					fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
					filename_forPath += fopt[0]+'_'+TIME + '.' + fopt[1];
					filename = fopt[0]+'_'+TIME + '.' + fopt[1];
					this.setFileUploadName(filename);
					System.out.println("filename:");
					System.out.println(filename);
					path = dir + filename_forPath;
					this.setFileUploadPath(path);
					System.out.println("path:");
					System.out.println(path);
					File dirCheck = new File(dir);
					if(!dirCheck.exists() && !dirCheck.isDirectory()){
						System.out.println("文件夹不存在，正在创建"+chooseThisDir+"文件夹");
						dirCheck.mkdir();

					}
					else {
						System.out.println(chooseThisDir+"文件夹已存在");
					}

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
	@RequestMapping("/bulkImportPoll")
	@ResponseBody
	public String bulkImportPoll(HttpServletRequest request) throws Exception {
		poiExcelPoll poiExcelPoll = new poiExcelPoll();
		String fileType = this.getFileType();
		long  startTime=System.currentTimeMillis();
		String oriFileName = request.getParameter("name");
		String fileName = this.getFileUploadName();
		String filePath = this.getFileUploadPath();
		String fileUploadTime = this.getFileUploadTime();

		String msg = poiExcelPoll.poiExceltoSql(oriFileName,fileName,filePath,fileUploadTime, fileType);
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


	@RequestMapping("/getType")
	@ResponseBody
	public String getType(HttpServletRequest request) throws Exception{
//        QmpController qmp = new QmpController();
		Map<String, Object> err = new HashMap<String, Object>();
		err.put("status", "myerror");
		Gson gson = new Gson();

		String fileType = request.getParameter("fileType");
		System.out.println(fileType);
		this.setFileType(fileType);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("filetype",fileType);
		result.put("status", "success");

		return gson.toJson(result);
	}



}
