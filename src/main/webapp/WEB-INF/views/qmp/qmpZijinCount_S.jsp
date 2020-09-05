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
</head>
<body>
<div id="list" style="display: block;overflow:auto;width:100%;">
    <table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1" style="table-layout:fixed;">
        <tr>
            <th width="4%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">序号</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">年份</th>
            <th width="4%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">月份</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">城市</th>
            <th width="8%"  align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属河流</th>
            <th width="10%"  align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th width="8%"  align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面属性</th>
            <th width="5%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">目标</th>
            <th width="10%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水质类别</th>
            <th width="15%"  align="center" style="word-wrap: break-word; white-space: nowrap;text-align: center;background:#99A4AF;color:white">超标项目</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">降类</th>
            <%--<th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2020年目标</th>--%>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">劣Ⅴ加罚</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">合计</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">补偿下游</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">补偿城市</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">补偿省里</th>
            <th width="6%" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">备注</th>

        </tr>

        <c:forEach var="qmp" items="${qmp_list}"  varStatus="s">

            <tr>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${s.count}</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.year }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.month }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.city }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.loc_river }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.section_name }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.section_sx }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.objective_2018 }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.szlb }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cbxm}</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.jl_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.lwjf_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.hj_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bcxy_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bccs_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bcsl_jnzj }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bz }</td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>