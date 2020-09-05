<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">
<link href="app/js/Ueditor/themes/default/css/ueditor.css" rel="stylesheet" type="text/css">
<link href="app/css/zcfg/fileinput.css" type="text/css" rel="stylesheet" />
<link href="app/css/zcfg/fileinput-rtl.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" href="app/js/Ueditor/themes/default/css/ueditor.css">  


<!--<script src="app/js/jquery-2.0.3.min.js"type="text/javascript"></script> 有顺序，jquery在上 
<script src="app/js/bootstrap.min.js"type="text/javascript"></script>-->
<script src="app/js/fileinput.js" type="text/javascript" ></script>
<script src="app/js/fileinput_locale_zh.js" type="text/javascript"></script>


<script>
	$('#inst').toggle();
	var url = "rest/Zcfg/listSJ";
	$.get(url, function(data) {
		$('#listAll').html(data);
		$('#inst').toggle();
	});
</script>

<script>
	$(function(){
		function initFileInput() { 
			var type =encodeURI(encodeURI("WZGLSJ"));
		    var toUrl = "rest/Zcfg/save?type="+type;
			$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");		
			$("#file").fileinput({  
					 
				language: 'zh', //设置语言
				uploadUrl: toUrl, //上传的地址
				allowedPreviewTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
				allowedPreviewMimeTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
				allowedFileTypes : ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
				allowedFileExtensions: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],//接收的文件后缀
				//uploadExtraData:{"id": 1, "fileName":'123.mp3'},//额外传递参数
				uploadAsync: false, //默认true异步上传
				uploadLabel: "确认上传",//设置上传按钮的汉字
				browseLabel: "浏览",
				showUpload: true, //是否显示上传按钮
				showRemove : false, //显示移除按钮
				showPreview : false, //是否显示预览
				showCaption: false,//是否显示标题
				browseClass: "btnz btnz-info", //按钮样式
				dropZoneEnabled: false,//是否显示拖拽区域
				//autoReplace: true, //替换
				//showCaption: true,//是否显示标题  
				//showCaption: true,
				//mainclass： "input-group-lg",
				maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
				//minFileCount: 1,
				maxFileCount: 1, //表示允许同时上传的最大文件个数
				enctype: 'multipart/form-data',
				validateInitialCount:true,
				previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
				msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
				
			}).on('filebatchselected', function (event, data, id, index) {
		
				var filename = data[0].name;
				var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
				if(!(fileExtension == 'doc'||fileExtension == 'DOC'||
					  fileExtension == 'docx'||fileExtension == 'DOCX'||
						 fileExtension == 'pdf'||fileExtension == 'PDF'||
							fileExtension == 'txt'||fileExtension == 'TXT')){
					alert('选择上传文件格式错误！\n格式要求[doc,docx,pdf,txt].\n请重新选择文件！');
					initFileInput();
					throw SyntaxError();
				}
				var json = {
					"jsfile" : filename
				}; 
				$.ajax({
					type : "POST",
					async : true,
					url : "rest/Zcfg/getType",
					data: json,
					success : function(data) {
						if(data == "true"){
							$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
							initFileInput();
							alert('文件已存在！\n请重新选择文件！');	
						}
						
					}
				});
			}).on("filebatchuploadsuccess", function (event, data) { 
				console.log(data.response);  
				$.get("rest/Zcfg/listSJ", function(data) {
					$('#listAll').html(data);
				});
		 
			});
		}
		 
		initFileInput();
			
		//异步上传成功结果处理
		//$('#' + ctrlName).on("fileuploaded", function (event, data, previewId, index) {})
		//异步上传错误结果处理		
		//$('#' + ctrlName).on('fileerror', function(event, data, msg) {});   
		//同步上传错误结果处理
		//$('#' + ctrlName).on('filebatchuploaderror', function(event, data, msg) {});   
		//同步上传成功结果处理
		 
 
	});    
 
	     
</script>

</head>
<body>
	<div id="all">

		 <div id="left" style="width:100%;" >
	 				<div class="form-group" >  
					<!--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal_upload" id="uploadButton">Upload1</button> -->		
							<div>
								<!-- <div style="float:left;"><button type="button" class="btnz btnz-info" data-toggle="modal" data-target="#myModal" id="addButton"  >添加政策法规</button></div> -->
							    <div style="width:10px;float:left;">&nbsp;</div>
								<div id="uploader" style="float:left;" ><input id="file" name="file" type="file" width="250px"></div>
								<!--<input id="file" name="file" type="file" data-show-caption="true">
								<p class="help-block">支持word格式，大小不超过2.0M</p>  -->
							    <div style="color:#999999" id="inst">
				                                                        上传文档支持格式：doc、docx、txt、pdf
				                <hr width="250" color="#999999" size="5">
				                </div>	
							</div>  
					</div>	 
				 		
	        </div>
	        <div id="listAll"></div>
	</div>
	
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div id="addDiv">
					</div>
				</div>
				<script type="text/javascript">
					$('#addCu_x').click(function() {
						$.ajax({
							type : "POST",
							async : false,
							url : "rest/Zcfg/insert",
							data : $('#insertForm').serialize(),		
							success : function(data) {
								if(data=="existant"){
									alert('文件已存在！\n请重新选择文件！');	
								}
								else{ 
									$.get("rest/Zcfg/list", function(data) {
										$('#listAll').html(data);
									});
								}	
							}								
						});
					});
					
				</script>
				<div class="modal-footer">
					<button type="button" class="btnz btnz-info" data-dismiss="modal" id="addCu_x">添加</button>
				</div>
			</div>
		</div>
	</div>
	
    <!-- Modal -->
	<div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div id="editDiv"></div>

				</div>
				<script type="text/javascript">
					$('#editCu_1').click(function() {
						$.ajax({
							type : "POST",
							dataType : "Zcfg",
							async : false,
							url : "rest/Zcfg/update",
							data : $('#editForm').serialize()
						});
						
						var url = "rest/Zcfg/list";
						$.get(url, function(data) {
							$('#listAll').html(data);
						});
					});
					
				</script>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="editCu_1">Edit</button>
				</div>
			</div>
		</div>
	</div>
	
	<!-- <script type="text/javascript" src="app/js/zcfg/zcfg.js"></script> -->
	<script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.all.js"> </script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.config.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.all.min.js"> </script>
	<script type="text/javascript" src="app/js/Ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/third-party/zeroclipboard/ZeroClipboard.js"></script>
</body>
</html>
