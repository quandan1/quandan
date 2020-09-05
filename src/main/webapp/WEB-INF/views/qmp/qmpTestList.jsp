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
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">年份</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">月份</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面编码</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所在地区</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所在河流</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">电导率</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水温</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">PH值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">溶解氧</th>
        </tr>
        <c:forEach var="qmpTestData" items="${list}">

            <%--<input id="qmpjd${qmpTestData.id}" type="hidden" value="${qmpTestData.longitude}  "/>--%>
            <%--<input id="qmpwd${qmpTestData.id}" type="hidden" value="${qmpTestData.latitude}  "/>--%>
            <tr id="qmpx${qmp.id}">
                <td align="center" style="white-space: nowrap;">
                    <a href="rest/qmp/Testid?id=${qmpTestData.id}" class="updateButton"  style="color: white;background:#FAAD5E;padding:2px 6px">修改</a>
                    <a href="rest/qmp/deleteTest?id=${qmpTestData.id}" class="deleteButton"  style="color: white;background:#00C0BF;padding:2px 6px">删除</a></td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.year }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.month }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.sectionBm }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.sectionName }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.locCity }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.locRiver }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.ddl }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.waterTemperature }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.ph }</td>
                <td align="center" style="white-space: nowrap;">${qmpTestData.rjy }</td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- 分页功能 start -->
<div align="center" id="page">
    <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
    ${page.pageNow} 页</font> <a href="rest/qmp/listTest?pageNow=1">首页</a>
    <c:choose>
        <c:when test="${page.pageNow - 1 > 0}">
            <a href="rest/qmp/listTest?pageNow=${page.pageNow - 1}">上一页</a>
        </c:when>
        <c:when test="${page.pageNow - 1 <= 0}">
            <!-- <a href="rest/qmp/list?pageNow=1">上一页</a> -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmp/listTest?pageNow=${page.pageNow}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
            <a href="rest/qmp/listTest?pageNow=${page.pageNow + 1}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 > page.totalPageCount}">
            <%-- <a href="rest/qmp/list?pageNow=${page.totalPageCount}">下一页</a> --%>
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmp/listTest?pageNow=${page.pageNow}">尾页</a>
        </c:when>
        <c:otherwise>
            <a href="rest/qmp/listTest?pageNow=${page.totalPageCount}">尾页</a>
        </c:otherwise>
    </c:choose>
</div> <!-- 分页功能 end -->
<script type="text/javascript" src="app/js/qmp/qmpTestList.js"></script>
</body>
</html>