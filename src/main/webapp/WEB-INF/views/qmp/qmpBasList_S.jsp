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
    <table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1">
        <tr>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属流域</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属河流</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面属性</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流级别</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">受控水库</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面级别</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属地市</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属区县</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">测站名称</th>
        </tr>

        <c:forEach var="qmpBaseInfo" items="${list}">

            <input id="qmpjd${qmpBaseInfo.id}" type="hidden" value="${qmpBaseInfo.longitude}  "/>
            <input id="qmpwd${qmpBaseInfo.id}" type="hidden" value="${qmpBaseInfo.latitude}  "/>
            <tr id="qmpx${qmpBaseInfo.id}">
                <td align="center" style="white-space: nowrap;"><a href="rest/qmp/Basid?id=${qmpBaseInfo.id}"
                                                                   class="updateButton"  style="color: white;background:#FAAD5E;padding:2px 6px">修改</a> <a href="rest/qmp/deleteBas?id=${qmpBaseInfo.id}"
                                                                                                                                                           class="deleteButton"  style="color: white;background:#00C0BF;padding:2px 6px">删除</a></td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.sectionName }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.basin }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.riverName }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.sectionSx }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.riverLevel }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.sksk }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.sectionLevel }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.locCity }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.locDistrict }</td>
                <td align="center" style="white-space: nowrap;">${qmpBaseInfo.czName }</td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- 分页功能 start -->
<div align="center" id="searchPage">
    <font size="2">共 ${page.totalPageCount} 页</font>
    <font size="2">第${page.pageNow} 页</font>
    <a href="rest/qmp/searchQmpBaeInfo?pageNow=1" class='search_A'>首页</a>
    <c:choose>
        <c:when test="${page.pageNow - 1 > 0}">
            <a href="rest/qmp/searchQmpBaeInfo?pageNow=${page.pageNow - 1}"
               class='search_A'>上一页</a>
        </c:when>
        <c:when test="${page.pageNow - 1 <= 0}">
            <!-- <a href="rest/qmp/search?pageNow=1" class='search_A'>上一页</a> -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmp/searchQmpBaeInfo?pageNow=${page.pageNow}"
               class='search_A'>下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
            <a href="rest/qmp/searchQmpBaeInfo?pageNow=${page.pageNow + 1}"
               class='search_A'>下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 > page.totalPageCount}">
            <%-- <a href="rest/qmp/search?pageNow=${page.totalPageCount}"
                class='search_A'>下一页</a> --%>
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/qmp/searchQmpBaeInfo?pageNow=${page.pageNow}"
               class='search_A'>尾页</a>
        </c:when>
        <c:otherwise>
            <a href="rest/qmp/searchQmpBaeInfo?pageNow=${page.totalPageCount}"
               class='search_A'>尾页</a>
        </c:otherwise>
    </c:choose>
    <script>
        $('.search_A').unbind("click").bind("click",function(e){
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
<script type="text/javascript" src="app/js/qmp/qmpBasList_S.js"></script>
</body>
</html>