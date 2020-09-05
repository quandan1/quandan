<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
<link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
<link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
<link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
<link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
<link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css" >

<script type="text/javascript" src='app/js/pollsource/pollsource.js'></script>
<script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
<script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
<script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
<script>


	
 
</script>
</head>
<body>
	<div id="all">
	 <div id="up">
		<div id="left" style="position:relative;height:470px;">
				<script>

			</script>
			


			<div>
				<div class="box" >
					<div id="head-title">
						<a class="" style="font-size: 15px">污染源查询与维护</a>
					</div>
					<div class="flex-row">
						<button type="button" class="btnz btnz-info"
								data-toggle="modal" data-target="#myModal_add" id="addButton"style="width: 100% ">添加</button>
						<button type="button" class="btnz btnz-info"
								data-toggle="modal" data-target="#myModal_search" id="searchButton"style="width: 100% ">查询</button>
					</div>
					<div class="flex" style="margin-bottom: 0px">
						<button type="button" class="btnz btnz-black"
								data-toggle="modal" data-target="#myModal_bulkImport_download" id="bulkImportButton_download">模板</button>
						<button type="button" class="btnz btnz-black"
								data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">导入</button>
								
						<button type="button" class="btnz btnz-black" id="exportExcel">导出</button>
					</div>
				</div>
			</div>

			<button type="button" class="btn btn-primary btn-lg hide"
				data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>

			<input type="text" id="jsonInput" class="hide"/>

			<div class="box" style="margin-top:10px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
				<div>
					<div id="citylisthead" class="flex1-row" style="margin-bottom: 10px;margin-top: 5px">
					</div>
				</div>

				<div id="citylist" style="width: 100%;display: flex;justify-content: center;flex-direction: row;flex-wrap: wrap"></div>
			</div>
			
			<div class="box" style="width:100%;position:absolute;bottom:0px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
				<div style="margin-top: 10px;margin-left: 10px;margin-right: 15px;">
					<span>当前数据年份：</span>
					<select id="pollmark" width="100px" style="background: #F3F3F3">
						<option value="2014">2014</option>
						<option value="2013">2013</option>
						<option value="2015">2015</option>
					</select>
				</div>
			</div>
			
			
			
			<!--
			<div id="typeselec">
			</div> -->
			<input type="text" id="KZDM" class="hide"/>
			<input type="text" id="treeselect" value="psrc" class="hide"/>
			</div>
			<div id="right" style="position:relative">
				<div id="map" style="width:100%; height:470px; float:left"></div>
				<div id="tree" style="position:absolute;right:0px;top:0px"></div>
				<div id="qmpTuli" class="box" style="width:150px !important;height:120px !important;position:absolute;right:0px;top:350px">
            	<div class="head-title">
                    <a class="" style="font-size: 15px">图例</a>
                </div>
                <div class="flex" style="margin-bottom: 0px">
	                <div style="width:15px;float:left">
	            		<img src="app/img/psrc1.gif" style="width:12px;height:12px"/>
	            		<img src="app/img/wsclc1.gif" style="width:12px;height:12px"/>
	            		<img src="app/img/pfty1.gif" style="width:12px;height:12px"/>
	            	</div>
	            	<div style="width:80px;float:left;margin-left:10px">
	            		<p>直排企业</p>
	            		<p>污水处理厂</p>
	            		<p>畜禽养殖</p>
	            	</div>
                </div>  
            </div>
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
					<h4 class="modal-title" id="myModalLabel">添加污染源</h4>
				</div>
				<div class="modal-body">
					<div id="addDiv"></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btnz btnz-info" data-dismiss="modal" id="addPollSource_x">确认添加</button>
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
					<h4 class="modal-title" id="myModalLabel">修改污染源</h4>
				</div>
				<div class="modal-body">
					<div id="editDiv"></div>

				</div>

				<div class="modal-footer">
					<button type="button" class="btnz btnz-info" data-dismiss="modal" id="editPollSource_1">确认修改</button>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Modal -->
	<div class="modal fade" id="myModal_search" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">污染源查询</h4>
				</div>
				<div class="modal-body">
					<div id="searchDiv">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btnz btnz-info" data-dismiss="modal" id="searchPollSource_x">查询</button>
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
					<%--<h4 class="modal-title" id="myModalLabel_bulk">污染源信息批量导入</h4>--%>
				</div>
				<div class="modal-body">
					<div id="bulkImportDiv">
					</div>
				</div>

				<div class="modal-footer">
					<a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImportQmp_x" onclick="bulkImport()">批量导入</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="myModal_bulkImport_download" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<%--<h4 class="modal-title" id="myModalLabel_download">污染源信息模板下载</h4>--%>
				</div>
				<div class="modal-body">
					<div id="bulkImportDiv_download">
					</div>
				</div>

				<%--<div class="modal-footer">--%>
					<%--<a type="button" class="btn btn-default" data-dismiss="modal" id="bulkImportQmp_download" onclick="bulkImport()">批量导入</a>--%>
				<%--</div>--%>
			</div>
		</div>
	</div>

</body>
</html>