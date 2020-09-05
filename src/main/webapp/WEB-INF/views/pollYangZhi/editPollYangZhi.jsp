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
<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">
 
<script type="text/javascript" src="app/js/pollsource/editPollSource.js"></script>
</head>
<body>	
	<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
<h3>修改畜禽养殖信息</h3>

	 	<form id="editForm">
			<table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
			<tr style="display:none">
					<td width="90" align="right">id</td>
					<td><input type="text" name="id" id="id" readonly="readonly" value="${pollYangZhi.id}" size="60" class="inpMain"/></td>
				</tr>	

				<tr><td  width="90"  align="right">行政区划名称</td><td><input  type="text"  name="xzqhmc"  id="xzqhmc"  size="60"  class="inpMain" value="${pollYangZhi.xzqhmc}" /></td></tr>
				<tr><td  width="90"  align="right">养殖场(小区)编码</td><td><input  type="text"  name="yzcbm"  id="yzcbm"  size="60"  class="inpMain" value="${pollYangZhi.yzcbm}"/></td></tr>
				<tr><td  width="90"  align="right">养殖场(小区)名称</td><td><input  type="text"  name="yzcmc"  id="yzcmc"  size="60"  class="inpMain" value="${pollYangZhi.yzcmc}"/></td></tr>
				<tr><td  width="90"  align="right">控制断面</td><td><input  type="text"  name="kzdm"  id="kzdm"  size="60"  class="inpMain" value="${pollYangZhi.kzdm}"/></td></tr>
				<tr><td  width="90"  align="right">控制单元</td><td><input  type="text"  name="kzdy"  id="kzdy"  size="60"  class="inpMain" value="${pollYangZhi.kzdy}"/></td></tr>
				<tr><td  width="90"  align="right">经度（增加）</td><td><input  type="text"  name="jd"  id="jd"  size="60"  class="inpMain" value="${pollYangZhi.jd}"/></td></tr>
				<tr><td  width="90"  align="right">纬度（增加）</td><td><input  type="text"  name="wd"  id="wd"  size="60"  class="inpMain" value="${pollYangZhi.wd}"/></td></tr>
				<tr><td  width="90"  align="right">地址(市、州、盟)</td><td><input  type="text"  name="dzS"  id="dzS"  size="60"  class="inpMain" value="${pollYangZhi.dzS}"/></td></tr>
				<tr><td  width="90"  align="right">地址(区、市、旗)</td><td><input  type="text"  name="dzX"  id="dzX"  size="60"  class="inpMain" value="${pollYangZhi.dzX}"/></td></tr>
				<tr><td  width="90"  align="right">乡(镇)</td><td><input  type="text"  name="xz"  id="xz"  size="60"  class="inpMain" value="${pollYangZhi.xz}"/></td></tr>
				<tr><td  width="90"  align="right">街(村)</th></td><td><input  type="text"  name="jc"  id="jc"  size="60"  class="inpMain" value="${pollYangZhi.jc}"/></td></tr>
				<tr><td  width="90"  align="right">所在流域名称</td><td><input  type="text"  name="szlymc"  id="szlymc"  size="60"  class="inpMain" value="${pollYangZhi.szlymc}"/></td></tr>
				<tr><td  width="90"  align="right">受纳水体名称</td><td><input  type="text"  name="snstmc"  id="snstmc"  size="60"  class="inpMain" value="${pollYangZhi.snstmc}"/></td></tr>
				<tr><td  width="90"  align="right">畜禽种类</td><td><input  type="text"  name="xqzl"  id="xqzl"  size="60"  class="inpMain" value="${pollYangZhi.xqzl}"/></td></tr>
				<tr><td  width="90"  align="right">饲养量（头/羽）</td><td><input  type="text"  name="syl"  id="syl"  size="60"  class="inpMain" value="${pollYangZhi.syl}"/></td></tr>
				<tr><td  width="90"  align="right">排放量_化学需氧量（千克）</td><td><input  type="text"  name="pflHxxyl"  id="pflHxxyl"  size="60"  class="inpMain" value="${pollYangZhi.pflHxxyl}"/></td></tr>
				<tr><td  width="90"  align="right">排放量_总氮（千克）</td><td><input  type="text"  name="pflZd"  id="pflZd"  size="60"  class="inpMain" value="${pollYangZhi.pflZd}"/></td></tr>
				<tr><td  width="90"  align="right">排放量_总磷（千克）</td><td><input  type="text"  name="pflZl"  id="pflZl"  size="60"  class="inpMain" value="${pollYangZhi.pflZl}"/></td></tr>
				<tr><td  width="90"  align="right">排放量_氨氮（千克）</td><td><input  type="text"  name="pflAd"  id="pflAd"  size="60"  class="inpMain" value="${pollYangZhi.pflAd}"/></td></tr>
				<tr><td  width="90"  align="right">去除率_化学需氧量</td><td><input  type="text"  name="qclHxxyl"  id="qclHxxyl"  size="60"  class="inpMain" value="${pollYangZhi.qclHxxyl}"/></td></tr>
				<tr><td  width="90"  align="right">去除率_总氮</td><td><input  type="text"  name="qclZd"  id="qclZd"  size="60"  class="inpMain" value="${pollYangZhi.qclZd}"/></td></tr>
				<tr><td  width="90"  align="right">去除率_总磷</td><td><input  type="text"  name="qclZl"  id="qclZl"  size="60"  class="inpMain" value="${pollYangZhi.qclZl}"/></td></tr>
			    <tr><td  width="90"  align="right">去除率_氨氮</td><td><input  type="text"  name="qclAd"  id="qclAd"  size="60"  class="inpMain" value="${pollYangZhi.qclAd}"/></td></tr>



				
			</table>
		</form>
 
 	</div>
</body>
</html>