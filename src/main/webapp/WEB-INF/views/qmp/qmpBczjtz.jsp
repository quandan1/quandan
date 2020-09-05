<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>水质现状报表</title>

    <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
    <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
    <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">
    <link rel="stylesheet" href="https://js.arcgis.com/3.24/esri/themes/calcite/dijit/calcite.css">
    <link rel="stylesheet" href="https://js.arcgis.com/3.24/esri/themes/calcite/esri/esri.css">

    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
    <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">

    <%--<script type="text/javascript" src="app/js/3.20/init.js"></script>--%>


    <script type="text/javascript" src='app/js/qmp/qmpBczjtz.js'></script>
    <script type="text/javascript" src='app/js/qmp/searchQmp.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
    <script src="https://js.arcgis.com/3.24/"></script>
</head>
<body class="claro">
<div id="all">
    <div id="up">
        <div id="left">
            <div>

            </div>


            <input type="text" id="jsonInput" class="hide"/>


            <div style="margin-top: 10px;">
                <%--<div class="box">
                    <div id="head-title">
                        <a class="" style="font-size: 15px">实测数据添加与导入</a>
                    </div>
                    <div class="flex-row">
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
                    </div>
                </div>--%>
                <div class="box"
                     style="align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
                    <div id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px">
                        <a style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'>补偿资金通知单</a>
                    </div>
                </div>

                <div id="dmszsb_body">
                    <form action="/EnvironmentalProtection/rest/qmp/get_bczjtz" method="post">
                        <div class="box"
                             style="margin-bottom: 0px;border-top-left-radius: 0 !important;border-top-right-radius: 0px !important;">
                            <div class="flex-row"
                                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                                <span>区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;域</span>
                                <select id="szxz_region" style="background: #ffffff;width: 100px" name="region">
                                    <option value="沈阳">沈阳</option>
                                    <option value="大连">大连</option>
                                    <option value="鞍山">鞍山</option>
                                    <option value="抚顺">抚顺</option>
                                    <option value="本溪">本溪</option>
                                    <option value="丹东">丹东</option>
                                    <option value="锦州">锦州</option>
                                    <option value="营口">营口</option>
                                    <option value="阜新">阜新</option>
                                    <option value="辽阳">辽阳</option>
                                    <option value="盘锦">盘锦</option>
                                    <option value="铁岭">铁岭</option>
                                    <option value="朝阳">朝阳</option>
                                    <option value="葫芦岛">葫芦岛</option>
                                </select>
                            </div>
                            <div class="flex-row"
                                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                                <span>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;份</span>
                                <select style="background: #ffffff;width: 100px" id="tz_year" name="year">
                                    <option value="2016">2016</option>
                                    <option value="2017">2017</option>
                                    <option value="2018">2018</option>
                                    <option value="2019">2019</option>
                                </select>
                            </div>
                            <div class="flex-row"
                                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                                <span>月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;份</span>
                                <select id="bczjtz_month" style="background: #ffffff;width: 100px" name="month">
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
                                <button type="submit" class="btnz btnz-black"
                                        style="width: 243.69px;">生成
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div id="right" style="position:relative">
            <%--<div id="rightPane"
                 data-dojo-type="dijit/layout/ContentPane"
                 data-dojo-props="region:'right'">

                <div data-dojo-type="dijit/layout/AccordionContainer">
                    <div data-dojo-type="dijit/layout/ContentPane" id="legendPane"
                         data-dojo-props="title:'Legend', selected:true">
                        <div id="legendDiv"></div>
                    </div>
                    <div data-dojo-type="dijit/layout/ContentPane"
                         data-dojo-props="title:'Pane 2'">
                        This pane could contain tools or additional content
                    </div>
                </div>
            </div>--%>
            <div id="map" data-dojo-type="dijit/layout/ContentPane"
                 data-dojo-props="region:'center'"
                 style="overflow:hidden;height:470px;width:100%">
            </div>
            <div id="qmpBilichi" class="box"
                 style="width:80px !important;height:20px !important;position:absolute;left:31px;top:400px">
                <div class="head-title">
                    <a class="" style="font-size: 15px">比例尺</a>
                </div>
            </div>

        </div>
        <div id="bookmarks"></div>
        <div id="down">
            <form action="rest/qmp/exportToExcel" method="post">
                <input id="exportToExcel" class="btn btn-success" type="submit"
                       style="display: none;background-color:#00c0c2!important;margin-bottom: 2px" value="导出Excel"/>
            </form>
            <%--<button class="btn btn-success" id="exportToExcel" style="display: none;background-color:#00c0c2!important;margin-bottom: 2px">导出Excel</button>--%>
            <div id="listAll" style="width: auto"></div>
        </div>
        <div id="down2">
            <div id="listAll2" class="hide"></div>
        </div>
    </div>


    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-body" style="text-align: center">
                    <img src="app/img/Loading.gif" width="100px" alt="">
                    <strong>加载中，请稍后......</strong>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
