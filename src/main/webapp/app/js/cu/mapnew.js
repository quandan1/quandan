console.log("liuxin");
var agoLayer, layer, map, tb, statesTask, riversTask, citiesTask, query, symbol;
var num=0;
init();
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
		},
	   showLabels : true, //very important that this must be set to true! 
	   extent : extent,
       logo: false, //取消地图默认的logo  
       zoom:12,  //显示地图的级别  
       maxZoom:16  //最大空间等级  
      });
    //var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/MapServer";
	 var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer";
    agoLayer = new ArcGISDynamicMapServiceLayer(url);
   
    agoLayer.setVisibleLayers([8]);
    map.addLayer(agoLayer);
    var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/7";
    featureLayer = new esri.layers.FeatureLayer(layerUrl, 	{
        infoTemplate: new esri.InfoTemplate("控制单元", 
        "<button class='btnz btnz-info' type='button' onclick='cuToQmp(\"${单元名称}\")'>相关控制断面</button>"+
        "<button class='btnz btnz-info' type='button' onclick='cuToPo(\"${单元名称}\")'>相关污染源</button>"+
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
//        mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
        outFields: ["*"],
//        hasAttributionData:true
	 });
	
	
	
	//地名标注
    var labelSymbol = new TextSymbol().setColor(new Color("#000000"));
    labelSymbol.font.setSize("10pt");
    labelSymbol.font.setFamily("微软雅黑");
    var json = {
        "labelExpressionInfo": {"value": "{单元名称}"},
    };
    var labelClass = new LabelClass(json);
    labelClass.symbol = labelSymbol;
    featureLayer.setLabelingInfo([ labelClass ]);
    
	map.addLayer(featureLayer);
	
	
	
	 $.ajax({
		type : "POST",
		dataType : "json",
		async : false,
		url : "rest/controlunit/userForMap",
		success: function(data){
			var result = decodeURIComponent(data.result);
			//filterArcGISDynamicMapServiceLayer(result);
			//console.log(data.result);
			featureLayer.setDefinitionExpression(result);
			map.addLayer(featureLayer);
		}
	});
	 symbol = new SimpleFillSymbol(SimpleFillSymbol.STYLE_SOLID, 
			    new SimpleLineSymbol(SimpleLineSymbol.STYLE_SOLID,
			    new Color([0,0,0]), 1), new Color([255,0,0,0.5])
			  );
	 
	 featureLayer.on("click", function(evt){  
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
					template.setContent(
						"<button class='btn' type='button' onclick='cuToQmp(\"${单元名称}\")'>相关控制断面</button>"+
				        "<button class='btn' type='button' onclick='cuToPo(\"${单元名称}\")'>相关污染源</button>"+
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
					featureLayer.setInfoTemplate(template);
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
				var hash = {},result = [],title="";
				 if(myrole==1) title = "省级视图";		
				 else 
					 if(myrole==2) title = "市级视图";
				 else 
					 if(myrole=="admin") title = "管理员视图";
				 else 
					 title = "县级视图";
			     $("#citylisthead").append($("<a id='citylista'></a>").attr({class:"my-list-group-item-select"}).text(""+title));   
				 $("#citylista").attr({title:"此处为说明内容"}).tipso();
				 
				 for (var i = 0; i < citylist.length; i++){
					 if (!hash[citylist[i]]){
						 hash[citylist[i]] = true;
						 result.push(citylist[i].replace("市","").replace("县",""));
						 if(citylist[i]!=''){
						    $("#citylist").after($("<a title='点击查看' style='width:50%;display:inline-block;'></a>").attr({href:"#",class:"my-list-group-item"}).text(citylist[i]));   
						 }

					 } 
				 }	
				 $(document).off("click",".my-list-group-item").on("click",".my-list-group-item",function(){//
					var $tmp = $(this),city={};
					if(myrole==1||myrole=="admin") 
						ctname = {"involve_city":$(this).text()};
					else if(myrole==2||myrole==3) 
						ctname = {"involve_county":$(this).text()};
					
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
			                console.log(name);
							if(name==''){
								name = "单元名称=''";
							}
							filterArcGISDynamicMapServiceLayer(name);
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
		"KZDY" : value
	}; 
	$('#jumpTmp').val("").val(JSON.stringify(json)); 
	$.get("rest/page/newPollSource", function(data) {
		$('#index-page-title').text("污染源管理");
		$('#main-content').html(data);
		$('#listAll').empty();
		$("#map").toggle();
		$.ajax({
			type : "POST",
			dataType : "html",
			async : true,
			url : "rest/psrc/search",
			data :json,
			success : function(data) {
				setTimeout(function () {
					$('#listAll').html(data);
					$.ajax({
						type : "POST",
						async : true,
						url : "rest/psrc/searchAllPsrc",
						data : json,
						success : function(data) {
							
							updatePsrcInMap(data,0);
							$("#map").toggle();
						}
					});
				},1000);
			}
		});
	});
}





$('#map').css({
    'height': '500px',
    'width': '100%'
});
