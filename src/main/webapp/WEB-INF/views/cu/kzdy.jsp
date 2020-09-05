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
<link rel="stylesheet" type="text/css" href="app/css/kzdy/kzdy.css">

</head>
<body>
    <div id="all">
        <div id="up">
           	<div id="left">
	            <select name="choose" id="choose" title="指标分析" style="margin-right: 5px;width: 138px;text-align: center" onchange="change()">
					<option value="source">直排企业</option>
					<option value="yangzhi">规模化畜禽养殖</option>
					<option value="factory">污水处理厂</option>
					<option value="total">所有类型</option>
				</select>
				<select name="youkong" id="youkong" title="优控" style="margin-right: 5px;width: 138px;text-align: center" >
					<option value="0">优控</option>
					<option value="1">达标</option>
					<option value="2">不达标</option>
				</select>
			</div>
			<div id="right">
			</div>
        </div>
	    <div id="down">
	       <div id="listAll"></div>
	    </div>
    </div>
	<script type="text/javascript" src="app/js/cu/kzdy.js"></script>
</body>
</html>