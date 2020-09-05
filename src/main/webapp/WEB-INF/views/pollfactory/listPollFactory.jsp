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
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">区划名称</th>               
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">单位</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属断面</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所在单元</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">地址_市</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">地址_县</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">地址_乡</th> 
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">地址_街</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水处理方法</th> 
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">排水去向</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">受纳水体</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">运行天数</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水处理力</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">污水处理量</th><%--
				<th align="center">O2去除量</th>
				<th align="center">进口浓度</th> 
				<th align="center">出口浓度</th>
				<th align="center">氨氮去除量</th>
				<th align="center">进口</th>
				<th align="center">出口</th>
				<th align="center">总氮去除量</th>
				<th align="center">进口</th>
				<th align="center">出口</th>
				<th align="center">总磷去除量</th>
				<th align="center">进口</th> 
				<th align="center">出口</th>	--%>
			</tr>
			<c:forEach var="pollfactory" items="${list}">
				<input id="pftyjd${pollfactory.id}" type="hidden" value="${pollfactory.jd}  "/>  
		     	<input id="pftywd${pollfactory.id}" type="hidden" value="${pollfactory.wd}  "/>  
				<tr id="pftyx${pollfactory.id}">
					<td align="center" style="white-space: nowrap;">	
						<a href="rest/pfty/id?id=${pollfactory.id }" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a> 
						<a href="rest/pfty/delete?id=${pollfactory.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
					</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.xzqhmc}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.dwmcGz}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.ssdm}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.sskzdy}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.qyxxdzDqSZM}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.qyxxdzXQSQ}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.qyxxdzXZ}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.qyxxdzJCMph}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.wsclffmc1}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.psqxlxmc}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.snstmc}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.yxtsT}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.wssjclnlDR}</td>
					<td align="center" style="white-space: nowrap;">${pollfactory.wssjcllWd}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.hxxylqclD}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.hxxyljkndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.hxxylckndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.adqclD}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.adjkndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.adckndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zdqclD}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zdjkndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zdckndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zlqclQk}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zljkndHkS}</td>
					<td align="center" style="white-space: nowrap;display:none"  >${pollfactory.zlckndHkS}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	    <!-- 分页功能 start -->  
			    <div align="center" id="page">  
			        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第  
			            ${page.pageNow} 页</font> <a href="rest/pfty/list?pageNow=1">首页</a>  
			        <c:choose>  
			            <c:when test="${page.pageNow - 1 > 0}">  
			                <a href="rest/pfty/list?pageNow=${page.pageNow - 1}">上一页</a>  
			            </c:when>  
			 <%--            <c:when test="${page.pageNow - 1 <= 0}">  
			                <a href="rest/pfty/list?pageNow=1">上一页</a>  
			            </c:when>   --%>
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCount==0}">  
			                <a href="rest/pfty/list?pageNow=${page.pageNow}">下一页</a>  
			            </c:when>  
			            <c:when test="${page.pageNow + 1 <= page.totalPageCount}">  
			                <a href="rest/pfty/list?pageNow=${page.pageNow + 1}">下一页</a>  
			            </c:when>  
			 <%--            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
			                <a href="rest/pfty/list?pageNow=${page.totalPageCount}">下一页</a>  
			            </c:when>   --%>
			        </c:choose>  
			        <c:choose>  
			            <c:when test="${page.totalPageCount==0}">  
			                <a href="rest/pfty/list?pageNow=${page.pageNow}">尾页</a>  
			            </c:when>  
			            <c:otherwise>  
			                <a href="rest/pfty/list?pageNow=${page.totalPageCount}">尾页</a>  
			            </c:otherwise>  
			        </c:choose>  
			    </div>  
			<!-- 分页功能 end -->  
	<script type="text/javascript" src="app/js/pollsource/listPollSource.js"></script>
</body>
</html>