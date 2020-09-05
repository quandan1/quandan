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
	    <input type="text" name="nameForMap" id="nameForMap" value="${name}" style="display:none"/>
		<table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="list_t">
			<tr>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元名称</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含控制断面名称</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">流域</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">涉及地市</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">涉及区（县）名称</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">乡镇个数</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">涉及河流名称</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水资源区</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">汇入河流</th>
			</tr>
			<c:forEach var="controlUnit" items="${list}">
				<tr id="cux${controlUnit.id}">
					<td align="center" style="white-space: nowrap;"> 
					    <a href="rest/controlunit/id?id=${controlUnit.id}"
						class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a> 
						<a href="rest/controlunit/delete?id=${controlUnit.id}"
						class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a></td>
					<td align="center" style="white-space: nowrap;">${controlUnit.unitName}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.includeSection}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.watershed}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.involveCity}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.involveCounty}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.villageAmount}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.involveRiver}</td>
				    <td align="center" style="white-space: nowrap;">${controlUnit.waterResource}</td>
					<td align="center" style="white-space: nowrap;">${controlUnit.hrRiver}</td>
				</tr>
			</c:forEach>
		</table>
		
	</div>

	<!-- 分页功能 start -->
		<div align="center" id="searchPage">
						<font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/controlunit/search?pageNow=1"
							class='search_A'>首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/controlunit/search?pageNow=${page.pageNow - 1}"
									class='search_A'>上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/controlunit/search?pageNow=1" class='search_A'>上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCount==0}">
								<a href="rest/controlunit/search?pageNow=${page.pageNow}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCount}">
								<a href="rest/controlunit/search?pageNow=${page.pageNow + 1}"
									class='search_A'>下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCount}">
								<!-- <a href="rest/controlunit/search?pageNow=${page.totalPageCount}"
									class='search_A'>下一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCount==0}">
								<a href="rest/controlunit/search?pageNow=${page.pageNow}"
									class='search_A'>尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/controlunit/search?pageNow=${page.totalPageCount}"
									class='search_A'>尾页</a>
							</c:otherwise>
						</c:choose>
						<script>
						$('.search_A').click(function(e) {
							e.preventDefault();
							var tmp = $('#jumpTmp').val();
							var test;
							if(tmp=="")	{
								tmp = $('#jsonInput').val();
							}
							test = JSON.parse(tmp);
					 
							$.ajax({
								type : "POST",
								dataType : "html",
								async : false,
								url : this.href,
								data : test,
								success : function(data) {
									$('#listAll').html(data);
								}
							});
						});
						</script>
		</div> 
	<script type="text/javascript" src="app/js/cu/cuList.js"></script>
</body>
</html>