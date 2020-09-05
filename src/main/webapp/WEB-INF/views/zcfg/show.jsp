<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<link href="app/css/cu/public.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="app/lib/jquery/jquery.js"></script>
</head>
<body>
	 
	 
 
	<c:choose>
		   <c:when test="${fn:contains(zcfg.name,'pdf')}">
				<iframe src="upload/zcfg/${zcfg.name}" style="width:100%;" frameborder="0" height="770px" ></iframe>
		   </c:when>
		   <c:when test="${fn:contains(zcfg.name,'PDF')}">
				<iframe src="upload/zcfg/${zcfg.name}" style="width:100%;" frameborder="0" height="770px" ></iframe>
		   </c:when>
		   <c:otherwise>
				 <h1 align="center"><font size="8"><strong>${zcfg.title}</strong></font></h1>
				 <h3><font size="3">${zcfg.content}</font></h3>
				 <div style="position: absolute; bottom: 10px; right: 10px;"><font size="3">生成日期：${zcfg.generateDateString}</font></div>
		   </c:otherwise>
		</c:choose>

		<!-- 
        <h1 align="center"><font size="8"><strong>${zcfg.title}</strong></font></h1>

        <h3><font size="3">${zcfg.content}</font></h3>
        <div style="position: absolute; bottom: 10px; right: 10px;"><font size="3">生成日期：${zcfg.generateDateString}</font></div>

		-->

	
	
</body>
</html>