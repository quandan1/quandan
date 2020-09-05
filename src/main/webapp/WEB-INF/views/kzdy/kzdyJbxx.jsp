<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <!-- <link rel="stylesheet" href="https://js.arcgis.com/3.20/dijit/themes/tundra/tundra.css"> -->
    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
    <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
    <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
    <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">

    <script type="text/javascript" src='app/js/kzdy/kzdyJbxx.js'></script>
    <script type="text/javascript" src='app/js/kzdy/map.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
</head>
<body>
<div id="all">
    <div id="up">
        <div id="left">
            <div>
                <div class="box">
                    <div id="head-title">
                        <a class="" style="font-size: 15px">断面单元查询与维护</a>
                    </div>
                    <div class="flex-row">
                        <button type="button" class="btnz btnz-info"
                                data-toggle="modal" data-target="#myModal_search" id="searchButton"
                                style="width: 100%;">查询
                        </button>
                        <button type="button" class="btnz btnz-info"
                                data-toggle="modal" data-target="#myModal_add" id="addButton"
                                style="width: 100%;">添加
                        </button>
                    </div>
                    <div class="flex" style="margin-bottom: 0px">
                        <button type="button" class="btnz btnz-black"
                                data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入
                        </button>

                        <button type="button" class="btnz btnz-black" id="exportExcel">导出表格</button>
                    </div>
                </div>
            </div>
            <button type="button" class="btn btn-primary btn-lg hide"
                    data-toggle="modal" data-target="#myModal" id="addButtona">添加
            </button>
            <button type="button" class="btn btn-primary btn-lg hide"
                    data-target="#myModal" id="redraw">画
            </button>
            <button data-dojo-type="dijit/form/Button" class="btn btn-primary btn-lg hide" data-toggle="modal">点
            </button>
            <button type="button" class="btn btn-primary btn-lg hide"
                    data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>


            <input type="text" id="jsonInput" class="hide"/>
            <div class="box" style="margin-top: 10px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div>
                    <div id="citylisthead" class="flex1-row" style="margin-bottom: 10px;margin-top: 5px">
                    </div>
                </div>

                <div id="citylist" style="width: 100%;display: flex;flex-direction: row;justify-content: center;flex-wrap: wrap"></div>
            </div>

            <div class="box" style="margin-top: 50px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div style="margin-left: 15px;padding-top: 5px;align-items: flex-start;">
                    <span>优控单元识别：</span>
                    <select id="cu_youkong" width="100px" style="background: #F3F3F3">
                        <option value="0">请选择</option>
                        <option value="1">不达标单元</option>
                        <option value="2">达标单元</option>
                    </select>
                </div>
            </div>

        </div>
        <div id="right" style="position:relative">
            <div id="map"></div>
            <!--  <div id="qmpTuli" class="box" style="width:150px !important;height:120px !important;position:absolute;right:0px;top:350px">
            	<div class="head-title">
                    <a class="" style="font-size: 15px">图例</a>
                </div>
                <div class="flex" style="margin-bottom: 0px">
	                <div style="width:15px;float:left">
	               		<img src="app/img/cu2.png" style="width:36px;height:12px;margin-left:15px"/>
	            		<img src="app/img/cu1.png" style="width:36px;height:12px;margin-left:15px"/>
	            	</div>
	            	<div style="width:100px;float:left;margin-left:40px">
	            		<p>控制单元</p>
	            		<p>非示范区单元</p>
	            	</div>
                </div>
            </div>-->
        </div>
    </div>
    <div id="down">
        <div id="listAll"></div>
    </div>
</div>

<div class="modal fade" id="myModal_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >添加控制单元</h4>
            </div>
            <div class="modal-body">
                <div id="addDiv">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="addKzdy_x">确认添加</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >修改控制单元</h4>
            </div>
            <div class="modal-body">
                <div id="editDiv"></div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="editK_1">修改</button>
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
                <h4 class="modal-title" >控制单元查询</h4>
            </div>
            <div class="modal-body">
                <div id="searchDiv">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="searchK_x">查询</button>
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
                <h4 class="modal-title" >控制单元批量导入</h4>
            </div>
            <div class="modal-body">
                <div id="bulkImportDiv">
                </div>
            </div>
            <div class="modal-footer">
                <a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImportK_x"
                   onclick="bulkImport()">批量导入</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>