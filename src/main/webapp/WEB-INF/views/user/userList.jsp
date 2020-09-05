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
	<div id="list" style="display: block">
		<table width="100%" border="0" cellpadding="8" cellspacing="0"
			class="tableBasic" id="list_t">
	                   <tr>
							<th align="center">用户名</th>
							<th align="center">权限</th>
							<th align="center">操作</th>

						</tr>
						
						<c:forEach var="user" items="${ulist}">
							<tr>
								<td align="center" style="white-space: nowrap;">${user.username }</td>
								<td align="center" style="white-space: nowrap;">${user.state}</td>
								<td align="center" style="white-space: nowrap;">
										<a href="rest/user/delete?id=${user.id}" id="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>	
								</td>	
							</tr>
						</c:forEach>
        </table>
        </div>
            <!-- 分页功能 start -->  
			    <div align="center" id="page">  
			        <font size="2">共 ${page.totalPageCountZcfg} 页</font> <font size="2">第  
			            ${page.pageNow} 页</font> <a href="rest/user/list?pageNow=1">首页</a>  
			        <c:choose>  
			            <c:when test="${page.pageNow - 1 > 0}">  
			                <a href="rest/user/list?pageNow=${page.pageNow - 1}">上一页</a>  
			            </c:when>  
			            <c:when test="${page.pageNow - 1 <= 0}">  
			                <!-- <a href="rest/user/list?pageNow=1">上一页</a>   -->
			            </c:when>  
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCountZcfg==0}">  
			                <a href="rest/user/list?pageNow=${page.pageNow}">下一页</a>  
			            </c:when>  
			            <c:when test="${page.pageNow + 1 <= page.totalPageCountZcfg}">  
			                <a href="rest/user/list?pageNow=${page.pageNow + 1}">下一页</a>  
			            </c:when>  
			            <c:when test="${page.pageNow + 1 > page.totalPageCountZcfg}">  
			                <!-- <a href="rest/user/list?pageNow=${page.totalPageCount}">下一页</a> -->
			            </c:when>  
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCountZcfg==0}">  
			                <a href="rest/user/list?pageNow=${page.pageNow}">尾页</a>  
			            </c:when>  
			            <c:otherwise>  
			                <a href="rest/user/list?pageNow=${page.totalPageCountZcfg}">尾页</a>  
			            </c:otherwise>  
			        </c:choose>  
			    </div>  
			<!-- 分页功能 end -->  

	<script type="text/javascript" src="app/js/user/userList.js"></script>
</body>
</html>