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
	<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="/assets/plugins/bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src="app/js/echart/echarts-all.js"></script>
	<script type="text/javascript" src="app/js/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="app/js/qmp/qmpSumAnalysis.js"></script>


</head>
<body>
	<div id="list" style="display: block;overflow:auto;width:100%;">
	    <input type="text" name="findName" id="findName" size="60" class="inpMain"/>
	    <button type="button" class="btn" id="find">搜索</button>

		<%--<button type="button" class="btn" id="ctrl1" onclick="onCtrl()" value="断面">断面</button>--%>
		<%--<button type="button" class="btn" id="ctrl" onclick="onCtrl()" value="元素">元素</button>--%>
		<div style="padding: 2px 8px; float:right;border: solid; border-width: 1px; border-color: #eaeafa; ">

			<label for="chs1" >元素分析</label>
			<input type="radio" id="chs1" value="elem" style="margin-right: 5px" onclick="onCtrl('elem')" checked="checked" name="choice">
			<label for="chs2" >断面分析</label>
			<input type="radio" id="chs2" value="section" style="margin-right: 5px" onclick="onCtrl('section')" name="choice">

			<select name="type" id="type" title="元素分析" style="margin-right: 5px">
				<option value="HXXYLCSL_D" onclick="gainData('${clist}','KZDM','HXXYLCSL_D','化学需氧量产生量统计','基于元素的统计','化学需氧量产生量（吨）')">化学需氧量产生量（吨）</option>
				<option value="HXXYLPFL_D" onclick="gainData('${clist}','KZDM','HXXYLPFL_D','化学需氧量排放量统计','基于元素的统计','化学需氧量排放量（吨）')">化学需氧量排放量（吨）</option>
				<option value="ADCSL_D" onclick="gainData('${clist}','KZDM','ADCSL_D','氨氮产生量统计','基于元素的统计','氨氮产生量（吨）')">氨氮产生量（吨）</option>
				<option value="ADPFL_D" onclick="gainData('${clist}','KZDM','ADPFL_D','氨氮排放量统计','基于元素的统计','氨氮排放量（吨）')">氨氮排放量（吨）</option>
				<option value="SYLCSL_D" onclick="gainData('${clist}','KZDM','SYLCSL_D','石油量产生量统计','基于元素的统计','石油量产生量（吨）')">石油量产生量（吨）</option>
				<option value="ADPFL_D" onclick="gainData('${clist}','KZDM','ADPFL_D','石油排放量统计','基于元素的统计','石油量排放量（吨）')">石油量排放量（吨）</option>
				<option value="GYFSPFL_D" onclick="gainData('${clist}','KZDM','GYFSPFL_D','工业废水排放量统计','基于元素的统计','工业废水排放量')" >工业废水排放量（吨）</option>
				<%--<option value="HFFPFL_QK">挥发酚排放量（千克）</option>--%>
				<%--<option value="QHWPFL_QK">氰化物排放量（千克）</option>--%>
				<%--<option value="FSSPFL_QK">废水砷排放量（千克）</option>--%>
				<%--<option value="FSQPFL_QK">废水铅排放量（千克）</option>--%>
				<%--<option value="FSGPFL_QK">废水镉排放量（千克）</option>--%>
				<%--<option value="FSGPFL_QK_DUP1">废水汞排放量（千克）</option>--%>
				<%--<option value="FSZGPFL_QK">废水总铬排放量（千克）</option>--%>
				<%--<option value="FSLJGPFL_QK">废水六价铬排放量（千克）</option>--%>
			</select>
			<select name="type" id="asection" title="断面分析" style="margin-right: 5px">
				<c:forEach var="item" items="${clist}">
					<option onclick="gainDataBySection('${clist}','KZDM','${item['KZDM']}','${item['KZDM']}各污染物所占比重统计','基于断面的统计','${item['KZDM']}')">${item['KZDM']}</option>
				</c:forEach>
			</select>

			<button type="button" class="btn" id="clear" onclick="clearMyDiv(false)" value="分析">分析</button>
		</div>

		<div class="mclear" id="mdraw">
		<table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;">断面名称</th>
				<th align="center" style="white-space: nowrap;">化学需氧量产生量（吨）</th>
				<th align="center" style="white-space: nowrap;">化学需氧量排放量（吨）</th>
				<th align="center" style="white-space: nowrap;">氨氮产生量（吨）</th>
				<th align="center" style="white-space: nowrap;">氨氮排放量（吨）</th>
				<th align="center" style="white-space: nowrap;">石油量产生量（吨）</th>
			    <th align="center" style="white-space: nowrap;">石油量排放量（吨）</th>
				<th align="center" style="white-space: nowrap;">工业废水排放量（吨）</th>
				<th align="center" style="white-space: nowrap;">挥发酚排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">氰化物排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水砷排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水铅排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水镉排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水汞排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水总铬排放量（千克）</th>
				<th align="center" style="white-space: nowrap;">废水六价铬排放量（千克）</th>
			</tr>
            <c:forEach var="map" items="${clist}">
              <c:if test="${map['KZDM'] != '无' && map['KZDM'] != '不确定'}">
				<tr>
					<td align="center" style="white-space: nowrap;">${map['KZDM']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['HXXYLPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['ADPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['SYLCSL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['SYLPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['GYFSPFL_D']}</td>
					<td align="center" style="white-space: nowrap;">${map['HFFPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['QHWPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSSPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSQPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSGPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSGPFL_QK_DUP1']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSZGPFL_QK']}</td>
					<td align="center" style="white-space: nowrap;">${map['FSLJGPFL_QK']}</td>
				</tr>
			  </c:if>
			</c:forEach>
		</table>
		</div>
	</div>
	<!-- 分页功能 start -->
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
	</div>

	<div id="Mydraw" style="width: 1200px; height: 550px;"></div>

</body>
</html>