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
<h3>修改污水处理厂信息</h3>

	 	<form id="editForm">
			<table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
			<tr style="display:none">
					<td width="90" align="right">id</td>
					<td><input type="text" name="id" id="id" readonly="readonly" value="${pollfactory.id}" size="60" class="inpMain"/></td>
				</tr>	

				<tr><td  width="90"  align="right">区划</td><td><input  type="text"  name="xzqhmc"  id="xzqhmc"  size="60"  class="inpMain" value="${pollfactory.xzqhmc}"   /></td></tr>
				<tr><td  width="90"  align="right">单位</td><td><input  type="text"  name="dwmcGz"  id="dwmcGz"  size="60"  class="inpMain" value="${pollfactory.dwmcGz}"   /></td></tr>
				<tr><td  width="90"  align="right">所属断面</td><td><input  type="text"  name="ssdm"  id="ssdm"  size="60"  class="inpMain" value="${pollfactory.ssdm}"   /></td></tr>
				<tr><td  width="90"  align="right">所在单元</td><td><input  type="text"  name="sskzdy"  id="sskzdy"  size="60"  class="inpMain" value="${pollfactory.sskzdy}"   /></td></tr>
				<tr><td  width="90"  align="right">地址_市</td><td><input  type="text"  name="qyxxdzDqSZM"  id="qyxxdzDqSZM"  size="60"  class="inpMain"  value="${pollfactory.qyxxdzDqSZM}"   /></td></tr>
				<tr><td  width="90"  align="right">地址_县</td><td><input  type="text"  name="qyxxdzXQSQ"  id="qyxxdzXQSQ"  size="60"  class="inpMain" value="${pollfactory.qyxxdzXQSQ}"   /></td></tr>
				<tr><td  width="90"  align="right">地址_乡</td><td><input  type="text"  name="qyxxdzXZ"  id="qyxxdzXZ"  size="60"  class="inpMain" value="${pollfactory.qyxxdzXZ}"   /></td></tr>
				<tr><td  width="90"  align="right">地址_街</td><td><input  type="text"  name="qyxxdzJCMph"  id="qyxxdzJCMph"  size="60"  class="inpMain"  value="${pollfactory.qyxxdzJCMph}"   /></td></tr>
				<tr><td  width="90"  align="right">污水处理方法</th></td><td><input  type="text"  name="wsclffmc1"  id="wsclffmc1"  size="60"  class="inpMain" value="${pollfactory.wsclffmc1}"   /></td></tr>
				<tr><td  width="90"  align="right">排水去向</td><td><input  type="text"  name="psqxlxmc"  id="psqxlxmc"  size="60"  class="inpMain" value="${pollfactory.psqxlxmc}"   /></td></tr>
				<tr><td  width="90"  align="right">受纳水体</td><td><input  type="text"  name="snstmc"  id="snstmc"  size="60"  class="inpMain" value="${pollfactory.snstmc}"   /></td></tr>
				<tr><td  width="90"  align="right">运行天数</td><td><input  type="text"  name="yxtsT"  id="yxtsT"  size="60"  class="inpMain"  value="${pollfactory.yxtsT}"   /></td></tr>
				<tr><td  width="90"  align="right">污水处理力</td><td><input  type="text"  name="wssjclnlDR"  id="wssjclnlDR"  size="60"  class="inpMain" value="${pollfactory.wssjclnlDR}"   /></td></tr>
				<tr><td  width="90"  align="right">污水处理量</td><td><input  type="text"  name="wssjcllWd"  id="wssjcllWd"  size="60"  class="inpMain" value="${pollfactory.wssjcllWd}"   /></td></tr>
				<tr><td  width="90"  align="right">O2去除量</td><td><input  type="text"  name="hxxylqclD"  id="hxxylqclD"  size="60"  class="inpMain"  value="${pollfactory.hxxylqclD}"   /></td></tr>
				<tr><td  width="90"  align="right">进口浓度</td><td><input  type="text"  name="hxxyljkndHkS"  id="hxxyljkndHkS"  size="60"  class="inpMain"   value="${pollfactory.hxxyljkndHkS}"   /></td></tr>
				<tr><td  width="90"  align="right">出口浓度</td><td><input  type="text"  name="hxxylckndHkS"  id="hxxylckndHkS"  size="60"  class="inpMain"   value="${pollfactory.hxxylckndHkS}"   /></td></tr>
				<tr><td  width="90"  align="right">氨氮去除量</td><td><input  type="text"  name="adqclD"  id="adqclD"  size="60"  class="inpMain"  value="${pollfactory.adqclD}"   /></td></tr>
				<tr><td  width="90"  align="right">进口</td><td><input  type="text"  name="adjkndHkS"  id="adjkndHkS"  size="60"  class="inpMain"  value="${pollfactory.adjkndHkS}"   /></td></tr>
				<tr><td  width="90"  align="right">出口</td><td><input  type="text"  name="adckndHkS"  id="adckndHkS"  size="60"  class="inpMain"  value="${pollfactory.adckndHkS}"   /></td></tr>
				<tr><td  width="90"  align="right">总氮去除量</td><td><input  type="text"  name="zdqclD"  id="zdqclD"  size="60"  class="inpMain"  value="${pollfactory.zdqclD}"   /></td></tr>
				<tr><td  width="90"  align="right">进口</td><td><input  type="text"  name="zdjkndHkS"  id="zdjkndHkS"  size="60"  class="inpMain"  value="${pollfactory.zdjkndHkS}"   /></td></tr>	
				<tr><td  width="90"  align="right">出口</th><td><input  type="text"  name="zdckndHkS"  id="zdckndHkS"  size="60"  class="inpMain"  value="${pollfactory.zdckndHkS}"   /></td></tr>	
				<tr><td  width="90"  align="right">总磷去除量</th><td><input  type="text"  name="zlqclQk"  id="zlqclQk"  size="60"  class="inpMain"value="${pollfactory.zlqclQk}"   /></td></tr>	
				<tr><td  width="90"  align="right">进口</th><td><input  type="text"  name="zljkndHkS"  id="zljkndHkS"  size="60"  class="inpMain"  value="${pollfactory.zljkndHkS}"   /></td></tr>	
				<tr><td  width="90"  align="right">出口</th><td><input  type="text"  name="zlckndHkS"  id="zlckndHkS"  size="60"  class="inpMain"  value="${pollfactory.zlckndHkS}"   /></td></tr>	



				
			</table>
		</form>
 
 	</div>
</body>
</html>