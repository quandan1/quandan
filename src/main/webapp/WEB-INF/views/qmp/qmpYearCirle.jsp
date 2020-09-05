<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="app/js/echart/echarts-all.js"></script>
    <script type="text/javascript" src="app/js/qmp/qmpAnalysis.js"></script>

    <link rel="stylesheet" type="text/css" href="assets/plugins/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="app/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstraps.min.js"></script>
</head>

<body>
<div class="row">
    <div class="col-md-2" style="margin-left: 5%">
        <select name="select" id="year" name="year" title="年份">
            <option value="null" selected="selected">选择年份</option>
            <option value="2014">2014年</option>
            <option value="2014">2015年</option>
            <option value="2014">2016年</option>
        </select>
        <%--<input type="text" id="year" name="year" title="年份" value="">--%>
    </div>
    <div class="col-md-2">
        <select name="select" id="section"name="section_name"  title="断面">
            <option value="null" selected="selected">选择断面</option>
            <option value="红庙子">红庙子</option>
            <option value="东陵大桥">东陵大桥</option>
            <option value="旧门桥">旧门桥</option>
        </select>
        <%--<input type="text" id="section" name="section_name" title="断面" value="红庙子">--%>
    </div>
    <div class="col-md-2">
        <select name="select" id="section"name="section_name"  title="断面">
            <option value="null" selected="selected">显示选项</option>
            <option value="yearCircle">年度环比表</option>
            <option value="YearEq">年度同比表</option>
            <option value="MonthWrxx">同年多月多指标</option>
            <option value="YearOne">多年多月单指标</option>
        </select>
        <%--<input type="text" id="section" name="section_name" title="断面" value="红庙子">--%>
    </div>
    <div class="col-md-2">
        <input type="button" onclick="searchqmpwr(${qmpWrxx})" value="提交" name="提交" >
    </div>
    <div class="col-md-4"></div>
</div>
<div class="row">
    <div class="container">
        <div class="col-md-12">
            <div class="col-md-10">
                <div id="chart" style="width: 800px; height: 600px;"></div>
            </div>
            <div class="col-md-2">
            </div>
            <%--<div style="width: 600px; height: 200px;"></div>--%>
        </div>
    </div>
</div>

</body>
</html>


