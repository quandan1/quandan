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
			<label for="chs2" >断面分析</label>
			<input type="radio" id="chs2" value="section" style="margin-right: 5px" onclick="onCtrl('section')" name="choice">
			<input type="hidden" id="gaindata" value="${alllist}">

			<select name="type" id="type" style="margin-right: 5px;width: 170px;text-align: center" title="指标分析">
				<option value="">指标选择</option>
				<option value="KZDM&HXXYLCSL_D&化学需氧量产生量统计&断面化学需氧量产生量比较&化学需氧量产生量（吨）">化学需氧量产生量（吨）</option>
				<option value="KZDM&HXXYLPFL_D&化学需氧量排放量统计&断面化学需氧量排放量&化学需氧量排放量（吨）">化学需氧量排放量（吨）</option>
				<option value="KZDM&ADCSL_D&氨氮产生量统计&断面氨氮产生量比较&氨氮产生量（吨）">氨氮产生量（吨）</option>
				<option value="KZDM&ADPFL_D&氨氮排放量统计&断面氨氮排放量比较&氨氮排放量（吨）">氨氮排放量（吨）</option>
				<option value="KZDM&SYLCSL_D&石油量产生量统计&断面石油量产生量比较&石油量产生量（吨）">石油量产生量（吨）</option>
				<option value="KZDM&SYLPFL_D&石油排放量统计&断面石油量排放量比较&石油量排放量（吨）">石油量排放量（吨）</option>
				<option value="KZDM&GYFSPFL_D&工业废水排放量统计&断面工业废水排放量比较&工业废水排放量（吨）">工业废水排放量（吨）</option>

			</select>
			<select name="type" id="asection" hidden="hidden" style="margin-right: 5px;width: 170px;text-align: center" title="断面分析">
				<option value="">断面选择</option>
				<c:forEach var="item" items="${clist}">
					<option value="KZDM&${item['KZDM']}&${item['KZDM']}各污染物含量统计&${item['KZDM']}各污染元素统计分析&${item['KZDM']}">${item['KZDM']}</option>
				</c:forEach>
			</select>
			<button type="button" class="btnz btnz-info" id="clear" onclick="clearMyDiv(false)" value="分析">分析</button>

		</div>
		<div class="mclear" id="mdraw">
		<table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污染源控制断面名称</th>
				<th align="center" value="involve_city" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属市</th>
				<th align="center" value="involve_country" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属县</th>
				<th align="center" id="elem1" value="HXXYLCSL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量产生量（吨）</th>
				<th align="center" id="elem2" value="HXXYLPFL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量排放量（吨）</th>
				<th align="center" id="elem3" value="ADCSL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮产生量（吨）</th>
				<th align="center" id="elem4" value="ADPFL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮排放量（吨）</th>
				<th align="center" id="elem5" value="SYLCSL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">石油量产生量（吨）</th>
			    <th align="center" id="elem6" value="SYLPFL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">石油量排放量（吨）</th>
				<th align="center" id="elem7" value="GYFSPFL_D" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">工业废水排放量（吨）</th>
				<!-- <th align="center" id="elem8" value="HFFPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">挥发酚排放量（千克）</th>
				<th align="center" id="elem9" value="QHWPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氰化物排放量（千克）</th>
				<th align="center" id="elem10" value="FSSPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水砷排放量（千克）</th>
				<th align="center" id="elem11" value="FSQPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水铅排放量（千克）</th>
				<th align="center" id="elem12" value="FSGPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水镉排放量（千克）</th>
				<th align="center" id="elem13" value="FSGPFL_QK_DUP1" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水汞排放量（千克）</th>
				<th align="center" id="elem14" value="FSZGPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水总铬排放量（千克）</th>
				<th align="center" id="elem15" value="FSLJGPFL_QK" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水六价铬排放量（千克）</th> -->
			</tr>
            <c:forEach var="map" items="${clist}">
				<tr>
					<td align="center" style="white-space: nowrap;">${map['KZDM']}</td>
					<td align="center" style="white-space: nowrap;">${map['loc_city']}</td>
					<td align="center" style="white-space: nowrap;">${map['loc_county']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['SYLCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['SYLPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['GYFSPFL_D']}</td>
					<!-- <td align="center" style="white-space: nowrap;">${map['HFFPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['QHWPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSSPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSQPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSGPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSGPFL_QK_DUP1']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSZGPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSLJGPFL_QK']}</td> -->
				</tr>
			</c:forEach>
		</table>
		</div>
	</div>
	<%-- <!-- 分页功能 start -->
	<div class="mclear">
		<div align="center" id="searchPage">
						<font size="2">共 ${page.totalPageCountZcfg} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/qmp/total?pageNow=1"
							class='search_A'>首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/qmp/total?pageNow=${page.pageNow - 1}"
									class='search_A'>上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/qmp/total?pageNow=1" class='search_A'>上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/qmp/total?pageNow=${page.pageNow}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCountZcfg}">
								<a href="rest/qmp/total?pageNow=${page.pageNow + 1}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCountZcfg}">
								<!-- <a href="rest/qmp/total?pageNow=${page.totalPageCount}"
									class='search_A'>下一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/qmp/total?pageNow=${page.pageNow}"
									class='search_A'>尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/qmp/total?pageNow=${page.totalPageCountZcfg}"
									class='search_A'>尾页</a>
							</c:otherwise>
						</c:choose>

		</div>
		</div> --%>
	<div id="Mydraw" style="width: 1300px; height: 600px;"></div>
	<script type="text/javascript" src="app/js/qmp/kzdmSource.js"></script>
</body>
</html>