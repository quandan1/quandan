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
  <link rel="stylesheet" href="app/css/qmp/qmpSzxz.css">
</head>
<body>
<div id="list" style="display: block;overflow:auto;width:100%;">
    <table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1">
        <tr>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面性质</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">原考核108</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流水质90</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">原序号</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">城市</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属流域</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属河流</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面属性</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">受控水库</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2020年目标</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2016年目标</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2017年目标</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:red">2018年目标</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">1月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">3月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">4月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">5月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">6月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">7月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">8月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">9月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">10月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">11月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">12月</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">2018年均</th>
        </tr>

        <c:forEach var="qmp" items="${result}">
            <input id="qmpjd${qmp.id}" type="hidden" value="${qmp.longitude}  "/>
            <input id="qmpwd${qmp.id}" type="hidden" value="${qmp.latitude}  "/>
            <tr id="qmpx${qmp.id}">
                <td align="center" style="white-space: nowrap;">${qmp.section_level }</td>
                <td align="center" style="white-space: nowrap;">${qmp.ykh_108 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.hlsz_90 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.original_id }</td>
                <td align="center" style="white-space: nowrap;">${qmp.loc_city }</td>
                <td align="center" style="white-space: nowrap;">${qmp.section_name }</td>
                <td align="center" style="white-space: nowrap;">${qmp.basin }</td>
                <td align="center" style="white-space: nowrap;">${qmp.river_name }</td>
                <td align="center" style="white-space: nowrap;">${qmp.section_sx }</td>
                <td align="center" style="white-space: nowrap;">${qmp.sksk }</td>
                <td align="center" style="white-space: nowrap;">${qmp.target_2020 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.target_2016 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.target_2017 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.target_2018 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info1 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info2 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info3 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info4 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info5 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info6 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info7 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info8 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info9 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info10 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info11 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.category_info12 }</td>
                <td align="center" style="white-space: nowrap;">${qmp.aver }</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>