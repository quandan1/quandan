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
    <script type="text/javascript" src='app/js/mike/shuiXiSelect.js'></script>
    <script type="text/javascript" src="app/js/jquery/jquery.min.js"></script>
</head>
<body>
<div id="list" style="display: block;overflow:auto;width:100%;">
<%--    <select id="sel1">--%>
<%--        <option value="0" selected>水系选择</option>--%>

<%--        <c:forEach items="${address}" var="shui">--%>
<%--            <option value="${shui.shuixi}">${shui.shuixi}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>


    <div id="sanji"></div>





</div>

</body>

</html>