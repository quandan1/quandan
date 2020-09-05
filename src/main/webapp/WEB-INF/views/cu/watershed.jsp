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
<link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
</head>
<body>
	<select name="sy" id="sy" title="指标分析"
		style="margin-right: 5px; width: 138px; text-align: center"
		onchange="water()">
		<option value="">流域</option>
<%-- 		<c:forEach var="water" items="${water}">
			<option value="${water['SZLYMC']}">${water['SZLYMC']}</option>
		</c:forEach> --%>
		
		<option value="辽河">辽河</option>
		<optgroup label="一级支流">
			<option value="柳河（新开河）">柳河（新开河）</option>
			<option value="绕阳河">绕阳河</option>
			<option value="拉马河">拉马河</option>
			<option value="秀水河">秀水河</option>
			<option value="养息牧河">养息牧河</option>
			<option value="柴河">柴河</option>
			<option value="清河">清河</option>
			<option value="亮子河">亮子河</option>
			<option value="长沟河">长沟河</option>
			<option value="招苏台河">招苏台河</option>
		</optgroup>
		<optgroup label="二级支流">
			<option value="二道河">二道河</option>
			<option value="寇河">寇河</option>
			<option value="马仲河">马仲河</option>
			<option value="碾盘河">碾盘河</option>
			<option value="沙河">沙河</option>
			<option value="条子河">条子河</option>
			<option value="小南河">小南河</option>
		</optgroup>
		<optgroup label="三级支流">
			<option value="红山河">红山河</option>
		</optgroup>
		<option value="浑河">浑河</option>
		<optgroup label="一级支流">
			<option value="蒲河">蒲河</option>
			<option value="细河">细河</option>
			<option value="苏子河">苏子河</option>
		</optgroup>
		<option value="太子河">太子河</option>
		<optgroup label="一级支流">
			<option value="沙河">沙河</option>
			<option value="海城河">海城河</option>
			<option value="南沙河">南沙河</option>
			<option value="五道河">五道河</option>
			<option value="杨柳河">杨柳河</option>
			<option value="运粮河">运粮河</option>
			<option value="细河">细河</option>
			<option value="马圈子河">马圈子河</option>
			<option value="北沙河（沙河）">北沙河（沙河）</option>
			<option value="兰河">兰河</option>
			<option value="汤河">汤河</option>
			<option value="运粮河">运粮河</option>
		</optgroup>
		<optgroup label="二级支流">
			<option value="柳壕河">柳壕河</option>
		</optgroup>
		
	</select>
	<script type="text/javascript" src="app/js/cu/watershed.js"></script>
</body>
</html>