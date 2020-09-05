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
 
		<table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1">
			<tr>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">操作</th>     
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">行政区划名称</th>               
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">养殖场(小区)编码</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">养殖场(小区)名称</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">控制断面</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">控制单元</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">经度（增加）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">纬度（增加）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">地址(市、州、盟)</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">地址(区、市、旗)</th> 
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">乡(镇)</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">街(村)</th> 
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">所在流域名称</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">受纳水体名称</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">畜禽种类</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">饲养量（头/羽）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">排放量_化学需氧量（千克）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">排放量_总氮（千克）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">排放量_总磷（千克）</th> 
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">排放量_氨氮（千克）</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">去除率_化学需氧量</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">去除率_总氮</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">去除率_总磷</th>
				<th style="white-space: nowrap;text-align: center;background:#99A4AF;color:white" align="center">去除率_氨氮</th>
				
			</tr>
			<c:forEach var="pollYangZhi" items="${list}">
				<input id="pyzjd${pollYangZhi.id}" type="hidden" value="${pollYangZhi.jd}  "/>  
		     	<input id="pyzwd${pollYangZhi.id}" type="hidden" value="${pollYangZhi.wd}  "/>  
				<tr id="pyzx${pollYangZhi.id}">
					<td align="center" style="white-space: nowrap;">	
						<a href="rest/pyz/id?id=${pollYangZhi.id }" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a> 
						<a href="rest/pyz/delete?id=${pollYangZhi.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
					</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.xzqhmc}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.yzcbm}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.yzcmc}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.kzdm}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.kzdy}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.jd}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.wd}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.dzS}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.dzX}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.xz}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.jc}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.szlymc}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.snstmc}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.xqzl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.syl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.pflHxxyl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.pflZd}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.pflZl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.pflAd}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.qclHxxyl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.qclZd}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.qclZl}</td>
					<td align="center" style="white-space: nowrap;">${pollYangZhi.qclAd}</td>
				</tr>
			</c:forEach>
		</table>
 
	</div>
	<!-- 分页功能 start -->
	<div align="center" id="searchPage">
		<font size="2">共 ${page.totalPageCount} 页</font>
		<font size="2">第${page.pageNow} 页</font>
		<a href="rest/pyz/search?pageNow=1" class='search_A'>首页</a>
		<c:choose>
			<c:when test="${page.pageNow - 1 > 0}">
				<a href="rest/pyz/search?pageNow=${page.pageNow - 1}"
					class='search_A'>上一页</a>
			</c:when>
			<c:when test="${page.pageNow - 1 <= 0}">
				<!-- <a href="rest/pyz/search?pageNow=1" class='search_A'>上一页</a> -->
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a href="rest/pyz/search?pageNow=${page.pageNow}"
					class='search_A'>下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 <= page.totalPageCount}">
				<a href="rest/pyz/search?pageNow=${page.pageNow + 1}"
					class='search_A'>下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 > page.totalPageCount}">
				<%-- <a href="rest/pyz/search?pageNow=${page.totalPageCount}"
					class='search_A'>下一页</a> --%>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a href="rest/pyz/search?pageNow=${page.pageNow}"
					class='search_A'>尾页</a>
			</c:when>
			<c:otherwise>
				<a href="rest/pyz/search?pageNow=${page.totalPageCount}"
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
	</div> <!-- 分页功能 end -->
	
<script type="text/javascript" src="app/js/pollsource/listPollSource.js"></script>
	
</body>
</html>