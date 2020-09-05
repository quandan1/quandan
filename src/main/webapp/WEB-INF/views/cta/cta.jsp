<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="app/css/cta/cta.css" rel="stylesheet" type="text/css">

<link rel="stylesheet"
	href="https://js.arcgis.com/3.20/dijit/themes/tundra/tundra.css">
<link rel="stylesheet"
	href="https://js.arcgis.com/3.20/esri/css/esri.css">
<link rel="stylesheet" type="text/css"
	href='app/js/jquery/themes/gray/easyui.css'>
<link rel="stylesheet" type="text/css"
	href="app/js/jquery/themes/icon.css">
<link href="app/css/cta/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	dojoConfig = {
		parseOnLoad : true
	};
</script>
<style type="text/css">
input.button-add {
    background-image: url('./app/img/add1.png'); /* 16px x 16px */
    background-color: Transparent;
    /* make the button transparent */
    background-repeat: no-repeat;  /* make the background image appear only once */
    background-position: 0px 0px;  /* equivalent to 'top left' */
    border: none;           /* assuming we don't want any borders */
    ctarsor: pointer;        /* make the ctarsor like hovering over an <a> element */
    height: 32px;
    width:32px;           /* make this the size of your image */
    vertical-align: middle; /* align the text vertically centered */
}
input.button-edit {
    background-image: url('./app/img/compose-3.png'); /* 16px x 16px */
    background-color: Transparent;
    /* make the button transparent */
    background-repeat: no-repeat;  /* make the background image appear only once */
    background-position: 0px 0px;  /* equivalent to 'top left' */
    border: none;           /* assuming we don't want any borders */
    ctarsor: pointer;        /* make the ctarsor like hovering over an <a> element */
    height: 32px;
    width:32px;           /* make this the size of your image */
    vertical-align: middle; /* align the text vertically centered */
}
</style>
<script type="text/javascript" src='app/js/cta/cta.js'></script>
<script type="text/javascript" src='assets/plugins/jquery-1.10.2.min.js'></script>
<script type="text/javascript" src="app/js/bootstrap.js"></script>
<script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
<script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
<script type="text/javascript"
	src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>


<script>
	dojo.require("esri.map", "esri/geometry/Extent");
	var layer, map, visible = [];
	function init() {
		var extent = new esri.geometry.Extent(120, 40, 128, 44)
		map = new esri.Map("map", {
			"spatialReference" : {
				"wkid" : 4326
			}, //设置坐标系
			logo : false, //取消地图默认的logo
			extent : extent, //程度
			zoom : 12, //显示地图的级别
			maxZoom : 16
		//最大空间等级
		});
		layer = new esri.layers.ArcGISDynamicMapServiceLayer(
				"http://115.159.185.228:6080/arcgis/rest/services//lh/lh/MapServer");

		//设置图层透明度
		// layer.setOpacity(0.6);
		if (layer.loaded) {
			buildLayerList(layer);
		} else {
			dojo.connect(layer, "onLoad", buildLayerList);
		}
		filterArcGISDynamicMapServiceLayer();
	}
	function filterArcGISDynamicMapServiceLayer() {
		var layerDefinitions = [];//定义过滤条件
		//过滤5个图层
		//layerDefinitions[0] = "NAME = '沈阳市'";
		layerDefinitions[0] = "所属市 = '沈阳市'";
		layerDefinitions[1] = "NAME = '沈阳市'";
		layerDefinitions[2] = "所属市 = '沈阳市'";
		layerDefinitions[3] = "所属市 = '沈阳市'";
		layerDefinitions[4] = "所属市 = '沈阳市'";
		layerDefinitions[5] = "所属市 = '沈阳市'";
		layerDefinitions[6] = "所属市 = '沈阳市'";
		layerDefinitions[7] = "所属市 = '沈阳市'";

		layer.setLayerDefinitions(layerDefinitions);//开始过滤
		map.addLayer(layer);//将过滤结果添加到地图上
		return;
	}
	function getChildrenNodes(parentnodes, node) {
		for (var i = parentnodes.length - 1; i >= 0; i--) {
			var pnode = parentnodes[i];
			//如果是父子关系，为父节点增加子节点，退出for循环
			if (pnode.id == node.pid) {
				pnode.state = "closed";//关闭二级树
				pnode.children.push(node);
				return;
			} else {
				//如果不是父子关系，删除父节点栈里当前的节点，
				//继续此次循环，直到确定父子关系或不存在退出for循环
				parentnodes.pop();
			}
		}
	}
	function buildLayerList(layer) {
		//构建图层树形结构
		var layerinfos = layer.layerInfos;
		var treeList = [];//jquery-easyui的tree用到的tree_data.json数组
		var parentnodes = [];//保存所有的父亲节点
		var root = {
			"id" : "rootnode",
			"text" : "图层",
			"children" : []
		};//增加一个根节点
		var node = {};
		if (layerinfos != null && layerinfos.length > 0) {

			for (var i = 0, j = layerinfos.length; i < j; i++) {
				var info = layerinfos[i];
				if (info.defaultVisibility) {
					visible.push(info.id);
				}
				//node为tree用到的json数据
				node = {
					"id" : info.id,
					"text" : info.name,
					"pid" : info.parentLayerId,
					"checked" : info.defaultVisibility ? true : false,
					"children" : []
				};
				if (info.parentLayerId == -1) {
					parentnodes.push(node);
					root.children.push(node);
				} else {
					getChildrenNodes(parentnodes, node);
					parentnodes.push(node);
				}
			}
		}
		treeList.push(root);
		layer.setVisibleLayers(visible);
		map.addLayer(layer);
	}
	dojo.ready(init);
	
	var url = "rest/cta/list";
	$.get(url, function(data) {
		$('#listAll').html(data);
	});
</script>
</head>
<body>
	<div id="all">
		<div id="left">
			<script>
			function getTree() {
				var tree = [ {
					text : "控制单元总量目标",
					nodes : [ {
						text : "省",
					}, {
						text : "市"
					}, {
						text : "县"
					}]
				}];
				return tree;
			}
				$('#tree').treeview({
					data : getTree(),
					multiSelect : true
				});
			</script>
			<div id="tree"></div>

		</div>

		<div id="right">
			<div id="map"></div>
			<div id="searchDiv" style="margin-top:40px;">
				 <div class="input-group" style="float:left; width:15%;">
            <span class="input-group-addon" >名称</span>
            <input type="text" class="form-control" >
        </div>

        	<div class="input-group"  style="float:left;width:15%;">
             <span class="input-group-addon">控制单元</span>
            <input type="text" class="form-control">
           
        	</div>

                 <div class="input-group"  style="float:left;width:15%;">
             <span class="input-group-addon">起始时间</span>
            <input type="text" class="form-control">
        	</div>
                <div class="input-group"  style="float:left;width:15%;">
             <span class="input-group-addon">达标年限</span>
            <input type="text" class="form-control">
        	</div>
        <div class="input-group" style="float:left;width:15%;">
            <span class="input-group-addon"><input type="button" value="search"  /></span>
       	
        </div>
	<div style="float:right;width:110px;">
           
       	<input type="button" class="button-add" data-toggle="modal" data-target="#myModal" id="addButton" ></button>
       	&nbsp;&nbsp;&nbsp;
       	<input type="button" class="button-edit" data-toggle="modal"  data-target="#myModal_edit" id="editModelButton" ></button>
       
        </div>
		
			</div>

			<div id="listAll"></div>
		</div>

	</div>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="doctament">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div id="addDiv">
					</div>
				</div>
				<script type="text/javascript">
					$('#addCta_x').click(function() {
						$.ajax({
							type : "POST",
							dataType : "Cta",
							async : false,
							url : "rest/cta/addCta",
							data : $('#insertForm').serialize()					
						});
						
 						var url = "rest/cta/list";
						$.get(url, function(data) {
							$('#listAll').html(data);
						}); 
					});
					
				</script>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="addCta_x">ADD</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="doctament">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div id="editDiv"></div>

				</div>
				<script type="text/javascript">
					$('#editCta_1').click(function() {
						$.ajax({
							type : "POST",
							dataType : "Cta",
							async : false,
							url : "rest/cta/update",
							data : $('#editForm').serialize()
						});
						
						var url = "rest/cta/list";
						$.get(url, function(data) {
							$('#listAll').html(data);
						});
					});
					
				</script>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="editCta_1">Edit</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>