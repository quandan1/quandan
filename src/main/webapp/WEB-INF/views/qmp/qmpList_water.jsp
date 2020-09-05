<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div>
    <span><strong>断面总数：</strong>
    <input value="${page.totalCount}">
    </span>
</div>
<div id="list" style="display: block;overflow:auto;width:100%;">
    <input type="text" name="nameForMap" id="nameForMap" value="${name}" style="display:none"/>
    <table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1">
        <tr>

            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">测站名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属流域</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">流量</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮(mg/L)
            </th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">
                化学需氧量(mg/L)
            </th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">总氮(mg/L)
            </th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">总磷(mg/L)
            </th>
        </tr>

        <c:forEach var="qmp" items="${list}">
            <tr id="qmpx${qmp.id}">
                <td align="center" style="white-space: nowrap;">${qmp.testBy }</td>
                <td align="center" style="white-space: nowrap;">${qmp.riverName }</td>
                <td align="center" style="white-space: nowrap;">${qmp.sectionName }</td>
                <td align="center" style="white-space: nowrap;">${qmp.basin }</td>
                <td align="center" style="white-space: nowrap;">${qmp.flowRate }</td>
                <td align="center" style="white-space: nowrap;">${qmp.ad }</td>
                <td align="center" style="white-space: nowrap;">${qmp.hxxyl }</td>
                <td align="center" style="white-space: nowrap;">${qmp.zd }</td>
                <td align="center" style="white-space: nowrap;">${qmp.zl }</td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- 分页功能 start -->
<div align="center" id="searchPage">
    <font size="2">共 ${page.totalPageCount} 页</font>
    <font size="2">第${page.pageNow} 页</font>
    <a href="rest/qmpa/searchw?pageNow=1" class='search_A'>首页</a>
    <c:choose>
        <c:when test="${page.pageNow - 1 > 0}">
            <a href="rest/qmpa/searchw?pageNow=${page.pageNow - 1}"
               class='search_A'>上一页</a>
        </c:when>
        <c:when test="${page.pageNow - 1 <= 0}">
            <!-- <a href="rest/qmp/search?pageNow=1" class='search_A'>上一页</a> -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmpa/searchw?pageNow=${page.pageNow}"
               class='search_A'>下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
            <a href="rest/qmpa/searchw?pageNow=${page.pageNow + 1}"
               class='search_A'>下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 > page.totalPageCount}">
            <%-- <a href="rest/qmp/search?pageNow=${page.totalPageCount}"
                class='search_A'>下一页</a> --%>
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmpa/searchw?pageNow=${page.pageNow}"
               class='search_A'>尾页</a>
        </c:when>
        <c:otherwise>
            <a href="rest/qmpa/searchw?pageNow=${page.totalPageCount}"
               class='search_A'>尾页</a>
        </c:otherwise>
    </c:choose>
    <script>
        $('.search_A').unbind("click").bind("click", function (e) {
            e.preventDefault();
            var tmp = $('#jumpTmp').val();
            var test;
            if (tmp == "") {
                tmp = $('#jsonInput').val();
            }
            test = JSON.parse(tmp);
            $.ajax({
                type: "POST",
                dataType: "html",
                async: false,
                url: this.href,
                data: test,
                success: function (data) {
                    $('#listAll').html(data);
                }
            });
        });
    </script>
</div> <!-- 分页功能 end -->
<script type="text/javascript" src="app/js/qmp/qmpList.js"></script>
</body>
</html>