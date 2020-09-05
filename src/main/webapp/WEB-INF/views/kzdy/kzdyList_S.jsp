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
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元编号</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元名称</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元级别</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属省份</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属地市</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含区(县)名称</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含乡镇名称</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含乡镇个数</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">流域</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水系</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">干流</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含一级河流</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含二级河流</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含三级河流</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含四级河流</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所含水源地</th>
                    <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">控制单元划分时间</th>
                </tr>
                <c:forEach var="kzdyJbxx" items="${list}">
                    <tr id="${kzdyJbxx.id}">
                        <td align="center" style="white-space: nowrap;">
                            <a href="rest/kzdy/id?id=${kzdyJbxx.id}" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a>
                            <a href="rest/kzdy/delete?id=${kzdyJbxx.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
                        </td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyBh}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyMc}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyJb}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdySheng}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyShi}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyQx}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyXz}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyXzs}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyLymc}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdySx}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyGl}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdy1jzl}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdy2jzl}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdy3jzl}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdy4jzl}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdySyd}</td>
                        <td align="center" style="white-space: nowrap;">${kzdyJbxx.kzdyTime}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <!-- 分页功能 start -->
        <div align="center" id="page">
            <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
            ${page.pageNow} 页</font> <a href="rest/kzdy/search?pageNow=1">首页</a>
            <c:choose>
                <c:when test="${page.pageNow - 1 > 0}">
                    <a href="rest/kzdy/search?pageNow=${page.pageNow - 1}">上一页</a>
                </c:when>
                <c:when test="${page.pageNow - 1 <= 0}">
                    <!-- <a href="rest/controlunit/list?pageNow=1">上一页</a>   -->
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${page.totalPageCount==0}">
                    <a href="rest/kzdy/search?pageNow=${page.pageNow}">下一页</a>
                </c:when>
                <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
                    <a href="rest/kzdy/search?pageNow=${page.pageNow + 1}">下一页</a>
                </c:when>
                <c:when test="${page.pageNow + 1 > page.totalPageCount}">
                    <!-- <a href="rest/controlunit/list?pageNow=${page.totalPageCount}">下一页</a> -->
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${page.totalPageCount==0}">
                    <a href="rest/kzdy/search?pageNow=${page.pageNow}">尾页</a>
                </c:when>
                <c:otherwise>
                    <a href="rest/kzdy/search?pageNow=${page.totalPageCount}">尾页</a>
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
<script type="text/javascript" src="app/js/kzdy/kzdyList.js"></script>
</body>
</html>