<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css" >
<style> 
.abc a{ 
display:inline-block;
border-left-width: 0px;
border-top-width: 0px;
border-right-width: 0px;
border-bottom-width: 0px;
margin-bottom: 0px;
text-decoration:underline;
font-size:15px;
} 
</style> 
</head>
<body>
 
	<div id="list" style="margin-top:20px;" class="abc">
	 <table width="100%" border="0" cellpadding="7" cellspacing="0"
			class="tableBasic" id="list_t">
		<tr>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">类型</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">标题</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">日期</th>
				<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>
		</tr>
		<!--  <tr>
		    <td align="center" style="white-space: nowrap;"><img src="app/img/fold.png" height="20" width="20"/></td>
		    <td align="center"><a href="rest/page/zcfgSJB?SJ_FLFG" id="SJ_FLFG" class='fold_sj'>法律法规</a></td>
		    <td align="center">2017-11-9</td>
		    <td align="center"></td>
		</tr>
		<tr>
		    <td align="center" style="white-space: nowrap;"><img src="app/img/fold.png" height="20" width="20"/></td>
		    <td align="center"><a href="rest/page/zcfgSJB?SJ_ZCZD" id="SJ_ZCZD" class='fold_sj'>政策制度</a></td>
		    <td align="center">2017-11-9</td>
		    <td align="center"></td>
		</tr>-->
		<c:forEach var="zcfg" items="${zlist}">
		<c:choose>
		<c:when test="${fn:contains(zcfg.type, '-FILE')}">
		<tr>
		    <td align="center" style="white-space: nowrap;"><img src="app/img/fold.png" height="20" width="20"/></td>
		    <td align="center"><a href="rest/page/zcfgSJB?${zcfg.title}" id="${zcfg.title}" class='fold_sj'>${zcfg.name}</a></td>
		    <td align="center">${zcfg.publishDateString}</td>
		    <td align="center"></td>
		   </tr>
		</c:when>
		<c:otherwise>
			<tr>
		        <td align="center" style="white-space: nowrap;"><img src="app/img/file.jpg" height="20" width="20"/></td>
				<td align="center" style="white-space: nowrap;"><a href="rest/Zcfg/show?id=${zcfg.id}" id="showContent" >${zcfg.title }</a></td>
				<td align="center" style="white-space: nowrap;">${zcfg.publishDateString}</td>
                <td align="center" style="white-space: nowrap;">
					<a href="rest/Zcfg/delete?id=${zcfg.id}" id="deleteButtonzSj" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px" name="${zcfg.name}">删除</a>
					<a href="upload/zcfg/${zcfg.name}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px" download>下载</a>
				</td>			
			</tr>		
		</c:otherwise>
		</c:choose>
		</c:forEach>		
	</table>
        </div>
            <!-- 分页功能 start -->  
			   		<div align="center" id="sjPage">
						<font size="2">共 ${page.totalPageCountZcfg} 页</font> <font size="2">第
							${page.pageNow} 页</font> <a href="rest/Zcfg/selectSJ?pageNow=1">首页</a>
						<c:choose>
							<c:when test="${page.pageNow - 1 > 0}">
								<a href="rest/Zcfg/selectSJ?pageNow=${page.pageNow - 1}">上一页</a>
							</c:when>
							<c:when test="${page.pageNow - 1 <= 0}">
								<!-- <a href="rest/Zcfg/selectSJ?pageNow=1">上一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/Zcfg/selectSJ?pageNow=${page.pageNow}">下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 <= page.totalPageCountZcfg}">
								<a href="rest/Zcfg/selectSJ?pageNow=${page.pageNow + 1}">下一页</a>
							</c:when>
							<c:when test="${page.pageNow + 1 > page.totalPageCountZcfg}">
								<!-- <a href="rest/Zcfg/selectSJ?pageNow=${page.totalPageCount}">下一页</a> -->
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${page.totalPageCountZcfg==0}">
								<a href="rest/Zcfg/selectSJ?pageNow=${page.pageNow}">尾页</a>
							</c:when>
							<c:otherwise>
								<a href="rest/Zcfg/selectSJ?pageNow=${page.totalPageCountZcfg}">尾页</a>
							</c:otherwise>
						</c:choose>

		</div>
			<!-- 分页功能 end -->  

	<script type="text/javascript" src="app/js/zcfg/zcfgList.js"></script>
</body>
</html>