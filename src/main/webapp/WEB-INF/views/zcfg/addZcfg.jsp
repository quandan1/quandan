<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>Insert title here</title>
</head>
<body>
	<div class="mainBox"
						style="height: auto !important; height: 550px; min-height: 550px;">
						<h3>添加政策</h3>
	<form id="insertForm">
		<table width="100%" border="0" cellpadding="8" cellspacing="0"
			class="tableBasic">
			<tr>
				<td width="90" align="right">名称</td>
				<td><input type="text" size="60" class="inpMain"  name="title" id="title" /></td>
			</tr>
            <tr>
				<td width="90" align="right">生成日期</td>
				<td><input type="text" size="60" class="inpMain"  name="generate" id="generate" readonly/></td>
			</tr>
			<tr>
				<td width="90" align="right">类别</td>
				<!--<td><input type="text" size="60" class="inpMain"  name="type" id="type" /></td>-->
				<td> 
				 <select name="type" id="type" style="width:255px;">
                      <option value="未分类" >未分类</option>
                      <option value="环保法" >环保法</option>
                      <option value="政策"> 政策</option>
                      <option value="法律"> 法律</option>
                 </select>
               </td>
			</tr>
			<tr>
				<td width="90" align="right">发布日期</td>
				<td>
				    <input type="text" size="60" class="inpMain"  name="publish" id="publish" class="Wdate"  onFocus="WdatePicker({lang:'zh-cn',readOnly:true})" />
				</td>
			</tr>
			<!-- <tr>
				<td width="90" align="right">下载次数</td>
				<td><input type="text" size="60" class="inpMain"  name="downNumber" id="downNumber" /></td>
			</tr> -->
			<tr>
				<td width="90" align="right">题目</td>
                <td><input type="text" size="60" class="inpMain"  name="title" id="title" /></td>			
            </tr>
            <tr>
				<td width="90" align="right">内容</td>
                <td>
                <!-- <textarea name="content" id="content" class="inpMain" rows="20"  cols="60"></textarea> -->
                <script id="ueditor" type="text/plain" name="myContent">
                </script>
                </td>			
            </tr>
		</table>
		<!-- <input type="button" id="addZcfg" class="addZcfg" value="添加"/> -->
	</form>
	<script type="text/javascript" src="app/js/zcfg/addZcfg.js"></script>
    <script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript">
		UE.delEditor("ueditor");
        var ue = UE.getEditor("ueditor",
        {toolbars:[['Undo', 'Redo','bold','underline']]});
		var publishDate = document.getElementById("publish");
		var generateDate= document.getElementById("generate");
	    var date = new Date();
	    var seperator1 = "-";
	    var year = date.getFullYear();
	    var month = date.getMonth() + 1;
	    var strDate = date.getDate();
	    if (month >= 1 && month <= 9) {
	        month = "0" + month;
	    }
	    if (strDate >= 0 && strDate <= 9) {
	        strDate = "0" + strDate;
	    }
	    var currentdate = year + seperator1 + month + seperator1 + strDate
	    publishDate.value=currentdate;
	    generateDate.value=currentdate;
    </script>
</body>
</html>