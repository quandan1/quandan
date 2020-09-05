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
	<div id="list" style="display: block">
		<table width="100%" border="0" cellpadding="8" cellspacing="0"
			class="tableBasic" id="list_t">
			<tr>
				<th width="22" align="center"><input name='chkall'
					type='checkbox' id='chkall' onclick='selectcheckbox(this.form)'
					value='check'></th>
				<th width="70" align="center">序号</th>
				<th align="left">控制单元名称</th>
				<th width="70" align="center">地域范围</th>
				<th width="70" align="center">现状</th>
				<th width="70" align="center">目标</th>
				<th width="70" align="center">起始时间</th>
				<th width="70" align="center">达标年限</th>
				<th width="70" align="center">操作</th>
			</tr>
			<c:forEach var="cta" items="${ulist}">
				<tr>
					<td align="center"><input type="checkbox" name="checkbox[]"
						value="1" /></td>
					<td align="center">${cta.id }</td>
					<td>${cta.name }</td>
					
					<td align="center">${cta.area }</td>
					<td align="center">${cta.condition }</td>
					<td align="center">${cta.goal }</td>
					<td align="center">${cta.starttime }</td>
					<td align="center">${cta.deadline }</td>
					<td align="center">
							<a href="rest/cta/id?id=${cta.id}" class="updateButton">修改</a> 
							<a href="rest/cta/delete?id=${cta.id}" class="deleteButton">删除</a>
					</td>
				</tr>
			</c:forEach>

		</table>
	</div>
	<script type="text/javascript" src="app/lib/jquery/jquery.js"></script>
	<script type="text/javascript" src="app/js/cta/ctaList.js"></script>
</body>
</html>