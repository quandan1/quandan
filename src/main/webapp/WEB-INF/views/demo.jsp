<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=7,IE=9">
<title>图层控制</title>


    <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
	<link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
	<script type="text/javascript">
    dojoConfig = {
        parseOnLoad : true
    };
	</script>
	
	<script type="text/javascript" src='app/js/jquery/jquery-1.7.2.min.js'></script>
	<script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
	<script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
	
	
    <script>
    dojo.require("esri.map", "esri/geometry/Extent");
    var layer, map, visible = [];
    function init() {
        var extent =  new esri.geometry.Extent(120, 40,128, 44)
        map = new esri.Map("map", {
           "spatialReference": { "wkid": 4326 },  //设置坐标系
           logo: false, //取消地图默认的logo
           extent: extent, //程度
           zoom:12,  //显示地图的级别
           maxZoom:16  //最大空间等级
          });
        layer = new esri.layers.ArcGISDynamicMapServiceLayer("http://60.205.177.82:6080/arcgis/rest/services/lh/lhriver/MapServer");
        
        //设置图层透明度
        // layer.setOpacity(0.6);
        if (layer.loaded) {
            buildLayerList(layer);
        } else {
            dojo.connect(layer, "onLoad", buildLayerList);
        }
        filterArcGISDynamicMapServiceLayer();
        
    }
    function filterArcGISDynamicMapServiceLayer(){
        var layerDefinitions = [];//定义过滤条件
        //过滤5个图
        
        layer.setLayerDefinitions(layerDefinitions);//开始过滤
        
        map.addLayer(layer);//将过滤结果添加到地图上
        return;
    }
    
    function getChildrenNodes(parentnodes, node){
         for (var i = parentnodes.length - 1; i >= 0; i--) {
            var pnode = parentnodes[i];
            //如果是父子关系，为父节点增加子节点，退出for循环
            if (pnode.id==node.pid) {
                pnode.state="closed" ;//关闭二级树
                pnode.children.push(node) ;
                return ;
            } else {
                //如果不是父子关系，删除父节点栈里当前的节点，
                //继续此次循环，直到确定父子关系或不存在退出for循环
                parentnodes.pop() ;
            }
        }
    }
    
    function buildLayerList(layer) {
			var layerinfos = layer.layerInfos ;
            var treeList = [] ;//jquery-easyui的tree用到的tree_data.json数组
            var parentnodes = [] ;//保存所有的父亲节点
            var root = {"id":"rootnode","text":"图层","children":[]} ;//增加一个根节点
            var node = {} ;
            if (layerinfos != null && layerinfos.length > 0) {

                for(var i=0,j=layerinfos.length;i<j;i++){
                    var info = layerinfos[i] ;
                    if (info.defaultVisibility) {
                        visible.push(info.id);
                    }
                    node = {
                        "id":info.id,
                        "text":info.name,
                        "pid":info.parentLayerId,
                        "checked":info.defaultVisibility ? true:false,
                        "children":[]
                    } ;
                    if(info.parentLayerId==-1){
                        parentnodes.push(node) ;
                        root.children.push(node) ;
                    }else{
                         getChildrenNodes(parentnodes, node);
                          parentnodes.push(node) ;
                    }
                }
            }
            treeList.push(root) ;
            //jquery-easyui的树
            $('#toc').tree({
                data:treeList ,
                checkbox :true, //使节点增加选择框
                onCheck:function (node,checked){//更新显示选择的图层
                    var visible = [];

                    var nodes = $('#toc').tree("getChecked") ;
                    dojo.forEach(nodes, function(node) {
                        visible.push(node.id);
                    });
                    //if there aren't any layers visible set the array to be -1
                    if (visible.length === 0) {
                        visible.push(-1);
                    }
                    layer.setVisibleLayers(visible);
                }
            });
            layer.setVisibleLayers(visible);
            map.addLayer(layer);
        }
    dojo.ready(init);
    </script>

</head>
<body>
    	<div id="panelHeader" style="width:200px;float:left">
            图层控制：<br />
            <ul id="toc" class="easyui-tree"></ul>
        </div>
  
        <div id="map" style="width:1000px; height:600px; float:left"></div>
    
    	<div id="legendDiv" style="width:100%;"></div>
</body>
</html>
