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
</head>
<body>
	<div id="list" style="display: block;overflow:auto;width:100%;">
		<table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;">操作</th>
				<th align="center" style="white-space: nowrap;">断面名称</th>
				<th align="center" style="white-space: nowrap;">流域名称</th>
				<th align="center" style="white-space: nowrap;">所在河流</th>
				<th align="center" style="white-space: nowrap;">河流级别/湖库属性</th>
				<th align="center" style="white-space: nowrap;">断面属性</th>
				<th align="center" style="white-space: nowrap;">所属地市</th>
				<th align="center" style="white-space: nowrap;">所属区县</th>
				<th align="center" style="white-space: nowrap;">断面级别</th>
				<th align="center" style="white-space: nowrap;">功能区水质目标</th>
			</tr>
			<c:forEach var="qmp" items="${list}">
				<input id="qmpjd${qmp.id}" type="hidden" value="${qmp.locLonD + (qmp.locLonS/60 + qmp.locLonM)/60}  "/>
		     	<input id="qmpwd${qmp.id}" type="hidden" value="${qmp.locLatD + (qmp.locLatS/60 + qmp.locLatM)/60}  "/>
				<tr id="qmpx${qmp.id}">
					<td align="center" style="white-space: nowrap;">
						<a href="rest/qmp/id?id=${qmp.id}" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a>
						<a href="rest/qmp/delete?id=${qmp.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
					</td>
					<td align="center" style="white-space: nowrap;">${qmp.sectionName }</td>
					<td align="center" style="white-space: nowrap;">${qmp.watershed }</td>
					<td align="center" style="white-space: nowrap;">${qmp.riverName }</td>
					<td align="center" style="white-space: nowrap;">${qmp.riverLevel }</td>
					<td align="center" style="white-space: nowrap;">${qmp.sectionProperty }</td>
					<td align="center" style="white-space: nowrap;">${qmp.locCity }</td>
					<td align="center" style="white-space: nowrap;">${qmp.locCounty }</td>
					<td align="center" style="white-space: nowrap;">${qmp.sectionLevel }</td>
					<td align="center" style="white-space: nowrap;">${qmp.qualityTarget }</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 分页功能 start -->
					<div align="center" id="page">
						<font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/qmp/list?pageNow=1">首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/qmp/list?pageNow=${page.pageNow - 1}">上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/qmp/list?pageNow=1">上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCount==0}">
								<a href="rest/qmp/list?pageNow=${page.pageNow}">下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCount}">
								<a href="rest/qmp/list?pageNow=${page.pageNow + 1}">下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCount}">
								<%-- <a href="rest/qmp/list?pageNow=${page.totalPageCount}">下一页</a> --%>
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCount==0}">
								<a href="rest/qmp/list?pageNow=${page.pageNow}">尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/qmp/list?pageNow=${page.totalPageCount}">尾页</a>
							</c:otherwise>
						</c:choose>
					</div> <!-- 分页功能 end -->
					<script type="text/javascript" src="app/js/qmp/qmpList.js"></script>
</body>
</html>