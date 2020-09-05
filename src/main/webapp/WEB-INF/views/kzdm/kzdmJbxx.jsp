<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>


    <script type="text/javascript" src='app/js/kzdm/kzdmJbxx.js'></script>
    <script type="text/javascript" src='app/js/kzdm/searchKzdm.js'></script>


        <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
        <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
        <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">
        <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
        <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">



        <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
        <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
        <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
</head>
<body>
<div id="all">
    <div id="up">
        <div id="left" style="position:relative;height:500px;">
<%--            <script>--%>
<%--                function getTree() {--%>
<%--                    var tree = [{--%>
<%--                        text: "控制断面"--%>
<%--                    }];--%>
<%--                    return tree;--%>
<%--                }--%>
<%--                $('#tree').treeview({--%>
<%--                    data: getTree(),--%>
<%--                    onNodeSelected: function (event, data) {--%>
<%--                        var tmp = data.text;--%>
<%--                        var layerDefinitions = [];//定义过滤条件--%>
<%--                        layerDefinitions[4] = "COD = '" + tmp + "'";--%>
<%--                        layer.setLayerDefinitions(layerDefinitions);//开始过滤--%>
<%--                        map.addLayer(layer);//将过滤结果添加到地图上--%>
<%--                    }--%>
<%--                });--%>
<%--            </script>--%>
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
                                data-toggle="modal" data-target="#myModal_search" id="searchButton">查询
                        </button>
                        <button type="button" class="btnz btnz-info"
                                data-toggle="modal" data-target="#myModal_add" id="addButton">添加
                        </button>
                        <button type="button" class="btn btn-primary btn-lg hide"
                                data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>
                    </div>
                    <div class="flex" style="margin-bottom: 0px;">
                        <button type="button" class="btnz btnz-black"
                                data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入
                        </button>

                        <button type="button" class="btnz btnz-black" id="exportExcel">导出表格</button>
                    </div>
                </div>
            </div>


            <input type="text" id="jsonInput" class="hide" value=""/>
            <input type="text" id="currentplace" class="hide" value=""/>
            <div class="box" style="margin-top: 10px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div>
                    <div id="citylisthead" class="flex1-row" style="margin-bottom: 10px;margin-top: 5px">
                    </div>
                </div>

                <div id="citylist" style="width: 100%;display: flex;flex-direction: row;justify-content: center;flex-wrap: wrap"></div>
            </div>

            <div class="box" style="width:100%;position:absolute;bottom:0px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
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
                    <%--<span>优控断面识别：</span>--%>
                    <%--<select id="qmp_youkong" style="background: #F3F3F3;width:145px;">--%>
                    <%--<option value="0">请选择</option>--%>
                    <%--<option value="1">不达标断面</option>--%>
                    <%--<option value="2">达标断面</option>--%>
                    <%--</select>--%>
                    <br>
                    <span>当前数据年份：</span>
                    <select id="qmpmark" width="100px" style="background: #F3F3F3;width:145px;">
                        <option value="2014">2014</option>
                        <option value="2013">2013</option>
                        <option value="2015">2015</option>
                    </select>
                </div>
            </div>



        </div>
        <div id="right" style="position:relative">
            <div id="map"></div>
            <div id="qmpTuli" class="box" style="width:160px !important;height:150px !important;position:absolute;right:0px;top:320px">
                <div class="head-title" style="margin-top: -10px;">
                    <a class="" style="font-size: 15px">图例</a>
                </div>
                <div class="flex" style="margin-bottom: 0px;margin-right:-55px;lift:50px">
                    <div style="width:15px;float:left">
                        <img src="app/img/qmp5rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp3rep.png" style="width:12px;height:12px;"/>
                        <img src="app/img/qmp2rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp1rep.png" style="width:12px;height:12px"/>
                        <%--<img src="app/img/histogram_orange.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_blue.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_yellow1.png" style="width:12px;height:12px"/>
                        <img src="app/img/histogram_green.png" style="width:12px;height:12px"/>--%>
                    </div>
                    <div style="width:150px;float:left;margin-left:10px">
                        <p>所有控制断面</p>
                        <p>达标断面</p>
                        <p>不达标断面</p>
                        <p>信息不明断面</p>
                        <%--<p>化学需氧产生量(吨)</p>
                        <p>化学需氧排放量(吨)</p>
                        <p>氨氮产生量(吨)</p>
                        <p>氨氮排放量(吨)</p>--%>
                    </div>
                </div>
            </div>
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
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="addKzdm_x">确认添加</button>
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
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="editKzdm_1">确认修改</button>
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
                <div id="searchDiv">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="searchKzdm_x">查询</button>
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
                <a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImportKzdm_x"
                   onclick="bulkImport()">批量导入</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>