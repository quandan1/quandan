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

    <script type="text/javascript" src='app/js/qmp/kzdmwater.js'></script>
    <script type="text/javascript" src='app/js/qmp/searchQmp.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>

</head>
<body>
<div id="all">
    <div id="up">
        <div id="right" style="position:relative">
            <div id="map" style="height:470px;width:100%"></div>
            <div id="qmpTuli" class="box" style="width:150px !important;height:120px !important;position:absolute;right:0px;top:350px">
                <div class="head-title">
                    <a class="" style="font-size: 15px">图例</a>
                </div>
                <div class="flex" style="margin-bottom: 0px">
                    <div style="width:15px;float:left">
                        <img src="app/img/qmp5rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp3rep.png" style="width:12px;height:12px;"/>
                        <img src="app/img/qmp2rep.png" style="width:12px;height:12px"/>
                        <img src="app/img/qmp1rep.png" style="width:12px;height:12px"/>
                    </div>
                    <div style="width:80px;float:left;margin-left:10px">
                        <p>所有控制断面</p>
                        <p>达标断面</p>
                        <p>不达标断面</p>
                        <p>信息不明断面</p>
                    </div>
                </div>
            </div>
        </div>
        <div id="left">
            <div>

            </div>


            <input type="text" id="jsonInput" class="hide"/>


            <div style="margin-top: 10px;">
                <div class="box" style="background-color: #3391e8;  align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
                    <div class="glyphicon glyphicon-asterisk" id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px;margin-left: 20px;color: white" >
                        <a style='font-size: 15px;color: white'>断面水质识别</a>
                    </div>
                </div>

                <div id="dmszsb_body">
                    <div class="box" style="margin-bottom: 0px;border-top-left-radius: 0 !important;border-top-right-radius: 0px !important;">
                        <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                            <span>断面筛选</span>
                            <select id="szsb_sx" style="background: #ffffff;width: 100px">
                                <option value="alldm">所有</option>
                                <option value="dmn">不达标断面</option>
                                <option value="dmy">达标断面</option>
                            </select>
                        </div>
                        <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                            <span>水质指标</span>
                            <select id="szsb_std" style="background: #ffffff;width: 100px">
                                <%--<option value="all">全指标</option>--%>
                                <option value="ad">氨氮</option>
                                <option value="hxxyl">化学需氧量</option>
                                <option value="zd">总氮</option>
                                <option value="zl">总磷</option>
                            </select>
                        </div>
                        <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                            <span>年份</span>
                            <select style="background: #ffffff;width: 100px">
                                <option value="2013">2013</option>
                                <option value="2014">2014</option>
                                <option value="2015">2015</option>
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
                        
                        <div class="flex-row" style="border: none;width: 100%;">
                            <button type="button" class="btnz btnz-black" id="search_szsb"
                                    style="background-color: #3391e8;border-color: white">识别
                            </button>
                        </div>
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
                <button type="button" class="btn btn-default" data-dismiss="modal" id="addQmp_x">确认添加</button>
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
                <button type="button" class="btn btn-default" data-dismiss="modal" id="editQmp_1">确认修改</button>
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
                <button type="button" class="btn btn-default" data-dismiss="modal" id="searchQmp_x">查询</button>
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
                <a type="button" class="btn btn-default" data-dismiss="modal" id="bulkImportQmp_x"
                   onclick="bulkImport()">批量导入</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>