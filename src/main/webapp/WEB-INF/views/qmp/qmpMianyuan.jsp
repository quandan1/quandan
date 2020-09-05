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
	
	<div style="margin-top:10px;margin-bottom:20px">
		<span style="font-size:125%" >请选择您要计算的污染物:</span>
		<select id="target" style="margin-right: 5px;width: 138px;text-align: center">
			<option value="ad">氨氮</option>
			<option value="hxxyl">化学需氧量</option>
			<option value="zl">总磷</option>
		</select>
		<span style="font-size:125%" >单位：吨/月</span>
		<span style="font-size:125%" >年份选择:</span>
		<select style="margin-right: 5px;width: 138px;text-align: center">
			<option value="ad">2014年</option>
		</select>
	</div>
	<div>
		<table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="qmpMYTable">
			<tr>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">断面名称</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">4月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">5月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">6月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">7月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">8月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">9月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">10月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">11月</th>
				<th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">年度</th>
			</tr>
		</table>
	</div>

	<script type="text/javascript" src="app/js/qmp/qmpMianyuan.js"></script>
</body>
</html>
