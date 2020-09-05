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
    <table width="100%" border="0" cellpadding="7" cellspacing="0" class="tableBasic" id="list_t1" style="table-layout:fixed;">
        <tr>
            <th width="50px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">城市</th>
            <th width="40px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">月份</th>
            <th width="60px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">断面名称</th>
            <th width="60px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所属河流</th>
            <th width="50px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">目标</th>
            <th width="60px" rowspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水质类别</th>
            <th width="60px" rowspan="2" align="center" style="word-wrap: break-word;white-space: nowrap;text-align: center;background:#99A4AF;color:white">超标指标</th>
            <th width="130px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">高锰酸盐指数(mg/L)</th>
            <th width="120px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">化学需氧量(mg/L)</th>
            <th width="100px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氨氮(mg/L)</th>
            <th width="100px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">总磷(mg/L)</th>
            <th width="120px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">生化需氧量(mg/L)</th>
            <th width="100px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">氟化物(mg/L)</th>
            <th width="100px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">挥发酚(mg/L)</th>
            <th width="100px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">石油类(mg/L)</th>
            <th width="145px" colspan="2" align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">阴离子表面活性剂(mg/L)</th>
        </tr>
        <tr>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">现状值</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">累加值</th>
        </tr>

        <c:forEach var="qmp" items="${result}">
            <input id="qmpjd${qmp.id}" type="hidden" value="${qmp.longitude}  "/>
            <input id="qmpwd${qmp.id}" type="hidden" value="${qmp.latitude}  "/>
            <tr>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.loc_city }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.month }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.section_name }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.river_name }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.quality_target }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.category_info }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cbxm }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cod_mn }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cod_mn_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cod_cr }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.cod_cr_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.nh_n }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.nh_n_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.t_p }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.t_p_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bod5 }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.bod5_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.f_ }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.f__add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.hff }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.hff_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.syl }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.syl_add }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.las }</td>
                <td align="center" style="word-wrap: break-word; word-break: normal;">${qmp.las_add }</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>