var extents = {
    tieling: [121.683328, 41.840331, 126.582710, 43.573067],
    huludao: [118.172417, 39.834530, 122.336235, 41.369228],
    chaoyang: [117.205270, 40.391405, 123.074377, 42.504821],
    panjin: [120.835854, 40.610362, 123.252882, 41.494596],
    yingkou: [120.694250, 39.753728, 124.190971, 41.048150],
    jinzhou: [119.431423, 40.729618, 123.581508, 42.211277],
    dandong: [122.309634, 39.673381, 126.586062, 41.213798],
    benxi: [123.398631, 40.740022, 125.936511, 41.637172],
    fushun: [122.925499, 41.209812, 126.512294, 42.482913],
    anshan: [120.654886, 40.025895, 125.149073, 41.654445],
    liaoyang: [121.430973, 40.460256, 125.309147, 41.800736],
    fuxin: [119.195495, 41.535575, 124.155844, 43.299593],
    shenyang: [120.344180, 41.038634, 126.162792, 43.148180]
};


var complexlist = "";
var complexlist2 = "";
var complexlist3 = "";

initMap();
initList();
var map, layer, graphicLayer;
var html = "";
//html += "<button type='button' class='btnz btnz-info' onclick='poToCu(\"${kzdy}\")'>相关单元</button>";
html += "<button type='button' class='btnz btnz-info' onclick='poToQmp(\"${kzdm}\")'>跳转至相关断面</button>";
html += "<table border='0' class='tableBasic'>";
html += "<tr><td>行政区划</td><td>${xzqhmc}</td></tr>";
html += "<tr><td>填报单位详细名称</td><td>${tbdwxxmc}</td></tr>";
html += "<tr><td>控制单元</td><td>${kzdy}</td></tr>";
html += "<tr><td>控制断面</td><td>${kzdm}</td></tr>";
html += "<tr><td>市州盟</td><td>${xxdzdqSZM}</td></tr>";
html += "<tr><td>区市旗</td><td>${xxdzxQSQ}</td></tr>";
html += "<tr><td>乡镇</td><td>${xxdzxZ}</td></tr>";
html += "<tr><td>受纳水体</td><td>${snstmc}</td></tr>";



html += "<tr><td>煤炭消耗量</td><td>${wtxhlD}</td></tr>";
html += "<tr><td>燃料油消耗量</td><td>${rlyxhlD}</td></tr>";
html += "<tr><td>焦炭消耗量</td><td>${jtxhlD}</td></tr>";
html += "<tr><td>天然气消耗量</td><td>${trqxhlWLFM}</td></tr>";
html += "<tr><td>其他燃油消耗量</td><td>${qtryxhlDBZM}</td></tr>";
html += "<tr><td>用电量</td><td>${ydlWQWS}</td></tr>";
html += "<tr><td>工业用水量</td><td>${gyyslD}</td></tr>";
html += "<tr><td>总氮</td><td>${zdpflD}</td></tr>";
html += "<tr><td>总磷</td><td>${zppflD}</td></tr>";
html += "<tr><td>工业废气</td><td>${gyfqpflWLFM}</td></tr>";
html += "<tr><td>二氧化硫</td><td>${eyhspflD}</td></tr>";
html += "<tr><td>氮氧化物</td><td>${dyhwpflD}</td></tr>";
html += "<tr><td>烟尘</td><td>${ycpflD}</td></tr>";
html += "<tr><td>挥发性有机物</td><td>${vocspflD}</td></tr>";
html += "<tr><td>废气砷</td><td>${fqspflQK}</td></tr>";
html += "<tr><td>废气铅</td><td>${fqqpflQK}</td></tr>";
html += "<tr><td>废气镉</td><td>${fqgpflQK}</td></tr>";
html += "<tr><td>废气总铬</td><td>${fqzgpflQK}</td></tr>";
html += "<tr><td>废气六价铬</td><td>${fqljgpflQK}</td></tr>";
html += "<tr><td>一般工业固体废物倾倒丢弃量</td><td>${ybgygtfwdqlD}</td></tr>";
html += "<tr><td>危险废物倾倒丢弃量</td><td>${wxfwdqlD}</td></tr>";



html += "<tr><td>废水</td><td>${gyfspflD}</td></tr>";
html += "<tr><td>需氧量</td><td>${hxxylpflD}</td></tr>";
html += "<tr><td>氨氮</td><td>${adpflD}</td></tr>";
html += "<tr><td>石油</td><td>${sylpflD}</td></tr>";
html += "<tr><td>挥发酚</td><td>${hffpflQk}</td></tr>";
html += "<tr><td>氰化物</td><td>${qhwpflQk}</td></tr>";
html += "<tr><td>砷</td><td>${fsspflQk}</td></tr>";
html += "<tr><td>铅</td><td>${fsqpflQk}</td></tr>";
html += "<tr><td>镉</td><td>${fsgpflQk}</td></tr>";
html += "<tr><td>汞</td><td>${fsgpflQkDup1}</td></tr>";
html += "<tr><td>总铬</td><td>${fszgpflQk}</td></tr>";
html += "<tr><td>六价铬</td><td>${fsljgpflQk}</td></tr>";


html += "</table>";
var html1 = "";
//html1 += "<button type='button' class='btnz btnz-info' onclick='poToCu(\"${sskzdy}\")'>相关单元</button>";
html1 += "<button type='button' class='btnz btnz-info' onclick='poToQmp(\"${ssdm}\")'>跳转至相关断面</button>";
html1 += "<table border='0' class='tableBasic'>";
html1 += "<tr><td>区划</td><td>${xzqhmc}</td></tr>";
html1 += "<tr><td>单位</td><td>${dwmcGz}</td></tr>";
html1 += "<tr><td>所属断面</td><td>${ssdm}</td></tr>";
html1 += "<tr><td>所在单元</td><td>${sskzdy}</td></tr>";
html1 += "<tr><td>地址_市</td><td>${qyxxdzDqSZM}</td></tr>";
html1 += "<tr><td>地址_县</td><td>${qyxxdzXQSQ}</td></tr>";
html1 += "<tr><td>地址_乡</td><td>${qyxxdzXZ}</td></tr>";
html1 += "<tr><td>地址_街</td><td>${qyxxdzJCMph}</td></tr>";
html1 += "<tr><td>污水处理方法</td><td>${wsclffmc1}</td></tr>";
html1 += "<tr><td>排水去向</td><td>${psqxlxmc}</td></tr>";
html1 += "<tr><td>受纳水体</td><td>${snstmc}</td></tr>";
html1 += "<tr><td>运行天数</td><td>${yxtsT}</td></tr>";
html1 += "<tr><td>污水处理力</td><td>${wssjclnlDR}</td></tr>";
html1 += "<tr><td>污水处理量</td><td>${wssjcllWd}</td></tr>";
html1 += "<tr><td>O2去除量</td><td>${hxxylqclD}</td></tr>";
html1 += "<tr><td>进口浓度</td><td>${hxxyljkndHkS}</td></tr>";
html1 += "<tr><td>出口浓度</td><td>${hxxylckndHkS}</td></tr>";
html1 += "<tr><td>氨氮去除量</td><td>${adqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${adjkndHkS}</td></tr>";
html1 += "<tr><td>出口</td><td>${adckndHkS}</td></tr>";
html1 += "<tr><td>总氮去除量</td><td>${zdqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${zdjkndHkS}</td></tr>";
html1 += "<tr><td>出口</td><td>${zdckndHkS}</td></tr>";
html1 += "<tr><td>总磷去除量</td><td>${zlqclQk}</td></tr>";
html1 += "<tr><td>进口</td><td>${zljkndHkS}</td></tr>";
html1 += "<tr><td>出口</td><td>${zlckndHkS}</td></tr>";

html1 += "<tr><td>污泥倾倒丢弃量</td><td>${wnqddqlD}</td></tr>";
html1 += "<tr><td>生化需氧量去除量</td><td>${shxylqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${shxyljkndHKS}</td></tr>";
html1 += "<tr><td>出口</td><td>${shxylckndHKS}</td></tr>";
html1 += "<tr><td>悬浮物去除量</td><td>${xfwqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${xfwjkndHKS}</td></tr>";
html1 += "<tr><td>出口</td><td>${xfwckndHKS}</td></tr>";
html1 += "<tr><td>动植物油去除量</td><td>${dzwyqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${dzwyjkndHKS}</td></tr>";
html1 += "<tr><td>出口</td><td>${dzwyckndHKS}</td></tr>";
html1 += "<tr><td>石油类去除量</td><td>${sylqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${syljkndHKS}</td></tr>";
html1 += "<tr><td>出口</td><td>${sylckndHKS}</td></tr>";
html1 += "<tr><td>阴离子活性剂去除量</td><td>${ylzhxjqclD}</td></tr>";
html1 += "<tr><td>进口</td><td>${ylzhxjjkndHKS}</td></tr>";
html1 += "<tr><td>出口</td><td>${ylzhxjckndHKS}</td></tr>";


html1 += "</table>";



var html2 = "";
//html2 += "<button type='button' class='btnz btnz-info' onclick='poToCu(\"${kzdy}\")'>相关单元</button>";
html2 += "<button type='button' class='btnz btnz-info' onclick='poToQmp(\"${kzdm}\")'>跳转至相关断面</button>";
html2 += "<table border='0' class='tableBasic'>";
html2 += "<tr><td>行政区划名称</td><td>${xzqhmc}</td></tr>";
html2 += "<tr><td>养殖场(小区)编码</td><td>${yzcbm}</td></tr>";
html2 += "<tr><td>养殖场(小区)名称</td><td>${yzcmc}</td></tr>";
html2 += "<tr><td>控制断面</td><td>${kzdm}</td></tr>";
html2 += "<tr><td>控制单元</td><td>${kzdy}</td></tr>";
html2 += "<tr><td>经度（增加）</td><td>${jd}</td></tr>";
html2 += "<tr><td>纬度（增加）</td><td>${wd}</td></tr>";
html2 += "<tr><td>地址(市、州、盟)</td><td>${dzS}</td></tr>";
html2 += "<tr><td>地址(区、市、旗)</td><td>${dzX}</td></tr>";
html2 += "<tr><td>乡(镇)</td><td>${xz}</td></tr>";
html2 += "<tr><td>街(村)</td><td>${jc}</td></tr>";
html2 += "<tr><td>所在流域名称</td><td>${szlymc}</td></tr>";
html2 += "<tr><td>受纳水体名称</td><td>${snstmc}</td></tr>";
html2 += "<tr><td>畜禽种类</td><td>${xqzl}</td></tr>";
html2 += "<tr><td>饲养量（头/羽）</td><td>${syl}</td></tr>";
html2 += "<tr><td>排放量_化学需氧量（千克）</td><td>${pflHxxyl}</td></tr>";
html2 += "<tr><td>排放量_总氮（千克）</td><td>${pflZd}</td></tr>";
html2 += "<tr><td>排放量_总磷（千克）</td><td>${pflZl}</td></tr>";
html2 += "<tr><td>排放量_氨氮（千克）</td><td>${pflAd}</td></tr>";
html2 += "<tr><td>去除率_化学需氧量</td><td>${qclHxxyl}</td></tr>";
html2 += "<tr><td>去除率_总氮</td><td>${qclZd}</td></tr>";
html2 += "<tr><td>去除率_总磷</td><td>${qclZl}</td></tr>";
html2 += "<tr><td>去除率_氨氮</td><td>${qclAd}</td></tr>";
html2 += "</table>";

var wholecity = "";

function initList() {
    var username = $('.username').text();
    var json = {
        "username": username,
        "TJNF": "2014"
    };
    $('#jsonInput').val(JSON.stringify(json));
    if($("#jumpOrNot").text()=="1"){
	    	$.ajax({
	        type: "POST",
	        dataType: "html",
	        async: false,
	        url: "rest/" + $('#treeselect').val() + "/search",
	        data: json,
	        success: function (data) {
	            $('#listAll').html(data);
	        }
	    });
    }
    

}

function initMap() {
    require([
        "esri/map",
        "esri/layers/ArcGISDynamicMapServiceLayer",
        "esri/geometry/Point", "esri/SpatialReference",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/geometry/Extent",
        "esri/InfoTemplate"
        ],function(
        		Map,
        		ArcGISDynamicMapServiceLayer, 
        		Point, 
        		SpatialReference, 
        		PictureMarkerSymbol, 
        		Graphic,
        		Extent,
        		InfoTemplate){
		var extent = new Extent(117.309229, 39.137731, 129.957720, 43.380153);
		map = new Map("map", {
			"spatialReference" : {
				"wkid" : 4326
			},
			//basemap: "topo",
			logo : false, 
			extent : extent,
			zoom : 12,
			maxZoom : 16
		});

		//全部单元
        //var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/8";
        var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/0";
        featureLayer = new esri.layers.FeatureLayer(layerUrl, {
            mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
            outFields: ["*"],
            hasAttributionData: true
        });
        map.addLayer(featureLayer,100);
        
		//河流
       // var layerUrl_2 = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/5";
        var layerUrl_2 = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/17";
        featureLayer_2 = new esri.layers.FeatureLayer(layerUrl_2, {
            mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
            outFields: ["*"],
            hasAttributionData: true
        });
        map.addLayer(featureLayer_2,2);
        
        
        $.ajax({
            type: "POST",
            dataType: "json",
            async: false,
            url: "rest/controlunit/userForMap",
            success: function (data) {
                var result = decodeURIComponent(data.result);
                //filterArcGISDynamicMapServiceLayer(result);
                featureLayer.setDefinitionExpression(result);
            }
        });

        layer = new ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer");
        layer.setVisibleLayers([23]);
        map.addLayer(layer,0);
        graphicLayer = new esri.layers.GraphicsLayer();
        map.addLayer(graphicLayer);
		var lon = "";
		var lat = "";
		var attr = "";

        //判断用户所代表的城市
        $.ajax({
            type: "POST",
            url: "rest/" + $('#treeselect').val() + "/getInitialExtent",
            data: {
                "username": username
            },
            success: function (res) {
                if (res !== '') {
					var ress = res.split("*");
                    var result = ress[0].split(",");
					wholecity = ress[1];
                    var extent = new Extent(parseFloat(result[0]), parseFloat(result[1]), parseFloat(result[2]), parseFloat(result[3]));
                    map.setExtent(extent)
                }
            }
        });

		
		var username = $('.username').text(); //用户控制
		var citylist="";
		var pt;
		if($("#jumpOrNot").text()=="1"){
			if($('#treeselect').val()=="psrc")pt="rest/psrc/searchAllPsrc";
			else if($('#treeselect').val()=="pfty")pt="rest/pfty/searchAllPfty";
				else if($('#treeselect').val()=="pyz")pt="rest/pyz/searchAllPyz";
			$.ajax({
				type : "POST",
				url : pt,
				data : {
					"username" : username,
					"TJNF":"2014"
				},
				success : function(allData) {
					for(var i=0;i<allData.length;i++){
						
						if($('#treeselect').val()=="psrc"){
							if(myrole==1||myrole=="admin") 
								citylist+=allData[i].xxdzdqSZM+"、";
							else if(myrole==2||myrole==3) 
								citylist+=allData[i].xzqhmc+"、";
							lon = allData[i].jdG;
							lat = allData[i].wdG;
							attr = {
							    "id":allData[i].id,
                                "xzqhmc":allData[i].xzqhmc,
                                "tbdwxxmc":allData[i].tbdwxxmc,
                                "kzdy":allData[i].kzdy,
                                "kzdm":allData[i].kzdm,
                                "xxdzdqSZM":allData[i].xxdzdqSZM,
                                "xxdzxQSQ":allData[i].xxdzxQSQ,
                                "xxdzxZ":allData[i].xxdzxZ,
                                "snstmc":allData[i].snstmc,
                                "gyfspflD":allData[i].gyfspflD,
                                "hxxylpflD":allData[i].hxxylpflD,
                                "adpflD":allData[i].adpflD,
                                "sylpflD":allData[i].sylpflD,
                                "hffpflQk":allData[i].hffpflQk,
                                "qhwpflQk":allData[i].qhwpflQk,
                                "fsspflQk":allData[i].fsspflQk,
                                "fsqpflQk":allData[i].fsqpflQk,
                                "fsgpflQk":allData[i].fsgpflQk,
                                "fsgpflQkDup1":allData[i].fsgpflQkDup1,
                                "fszgpflQk":allData[i].fszgpflQk,
                                "fsljgpflQk":allData[i].fsljgpflQk,


                                "wtxhlD":allData[i].wtxhlD,
                                "rlyxhlD":allData[i].rlyxhlD,
                                "jtxhlD":allData[i].jtxhlD,
                                "trqxhlWLFM":allData[i].trqxhlWLFM,
                                "qtryxhlDBZM":allData[i].qtryxhlDBZM,
                                "ydlWQWS":allData[i].ydlWQWS,
                                "gyyslD":allData[i].gyyslD,
                                "zdpflD":allData[i].zdpflD,
                                "gyfqpflWLFM":allData[i].gyfqpflWLFM,
                                "eyhspflD":allData[i].eyhspflD,
                                "dyhwpflD":allData[i].dyhwpflD,
                                "ycpflD":allData[i].ycpflD,
                                "vocspflD":allData[i].vocspflD,
                                "fqspflQK":allData[i].fqspflQK,
                                "fqqpflQK":allData[i].fqqpflQK,
                                "fqgpflQK":allData[i].fqgpflQK,
                                "fqzgpflQK":allData[i].fqzgpflQK,
                                "fqljgpflQK":allData[i].fqljgpflQK,
                                "ybgygtfwdqlD":allData[i].ybgygtfwdqlD,
                                "wxfwdqlD":allData[i].wxfwdqlD


							};	 
							var point = new Point(lon,lat,map.spatialReference);
							var infoTemplate = new InfoTemplate("直排企业信息", html);
							var symbol1 = new PictureMarkerSymbol("app/img/psrc1.gif", 8, 8);
							var graphic = new Graphic(point, symbol1,attr,infoTemplate);  
							graphicLayer.add(graphic); 
						}else if($('#treeselect').val()=="pfty"){
							if(myrole==1||myrole=="admin") 
								citylist+=allData[i].qyxxdzDqSZM+"、";
							else if(myrole==2||myrole==3) 
								citylist+=allData[i].xzqhmc+"、";
							lon = allData[i].jd;
							lat = allData[i].wd;
							attr = {

									"id":allData[i].id,
									"xzqhmc":allData[i].xzqhmc,
									"dwmcGz":allData[i].dwmcGz,
									"ssdm":allData[i].ssdm,
									"sskzdy":allData[i].sskzdy,
									"qyxxdzDqSZM":allData[i].qyxxdzDqSZM,
									"qyxxdzXQSQ":allData[i].qyxxdzXQSQ,
									"qyxxdzXZ":allData[i].qyxxdzXZ,
									"qyxxdzJCMph":allData[i].qyxxdzJCMph,
									"wsclffmc1":allData[i].wsclffmc1,
									"psqxlxmc":allData[i].psqxlxmc,
									"snstmc":allData[i].snstmc,
									"yxtsT":allData[i].yxtsT,
									"wssjclnlDR":allData[i].wssjclnlDR,
									"wssjcllWd":allData[i].wssjcllWd,
									"hxxylqclD":allData[i].hxxylqclD,
									"hxxyljkndHkS":allData[i].hxxyljkndHkS,
									"hxxylckndHkS":allData[i].hxxylckndHkS,
									"adqclD":allData[i].adqclD,
									"adjkndHkS":allData[i].adjkndHkS,
									"adckndHkS":allData[i].adckndHkS,
									"zdqclD":allData[i].zdqclD,
									"zdjkndHkS":allData[i].zdjkndHkS,
									"zdckndHkS":allData[i].zdckndHkS,
									"zlqclQk":allData[i].zlqclQk,
									"zljkndHkS":allData[i].zljkndHkS,
									"zlckndHkS":allData[i].zlckndHkS,


                                "wnqddqlD":allData[i].wnqddqlD,
                                "shxylqclD":allData[i].shxylqclD,
                                "shxyljkndHKS":allData[i].shxyljkndHKS,
                                "shxylckndHKS":allData[i].shxylckndHKS,
                                "xfwqclD":allData[i].xfwqclD,
                                "xfwjkndHKS":allData[i].xfwjkndHKS,
                                "xfwckndHKS":allData[i].xfwckndHKS,
                                "dzwyqclD":allData[i].dzwyqclD,
                                "dzwyjkndHKS":allData[i].dzwyjkndHKS,
                                "dzwyckndHKS":allData[i].dzwyckndHKS,
                                "sylqclD":allData[i].sylqclD,
                                "syljkndHKS":allData[i].syljkndHKS,
                                "sylckndHKS":allData[i].sylckndHKS,
                                "ylzhxjqclD":allData[i].ylzhxjqclD,
                                "ylzhxjjkndHKS":allData[i].ylzhxjjkndHKS,
                                "ylzhxjckndHKS":allData[i].ylzhxjckndHKS



                        };
							var point = new Point(lon,lat,map.spatialReference);
							var infoTemplate = new InfoTemplate("污水处理厂信息", html1);
							var symbol1 = new PictureMarkerSymbol("app/img/wsclc1.gif", 10,10);
							var graphic = new Graphic(point, symbol1,attr,infoTemplate);  
							graphicLayer.add(graphic); 		
						}else if($('#treeselect').val()=="pyz"){
							if(myrole==1||myrole=="admin") 
								citylist+=allData[i].dzS+"、";
							else if(myrole==2||myrole==3) 
								citylist+=allData[i].xzqhmc+"、";
							//console.log(allData[i].dzS);
							//console.log(citylist);
							lon = allData[i].jd;
							lat = allData[i].wd;
							attr = {

									"id":allData[i].id,
									"xzqhmc":allData[i].xzqhmc,
									"yzcbm":allData[i].yzcbm,
									"yzcmc":allData[i].yzcmc,
									"kzdm":allData[i].kzdm,
									"kzdy":allData[i].kzdy,
									"jd":allData[i].jd,
									"wd":allData[i].wd,
									"dzS":allData[i].dzS,
									"dzX":allData[i].dzX,
									"xz":allData[i].xz,
									"jc":allData[i].jc,
									"szlymc":allData[i].szlymc,
									"snstmc":allData[i].snstmc,
									"xqzl":allData[i].xqzl,
									"syl":allData[i].syl,
									"pflHxxyl":allData[i].pflHxxyl,
									"pflZd":allData[i].pflZd,
									"pflZl":allData[i].pflZl,
									"pflAd":allData[i].pflAd,
									"qclHxxyl":allData[i].qclHxxyl,
									"qclZd":allData[i].qclZd,
									"qclZl":allData[i].qclZl,
									"qclAd":allData[i].qclAd
		
							};	 
							var point = new Point(lon,lat,map.spatialReference);
							var infoTemplate = new InfoTemplate("畜禽养殖信息", html2);
							var symbol1 = new PictureMarkerSymbol("app/img/pfty1.gif", 10,10);
							var graphic = new Graphic(point, symbol1,attr,infoTemplate);  
							graphicLayer.add(graphic); 		
						}
					}
					list_city(citylist);
				}
			});
		}
		

	});
}

function updatePsrcInMap(allData, flag) {
	//alert("$('#treeselect').val():"+$('#treeselect').val());
	//console.log(allData);
	complexlist = "";
    console.log("updatePsrcInMap")
    require([
        "esri/geometry/Point",
        "esri/symbols/SimpleMarkerSymbol",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/InfoTemplate"
    ], function (Point,
                 SimpleMarkerSymbol,
                 PictureMarkerSymbol,
                 Graphic,
                 InfoTemplate) {
        var lon = "";
        var lat = "";
        var attr = "";

        if (flag == 0) graphicLayer.clear();

        for (var i = 0; i < allData.length; i++) {
            if ($('#treeselect').val() == "psrc") {
                if (myrole == 1 || myrole == "admin")
                    complexlist += allData[i].xxdzdqSZM + "、";
                else if (myrole == 2 || myrole == 3)
                    complexlist += allData[i].xzqhmc + "、";
                lon = allData[i].jdG;
                lat = allData[i].wdG;
                attr = {
                    "id": allData[i].id,
                    "xzqhmc": allData[i].xzqhmc,
                    "tbdwxxmc": allData[i].tbdwxxmc,
                    "kzdy": allData[i].kzdy,
                    "kzdm": allData[i].kzdm,
                    "xxdzdqSZM": allData[i].xxdzdqSZM,
                    "xxdzxQSQ": allData[i].xxdzxQSQ,
                    "xxdzxZ": allData[i].xxdzxZ,
                    "snstmc": allData[i].snstmc,
                    "gyfspflD": allData[i].gyfspflD,
                    "hxxylpflD": allData[i].hxxylpflD,
                    "adpflD": allData[i].adpflD,
                    "sylpflD": allData[i].sylpflD,
                    "hffpflQk": allData[i].hffpflQk,
                    "qhwpflQk": allData[i].qhwpflQk,
                    "fsspflQk": allData[i].fsspflQk,
                    "fsqpflQk": allData[i].fsqpflQk,
                    "fsgpflQk": allData[i].fsgpflQk,
                    "fsgpflQkDup1": allData[i].fsgpflQkDup1,
                    "fszgpflQk": allData[i].fszgpflQk,
                    "fsljgpflQk": allData[i].fsljgpflQk,



                    "wtxhlD":allData[i].wtxhlD,
                    "rlyxhlD":allData[i].rlyxhlD,
                    "jtxhlD":allData[i].jtxhlD,
                    "trqxhlWLFM":allData[i].trqxhlWLFM,
                    "qtryxhlDBZM":allData[i].qtryxhlDBZM,
                    "ydlWQWS":allData[i].ydlWQWS,
                    "gyyslD":allData[i].gyyslD,
                    "zdpflD":allData[i].zdpflD,
                    "gyfqpflWLFM":allData[i].gyfqpflWLFM,
                    "eyhspflD":allData[i].eyhspflD,
                    "dyhwpflD":allData[i].dyhwpflD,
                    "ycpflD":allData[i].ycpflD,
                    "vocspflD":allData[i].vocspflD,
                    "fqspflQK":allData[i].fqspflQK,
                    "fqqpflQK":allData[i].fqqpflQK,
                    "fqgpflQK":allData[i].fqgpflQK,
                    "fqzgpflQK":allData[i].fqzgpflQK,
                    "fqljgpflQK":allData[i].fqljgpflQK,
                    "ybgygtfwdqlD":allData[i].ybgygtfwdqlD,
                    "wxfwdqlD":allData[i].wxfwdqlD



                };
                var point = new Point(lon, lat, map.spatialReference);
                var infoTemplate = new InfoTemplate("直排企业信息", html);
                var symbol1 = new PictureMarkerSymbol("app/img/psrc1.gif", 8, 8);
                var graphic = new Graphic(point, symbol1, attr, infoTemplate);
                graphicLayer.add(graphic);
            } else if ($('#treeselect').val() == "pfty") {
                if (myrole == 1 || myrole == "admin")
                    complexlist += allData[i].qyxxdzDqSZM + "、";
                else if (myrole == 2 || myrole == 3)
                    complexlist += allData[i].xzqhmc + "、";
                lon = allData[i].jd;
                lat = allData[i].wd;
                attr = {
                    "id": allData[i].id,
                    "xzqhmc": allData[i].xzqhmc,
                    "dwmcGz": allData[i].dwmcGz,
                    "ssdm": allData[i].ssdm,
                    "sskzdy": allData[i].sskzdy,
                    "qyxxdzDqSZM": allData[i].qyxxdzDqSZM,
                    "qyxxdzXQSQ": allData[i].qyxxdzXQSQ,
                    "qyxxdzXZ": allData[i].qyxxdzXZ,
                    "qyxxdzJCMph": allData[i].qyxxdzJCMph,
                    "wsclffmc1": allData[i].wsclffmc1,
                    "psqxlxmc": allData[i].psqxlxmc,
                    "snstmc": allData[i].snstmc,
                    "yxtsT": allData[i].yxtsT,
                    "wssjclnlDR": allData[i].wssjclnlDR,
                    "wssjcllWd": allData[i].wssjcllWd,
                    "hxxylqclD": allData[i].hxxylqclD,
                    "hxxyljkndHkS": allData[i].hxxyljkndHkS,
                    "hxxylckndHkS": allData[i].hxxylckndHkS,
                    "adqclD": allData[i].adqclD,
                    "adjkndHkS": allData[i].adjkndHkS,
                    "adckndHkS": allData[i].adckndHkS,
                    "zdqclD": allData[i].zdqclD,
                    "zdjkndHkS": allData[i].zdjkndHkS,
                    "zdckndHkS": allData[i].zdckndHkS,
                    "zlqclQk": allData[i].zlqclQk,
                    "zljkndHkS": allData[i].zljkndHkS,
                    "zlckndHkS": allData[i].zlckndHkS,




                    "wnqddqlD":allData[i].wnqddqlD,
                    "shxylqclD":allData[i].shxylqclD,
                    "shxyljkndHKS":allData[i].shxyljkndHKS,
                    "shxylckndHKS":allData[i].shxylckndHKS,
                    "xfwqclD":allData[i].xfwqclD,
                    "xfwjkndHKS":allData[i].xfwjkndHKS,
                    "xfwckndHKS":allData[i].xfwckndHKS,
                    "dzwyqclD":allData[i].dzwyqclD,
                    "dzwyjkndHKS":allData[i].dzwyjkndHKS,
                    "dzwyckndHKS":allData[i].dzwyckndHKS,
                    "sylqclD":allData[i].sylqclD,
                    "syljkndHKS":allData[i].syljkndHKS,
                    "sylckndHKS":allData[i].sylckndHKS,
                    "ylzhxjqclD":allData[i].ylzhxjqclD,
                    "ylzhxjjkndHKS":allData[i].ylzhxjjkndHKS,
                    "ylzhxjckndHKS":allData[i].ylzhxjckndHKS


                };
                var point = new Point(lon, lat, map.spatialReference);
                var infoTemplate = new InfoTemplate("污水处理厂信息", html1);
                var symbol1 = new PictureMarkerSymbol("app/img/wsclc1.gif", 10, 10);
                var graphic = new Graphic(point, symbol1, attr, infoTemplate);
                graphicLayer.add(graphic);

            }

            else if ($('#treeselect').val() == "pyz") {
                if (myrole == 1 || myrole == "admin")
                    complexlist += allData[i].dzS + "、";
                else if (myrole == 2 || myrole == 3)
                    complexlist += allData[i].xzqhmc + "、";
                lon = allData[i].jd;
                lat = allData[i].wd;
                attr = {

                    "id": allData[i].id,
                    "xzqhmc": allData[i].xzqhmc,
                    "yzcbm": allData[i].yzcbm,
                    "yzcmc": allData[i].yzcmc,
                    "kzdm": allData[i].kzdm,
                    "kzdy": allData[i].kzdy,
                    "jd": allData[i].jd,
                    "wd": allData[i].wd,
                    "dzS": allData[i].dzS,
                    "dzX": allData[i].dzX,
                    "xz": allData[i].xz,
                    "jc": allData[i].jc,
                    "szlymc": allData[i].szlymc,
                    "snstmc": allData[i].snstmc,
                    "xqzl": allData[i].xqzl,
                    "syl": allData[i].syl,
                    "pflHxxyl": allData[i].pflHxxyl,
                    "pflZd": allData[i].pflZd,
                    "pflZl": allData[i].pflZl,
                    "pflAd": allData[i].pflAd,
                    "qclHxxyl": allData[i].qclHxxyl,
                    "qclZd": allData[i].qclZd,
                    "qclZl": allData[i].qclZl,
                    "qclAd": allData[i].qclAd

                };
                var point = new Point(lon, lat, map.spatialReference);
                var infoTemplate = new InfoTemplate("畜禽养殖信息", html2);
                var symbol1 = new PictureMarkerSymbol("app/img/pfty1.gif", 10, 10);
                var graphic = new Graphic(point, symbol1, attr, infoTemplate);
                graphicLayer.add(graphic);

            }
        }
		
    });
}

function updatePftyInMap(allData, flag) {
	complexlist = "";
    require([
        "esri/geometry/Point",
        "esri/symbols/SimpleMarkerSymbol",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/InfoTemplate"
    ], function (Point,
                 SimpleMarkerSymbol,
                 PictureMarkerSymbol,
                 Graphic,
                 InfoTemplate) {
        var lon = "";
        var lat = "";
        var attr = "";

        if(flag==0)graphicLayer.clear();

        for (var i = 0; i < allData.length; i++) {
            if (myrole == 1 || myrole == "admin")
                complexlist += allData[i].qyxxdzDqSZM + "、";
            else if (myrole == 2 || myrole == 3)
                complexlist += allData[i].xzqhmc + "、";
            lon = allData[i].jd;
            lat = allData[i].wd;
            attr = {
                "id": allData[i].id,
                "xzqhmc": allData[i].xzqhmc,
                "dwmcGz": allData[i].dwmcGz,
                "ssdm": allData[i].ssdm,
                "sskzdy": allData[i].sskzdy,
                "qyxxdzDqSZM": allData[i].qyxxdzDqSZM,
                "qyxxdzXQSQ": allData[i].qyxxdzXQSQ,
                "qyxxdzXZ": allData[i].qyxxdzXZ,
                "qyxxdzJCMph": allData[i].qyxxdzJCMph,
                "wsclffmc1": allData[i].wsclffmc1,
                "psqxlxmc": allData[i].psqxlxmc,
                "snstmc": allData[i].snstmc,
                "yxtsT": allData[i].yxtsT,
                "wssjclnlDR": allData[i].wssjclnlDR,
                "wssjcllWd": allData[i].wssjcllWd,
                "hxxylqclD": allData[i].hxxylqclD,
                "hxxyljkndHkS": allData[i].hxxyljkndHkS,
                "hxxylckndHkS": allData[i].hxxylckndHkS,
                "adqclD": allData[i].adqclD,
                "adjkndHkS": allData[i].adjkndHkS,
                "adckndHkS": allData[i].adckndHkS,
                "zdqclD": allData[i].zdqclD,
                "zdjkndHkS": allData[i].zdjkndHkS,
                "zdckndHkS": allData[i].zdckndHkS,
                "zlqclQk": allData[i].zlqclQk,
                "zljkndHkS": allData[i].zljkndHkS,
                "zlckndHkS": allData[i].zlckndHkS,



                "wnqddqlD":allData[i].wnqddqlD,
                "shxylqclD":allData[i].shxylqclD,
                "shxyljkndHKS":allData[i].shxyljkndHKS,
                "shxylckndHKS":allData[i].shxylckndHKS,
                "xfwqclD":allData[i].xfwqclD,
                "xfwjkndHKS":allData[i].xfwjkndHKS,
                "xfwckndHKS":allData[i].xfwckndHKS,
                "dzwyqclD":allData[i].dzwyqclD,
                "dzwyjkndHKS":allData[i].dzwyjkndHKS,
                "dzwyckndHKS":allData[i].dzwyckndHKS,
                "sylqclD":allData[i].sylqclD,
                "syljkndHKS":allData[i].syljkndHKS,
                "sylckndHKS":allData[i].sylckndHKS,
                "ylzhxjqclD":allData[i].ylzhxjqclD,
                "ylzhxjjkndHKS":allData[i].ylzhxjjkndHKS,
                "ylzhxjckndHKS":allData[i].ylzhxjckndHKS



            };
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("污水处理厂信息", html1);
            var symbol1 = new PictureMarkerSymbol("app/img/wsclc1.gif", 10, 10);
            var graphic = new Graphic(point, symbol1, attr, infoTemplate);
            graphicLayer.add(graphic);
        }
    });
}

function updatePyzInMap(allData, flag) {
	complexlist3 = "";
    require([
        "esri/geometry/Point",
        "esri/symbols/SimpleMarkerSymbol",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/InfoTemplate"
    ], function (Point,
                 SimpleMarkerSymbol,
                 PictureMarkerSymbol,
                 Graphic,
                 InfoTemplate) {
        var lon3 = "";
        var lat3 = "";
        var attr3 = "";

        if(flag==0)graphicLayer.clear();

        for (var i = 0; i < allData.length; i++) {
            if (myrole == 1 || myrole == "admin")
                complexlist3 += allData[i].dzS + "、";
            else if (myrole == 2 || myrole == 3)
                complexlist3 += allData[i].xzqhmc + "、";
            lon3 = allData[i].jd;
            lat3 = allData[i].wd;
            attr3 = {

                "id": allData[i].id,
                "xzqhmc": allData[i].xzqhmc,
                "yzcbm": allData[i].yzcbm,
                "yzcmc": allData[i].yzcmc,
                "kzdm": allData[i].kzdm,
                "kzdy": allData[i].kzdy,
                "jd": allData[i].jd,
                "wd": allData[i].wd,
                "dzS": allData[i].dzS,
                "dzX": allData[i].dzX,
                "xz": allData[i].xz,
                "jc": allData[i].jc,
                "szlymc": allData[i].szlymc,
                "snstmc": allData[i].snstmc,
                "xqzl": allData[i].xqzl,
                "syl": allData[i].syl,
                "pflHxxyl": allData[i].pflHxxyl,
                "pflZd": allData[i].pflZd,
                "pflZl": allData[i].pflZl,
                "pflAd": allData[i].pflAd,
                "qclHxxyl": allData[i].qclHxxyl,
                "qclZd": allData[i].qclZd,
                "qclZl": allData[i].qclZl,
                "qclAd": allData[i].qclAd

            };
            var point3 = new Point(lon3, lat3, map.spatialReference);
            var infoTemplate3 = new InfoTemplate("畜禽养殖信息", html2);
            var symbol13 = new PictureMarkerSymbol("app/img/pfty1.gif", 10, 10);
            var graphic3 = new Graphic(point3, symbol13, attr3, infoTemplate3);
            graphicLayer.add(graphic3);
        }
    });
}


//------------------------------------- 省市县导航 ----------------------------------------//

function list_city(citylist) {
	$("#citylisthead").html("");
	$("#citylist").html("");
    var oplist = [];
    oplist = citylist.split("、");
	
    //console.log(oplist);
    var hash = {}, result = [], title = "";
    var mark = "";
    if (myrole == 1) {
		$("#citylist").css("justify-content","");
        title = "省级视图";
        mark = "市"
    }
    else if (myrole == 2) {
        title = "市级视图";
        mark = ""
    }
    else if (myrole == "admin") {
		$("#citylist").css("justify-content","");
        title = "管理员视图";
        mark = "市"
    }
    else {
        title = "县级视图";
        mark = ""
    }
    $("#citylisthead").append($("<a id='citylista' style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'></a>").attr({class: ""}).text("" + title));

	
    for (var i = 0; i < oplist.length; i++) {
        if (!(hash[oplist[i]] || oplist[i] == "")) {

            var value_a = oplist[i];

            hash[oplist[i]] = true;
            result.push(oplist[i]);
			
			if(myrole == 1 || myrole == "admin"){
				
				$("#citylist").append("<select title='点击查看' href='#' name='op"+i+"' class='my-list-group-item' style='width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>" 
				+"<option style='display:none' selected>"+ value_a + "</option>"
				+"<option value='"+ value_a + "'>"+ value_a + "</option>"
				+"</select>");
				
			}else{
				if(value_a.length>6){
					var value_atmp = value_a.substring(0,6)+"..";
					$("#citylist").append("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='white-space: nowrap;overflow:hidden;width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>" + value_atmp + "</a>");
				}else{
					$("#citylist").append("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='white-space: nowrap;overflow:hidden;width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>" + value_a + "</a>");
				}
			}

        }
    }
	
	//市县级视图，绑定点击事件
	if(myrole == 2 || myrole == 3){

		$(document).off("click", ".my-list-group-item").on("click", ".my-list-group-item", function () { 
			 
			var $tmp = $(this), city = {};
			var	years = $("#pollmark").val();
			var	citys = $(this).attr('value');
			
			$tmp.css('background-color', '#CCFFFF').siblings().css('background-color', '#F3F3F3').end();
			
			//三合一
			ctname = {
				"XZQHMC": citys,
				"TJNF":years
			};		
			ctname2 = {"involve_county": $tmp.attr('value')};
			
			
			console.log(ctname);
			console.log(ctname2);
			console.log(" citys:"+citys+" years:"+years);
			afterclick( ctname, ctname2, citys, years);
		});	
		
	//管理员和省级视图，绑定下拉框 Change事件
	}else{
		
		//自定义下拉框补全事件
		$(document).off("makeopts", ".my-list-group-item").on("makeopts", ".my-list-group-item", function () {//
		
			if($(this).hasClass('on')) {
				
				return;
			}
			$(this).addClass("on");
			
			var CTname = $(this).val();
			var CTnb = this.name;
			//alert(CTname+':'+CTnb);
			$.ajax({
				type: "POST",
				async: true,
				url: "rest/" + $('#treeselect').val() + "/getCity",
				data: {
					"roleSign":2,
					"loc_city":CTname,
					"tjnf":$("#pollmark").val()
				},
				success: function (data) {
					var TMP = eval("("+data+")"); 
					var hsh = {};
					hsh[CTname] = true;
					
					$.each(TMP, function(i, item) {
						var arrs = [];
						arrs.push(item);
						
						if(item.indexOf("、")!=-1){
							arrs = [];
							arrs = item.split("、");
							
						}
						$.each(arrs, function(k, ktem) {
							if (!(hsh[ktem] || ktem == "")) {
								
								hsh[ktem] = true;
								
								$("select[name="+CTnb+"]").append("<option value='"+ ktem + "'>"+ ktem + "</option>");
								//console.log(ktem);
							}
						});						
					});
				}
			});	
		});
		
		//整个页面加载完毕后，自动触发下拉框补全事件
		$(document).ready(function(){
			
			$("select[name^=op]").trigger('makeopts');
			
		});		

		$(document).off("change", ".my-list-group-item").on("change", ".my-list-group-item", function () {//

			var selectFirst = $("select[name="+this.name+"] option:first").attr("value");
			var $tmp = $(this), city = {};
			var patt = new RegExp("[县区]$")
			
			if(bigtmp!=null&&this.name!=bigtmp[1]){
				$("select[name="+bigtmp[1]+"]").val(bigtmp[0]);
				
			}
			bigtmp=[selectFirst,this.name];
			
			$tmp.css('background-color', '#CCFFFF').siblings().css('background-color', '#F3F3F3').end();
			
			var	years = $("#pollmark").val();
			var	citys = $(this).attr('value');

			switch($('#treeselect').val()){
	
				case 'psrc':
					ctname = {
						"XXDZDQ_S_Z_M": citys,
						"TJNF":years
					};				
					break;
					
				case 'pfty':
					ctname = {
						"QYXXDZ_DQ_S_Z_M": citys,
						"TJNF":years
					};			
					break;
					
				case 'pyz':
					ctname = {
						"DZ_S": citys,
						"TJNF":years
					};			
					break;
			}	
			ctname2 = {"involve_city": $tmp.val()};
		
			//console.log('????? '+"$tmp.val():"+ $tmp.val()+"selectFirst:"+ selectFirst);
			if($tmp.val()!=selectFirst){
				
				//三合一
				ctname = {
					"XZQHMC": citys,
					"TJNF":years
				};	
				ctname2 = {"involve_county": $tmp.val()};

			}
			console.log("selectFirst",selectFirst,'   select:',$tmp.val())
			console.log("ctname：",ctname)

			afterclick( ctname, ctname2, $tmp.val());
		});
		
	}

}


function filterArcGISDynamicMapServiceLayer(value) {
	
    featureLayer.setDefinitionExpression(value);//开始过滤
	
    map.addLayer(featureLayer,100);
}

function afterclick( obj_1, obj_2, str_1, date ) {
	
	var types = $('#treeselect').val();
	
	var mapURL = "";
	if (types == "psrc") 
		mapURL = "rest/psrc/searchAllPsrc";
	else if (types == "pfty") 
		mapURL = "rest/pfty/searchAllPfty";
	else if (types == "pyz") 
		mapURL = "rest/pyz/searchAllPyz";	
	
	$('#jsonInput').val("").val(JSON.stringify(obj_1));
	$('#jsonInput2').val("").val(JSON.stringify(obj_2));
	$('#jumpTmp').val("");

	$.ajax({
		type: "POST",
		async: true,
		url: mapURL,
		data: obj_1,
		success: function (data) {
			
			updatePsrcInMap(data, 0);

			$.ajax({
				type: "POST",
				dataType: "html",
				async: false,
				url: "rest/" + types + "/search",
				data: obj_1,
				success: function (data) {
					$('#listAll').html(data);
				}
			});
			switch ( str_1 ) {
				case '鞍山市':
case '海城市':
case '千山区':
case '铁西区':
case '铁东区':
case '立山区':
case '鞍山高新产业技术开发区':	
//case '铁东区':
//case '铁西区':
case '千山区':
case '台安县':
case '海城市':		
//case '海城市':
//case '千山区':
case '台安':
//case '铁西区':
//case '铁东区':		
					console.log('鞍山');
					var extent = new esri.geometry.Extent(extents.anshan[0], extents.anshan[1], extents.anshan[2], extents.anshan[3]);
					map.setExtent(extent);
					break;
				case '辽阳市':
case '灯塔市':
case '辽阳县':
case '文圣区':
case '宏伟区':			
//case '文圣区':
//case '宏伟区':
case '弓长岭':
case '太子河':
//case '辽阳县':
//case '灯塔市':	
//case '辽阳县':
//case '灯塔市':
//case '文圣区':
case '太子河区':
case '宏伟':
case '太子区':
					console.log('辽阳');
					var extent = new esri.geometry.Extent(extents.liaoyang[0], extents.liaoyang[1], extents.liaoyang[2], extents.liaoyang[3]);
					map.setExtent(extent);
					break;
				case '阜新市':
					console.log('阜新');
					var extent = new esri.geometry.Extent(extents.fuxin[0], extents.fuxin[1], extents.fuxin[2], extents.fuxin[3]);
					map.setExtent(extent);
					break;
				case '盘锦市':
case '盘山县':
case '兴隆台区':
case '大洼县':
case '双台子区':
//case '双台子区':
case '兴隆台':
//case '大洼县':
//case '盘山县':
//case '盘山县':
case '大洼':
case '辽河口生态经济区':
//case '双台子区':
//case '兴隆台区':
					var extent = new esri.geometry.Extent(extents.panjin[0], extents.panjin[1], extents.panjin[2], extents.panjin[3]);
					map.setExtent(extent);
					break;
				case '锦州市':
				case '义县':
				case '凌海':
				case '黑山':
				case '北镇':
				case '太和区':
				case '松山新区':					
					var extent = new esri.geometry.Extent(extents.jinzhou[0], extents.jinzhou[1], extents.jinzhou[2], extents.jinzhou[3]);
					map.setExtent(extent);
					break;
				case '朝阳市':
				case '双塔区':
				case '北票市':
				case '喀左县':
				case '朝阳县':
					var extent = new esri.geometry.Extent(extents.chaoyang[0], extents.chaoyang[1], extents.chaoyang[2], extents.chaoyang[3]);
					map.setExtent(extent);
					break;
				case '铁岭市':
case '昌图县':
case '高新技术产业开发区':
case '开原市':
case '清河区':
case '调兵山市':
case '铁岭县':
case '西丰县':
case '银州区':
//case '银州区':
//case '清河区':
case '西丰':
//case '昌图县':
//case '调兵山市':
case '开原':
case '西丰县':
//case '开原市':
case '昌图':
//case '铁岭县':
//case '调兵山市':
//case '银州区':
case '开原市万丰生猪养殖场':
case '开原维民种猪场':
case '清河':
case '铁岭经济开发区':
					var extent = new esri.geometry.Extent(extents.tieling[0], extents.tieling[1], extents.tieling[2], extents.tieling[3]);
					map.setExtent(extent);
					break;
				case '沈阳市':
case '东陵区':
case '蒲河新城':
case '沈阳经济技术开发区':
case '新民市':
case '于洪区':
case '苏家屯区':
case '康平县':
case '沈北新区':
case '沈河区':
case '大东':
case '苏家屯区':
case '浑南新区':
//case '东陵区':
//case '沈北新区':
//case '于洪区':
case '皇姑区':
case '辽中县':
//case '沈阳经济技术开发区':
case '棋盘山开发区':
case '新民':
//case '东陵区':
//case '沈北新区':
//case '于洪区':
//case '新民':
//case '沈阳经济技术开发区':
case '法库':
case '辽中':
//case '康平县':
case '苏家屯':
					var extent = new esri.geometry.Extent(extents.shenyang[0], extents.shenyang[1], extents.shenyang[2], extents.shenyang[3]);
					map.setExtent(extent);
					break;
				case '葫芦岛市':
				case '建昌县':
					var extent = new esri.geometry.Extent(extents.huludao[0], extents.huludao[1], extents.huludao[2], extents.huludao[3]);
					map.setExtent(extent);
					break;
				case '营口市':
				case '营口市区':
				case '大石桥市':
					var extent = new esri.geometry.Extent(extents.yingkou[0], extents.yingkou[1], extents.yingkou[2], extents.yingkou[3]);
					map.setExtent(extent);
					break;
				case '丹东市':
				case '宽甸县':
				case '振兴区':
				case '东港市':
				
					var extent = new esri.geometry.Extent(extents.dandong[0], extents.dandong[1], extents.dandong[2], extents.dandong[3]);
					map.setExtent(extent);
					break;
				case '本溪市':
case '平山区':
case '溪湖区':
case '本溪满族自治县':
case '明山区':
case '南芬区':
case '本溪市高新技术产业开发区':		
case '平山':
//case '本溪满族自治县':
case '溪湖':
case '本溪':
case '明山':
//case '南芬区':
case '高新区':		
					var extent = new esri.geometry.Extent(extents.benxi[0], extents.benxi[1], extents.benxi[2], extents.benxi[3]);
					map.setExtent(extent);
					break;
				case '抚顺市':
case '清原满族自治县':
case '顺城区':
case '新宾满族自治县':
case '清原':
case '东洲区':
case '望花区':
case '抚顺县':
case '新抚区':	
//case '新抚区':
//case '望花区':
//case '顺城区':
//case '新宾满族自治县':
//case '清原满族自治县':		
//case '新宾满族自治县':
//case '抚顺县':	
					var extent = new esri.geometry.Extent(extents.fushun[0], extents.fushun[1], extents.fushun[2], extents.fushun[3]);
					map.setExtent(extent);
					break;
			}
		}
	});

	//点击区域显示
	$.ajax({
		type: "POST",
		async: true,
		url: "rest/controlunit/search",
		data: obj_2,
		success: function (data) {
			
			$('#listAll2').html(data);
 
			var name = $(data).find("#nameForMap").val();
			
			//console.log('name:',name);
			if (name == '') {
				
				name = "单元名称=''";
			}
			console.log('背景过滤:'+name);
			filterArcGISDynamicMapServiceLayer(name);
			 
			
		}
	});	
}

//------------------------------------- 省市县导航 [ 结束 ]---------------------------------------//



var elder;
$(document).off("click", "tr[id^='psrcx']").on({
    click: function () {

        $(this).addClass("hlight").siblings().removeClass("hlight").end();
        var lon = parseFloat($("#psrcjd" + this.id.substr(5)).val());
        var lat = parseFloat($("#psrcwd" + this.id.substr(5)).val());
        var infodata = {};
        var qmpname = ["tbdwxxmc", "xzqhmc", "kzdy", "kzdm", "xxdzdqSZM", "xxdzxQSQ", "xxdzxZ", "snstmc", "gyfspflD", "hxxylpflD",
            "adpflD", "sylpflD", "hffpflQk", "qhwpflQk", "fsspflQk", "fsqpflQk", "fsgpflQk", "fsgpflQkDup1", "fszgpflQk", "fsljgpflQk","wtxhlD",
             "rlyxhlD","jtxhlD","trqxhlWLFM","qtryxhlDBZM","ydlWQWS","gyyslD","zdpflD","gyfqpflWLFM","eyhspflD","dyhwpflD","ycpflD","vocspflD",
              "fqspflQK","fqqpflQK","fqgpflQK","fqgpflQK","fqzgpflQK","fqljgpflQK","ybgygtfwdqlD","wxfwdqlD"];
        for (var i = 0; i < $(this).children('td').length; i++) {
            infodata[qmpname[i]] = $(this).children('td').eq(i + 1).text();
        }
        require([
            "esri/geometry/Point",
            "esri/symbols/PictureMarkerSymbol",
            "esri/graphic",
            "esri/InfoTemplate"
        ], function (Point,
                     PictureMarkerSymbol,
                     Graphic,
                     InfoTemplate) {
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("直排企业信息", html);
            var symbol1 = new PictureMarkerSymbol("app/img/psrc3.gif", 8, 8);
            //var simpleMarkerSymbol = new SimpleMarkerSymbol();
            var graphic = new Graphic(point, symbol1, infodata, infoTemplate);
            //var graphic1 = new Graphic();
            graphicLayer.remove(elder);
            graphicLayer.add(graphic);
            elder = graphic;
        });
        ////alert(abc.locLatD);
        //console.log('highlight');
    }
}, "tr[id^='psrcx']");



var elder;
$(document).off("click", "tr[id^='pftyx']").on({
    click: function () {

        $(this).addClass("hlight").siblings().removeClass("hlight").end();
        var lon = parseFloat($("#pftyjd" + this.id.substr(5)).val());
        var lat = parseFloat($("#pftywd" + this.id.substr(5)).val());
        var infodata = {};
        var qmpname = ["xzqhmc", "dwmcGz", "ssdm", "sskzdy", "qyxxdzDqSZM", "qyxxdzXQSQ", "qyxxdzXZ", "qyxxdzJCMph", "wsclffmc1", "psqxlxmc", "snstmc", "yxtsT", "wssjclnlDR",
            "wssjcllWd", "hxxylqclD", "hxxyljkndHkS", "hxxylckndHkS", "adqclD", "adjkndHkS", "adckndHkS", "zdqclD", "zdjkndHkS", "zdckndHkS", "zlqclQk", "zljkndHkS", "zlckndHkS",
             "wnqddqlD","shxylqclD","shxyljkndHKS","shxylckndHKS","xfwqclD","xfwjkndHKS","xfwckndHKS","dzwyqclD","dzwyjkndHKS","dzwyckndHKS","sylqclD","syljkndHKS","sylckndHKS","ylzhxjqclD","ylzhxjjkndHKS","ylzhxjckndHKS"];
        for (var i = 0; i < $(this).children('td').length; i++) {
            infodata[qmpname[i]] = $(this).children('td').eq(i + 1).text();
        }
        require([
            "esri/geometry/Point",
            "esri/symbols/PictureMarkerSymbol",
            "esri/graphic",
            "esri/InfoTemplate"
        ], function (Point,
                     PictureMarkerSymbol,
                     Graphic,
                     InfoTemplate) {
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("污水处理厂信息", html1);
            var symbol1 = new PictureMarkerSymbol("app/img/wsclc3.gif", 10, 10);
            //var simpleMarkerSymbol = new SimpleMarkerSymbol();
            var graphic = new Graphic(point, symbol1, infodata, infoTemplate);
            //var graphic1 = new Graphic();
            graphicLayer.remove(elder);
            graphicLayer.add(graphic);
            elder = graphic;
        });
        ////alert(abc.locLatD);
        //console.log('highlight');
    }
}, "tr[id^='pftyx']");

var elder;
$(document).off("click", "tr[id^='pyzx']").on({
    click: function () {

        $(this).addClass("hlight").siblings().removeClass("hlight").end();
        var lon = parseFloat($("#pyzjd" + this.id.substr(4)).val());
        var lat = parseFloat($("#pyzwd" + this.id.substr(4)).val());
        var infodata = {};
        var qmpname = ["xzqhmc", "yzcbm", "yzcmc", "kzdm", "kzdy", "jd", "wd", "dzS", "dzX", "xz", "jc", "szlymc", "snstmc",
            "xqzl", "syl", "pflHxxyl", "pflZd", "pflZl", "pflAd", "qclHxxyl", "qclZd", "qclZl", "qclAd"];
        for (var i = 0; i < $(this).children('td').length; i++) {
            infodata[qmpname[i]] = $(this).children('td').eq(i + 1).text();
        }
        require([
            "esri/geometry/Point",
            "esri/symbols/PictureMarkerSymbol",
            "esri/graphic",
            "esri/InfoTemplate"
        ], function (Point,
                     PictureMarkerSymbol,
                     Graphic,
                     InfoTemplate) {
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("畜禽养殖信息", html1);
            var symbol1 = new PictureMarkerSymbol("app/img/pfty3.gif", 10, 10);
            //var simpleMarkerSymbol = new SimpleMarkerSymbol();
            var graphic = new Graphic(point, symbol1, infodata, infoTemplate);
            //var graphic1 = new Graphic();
            graphicLayer.remove(elder);
            graphicLayer.add(graphic);
            elder = graphic;
        });
        ////alert(abc.locLatD);
        //console.log('highlight');
    }
}, "tr[id^='pyzx']");


$('#map').css({
    'height': '470px',
    'width': '100%'
});

function getTree() {
    var tree = [{
        text: "直排点源",
        nodes: [{
            text: "直排企业",
            selectable: true,
            state: {
                checked: true,
                //	disabled: true,
                //	expanded: true,
                selected: true
            },
            //nodes : [{
            //	text : "达标",
            //}, {
            //	text : "不达标",
            //}]
        }, {
            text: "污水处理厂",
        }, {
            text: "规模化畜禽养殖",
        }]
    }];
    return tree;
}


$('#tree').treeview({
    multiSelect: false,
    data: getTree(),
    selectedBackColor:"#00c3c1",
    backColor:" #F3F3F3",
    onNodeSelected: function (event, data) {
		
		graphicLayer.clear();
        var tmp = data.text;

		var JUMPP = $('#jumpTmp').val();
 
		console.log("------");
		console.log(JUMPP);
		console.log("------");
		
		var datas = {
		    "TJNF": $("#pollmark").val()
		};
        if (tmp == "直排企业") {
			if(JUMPP!=null && JUMPP!=""){
				 
				JUMPP = eval('('+JUMPP+')');
				if(JUMPP.TAG=="KZDY"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"KZDY":JUMPP.KZDY
					};
				}else if(JUMPP.TAG=="KZDM"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"KZDM":JUMPP.KZDM
					};					
				}
			}
            removeElementsByClass('my-list-group-item');
            $('#citylisthead').empty();
            complexlist = "";
            $('#treeselect').val("psrc");
            $('#listAll').empty();
            $.ajax({
                type: "POST",
                dataType: "html",
                async: true,
                url: "rest/psrc/search",
				data:datas,
                success: function (data) {
                    $('#listAll').html(data);
                    $.ajax({
                        type: "POST",
                        async: true,
                        url: "rest/psrc/searchAllPsrc",
						data:datas,
                        success: function (data) {
                            updatePsrcInMap(data, 0);
                            list_city(complexlist);
                        }
                    });
                }
            });

        } else if (tmp == "污水处理厂") {
			if(JUMPP!=null && JUMPP!=""){
				JUMPP = eval('('+JUMPP+')');
				if(JUMPP.TAG=="KZDY"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"SSKZDY":JUMPP.KZDY
					};
				}else if(JUMPP.TAG=="KZDM"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"KZDM":JUMPP.KZDM
					};					
				}
			}
            removeElementsByClass('my-list-group-item');
            $('#citylisthead').empty();
            complexlist = "";
            $('#treeselect').val("pfty");
            $('#listAll').empty();
            $.ajax({
                type: "POST",
                dataType: "html",
                async: true,
                url: "rest/pfty/search",
				data:datas,
                success: function (data) {
                    $('#listAll').html(data);
                    $.ajax({
                        type: "POST",
                        async: true,
                        url: "rest/pfty/searchAllPfty",
						data:datas,
                        success: function (data) {
							console.log(data);
                            updatePsrcInMap(data, 0);
                            list_city(complexlist);
                        }
                    });
                }
            });
        } else if (tmp == "规模化畜禽养殖") {
			if(JUMPP!=null && JUMPP!=""){
				JUMPP = eval('('+JUMPP+')');
				if(JUMPP.TAG=="KZDY"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"KZDY":JUMPP.KZDY
					};
				}else if(JUMPP.TAG=="KZDM"){
					datas = {
						"TJNF": $("#pollmark").val(),
						"KZDM":JUMPP.KZDM
					};					
				}
			}		
            removeElementsByClass('my-list-group-item');
            $('#citylisthead').empty();
            complexlist = "";
            $('#treeselect').val("pyz");
            $('#listAll').empty();
            $.ajax({
                type: "POST",
                dataType: "html",
                async: true,
                url: "rest/pyz/search",
				data:datas,
                success: function (data) {
                    $('#listAll').html(data);
                    $.ajax({
                        type: "POST",
                        async: true,
                        url: "rest/pyz/searchAllPyz",
						data:datas,
                        success: function (data) {
                            updatePsrcInMap(data, 0);
                            list_city(complexlist);
                        }
                    });
                }
            });
        }
		
		$('#jsonInput').val(JSON.stringify(datas));
		
		if(myrole == 1 || myrole == "admin"){
			//暂时方案
			var extent = new esri.geometry.Extent(117.309229, 39.137731, 129.957720, 43.380153);
			//alert(map.getZoom());
			map.setExtent(extent);
			var abc = "单元名称='三合屯' or 单元名称='清辽' or单元名称='清河水库入库口' or 单元名称='朱尔山' or 单元名称='巨流河大桥' or 单元名称='柴河水库入库口' or 单元名称='蒲河沿' or 单元名称='牤牛河大桥' or 单元名称='凤鸣电站' or 单元名称='古楼' or 单元名称='王家沟' or 单元名称='老官砬子' or 单元名称='水丰水库' or 单元名称='高台子' or 单元名称='西八千' or 单元名称='参窝坝下' or 单元名称='二道河入汤河水库口' or 单元名称='下达河入汤河水库口' or 单元名称='张家堡' or 单元名称='盘锦兴安' or 单元名称='刘家台' or 单元名称='卧佛寺' or 单元名称='牛庄' or 单元名称='瑷河大桥' or 单元名称='关门山大桥' or 单元名称='红石碑入海前' or 单元名称='辽河公园' or 单元名称='赵圈河' or 单元名称='口子街' or 单元名称='厦子沟' or 单元名称='大洋河桥' or 单元名称='孤家子' or 单元名称='英那河入海口' or 单元名称='大清河口' or 单元名称='小于屯' or 单元名称='城子坦' or 单元名称='麦家' or 单元名称='通江口' or 单元名称='亮子河入河口' or 单元名称='东大桥' or 单元名称='黄河子' or 单元名称='兴国桥' or 单元名称='马虎山' or 单元名称='王家窝棚' or 单元名称='大凌河西支入河口' or 单元名称='老虎山河入河口' or 单元名称='胜利塘' or 单元名称='阿及堡' or 单元名称='戈布桥' or 单元名称='东陵大桥' or 单元名称='河洪桥' or 单元名称='太子河入观音阁水库口' or 单元名称='兴安' or 单元名称='汤河桥' or 单元名称='下王家' or 单元名称='下口子' or 单元名称='小姐庙' or 单元名称='三岔河' or 单元名称='西树林' or 单元名称='荒沟' or 单元名称='江桥' or 单元名称='红庙子' or 单元名称='万泰' or 单元名称='文安' or 单元名称='章吉营' or 单元名称='台沟' or 单元名称='北杂木' or 单元名称='柳河桥' or 单元名称='曙光大桥' or 单元名称='何家信子' or 单元名称='三台子' or 单元名称='茧场' or 单元名称='南大桥' or 单元名称='复州湾大桥' or 单元名称='蒲石河大桥' or 单元名称='于家房' or 单元名称='砂山' or 单元名称='拉马桥' or 单元名称='大伙房水库' or 单元名称='松树水文站' or 单元名称='南太子河入观音阁水库口' or 单元名称='柳家桥' or 单元名称='沟帮子镇' or 单元名称='女儿河入河口'";		
			filterArcGISDynamicMapServiceLayer(abc);
		}else{
			
			//点击区域显示
			$.ajax({
				type: "POST",
				async: true,
				url: "rest/controlunit/search",
				data: {
					"involve_city": wholecity
				},
				success: function (data) {
					
					$('#listAll2').html(data);
		 
					var name = $(data).find("#nameForMap").val();
					
					//console.log('name:',name);
					if (name == '') {
						
						name = "单元名称=''";
					}
					console.log('背景过滤:'+name);
					filterArcGISDynamicMapServiceLayer(name);
					 
					
				}
			});	
			
		}
    }
});


$('#addButton').click(function () {
    var url = "";
    var marks = $('#treeselect').val();
    if (marks == "psrc") url = "rest/page/addPollSource";
    else if (marks == "pfty") url = "rest/page/addPollFactory";
    else if (marks == "pyz") url = "rest/page/addPollYangZhi";
    ////alert(url);
    $.get(url, function (data) {
        $('#addDiv').html(data);
    });
});


$('#searchButton').click(function () {
    var url = "";
    var marks = $('#treeselect').val();
    if (marks == "psrc") url = "rest/page/searchPollSource";
    else if (marks == "pfty") url = "rest/page/searchPollFactory";
    else if (marks == "pyz") url = "rest/page/searchPollYangZhi";

    $.get(url, function (data) {
        $('#searchDiv').html(data);
    });
});

$('#exportExcel').click(function () {
    var url = "";
    var marks = $('#treeselect').val();
    if (marks == "psrc") url = "rest/psrc/exportExcel";
    else if (marks == "pfty") url = "rest/pfty/exportExcel";
    else if (marks == "pyz") url = "rest/pyz/exportExcel";
	var tmp = $('#jsonInput').val();
	var test = JSON.parse(tmp);
	console.log(test);
	$.ajax({
		type : "POST",
		dataType : "html",
		async : false,
		url : url,
		data : test,
		success : function(data) {
			window.location.href= url.replace("exportExcel", "upload");
		}
	});
});


function poToCu(po) {
    var json = {
        "include_section": po
    };
    $('#jumpTmp').val("").val(JSON.stringify(json));
    $.get("rest/page/newCu", function (data) {
        $('#index-page-title').text("控制单元管理");
        $('#main-content').html(data);
        $('#listAll').empty();
        $("#map").toggle();
        $.ajax({
            type: "POST",
            dataType: "html",
            async: true,
            url: "rest/controlunit/search",
            data: json,
            success: function (data) {
                $('#listAll').html(data);
                var name = $("#nameForMap").val();
                filterArcGISDynamicMapServiceLayer(name);
                $("#map").toggle();
            }
        });
    });
}


function poToQmp(po) {
    var json = {
        "section_name": po
    };
    $('#jumpOrNot').text("0");
    $('#jumpTmp').val("").val(JSON.stringify(json));

    $.get("rest/page/newQmp", function (data) {
        $('#index-page-title').text("控制断面管理");
        $('#main-content').html(data);
        $('#listAll').empty();
        $("#map").toggle();
        $.ajax({
            type: "POST",
            dataType: "html",
            async: true,
            url: "rest/qmp/search",
            data: json,
            success: function (data) {
            	$('#jumpOrNot').text("1");
                $('#listAll').html(data);
                $.ajax({
                    type: "POST",
                    async: true,
                    url: "rest/qmp/searchAllQmp",
                    data: json,
                    success: function (data) {
                        updateQmpInMap(data);
                        $("#map").toggle();
                        
                    }
                });
            }
        });
    });
}
function removeElementsByClass(className) {
    var elements = document.getElementsByClassName(className);
    while (elements.length > 0) {
        elements[0].parentNode.removeChild(elements[0]);
    }
}

$('#bulkImportButton').click(function() {
    var url = "rest/page/bulkImportPoll";
    $.get(url, function(data) {
        $('#bulkImportDiv').html(data);
    });
});
$('#bulkImportButton_download').click(function() {
    var url = "rest/page/bulkImportPoll_download";
    $.get(url, function(data) {
        $('#bulkImportDiv_download').html(data);
    });
});

function bulkImport() {
    var fileName = $("#fileName").text();
    $.ajax({
        type:"POST",
        dataType : "json",
        url:"rest/poll/bulkImportPoll",
        async:false,
        data: {name:fileName},
        success: function(data) {
            console.log(data);
            var msg = data.msg;
            console.log(data.msg)
            var time = data.time;
            console.log(data.updateCount)
            var updateCount = data.updateCount;
            console.log(data.insertCount)
            var insertCount = data.insertCount;
            var newMsg = msg+"\n用时: "+time+"\n更新了："+updateCount+"条数据；\n新增了："+insertCount+"条数据。";
            //alert(newMsg);
            // //alert(data);


        }
    })

}



$("#pollmark").on("change",function () {
	var value = $("#pollmark").val();
	var JUMPP = $("#jumpTmp").val();
	var datas = {
		    "TJNF": value
		};
	if(JUMPP!=null && JUMPP!=""){
		JUMPP = eval('('+JUMPP+')');
		if(JUMPP.TAG="KZDY"){
			datas = {
				"TJNF": value,
				"KZDY":JUMPP.KZDY
			};
		}else if(JUMPP.TAG="KZDM"){
			datas = {
				"TJNF": value,
				"KZDM":JUMPP.KZDM
			};					
		}
	}	
	complexlist = "";
	complexlist2 = "";
	complexlist3 = "";	
	
	//if(value!=2013){
 
		$('#jsonInput').val(JSON.stringify(datas));
		//alert(value+":"+$('#treeselect').val());
		if($('#treeselect').val()=="psrc"){
			$.ajax({//载入下方表格
				type: "POST",
				dataType: "html",
				async: true,
				url: "rest/psrc/search",
				data: datas,
				success: function (data) {

					setTimeout(function () {

						$('#listAll').html(data);

						$.ajax({//更新地图
							type: "POST",
							async: true,
							url: "rest/psrc/searchAllPsrc",
							data: datas,
							success: function (data) {
								updatePsrcInMap(data, 0);
								//alert(complexlist);
								list_city(complexlist);
							}
						});
					}, 1000);
				}
			});
		}else if($('#treeselect').val()=="pfty"){
			$.ajax({
				type: "POST",
				dataType: "html",
				async: true,
				url: "rest/pfty/search",
				data: datas,
				success: function (data) {

					setTimeout(function () {

						$('#listAll').html(data);

						$.ajax({
							type: "POST",
							async: true,
							url: "rest/pfty/searchAllPfty",
							data: datas,
							success: function (data) {
								console.log(data);
								updatePftyInMap(data, 0);
								list_city(complexlist);
							}
						});
					}, 1000);
				}
			});
		}else if($('#treeselect').val()=="pyz"){
			$.ajax({
				type: "POST",
				dataType: "html",
				async: true,
				url: "rest/pyz/search",
				data: datas,
				success: function (data) {

					setTimeout(function () {

						$('#listAll').html(data);

						$.ajax({
							type: "POST",
							async: true,
							url: "rest/pyz/searchAllPyz",
							data: datas,
							success: function (data) {
				
								updatePyzInMap(data, 0);
								list_city(complexlist);
								// $("#map").show();
							}
						});
					}, 1000);
				}
			});
		}

	//}
	$("#pollmark").val(value);
	//$("#map").toggle();
	/**/
});



