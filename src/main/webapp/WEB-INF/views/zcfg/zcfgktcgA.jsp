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
	var type = $("#typeA").val();
	var url = "rest/Zcfg/selectKTCGA?type="+type;
	$.get(url, function(data) {
	    //console.log(data);
		$('#listAll').html(data);
		$('#inst').toggle();
	});
</script>
<%--返回上一级--%>
<script>
$('#back').click(function(){
	    console.log("back");
		$.get("rest/page/zcfgKtcg", function(data) {
			$('#index-page-title').text("政策法规管理-课题成果");
			$('#main-content').html(data);
			$('#listAll').empty();
			var url_new = "rest/Zcfg/selectKTCG?type=KTCG";
			$.get(url_new, function(data) {
				$('#listAll').html(data);
			});
		}); 
});
</script>
</head>
<body>
<input type="hidden" value="${role_name}" name="test" id="hasGetRoleName"/>
<%--<input type="text" value="${role_name}市"/>--%>
<input type="hidden" value="${role_sign}" id="hasGetRoleSign"/>
<input type="hidden" id="typeA" name="typeA"/>
	<div id="all">
	       <div id="left" style="width:10%;" >
	          <button type="button" class="btnz btnz-info" id="back">返回上一级</button>
	       </div>
	       <div id="right" style="width:90%;" >
	 				<div class="form-group" >  
	 				   
						  <c:if test="${ role_sign == 'admin' or role_sign == '1' }">
							 <div>
								 <div style="width:10px;float:left;">&nbsp;</div>
								 <div  id="uploader" style="float:left;" >
								 <input id="file" name="file" type="file" width="500px">
								 </div>
								 <div style="color:#999999" id="inst">
				                                                        上传文档支持格式：doc、docx、txt、pdf
				                 <hr width="250" color="#999999" size="5">
				                 </div>	
							 </div>
						 </c:if>
						<script type="text/javascript">
                            $(document).ready(function() {

                                $('#addButton').click(function(){
                                    var url = "rest/page/addZcfgKtcgA";
                                    $.get(url, function(data) {
                                        $('#addDiv').html(data);
                                    });
                                });

                            });

						</script>
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
					<h4 class="modal-title" id="myModalLabel modal-title">添加课题成果</h4>
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
                                    var type = $("#typeA").val();
                                    var url = "rest/Zcfg/selectKTCGA?type="+type;
									$.get(url, function(data) {
										$('#listAll').html(data);
									});
								}	
							}								
						});
					});
					
				</script>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="addCu_x">ADD</button>
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
						var type = $("#typeA").val();
						var url = "rest/Zcfg/selectKTCGA?type="+type;
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
	
	<%--<script type="text/javascript" src="app/js/zcfg/zcfg.js"></script>--%>
	<script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.all.js"> </script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.config.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/ueditor.all.min.js"> </script>
	<script type="text/javascript" src="app/js/Ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript" src="app/js/Ueditor/third-party/zeroclipboard/ZeroClipboard.js"></script>
</body>
</html>