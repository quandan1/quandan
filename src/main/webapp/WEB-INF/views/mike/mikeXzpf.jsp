
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src='app/js/jquery/jquery-1.7.2.min.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
        <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
        <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>

    <script type="text/javascript" src='app/js/mike/mikeXzpf.js'></script>





    <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
    <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
    <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">

    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
    <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
    <link  rel="stylesheet" type="text/css" href="app/css/mike/jquery-ui.min.css" />
    <link  rel="stylesheet" type="text/css"  href="app/css/mike/xzpf.css" />
    <link rel="stylesheet" type="text/css" href="app/css/mike/public.css">


    <link type="text/javascript" href="app/js/3.20/init.js">
    <!-- 引入jQuery的js文件 -->
    <script type="text/javascript" src="app/js/jquery/jquery-1.7.2.min.js" ></script>
    <!-- 引入jQuery UI的js文件 -->
    <script type="text/javascript" src="app/js/jquery/jquery-ui.js" ></script>
    

    <script type="text/javascript" src="app/js/jquery/jquery.fixedheadertable.min.js"></script>
    <link href="app/css/mike/defaultTheme.css" rel="stylesheet" media="screen" />

</head>

<body>
<div id="heliuxuanze">

</div>
<div id="xuanze2" style="height: 100px;">
    <ul id="myTab" class="nav nav-tabs">
        <li class="active">
            <a href="#home" data-toggle="tab">
                  河流级联选择
            </a>
        </li>
        <li>
            <a href="#ios" data-toggle="tab">
                河流搜索框
            </a>
        </li>

    </ul>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="home">

        </div>
        <div class="tab-pane fade" id="ios">
            <input id="inp1" placeholder="请输入河流名称" style="width: 200px">
            <div id="lsn" style="width: 200px">

            </div>
        </div>
    </div>
</div>
<div id="monishezhi">
</div>
</br>

<div id="btn">
    <button id="startmoni">开始模拟</button>
    <button id="resultshow">结果查看</button>
</div>
<div id="pic">

</div>
<div id="map">

</div>
<div id="left">

</div>
<div id="right">

</div>
<div id="up">

</div>
<div id="down" style="height: 600px;width: 600px">
    原始数据：</br>
    <div id="downin"  style="height: 400px;width: 400px">


    </div>
<%--    <table id="tab1" >--%>
<%--        <thead style="width: 400px;height: 20px;" >--%>
<%--        <tr id="tr1">--%>
<%--            <th>企业名称</th>--%>
<%--            <th>详细地址县(区、市、旗)</th>--%>
<%--            <th>详细地址乡(镇)</th>--%>
<%--            <th>经度</th>--%>
<%--            <th>纬度</th>--%>
<%--            <th>生产时间（小时/年）</th>--%>
<%--            <th>废水排放量（吨/年）</th>--%>
<%--        </tr>--%>
<%--        </thead>--%>
<%--        <tbody style="width: 400px;height: 80px;" id="tbd1" >--%>
<%--        </tbody>--%>
<%--    </table>--%>
</div>
    <div style="height: 100px;width: 400px" >
        <table id="tab3">
            <thead style="width: 400px;height: 20px;" >
            <tr id="tr1">
                <th>企业名称</th>
                <th>详细地址县(区、市、旗)</th>
                <th>详细地址乡(镇)</th>
                <th>经度</th>
                <th>纬度</th>
                <th>生产时间（小时/年）</th>
                <th>废水排放量（吨/年）</th>
            </tr>
            </thead>
            <tbody style="width: 400px;height: 80px;" id="tbd1" >
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
            </tr>
            </tbody>
        </table>
</div>

</body>
</html>
<script type="text/javascript">

    $(document).ready(function() {
        $('#tab1').fixedHeaderTable({ footer: true, altClass: 'odd' });
        $('#tab2').fixedHeaderTable({ footer: true, altClass: 'odd' });
        $('#tab3').fixedHeaderTable({ footer: true, altClass: 'odd' });
    });

</script>
