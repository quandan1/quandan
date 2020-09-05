<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
</head>
<body>
    <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
        <h3>修改政策</h3>
    <form id="editForm">
        <input type="text"  name="hidden" id="hidden" value="${zcfg.type}" style="display:none"/>
		<table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
			<tr>
				<td width="90" align="right">序号</td>
				<td><input type="text" size="60" class="inpMain" name="id" id="id" readonly="readonly" value="${zcfg.id}" /></td>
			</tr>
			<tr>
				<td width="90" align="right">名称</td>
				<td><input type="text" size="60" class="inpMain" name="name" id="name" value="${zcfg.name}" /></td>
			</tr>
			<tr>
				<td width="90" align="right">生成日期</td>
				<td><input type="text" size="60" class="inpMain" name="generate" id="generate" value="${zcfg.generateDateString}" readonly/></td>
			</tr>
			<tr>
				<td width="90" align="right">类别</td>
				<!-- <td><input type="text" name="type" id="type" value="${zcfg.type}" /></td> -->
				<td> 
				 <select name="type" id="type"  style="width:255px;">
                      <option value="未分类" >未分类</option>
                      <option value="环保法" >环保法</option>
                      <option value="政策"> 政策</option>
                      <option value="法律"> 法律</option>
                 </select>
               </td>
			</tr>
		    <tr>
				<td width="90" align="right">发布日期</td>
				<td><input type="text" size="60" class="inpMain" name="publish" id="publish" value="${zcfg.publishDateString}" class="Wdate" onFocus="WdatePicker({lang:'zh-cn',readOnly:true})"/></td>
			</tr>
			<!-- <tr>
				<td width="90" align="right">下载次数</td>
				<td><input type="text" size="60" class="inpMain" name="downNumber" id="downNumber" value="${zcfg.downNumber}" /></td>
			</tr> -->
			<tr>
				<td width="90" align="right">题目</td>
				<td><input type="text" size="60" class="inpMain" name="title" id="title" value="${zcfg.title}" /></td>
			</tr>
			<tr>
				<td width="90" align="right">内容</td>
                <td>
                <!-- <textarea name="content" id="content" class="inpMain" rows="20"  cols="60">
                ${zcfg.content}
                </textarea> -->
                <script id="editor" type="text/plain" name="cont">
                </script>
                </td>			
            </tr>
			<!--<tr>
				<td><input type="button" name="update" id="update" value="update" /></td>
			</tr>-->
		</table>
	</form>
	</div>
	<script type="text/javascript" src="app/js/zcfg/editZcfg.js"></script>
    <script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">
        UE.delEditor("editor");
        var ue = UE.getEditor("editor",
        {toolbars:[['Undo', 'Redo','bold','underline']]});
        ue.ready(function(){
     	   //ue.setContent("${newsinf.contect}");
     	   ue.execCommand('insertHtml', '${zcfg.content}');
        });
    </script>
</body>
</html>