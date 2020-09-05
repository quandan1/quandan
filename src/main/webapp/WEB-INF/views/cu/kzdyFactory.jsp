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
			<input type="hidden" id="gaindata" value="${clist}">

			<select name="type" id="type" style="margin-right: 5px;width: 170px;text-align: center" title="指标分析">
			    <option value="">指标选择</option>
				<!--<option value="KZDY&WSSJCLNL_D_R&污水设计处理能力统计&单元污水设计处理能力比较&污水设计处理能力（吨/日）">污水设计处理能力（吨/日）</option>
				<option value="KZDY&WSSJCLL_WD&污水实际处理量统计&单元污水实际处理量&污水实际处理量（万吨）">污水实际处理量（万吨）</option>  -->
				<option value="KZDY&HXXYLQCL_D&化学需氧量去除量统计&单元化学需氧量去除量比较&化学需氧量去除量（吨）">化学需氧量去除量（吨）</option>
				<option value="KZDY&HXXYLJKND_HK_S&化学需氧量进口浓度统计&单元化学需氧量进口浓度比较&化学需氧量进口浓度（毫克/升）">化学需氧量进口浓度（毫克/升）</option>
				<option value="KZDY&HXXYLCKND_HK_S&化学需氧量出口浓度统计&单元化学需氧量出口浓度比较&化学需氧量出口浓度（毫克/升）">化学需氧量出口浓度（毫克/升）</option>
                <option value="KZDY&ADQCL_D&氨氮去除量统计&单元氨氮去除量比较&氨氮去除量（吨）">氨氮去除量（吨）</option>
                <option value="KZDY&ADJKND_HK_S&氨氮进口浓度统计&单元氨氮进口浓度比较&氨氮进口浓度（毫克/升）">氨氮进口浓度（毫克/升）</option>
                <option value="KZDY&ADCKND_HK_S&氨氮出口浓度统计&单元氨氮出口浓度比较&氨氮出口浓度（毫克/升）">氨氮出口浓度（毫克/升）</option>
			</select>
			<select name="type" id="asection" hidden="hidden" style="margin-right: 5px;width: 170px;text-align: center" title="断面分析">
			    <option value="">单元选择</option>
				<c:forEach var="item" items="${clist}">
					<option value="KZDY&${item['KZDY']}&${item['KZDY']}各污染物含量统计&${item['KZDY']}各污染元素统计分析&${item['KZDY']}">${item['KZDY']}</option>
				</c:forEach>
			</select>
			<button type="button" class="btnz btnz-info" id="clear" onclick="clearMyDiv(false)" value="分析">分析</button>

		</div>
		<div class="mclear" id="mdraw">
		<table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水处理厂控制单元名称</th>
				<th align="center" value="involve_city" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属市</th>
				<th align="center" value="involve_country" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属县</th>
				<!-- <th align="center" id="elem1" value="WSSJCLNL_D_R" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水设计处理能力（吨/日）</th>
				<th align="center" id="elem2" value="WSSJCLL_WD" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水实际处理量（万吨）</th> -->
				<th align="center" id="elem3" value="HXXYLQCL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量去除量（吨）</th>
				<th align="center" id="elem4" value="HXXYLJKND_HK_S" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量进口浓度（毫克/升）</th>
				<th align="center" id="elem5" value="HXXYLCKND_HK_S" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量出口浓度（毫克/升）</th>
				<th align="center" id="elem6" value="ADQCL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮去除量（吨）</th>
				<th align="center" id="elem7" value="ADJKND_HK_S" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮进口浓度（毫克/升）</th>
				<th align="center" id="elem8" value="ADCKND_HK_S" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮出口浓度（毫克/升）</th>
			</tr>
            <c:forEach var="map" items="${clist}">
				<tr>
					<td align="center" style="white-space: nowrap;">${map['KZDY']}</td>
					<td align="center" style="white-space: nowrap;">${map['involve_city']}</td>
					<td align="center" style="white-space: nowrap;">${map['involve_county']}</td>
					<!-- <td align="center" style="white-space: nowrap;">${map['WSSJCLNL_D_R']}</td>
					<td align="center" style="white-space: nowrap;">${map['WSSJCLL_WD']}</td> -->
					<td align="center" style="white-space: nowrap;">${map['HXXYLQCL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLJKND_HK_S']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLCKND_HK_S']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADQCL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADJKND_HK_S']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADCKND_HK_S']}</td>
				</tr>
			</c:forEach>
		</table>
		</div>
	</div>
<%-- 	<!-- 分页功能 start -->
	<div class="mclear">
		<div align="center" id="searchPage">
						<font size="2">共 ${page.totalPageCountZcfg} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/controlunit/factoryTotal?pageNow=1"
							class='search_A'>首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/controlunit/factoryTotal?pageNow=${page.pageNow - 1}"
									class='search_A'>上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/controlunit/factoryTotal?pageNow=1" class='search_A'>上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/controlunit/factoryTotal?pageNow=${page.pageNow}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCountZcfg}">
								<a href="rest/controlunit/factoryTotal?pageNow=${page.pageNow + 1}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCountZcfg}">
								<!-- <a href="rest/controlunit/factoryTotal?pageNow=${page.totalPageCount}"
									class='search_A'>下一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/controlunit/factoryTotal?pageNow=${page.pageNow}"
									class='search_A'>尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/controlunit/factoryTotal?pageNow=${page.totalPageCountZcfg}"
									class='search_A'>尾页</a>
							</c:otherwise>
						</c:choose>

		</div>
	</div> --%>
	<div id="Mydraw" style="width: 1200px; height: 550px;"></div>
	<script type="text/javascript" src="app/js/cu/kzdyFactory.js"></script>
</body>
</html>