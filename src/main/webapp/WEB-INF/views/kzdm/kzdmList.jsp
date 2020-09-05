<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
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
    <table width="100%" border="0" cellpadding="7" cellspacing="0"
           class="tableBasic" id="list_t">
        <tr>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制断面编号</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属控制单元编号</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属控制单元名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">流域名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所在河流（湖库）</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流级别/湖库属性</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">汇入河流（湖库、海洋）</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面属性</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属省份</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属地市</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属区县</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">测站名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面级别</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面类型</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">是否在城市建成区</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现有/拟增设/新增</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">监测频次</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">监测项目</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 经度度</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 经度分</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 经度秒</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 纬度度</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">纬度分</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">纬度秒</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">功能区水质目标</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 经度</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 纬度</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 所含河流</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white"> 设置时间</th>
        </tr>

        <c:forEach var="kzdmJbxx" items="${list}">
            <tr id="${kzdmJbxx.id}">
                <td align="center" style="white-space: nowrap;">
                    <a href="rest/kzdm/id?id=${kzdmJbxx.id}" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a>
                    <a href="rest/kzdm/delete?id=${kzdmJbxx.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
                </td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmBh}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmDybh}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmDymc}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmLymc}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSzhl}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmHljb}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmHrhl}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmMc}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSx}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSheng}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmShi}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmQx}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmCzmc}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJb}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmLx}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSfcq}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSzzk}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJcpc}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJcxm}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJdd}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJdf}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJds}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmWdd}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmWdf}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmWds}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmSzmb}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmJd}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmWd}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmShhl}</td>
                <td align="center" style="white-space: nowrap;">${kzdmJbxx.kzdmTime}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- 分页功能 start -->
<div align="center" id="page">
    <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
    ${page.pageNow} 页</font> <a href="rest/kzdm/list?pageNow=1">首页</a>
    <c:choose>
        <c:when test="${page.pageNow - 1 > 0}">
            <a href="rest/kzdm/list?pageNow=${page.pageNow - 1}">上一页</a>
        </c:when>
        <c:when test="${page.pageNow - 1 <= 0}">
            <!-- <a href="rest/controlunit/list?pageNow=1">上一页</a>   -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/kzdm/list?pageNow=${page.pageNow}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
            <a href="rest/kzdm/list?pageNow=${page.pageNow + 1}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 > page.totalPageCount}">
            <!-- <a href="rest/controlunit/list?pageNow=${page.totalPageCount}">下一页</a> -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/kzdm/list?pageNow=${page.pageNow}">尾页</a>
        </c:when>
        <c:otherwise>
            <a href="rest/kzdm/list?pageNow=${page.totalPageCount}">尾页</a>
        </c:otherwise>
    </c:choose>
</div>
<!-- 分页功能 end -->
<script type="text/javascript" src="app/js/kzdm/kzdmList.js"></script>
</body>
</html>