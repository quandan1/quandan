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
    <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
</head>
<body>
<div style="margin-top:10px;margin-bottom:20px">
    <span style="font-size:125%">当前计算的污染物:</span>
    <select id="target1" style="margin-right: 5px;width: 138px;text-align: center">
        <option value="ad">氨氮</option>
        <option value="hxxyl">化学需氧量</option>
        <option value="zl">总磷</option>
    </select>


    <span style="font-size:125%">当前数据的年份:</span>
    <select id="target2" style="margin-right: 5px;width: 138px;text-align: center">
        <option value="2014">2014</option>
        <option value="2013">2013</option>
        <option value="2015">2015</option>

    </select>

    <span style="font-size:125%">当前断面:</span>
    <select id="target3" style="margin-right: 5px;width: 138px;text-align: center">

    </select>

    <span style="font-size:125%">当前数据的月份:</span>
    <select id="target4" style="margin-right: 5px;width: 138px;text-align: center">
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
    </select>

    <span style="font-size:125%">&nbsp;&nbsp;&nbsp;&nbsp;示例: 点源贡献率 / 面源贡献率</span>
</div>

<div id="piechart" style="width: 600px;height: 400px;">

</div>


<table width="100%" border="0" cellpadding="7" cellspacing="0"
       class="tableBasic" id="DMrateTable">
    <tr>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">断面名称</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">五月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">六月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">七月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">八月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">九月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">十月</th>
        <th align="center" style="white-space: nowrap; text-align: center; background: #99A4AF; color: white">十一月</th>
    </tr>
    <tr>
    </tr>
</table>

<script type="text/javascript" src="app/js/qmp/qmpDMrate.js"></script>
<script type="text/javascript" src="app/js/echart/echart.common.min.js"></script>
</body>
</html>
