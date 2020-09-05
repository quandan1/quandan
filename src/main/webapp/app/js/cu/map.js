console.log("liuxin");
var agoLayer, layer, map, tb, statesTask, riversTask, citiesTask, query, symbol;
var num=0;
init();
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
function init(){
require(["esri/map", "esri/layers/ArcGISDynamicMapServiceLayer", "esri/layers/FeatureLayer",
         "esri/InfoTemplate", "esri/renderers/ClassBreaksRenderer", "esri/symbols/SimpleFillSymbol", "esri/dijit/Legend",
         "esri/Color", "esri/tasks/query", "esri/geometry/Extent", "esri/renderers/SimpleRenderer", "esri/symbols/SimpleLineSymbol", 
         "esri/renderers/UniqueValueRenderer","esri/symbols/TextSymbol","esri/layers/LabelClass"],
    function (Map, ArcGISDynamicMapServiceLayer, FeatureLayer,
            InfoTemplate, ClassBreaksRenderer, SimpleFillSymbol, Legend, Color, Query, Extent, SimpleRenderer, SimpleLineSymbol, UniqueValueRenderer,TextSymbol,LabelClass) {
        //parser.parse();
	var extent =  new esri.geometry.Extent(120, 40,128, 44);
    map = new esri.Map("map", { 
      "spatialReference" : {
			"wkid" : 4326
		},//地理坐标 4326对应GCS_WGS_1984 
	   showLabels : true, //very important that this must be set to true! 
	   extent : extent,
       logo: false, //取消地图默认的logo  
       zoom:12,  //显示地图的级别  
       maxZoom:16  //最大空间等级  
      });
  // var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer";
		var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer";
    agoLayer = new ArcGISDynamicMapServiceLayer(url);
    //agoLayer.setVisibleLayers([9]);//设置china(9)
		//agoLayer.setVisibleLayers([19,20,21,23]);//设置china(9)
		agoLayer.setVisibleLayers([0,1,27,31,34,35]);//设置china(9)
    map.addLayer(agoLayer,0);
	//	map.addLayer(agoLayer,0);

		
		//var layerUrl_2 = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/20";
		var layerUrl_2 = "http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer/27";
		featureLayer_2 = new esri.layers.FeatureLayer(layerUrl_2, {
			mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
			outFields: ["*"],
			hasAttributionData: true
		});
		map.addLayer(featureLayer_2, 2);



    //var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/5";
		//var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/19";
		var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer/27";
    layer = new esri.layers.FeatureLayer(layerUrl, 	{
        infoTemplate: new esri.InfoTemplate("控制单元", 
        "<button class='btnz btnz-info' type='button' onclick='cuToQmp(\"${单元名称}\")'>相关断面</button>"+
        "<button class='btnz btnz-info' type='button' onclick='cuToPo(\"${单元名称}\")'>污染源</button>"+
        "<table width='100%' border='0' class='tableBasic'>" +
        "<tr><td width='120'>FID:</td><td>${FID}</td></tr>"+
        "<tr><td width='120'>单元名称：</td><td>${单元名称}</td></tr>"+
        "<tr><td width='120'>乡镇个数：</td><td>${乡镇个数}</td></tr>" +
        "<tr><td width='120'>所属区:</td><td>${所属区}</td></tr>" +
        "<tr><td width='120'>所属市:</td><td>${所属市}</td></tr>" +
        "</table><br/>"+
        "<table border='0' class='tableBasic'>" +
        "总量计算：请选择下面要计算的属性"+
        "<tr><td><select name='prop' id='prop' onchange='cal($(\"#prop\").val(),\"${单元名称}\")'>"+
        "<option value='HXXYLCSL_D'>化学需氧量产生量（吨）</option>"+
        "<option value='HXXYLPFL_D'>化学需氧量排放量（吨）</option>"+
        "<option value='ADCSL_D'>氨氮产生量（吨）</option>"+
        "<option value='ADPFL_D'>氨氮排放量（吨）</option>"+
        "<option value='SYLCSL_D'>石油量产生量（吨）</option>"+
        "<option value='SYLPFL_D'>石油量排放量（吨）</option>"+
        "<option value='GYFSPFL_D'>工业废水排放量（吨）</option>"+
        "<option value='HFFPFL_QK'>挥发酚排放量（千克）</option>"+
        "<option value='QHWPFL_QK'>氰化物排放量（千克）</option>"+
        "<option value='FSSPFL_QK'>废水砷排放量（千克）</option>"+
        "<option value='FSQPFL_QK'>废水铅排放量（千克）</option>"+
        "<option value='FSGPFL_QK'>废水镉排放量（千克）</option>"+
        "<option value='FSGPFL_QK_DUP1'>废水汞排放量（千克）</option>"+
        "<option value='FSZGPFL_QK'>废水总铬排放量（千克）</option>"+
        "<option value='FSLJGPFL_QK'>废水六价铬排放量（千克）</option>"+
        "</select>"+
        "</td><td><span id='count'>0</span></td></tr>"+
        "</table>"
        ),
        mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
        outFields: ["*"],
        hasAttributionData:true
	 });
	
	
	
	//地名标注
    var labelSymbol = new TextSymbol().setColor(new Color("#000000"));
    labelSymbol.font.setSize("8pt");
    labelSymbol.font.setFamily("微软雅黑");
    var json = {
        "labelExpressionInfo": {"value": "{单元名称}"},
    };
    var labelClass = new LabelClass(json);
    labelClass.symbol = labelSymbol;
    layer.setLabelingInfo([ labelClass ]);
    
	//map.addLayer(layer);
		map.addLayer(layer);
	
	
	
	 $.ajax({
		type : "POST",
		dataType : "json",
		async : false,
		url : "rest/controlunit/userForMap",
		success: function(data){
			var result = decodeURIComponent(data.result);
			//filterArcGISDynamicMapServiceLayer(result);
			console.log('result:'+result);
			layer.setDefinitionExpression(result);
			map.addLayer(layer);
		}
	});
	 symbol = new SimpleFillSymbol(SimpleFillSymbol.STYLE_SOLID, 
			    new SimpleLineSymbol(SimpleLineSymbol.STYLE_SOLID,
			    new Color([0,0,0]), 1), new Color([255,0,0,0.5])
			  );
	 
	 layer.on("click", function(evt){  
	   console.log(evt.graphic.attributes.单元名称);
	   var name = evt.graphic.attributes.单元名称;
	   $.ajax({
				type : "POST",
				dataType : "json",
				async : false,
				url : "rest/controlunit/info",
				data : {
					 name : name
				},
				success: function(data){
					//console.log(data);
					//console.log(evt.graphic.attributes);
					var template = new InfoTemplate();
					template.setTitle("控制单元");
					console.log(data.hrRiver);
					template.setContent(
						"<button class='btnz btnz-info' type='button' onclick='cuToQmp(\"${单元名称}\")'>相关断面</button>"+
				        "<button class='btnz btnz-info' type='button' onclick='cuToPo(\"${单元名称}\")'>污染源</button>"+
				        "<table width='100%' border='0' class='tableBasic'>" +
				        "<tr><td width='120'>FID:</td><td>${FID}</td></tr>"+
				        "<tr><td width='120'>控制单元名称：</td><td>${单元名称}</td></tr>"+
				        "<tr><td width='120'>所含控制断面名称：</td><td>"+data.includeSection+"</td></tr>"+
				        "<tr><td width='120'>流域：</td><td>"+data.waterShed+"</td></tr>"+
				        "<tr><td width='120'>所属省份:</td><td>"+data.locProvince+"</td></tr>" +
				        "<tr><td width='120'>涉及地市:</td><td>"+data.involveCity+"</td></tr>" +
				        "<tr><td width='120'>涉及区（县）名称:</td><td>"+data.involveCounty+"</td></tr>" +
				        "<tr><td width='120'>涉及乡镇名称：</td><td>"+data.involveVillage+"</td></tr>"+
				        "<tr><td width='120'>乡镇个数：</td><td>"+data.villageAmount+"</td></tr>" +
				        "<tr><td width='120'>涉及河流名称：</td><td>"+data.involveRiver+"</td></tr>" +
				        "<tr><td width='120'>水资源区：</td><td>"+data.waterResource+"</td></tr>" +
				        "<tr><td width='120'>汇入河流：</td><td>"+data.hrRiver+"</td></tr>" +

						"<tr><td width='120'>控制单元级别：</td><td>"+data.unitType+"</td></tr>"+
						"<tr><td width='120'>包含水系：</td><td>"+data.includeSx+"</td></tr>" +
						"<tr><td width='120'>所含干流：</td><td>"+data.includeGl+"</td></tr>" +
						"<tr><td width='120'>所含一级支流：</td><td>"+data.include1jzl+"</td></tr>" +
						"<tr><td width='120'>所含二级支流：</td><td>"+data.include2jzl+"</td></tr>" +
						"<tr><td width='120'>所含三级支流：</td><td>"+data.include3jzl+"</td></tr>" +
						"<tr><td width='120'>所含四级支流：</td><td>"+data.include4jzl+"</td></tr>" +
						"<tr><td width='120'>控制单元划分时间：</td><td>"+data.kzdyTime+"</td></tr>" +

				        "</table><br/>"+
				        "<table border='0' class='tableBasic'>" +
				        "总量计算：请选择下面要计算的属性"+
				        "<tr><td><select name='prop' id='prop' onchange='cal($(\"#prop\").val(),\"${单元名称}\")'>"+
				        "<option value='HXXYLCSL_D'>化学需氧量产生量（吨）</option>"+
				        "<option value='HXXYLPFL_D'>化学需氧量排放量（吨）</option>"+
				        "<option value='ADCSL_D'>氨氮产生量（吨）</option>"+
				        "<option value='ADPFL_D'>氨氮排放量（吨）</option>"+
				        "<option value='SYLCSL_D'>石油量产生量（吨）</option>"+
				        "<option value='SYLPFL_D'>石油量排放量（吨）</option>"+
				        "<option value='GYFSPFL_D'>工业废水排放量（吨）</option>"+
				        "<option value='HFFPFL_QK'>挥发酚排放量（千克）</option>"+
				        "<option value='QHWPFL_QK'>氰化物排放量（千克）</option>"+
				        "<option value='FSSPFL_QK'>废水砷排放量（千克）</option>"+
				        "<option value='FSQPFL_QK'>废水铅排放量（千克）</option>"+
				        "<option value='FSGPFL_QK'>废水镉排放量（千克）</option>"+
				        "<option value='FSGPFL_QK_DUP1'>废水汞排放量（千克）</option>"+
				        "<option value='FSZGPFL_QK'>废水总铬排放量（千克）</option>"+
				        "<option value='FSLJGPFL_QK'>废水六价铬排放量（千克）</option>"+
				        "</select>"+
				        "</td><td><span id='count'>0</span></td></tr>"+
				        "</table>"
					);
					layer.setInfoTemplate(template);
				}
			});
	 });    
	
});
}

list_city();
function list_city(){
	 var citylist = [];
	 var city = "";
	 $.ajax({
			type : "POST",
			url : "rest/controlunit/left",
			success : function(allData) {
				for(var i=0;i<allData.length;i++){
					if(myrole==1||myrole=="admin"){
						if(allData[i].involveCity==''){
						}else{
							city+=allData[i].involveCity+"、";
						}
					}
					else if(myrole==2||myrole==3){
						if(allData[i].involveCounty==''){
						}else{
							city += allData[i].involveCounty+"、";
						}
					}
				}
				citylist = city.split('、');
				//去除区县的不符合数据
				if(myrole==2){
					console.log("刘欣");
					$.ajax({
						type : "POST",
						async: false,
						url : "rest/controlunit/county",
						success : function(data) {
							var list_city = [];
							for (var i = 0; i < citylist.length; i++){
								var c = citylist[i];
								for(var j = 0;j < data.length; j++){
									var c_role = data[j];
									if(c.indexOf(c_role)>-1){
										list_city.push(c);
									}
								}
							}
							citylist = list_city;
						}
					});
				}
				var hash = {},result = [],title="";
				 if(myrole==1) title = "省级视图";		
				 else 
					 if(myrole==2) title = "市级视图";
				 else 
					 if(myrole=="admin") title = "管理员视图";
				 else 
					 title = "县级视图";
			     $("#citylisthead").append($("<a id='citylista' style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'></a>").attr({class:""}).text(""+title));
				 $("#citylista").attr({title:"此处为说明内容"}).tipso();
				 
				 for (var i = 0; i < citylist.length; i++){
					 if (!hash[citylist[i]]){
						 hash[citylist[i]] = true;
						 result.push(citylist[i].replace("市","").replace("县",""));
						 if(citylist[i]!=''){
						    $("#citylist").append($("<a title='点击查看' style='width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'></a>").attr({href:"#",class:"my-list-group-item"}).text(citylist[i]));
						 }

					 } 
				 }	
				 $(document).off("click",".my-list-group-item").on("click",".my-list-group-item",function(){//
					var $tmp = $(this),city={};
					if(myrole==1||myrole=="admin") 
						ctname = {"involve_city":$(this).text()};
					else if(myrole==2||myrole==3) 
						ctname = {"involve_county":$(this).text()};

					console.log("ctname:",ctname);
					$('#jsonInput').val("").val(JSON.stringify(ctname));
					$('#jumpTmp').val("");
					$.ajax({
						type : "POST",
						async : true,
						url : "rest/controlunit/search",
						data :ctname,
						success : function(data) {
							$tmp.addClass("my-list-group-item-hlight").siblings().removeClass("my-list-group-item-hlight").end();  
							$('#listAll').html(data);
							var name=$("#nameForMap").val();
			                console.log('name:'+name);
							if(name==''){
								name = "单元名称=''";
							}
							filterArcGISDynamicMapServiceLayer(name);
                            switch ($tmp.text()) {
                                case '鞍山市':
                                    console.log('鞍山');
                                    var extent = new esri.geometry.Extent(extents.anshan[0], extents.anshan[1], extents.anshan[2], extents.anshan[3]);
                                    map.setExtent(extent);
                                    break;
                                case '辽阳市':
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
                                    var extent = new esri.geometry.Extent(extents.panjin[0], extents.panjin[1], extents.panjin[2], extents.panjin[3]);
                                    map.setExtent(extent);
                                    break;
                                case '锦州市':
                                    var extent = new esri.geometry.Extent(extents.jinzhou[0], extents.jinzhou[1], extents.jinzhou[2], extents.jinzhou[3]);
                                    map.setExtent(extent);
                                    break;
                                case '朝阳市':
                                    var extent = new esri.geometry.Extent(extents.chaoyang[0], extents.chaoyang[1], extents.chaoyang[2], extents.chaoyang[3]);
                                    map.setExtent(extent);
                                    break;
                                case '铁岭市':
                                    var extent = new esri.geometry.Extent(extents.tieling[0], extents.tieling[1], extents.tieling[2], extents.tieling[3]);
                                    map.setExtent(extent);
                                    break;
                                case '沈阳市':
                                    var extent = new esri.geometry.Extent(extents.shenyang[0], extents.shenyang[1], extents.shenyang[2], extents.shenyang[3]);
                                    map.setExtent(extent);
                                    break;
                                case '葫芦岛市':
                                    var extent = new esri.geometry.Extent(extents.huludao[0], extents.huludao[1], extents.huludao[2], extents.huludao[3]);
                                    map.setExtent(extent);
                                    break;
                                case '营口市':
                                    var extent = new esri.geometry.Extent(extents.yingkou[0], extents.yingkou[1], extents.yingkou[2], extents.yingkou[3]);
                                    map.setExtent(extent);
                                    break;
                                case '丹东市':
                                    var extent = new esri.geometry.Extent(extents.dandong[0], extents.dandong[1], extents.dandong[2], extents.dandong[3]);
                                    map.setExtent(extent);
                                    break;
                                case '本溪市':
                                    var extent = new esri.geometry.Extent(extents.benxi[0], extents.benxi[1], extents.benxi[2], extents.benxi[3]);
                                    map.setExtent(extent);
                                    break;
                                case '抚顺市':
                                    var extent = new esri.geometry.Extent(extents.fushun[0], extents.fushun[1], extents.fushun[2], extents.fushun[3]);
                                    map.setExtent(extent);
                                    break;
                            }
						}
					});		
				});
			}
	 });
	 
}

$('#redraw').click(function() {
	console.log("llll");
    //输出其中一个graphic(面要素)的所有属性  
    for(var i = 0;i<layer.graphics.length;i++){  
   	  if(layer.graphics[i].attributes["单元名称"]=="清辽"){
   		   layer.graphics[i].setSymbol(symbol);
   	}else{
   	}
    }  
});
var save;
$(document).off("click","tr[id^='cux']").on("click","tr[id^='cux']",function(){
	//console.log($(this).children('td').eq(1).text());
	$(this).addClass("hlight").siblings().removeClass("hlight").end(); 
	var cu_name = [];
	cu_name = $(this).children('td').eq(1).text().split('（');
	//console.log(cu_name[0]);
	//var name = $(this).children('td').eq(1).text();
	var name = cu_name[0];
	//console.log(name);
	if(save==""){
		for(var i = 0;i<layer.graphics.length;i++){
	   	  if(layer.graphics[i].attributes["单元名称"]==name){
	   		   layer.graphics[i].setSymbol(symbol);
	   	  }
		}
	}else{
		for(var i = 0;i<layer.graphics.length;i++){
		   	  if(layer.graphics[i].attributes["单元名称"]==name){
		   		   layer.graphics[i].setSymbol(symbol);
		   	  }else if(layer.graphics[i].attributes["单元名称"]==save){
		   		   layer.graphics[i].setSymbol();
		   	  }
		}
	}
	save = $(this).children('td').eq(1).text().split('（')[0];
});
//var save_s;
//$(document).off("click","tr[id^='cu_x']").on("click","tr[id^='cu_x']",function(){
//	console.log($(this).children('td').eq(1).text());
//	$(this).addClass("hlight").siblings().removeClass("hlight").end(); 
//	var name = $(this).children('td').eq(1).text();
//	if(save_s==""){
//		for(var i = 0;i<layer.graphics.length;i++){
//	   	  if(layer.graphics[i].attributes["单元名称"]==name){
//	   		   layer.graphics[i].setSymbol(symbol);
//	   	  }
//		}
//	}else{
//		for(var i = 0;i<layer.graphics.length;i++){
//		   	  if(layer.graphics[i].attributes["单元名称"]==name){
//		   		   layer.graphics[i].setSymbol(symbol);
//		   	  }else if(layer.graphics[i].attributes["单元名称"]==save){
//		   		   layer.graphics[i].setSymbol();
//		   	  }
//		}
//	}
//	save_s = $(this).children('td').eq(1).text();
//});

function cal(prop,kzdy){
   num = num+1;
   var unit = [];
   unit = prop.split('_');
   var unit_c;
   if(unit[1]=='D'){
	   unit_c = '吨';
   }else{
	   unit_c = '千克';
   }
   $.ajax({
		type : "POST",
		dataType : "json",
		async : false,
		url : "rest/controlunit/compute",
		data : {
		   kzdy : kzdy,
		   prop : prop
		},
		success: function(data){
			$('#count').text(data+unit_c);
		}
	});
   //$('#count').text(num);
}
function click(){

}
function filterArcGISDynamicMapServiceLayer(value){

	layer.setDefinitionExpression(value);//开始过滤  
	map.addLayer(layer);
}  
function TZ(value){
	console.log(value);
}
function cuToQmp(value){
	var json = {
		"section_name" : value
	};
	$('#jumpTmp').val("").val(JSON.stringify(json)); 
	$("#jumpOrNot").text("0");
	$.get("rest/page/newQmp", function(data) {	 
		$('#index-page-title').text("控制断面管理");
		$('#main-content').html(data);
		$('#listAll').empty();
		$("#map").toggle();
		$.ajax({
			type : "POST",
			dataType : "html",
			async : true,
			url : "rest/qmp/search",
			data : json,
			success : function(data) {
				$("#jumpOrNot").text("1");
				$('#listAll').html(data);
				$.ajax({
					type : "POST",
					async : true,
					url : "rest/qmp/searchAllQmp",
					data : json,
					success : function(data) {
						updateQmpInMap(data);
						$("#map").toggle();
					}
				});
			}
		});
	}); 
}	 

function cuToPo(value){
	var json = {
		"TAG":"KZDY",
		"KZDY" : value
	}; 
	$('#jumpTmp').val("").val(JSON.stringify(json));
	$("#jumpOrNot").text("0");
	$.get("rest/page/newPollSource", function(data) {
		$('#index-page-title').text("污染源管理");
		$('#main-content').html(data);
		$('#listAll').empty();
		$("#map").toggle();
		
		complexlist =  "";
		
		$.ajax({
			type : "POST",
			dataType : "html",
			async : true,
			url : "rest/psrc/search",
			data :json,
			success : function(data) {	
				$("#jumpOrNot").text("1");
				$('#listAll').html(data);
				$.ajax({
					type : "POST",
					async : true,
					url : "rest/psrc/searchAllPsrc",
					data : json,
					success : function(data) {
						updatePsrcInMap(data,0);
						list_city(complexlist);
						$("#map").toggle();
					}
				});
			}
		});
	});
}





$('#map').css({
    'height': '470px',
    'width': '100%'
});
