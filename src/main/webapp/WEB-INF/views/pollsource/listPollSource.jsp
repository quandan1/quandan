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
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>	
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">填报单位详细名称</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">行政区划</th>
				
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制断面</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">市州盟</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">区市旗</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">乡镇</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">受纳水体</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">废水</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">需氧量</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮</th> 
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">石油</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">挥发酚</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氰化物</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">砷</th> 
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">铅</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">镉</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">汞</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">总铬</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">六价铬</th>
				
			</tr>
			<c:forEach var="pollsource" items="${list}">
				<input id="psrcjd${pollsource.id}" type="hidden" value="${pollsource.jdG}  "/>  
		     	<input id="psrcwd${pollsource.id}" type="hidden" value="${pollsource.wdG}  "/>  
				<tr id="psrcx${pollsource.id}">
					<td align="center" style="white-space: nowrap;">	
						<a href="rest/psrc/id?id=${pollsource.id }" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a> 
						<a href="rest/psrc/delete?id=${pollsource.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
					</td>
					<td align="center" style="white-space: nowrap;">${pollsource.tbdwxxmc}</td>	
					<td align="center" style="white-space: nowrap;">${pollsource.xzqhmc}</td>
					
					<td align="center" style="white-space: nowrap;">${pollsource.kzdy}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.kzdm}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.xxdzdqSZM}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.xxdzxQSQ}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.xxdzxZ}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.snstmc}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.gyfspflD}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.hxxylpflD}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.adpflD}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.sylpflD}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.hffpflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.qhwpflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fsspflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fsqpflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fsgpflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fsgpflQkDup1}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fszgpflQk}</td>
					<td align="center" style="white-space: nowrap;">${pollsource.fsljgpflQk}</td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
	    <!-- 分页功能 start -->  
			    <div align="center" id="page">  
			        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第  
			            ${page.pageNow} 页</font> <a href="rest/psrc/list?pageNow=1">首页</a>  
			        <c:choose>  
			            <c:when test="${page.pageNow - 1 > 0}">  
			                <a href="rest/psrc/list?pageNow=${page.pageNow - 1}">上一页</a>  
			            </c:when>  
			 <%--            <c:when test="${page.pageNow - 1 <= 0}">  
			                <a href="rest/psrc/list?pageNow=1">上一页</a>  
			            </c:when>   --%>
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCount==0}">  
			                <a href="rest/psrc/list?pageNow=${page.pageNow}">下一页</a>  
			            </c:when>  
			            <c:when test="${page.pageNow + 1 <= page.totalPageCount}">  
			                <a href="rest/psrc/list?pageNow=${page.pageNow + 1}">下一页</a>  
			            </c:when>  
			 <%--            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
			                <a href="rest/psrc/list?pageNow=${page.totalPageCount}">下一页</a>  
			            </c:when>   --%>
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCount==0}">  
			                <a href="rest/psrc/list?pageNow=${page.pageNow}">尾页</a>  
			            </c:when>  
			            <c:otherwise>  
			                <a href="rest/psrc/list?pageNow=${page.totalPageCount}">尾页</a>  
			            </c:otherwise>  
			        </c:choose>  
			    </div>  
			<!-- 分页功能 end -->  
	<script type="text/javascript" src="app/js/pollsource/listPollSource.js"></script>
</body>
</html>