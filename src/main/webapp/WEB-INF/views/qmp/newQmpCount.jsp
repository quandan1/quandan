<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">

    <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
    <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">

    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
    <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">

    <link type="text/javascript" href="app/js/3.20/init.js">

    <script type="text/javascript" src='app/js/qmp/newQmpCount.js'></script>
    <script type="text/javascript" src='app/js/qmp/searchNewQmpCount.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
    <script type="text/javascript" src="app/js/echart/echarts-all.js"></script>

</head>
<body>
<div id="all">
    <div id="up">
        <div id="left" style="position:relative;height:500px;">
            <script>
                function getTree() {
                    var tree = [{
                        text: "控制断面"
                    }];
                    return tree;
                }
                $('#tree').treeview({
                    data: getTree(),
                    onNodeSelected: function (event, data) {
                        var tmp = data.text;
                        var layerDefinitions = [];//定义过滤条件
                        layerDefinitions[4] = "COD = '" + tmp + "'";
                        layer.setLayerDefinitions(layerDefinitions);//开始过滤
                        map.addLayer(layer);//将过滤结果添加到地图上
                    }
                });
            </script>
            <!-- <div id="tree"></div> -->
            <div>
                <%--<div id="head-title" style="margin-top:15px;">--%>
                <%--<a class="my-list-group-item-select">断面信息查询与维护</a>--%>
                <%--</div>--%>
                <div class="box">
                    <div id="head-title">
                        <a class="" style="font-size: 15px">断面信息查询与维护</a>
                    </div>
                    <div class="flex-row">
                        <button type="button" class="btnz btnz-info"
                                data-toggle="modal" data-target="#myModal_add" id="addButton">添加
                        </button>
                        <button type="button" class="btnz btnz-info"
                                data-toggle="modal" data-target="#myModal_search" id="searchButton">查询
                        </button>
                        <button type="button" class="btn btn-primary btn-lg hide"
                                data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>
                    </div>
                    <div class="flex" style="margin-bottom: 0px;">
                        <button type="button" class="btnz btnz-black"
                                data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入
                        </button>

                        <button type="button" class="btnz btnz-black" id="exportExcel">导&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出</button>
                    </div>
                </div>
                <%--<div class="body-button">--%>
                <%--&lt;%&ndash;<table width="100%" border="0" cellspacing="0" class="tableBasic">&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<div id="head-title" style="margin-top:15px;">&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<a class="my-list-group-item-select">断面信息查询与维护</a>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</div>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;<tr style="width: 100%;">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<td style="padding: 5px; ">&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<button type="button" class="btn btn-primary " style="width: 100%;display: inline "&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;data-toggle="modal" data-target="#myModal_add" id="addButton">添加&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</button>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<td style="padding: 5px;">&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<button type="button" class="btn btn-primary" style="width: 100%;display: inline"&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;data-toggle="modal" data-target="#myModal_search" id="searchButton">查询&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</button>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;</td>&ndash;%&gt;--%>

                <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<button type="button" class="btn btn-primary btn-lg hide"&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<tr>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<td>&ndash;%&gt;&ndash;%&gt;--%>

                <%--&lt;%&ndash;&lt;%&ndash;</td>&ndash;%&gt;&ndash;%&gt;--%>

                <%--&lt;%&ndash;&lt;%&ndash;</tr>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<tr>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<td>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<button type="button" class="btn btn-primary btn-lg" style="width: 100%"&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;data-toggle="modal" data-target="#myModal_search" id="searchButton"><span style="font-size: small">查询</span>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</button>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</td>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;&ndash;%&gt;&ndash;%&gt;--%>

                <%--&lt;%&ndash;&lt;%&ndash;</tr>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<td colspan="2" style="padding: 5px;">&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;<button type="button" class="btn btn-primary" style="width: 100%;display: inline"&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;&lt;%&ndash;</button>&ndash;%&gt;&ndash;%&gt;--%>
                <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</table>&ndash;%&gt;--%>
                <%--</div>--%>
            </div>


            <input type="text" id="jsonInput" class="hide" value=""/>
            <input type="text" id="currentplace" class="hide" value=""/>
            <%--<div class="box" style="margin-top: 10px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div>
                    <div id="citylisthead" class="flex1-row" style="margin-bottom: 10px;margin-top: 5px">
                    </div>
                </div>

                <div id="citylist" style="width: 100%;display: flex;flex-direction: row;justify-content: center;flex-wrap: wrap"></div>
            </div>--%>
            <%--<div id="citylisthead" style="margin-top:15px;"></div>--%>
            <%--<div id="citylist" style="margin-top:0.5px;"></div>--%>

            <%-- <div style="margin-top: 10px;">
                <div class="box" style="align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
                    <div id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px">
                        <a style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'>断面水质识别</a>
                    </div>
                </div>
                <div id="dmszsb_body">
                    <div class="box" style="margin-bottom: 0px;border-top-left-radius: 0 !important;border-top-right-radius: 0px !important;">
                        <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                            <span>水质指标</span>
                            <select id="szsb_std" style="background: #ffffff;width: 100px">
                                <option value="zl">全指标</option>
                                <option value="ad">氨氮</option>
                                <option value="hxxyl">化学需氧量</option>
                                <option value="zd">总氮</option>
                                <option value="zl">总磷</option>
                            </select>
                        </div>
                        <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                            <span>月份</span>
                            <select id="szsb_month" style="background: #ffffff;width: 100px">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                        </div>
                        <div class="flex-row" style="border: none;width: 100%">
                            <button type="button" class="btnz btnz-black" id="search_szsb"
                                    style="">识别
                            </button>
                        </div>
                    </div>
                    <table width="100%" cellspacing="0" style="background: #F3F3F3;border: none;">
                    <tr>
                    <td style="text-align: center">水质指标</td>
                    <td style="text-align: center">
                    <select id="szsb_std" width="100px" style="background: #ffffff">
                    <option value="zl">全指标</option>
                    <option value="ad">氨氮</option>
                    <option value="hxxyl">化学需氧量</option>
                    <option value="zd">总氮</option>
                    <option value="zl">总磷</option>
                    </select>
                    </td>
                    </tr>
                    <tr>
                    <td style="text-align: center">月份</td>
                    <td style="text-align: center">
                    <select id="szsb_month" width="100px">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    </select>
                    </td>
                    </tr>
                    <tr>
                    <td colspan="2">
                    <div class="flex-row" style="border: none;">
                    <button type="button" class="btnz btnz-black" id="search_szsb"
                    style="">识别
                    </button>
                    </div>
                    </td>
                    </tr>
                    </table>
                </div>
            </div> --%>

<%--            <div class="box" style="width:100%;position:absolute;bottom:0px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div style="margin-top: 10px;margin-left: 10px;margin-right: 15px;">
                    <span>点源总量显示：</span>
                    <select id="count_source" style="background: #F3F3F3;width:145px;">
                        <option value="0">请选择</option>
                        <option value="1">化学需氧量产生量(吨):</option>
                        <option value="2">化学需氧量排放量(吨):</option>
                        <option value="3">氨氮产生量(吨):</option>
                        <option value="4">氨氮排放量(吨):</option>
                    </select>
                    <br>
                    &lt;%&ndash;<span>优控断面识别：</span>&ndash;%&gt;
                    &lt;%&ndash;<select id="qmp_youkong" style="background: #F3F3F3;width:145px;">&ndash;%&gt;
                    &lt;%&ndash;<option value="0">请选择</option>&ndash;%&gt;
                    &lt;%&ndash;<option value="1">不达标断面</option>&ndash;%&gt;
                    &lt;%&ndash;<option value="2">达标断面</option>&ndash;%&gt;
                    &lt;%&ndash;</select>&ndash;%&gt;
                    <br>
                    <span>当前数据年份：</span>
                    <select id="qmpmark" width="100px" style="background: #F3F3F3;width:145px;">
                        <option value="2014">2014</option>
                        <option value="2013">2013</option>
                        <option value="2015">2015</option>
                    </select>
                </div>
            </div>--%>



        </div>
        <div id="right" style="position:relative">
            <div id="map"></div>
            <div id="qmpBilichi" class="box"
                 style="width:80px !important;height:20px !important;position:absolute;left:31px;top:400px">
                <div class="head-title">
                    <a class="" style="font-size: 15px">比例尺</a>
                </div>
            </div>
            <%--<div id="qmpTuli" class="box" style="width:160px !important;height:150px !important;position:absolute;right:0px;top:320px">
                <div class="head-title" style="margin-top: -10px;">
                    <a class="" style="font-size: 15px">图例</a>
                </div>
                <div class="flex" style="margin-bottom: 0px;margin-right:-55px;lift:50px">
                    <div style="width:15px;float:left">
                        <img src="app/img/qmp5rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp3rep.png" style="width:12px;height:12px;"/>
                        <img src="app/img/qmp2rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp1rep.png" style="width:12px;height:12px"/>
                        &lt;%&ndash;<img src="app/img/histogram_orange.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_blue.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_yellow1.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_green.png" style="width:12px;height:12px"/>&ndash;%&gt;
                    </div>
                    <div style="width:150px;float:left;margin-left:10px">
                        <p>所有控制断面</p>
                        <p>达标断面</p>
                        <p>不达标断面</p>
                        <p>信息不明断面</p>
                        &lt;%&ndash;<p>化学需氧产生量(吨)</p>
                        <p>化学需氧排放量(吨)</p>
                        <p>氨氮产生量(吨)</p>
                        <p>氨氮排放量(吨)</p>&ndash;%&gt;
                    </div>
                </div>
            </div>--%>
        </div>
    </div>
    <div id="down">
        <div id="listAll" style="width: auto"></div>
    </div>
    <div id="down2">
        <div id="listAll2" class="hide"></div>
    </div>
</div>

<div class="modal fade" id="myModal_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">添加控制断面</h4>
            </div>
            <div class="modal-body">
                <div id="addDiv"></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="addQmp_x">确认添加</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改控制断面</h4>
            </div>
            <div class="modal-body">
                <div id="editDiv"></div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="editQmp_1">确认修改</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="myModal_search" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">控制断面查询</h4>
            </div>
            <div class="modal-body">
                <div id="searchDiv2">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="searchQmp_x">查询</button>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="myModal_bulkImport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">控制断面批量导入</h4>
            </div>
            <div class="modal-body">
                <div id="bulkImportDiv">
                </div>
            </div>
            <div class="modal-footer">
                <a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImportQmp_x"
                   onclick="bulkImportBas()">批量导入</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>