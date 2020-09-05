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

	<script type="text/javascript" src="app/js/echart/echarts-all.js"></script>
	<script type="text/javascript" src="app/js/qmp/qmpSumAnalysis.js"></script>

</head>
<body>
	<div id="list" style=" display: block; overflow:auto; width:100%; ">
	    <input type="text" name="findName" id="findName" size="60" class="inpMain"/>
	    <button type="button" class="btnz btnz-info" id="find">搜索</button>
	    <div style="padding: 2px 8px; float:right; border: solid; border-width: 1px; border-color: #eaeafa; ">
			<label for="chs1" >指标分析</label>
			<input type="radio" id="chs1" value="elem" style="margin-right: 5px" onclick="onCtrl('elem')" checked="checked" name="choice">
			<label for="chs2" >单元分析</label>
			<input type="radio" id="chs2" value="section" style="margin-right: 5px" onclick="onCtrl('section')" name="choice">
			<input type="hidden" id="gaindata" value="${list}">

			<select name="type" id="type" style="margin-right: 5px;width: 170px;text-align: center" title="指标分析">
			    <option value="">指标选择</option>
				<option value="KZDY&HXXYL&化学需氧量统计&单元化学需氧量比较&化学需氧量（吨）">化学需氧量（吨）</option>
                <option value="KZDY&ADPFL&氨氮排放量统计&单元氨氮排放量比较&氨氮排放量（吨）">氨氮排放量（吨）</option>
			</select>
			<select name="type" id="asection" hidden="hidden" style="margin-right: 5px;width: 170px;text-align: center" title="断面分析">
			    <option value="">单元选择</option>
				<c:forEach var="item" items="${list}">
					<option value="KZDY&${item['KZDY']}&${item['KZDY']}各污染物含量统计&${item['KZDY']}各污染元素统计分析&${item['KZDY']}">${item['KZDY']}</option>
				</c:forEach>
			</select>
			<button type="button" class="btnz btnz-info" id="clear" onclick="clearMyDiv(false)" value="分析">分析</button>

		</div>
		<div class="mclear" id="mdraw">
		<table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元名称</th>
				<th align="center" value="involve_city" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属市</th>
				<th align="center" value="involve_country" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属县</th>
				<th align="center" id="elem1" value="HXXYL" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量（吨）</th>
				<th align="center" id="elem2" value="ADPFL" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮排放量（吨）</th>
			</tr>
            <c:forEach var="map" items="${list}">
				<tr>
					<td align="center" style="white-space: nowrap;">${map['KZDY']}</td>
					<td align="center" style="white-space: nowrap;">${map['involve_city']}</td>
					<td align="center" style="white-space: nowrap;">${map['involve_country']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYL']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADPFL']}</td>
				</tr>
			</c:forEach>
		</table>
		</div>
	</div>
	<!-- 分页功能 start -->
	<div class="mclear">
		<div align="center" id="searchPage">
						<font size="2">共 ${page.totalPageCountZcfg} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/controlunit/sum?pageNow=1"
							class='search_A'>首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/controlunit/sum?pageNow=${page.pageNow - 1}"
									class='search_A'>上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/controlunit/sum?pageNow=1" class='search_A'>上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/controlunit/sum?pageNow=${page.pageNow}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCountZcfg}">
								<a href="rest/controlunit/sum?pageNow=${page.pageNow + 1}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCountZcfg}">
								<!-- <a href="rest/controlunit/sum?pageNow=${page.totalPageCount}"
									class='search_A'>下一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/controlunit/sum?pageNow=${page.pageNow}"
									class='search_A'>尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/controlunit/sum?pageNow=${page.totalPageCountZcfg}"
									class='search_A'>尾页</a>
							</c:otherwise>
						</c:choose>

		</div>
	</div>
	<div id="Mydraw" style="width: 1200px; height: 550px;"></div>
	<script type="text/javascript" src="app/js/cu/kzdyTotal.js"></script>
</body>
</html>