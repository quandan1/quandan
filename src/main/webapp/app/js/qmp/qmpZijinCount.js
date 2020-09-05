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
initMap();
// initList()
var map, layer, graphicLayer, graphic, featureLayer;
var myrole = $("#myRole").val();
/*var html = "";
//html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";
html += "<table border='0' class='tableBasic'>";
html += "<tr><td>序号</td><td>${id}</td></tr>";
html += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";
html += "<tr><td>流域名称</td><td>${watershed}</td></tr>";
html += "<tr><td>所在河流</td><td>${riverName}</td></tr>";
html += "<tr><td>所属省份</td><td>${locProvince}</td></tr>";
html += "<tr><td>所属地市</td><td>${locCity}</td></tr>";
html += "<tr><td>所属区县</td><td>${locCounty}</td></tr>";
html += "<tr><td>河流级别/湖库属性</td><td>${riverLevel}</td></tr>";
html += "<tr><td>汇入河流（湖库、海洋）</td><td>${riverTo}</td></tr>";
html += "<tr><td>断面属性</td><td>${sectionProperty}</td></tr>";
html += "<tr><td>测站名称</td><td>${testBy}</td></tr>";
html += "<tr><td>断面级别</td><td>${sectionLevel}</td></tr>";
html += "<tr><td>断面类型</td><td>${sectionType}</td></tr>";
html += "<tr><td>是否在城市建成区</td><td>${isUrban}</td></tr>";
html += "<tr><td>现有/拟增设</td><td>${isAddition}</td></tr>";
html += "<tr><td>监测频次</td><td>${testFrequency}</td></tr>";
html += "<tr><td>监测项目</td><td>${testItems}</td></tr>";
html += "<tr><td>功能区水质目标</td><td>${qualityTarget}</td></tr>";
html += "</table><br/>";
html += "<table border='0' class='tableBasic'>";
html += "总量计算：请选择下面要计算的属性";
html += "<tr><td><select name='prop' id='prop' onchange='cal($(\"#prop\").val(),\"${sectionName}\")'>";
html += "<option value='HXXYLCSL_D'>化学需氧量产生量（吨）</option>";
html += "<option value='HXXYLPFL_D'>化学需氧量排放量（吨）</option>";
html += "<option value='ADCSL_D'>氨氮产生量（吨）</option>";
html += "<option value='ADPFL_D'>氨氮排放量（吨）</option>";
html += "<option value='SYLCSL_D'>石油量产生量（吨）</option>";
html += "<option value='SYLPFL_D'>石油量排放量（吨）</option>";
html += "<option value='GYFSPFL_D'>工业废水排放量（吨）</option>";
html += "<option value='HFFPFL_QK'>挥发酚排放量（千克）</option>";
html += "<option value='QHWPFL_QK'>氰化物排放量（千克）</option>";
html += "<option value='FSSPFL_QK'>废水砷排放量（千克）</option>";
html += "<option value='FSQPFL_QK'>废水铅排放量（千克）</option>";
html += "<option value='FSGPFL_QK'>废水镉排放量（千克）</option>";
html += "<option value='FSGPFL_QK_DUP1'>废水汞排放量（千克）</option>";
html += "<option value='FSZGPFL_QK'>废水总铬排放量（千克）</option>";
html += "<option value='FSLJGPFL_QK'>废水六价铬排放量（千克）</option>";
html += "</select>";
html += "</td><td><span id='count'>0</span></td></tr>";
html += "</table>";*/
var html = "";
//html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
//html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";
html += "<table border='0' class='tableBasic'>";
html += "<tr><td>序号</td><td>${id}</td></tr>";
html += "<tr><td>断面级别</td><td>${sectionLevel}</td></tr>";
html += "<tr><td>原考核108</td><td>${ykh108}</td></tr>";
html += "<tr><td>河流水质90</td><td>${hlsz90}</td></tr>";
html += "<tr><td>原序号</td><td>${originalId}</td></tr>";
html += "<tr><td>所属省份</td><td>${locProvince}</td></tr>";
html += "<tr><td>所属地市</td><td>${locCity}</td></tr>";
html += "<tr><td>所属区县</td><td>${locDistrictl}</td></tr>";
html += "<tr><td>测站名称</td><td>${czName}</td></tr>";
html += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";
html += "<tr><td>所属流域</td><td>${basin}</td></tr>";
html += "<tr><td>所属河流</td><td>${riverName}</td></tr>";
html += "<tr><td>断面属性</td><td>${sectionSx}</td></tr>";
html += "<tr><td>河流级别</td><td>${riverLevel}</td></tr>";
html += "<tr><td>受控水库</td><td>${sksk}</td></tr>";
html += "</table><br/>";

var html2 = "";
//html2 += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
html2 += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";
html2 += "<table border='0' class='tableBasic'>";
html2 += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";
html2 += "<tr><td>流域名称</td><td>${basin}</td></tr>";
html2 += "<tr><td>所在河流</td><td>${riverName}</td></tr>";
html2 += "<tr><td>所属省份</td><td>${locProvince}</td></tr>";
html2 += "<tr><td>测站名称</td><td>${testBy}</td></tr>";
html2 += "<tr><td>氨氮</td><td>${ad}</td></tr>";
html2 += "<tr><td>氨氮标准</td><td>${adStd}</td></tr>";
html2 += "<tr><td>化学需氧量</td><td>${hxxyl}</td></tr>";
html2 += "<tr><td>化学需氧量标准</td><td>${hxxylStd}</td></tr>";
html2 += "<tr><td>总氮</td><td>${zd}</td></tr>";
html2 += "<tr><td>总氮标准</td><td>${zdStd}</td></tr>";
html2 += "<tr><td>总磷</td><td>${zl}</td></tr>";
html2 += "<tr><td>总磷标准</td><td>${zlStd}</td></tr>";
html2 += "</table><br/>";

function initList() {
  var username = $('.username').text();
  var json = {
    "username": username
  };
  $('#jsonInput').val(JSON.stringify(json));
  $.ajax({
    type: "POST",
    dataType: "html",
    async: false,
    url: "rest/qmpa/searchw",
    data: json,
    success: function (data) {
      $('#listAll').html(data);
    }
  });

}

function initMap() {
  require([
    "esri/map",
    "esri/layers/ArcGISDynamicMapServiceLayer",
    "esri/geometry/Point", "esri/SpatialReference",
    "esri/symbols/PictureMarkerSymbol",
    "esri/graphic",
    "esri/geometry/Extent",
    "esri/InfoTemplate",
    "esri/layers/FeatureLayer",
    "esri/symbols/TextSymbol",
    "esri/layers/LabelClass",
    "dojo/dom","dojo/on","dojo/query",
    "esri/symbols/SimpleMarkerSymbol",
    "esri/symbols/SimpleLineSymbol",
    "esri/symbols/SimpleFillSymbol",
    "esri/toolbars/draw",
    "esri/tasks/PrintTask",
    "esri/tasks/PrintTemplate",
    "esri/tasks/PrintParameters",
    "dojo/colors",
    "dojo/domReady!",
    "esri/dijit/Scalebar",
    "dojo/_base/array",
    "dojo/parser",
    "esri/dijit/Legend",
    "dijit/layout/BorderContainer", "dijit/layout/ContentPane",
    "dijit/layout/AccordionContainer"
  ], function (Map,
               ArcGISDynamicMapServiceLayer,
               Point,
               SpatialReference,
               PictureMarkerSymbol,
               Graphic,
               Extent,
               InfoTemplate,
               FeatureLayer,
               TextSymbol,
               LabelClass,
               dom,on,query,
               SimpleMarkerSymbol,
               SimpleLineSymbol,
               SimpleFillSymbol,
               Draw,PrintTask,PrintTemplate,PrintParameters,
               Color,
               Scalebar,
               arrayUtils,
               parser,
               Legend) {
    var extent = new Extent(117.309229, 39.137731, 129.957720, 43.380153);
    map = new Map("map", {
      "spatialReference": {
        "wkid": 4326
      },
      logo: false,
      extent: extent,
      showLabels: true,
      zoom: 12,
      maxZoom: 16
    });

    var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/14";
    featureLayer = new esri.layers.FeatureLayer(layerUrl, {
      mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
      outFields: ["*"],
      hasAttributionData: true
    });
    map.addLayer(featureLayer);
    $.ajax({
      type: "POST",
      dataType: "json",
      async: false,
      url: "rest/controlunit/userForMap",
      success: function (data) {
        var result = decodeURIComponent(data.result);
        //filterArcGISDynamicMapServiceLayer(result);
        featureLayer.setDefinitionExpression(result);
        map.addLayer(featureLayer);
      }
    });

    layer = new ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer");
    layer.setVisibleLayers([0 , 11, 13, 14, 16, 22]);
    map.addLayer(layer);
    graphicLayer = new esri.layers.GraphicsLayer();
    map.addLayer(graphicLayer);
    var lon = "";
    var lat = "";
    var attr = "";
    var username = $('.username').text();

    //判断用户所代表的城市
    $.ajax({
      type: "POST",
      url: "rest/qmp/getInitialExtent",
      data: {
        "username": username
      },
      success: function (res) {
        if (res !== '') {
          var result = res.split(",");
          var extent = new Extent(parseFloat(result[0]), parseFloat(result[1]), parseFloat(result[2]), parseFloat(result[3]));
          map.setExtent(extent)
        }
      }
    });

      //添加比例尺
      // alert("aaa");
      var scalebar=new esri.dijit.Scalebar({map:map,scalebarUnit:"dual"});

    var citylist = "";
    // $.ajax({
    //     type: "POST",
    //     url: "rest/qmp/searchAllQmp",
    //     data: {
    //         "username": username
    //     },
    //     success: function (allData) {
    //         for (var i = 0; i < allData.length; i++) {
    //             if (myrole == 1 || myrole == "admin") citylist += allData[i].locCity + "、";
    //             else if (myrole == 2 || myrole == 3) citylist += allData[i].locCounty + "、";
    //             //else if(myrole==3) citylist.push(allData[i].locCounty);
    //             //if($(myrole==3)citylist.push(allData[i].locCity);
    //             lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
    //             lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;
    //             attr = {
    //                 "id": allData[i].id,
    //                 "watershed": allData[i].watershed,
    //                 "riverName": allData[i].riverName,
    //                 "riverLevel": allData[i].riverLevel,
    //                 "riverTo": allData[i].riverTo,
    //                 "sectionName": allData[i].sectionName,
    //                 "sectionProperty": allData[i].sectionProperty,
    //                 "locProvince": allData[i].locProvince,
    //                 "locCity": allData[i].locCity,
    //                 "locCounty": allData[i].locCounty,
    //                 "testBy": allData[i].testBy,
    //                 "sectionLevel": allData[i].sectionLevel,
    //                 "sectionType": allData[i].sectionType,
    //                 "isUrban": allData[i].isUrban,
    //                 "isAddition": allData[i].isAddition,
    //                 "testFrequency": allData[i].testFrequency,
    //                 "testItems": allData[i].testItems,
    //                 "qualityTarget": allData[i].qualityTarget
    //             };
    //             var point = new Point(lon, lat, map.spatialReference);
    //             var infoTemplate = new InfoTemplate("控制断面信息", html);
    //             var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
    //             graphic = new Graphic(point, symbol1, attr, infoTemplate);
    //             graphicLayer.add(graphic);
    //         }
    //         $('#city').val(citylist);
    //         list_city(citylist);
    //     }
    // });

  });
}

var num = 0;

function cal(prop, kzdm) {
  num = num + 1;
  $.ajax({
    type: "POST",
    dataType: "json",
    async: false,
    url: "rest/qmp/compute",
    data: {
      kzdm: kzdm,
      prop: prop
    },
    success: function (data) {
      $('#count').text(data);
    }
  });
}


function list_city(citylist) {
  var oplist = [];
  oplist = citylist.split("、");

  var hash = {}, result = [], title = "";
  var mark = "";
  if (myrole == 1) {
    title = "所辖市断面";
    mark = "市"
  }
  else if (myrole == 2) {
    title = "所辖县/区断面";
    mark = "县"
  }
  else if (myrole == "admin") {
    title = "所辖市断面";
    mark = "市"
  }
  else {
    title = "所辖县/区断面";
    mark = "县"
  }
  // $("#citylisthead").append($("<a id='citylista'></a>").attr({class: "my-list-group-item-select"}).text("" + title));
  $("#citylisthead").append($("<a style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'></a>").text("" + title));

  for (var i = 0; i < oplist.length; i++) {
    if (!(hash[oplist[i]] || oplist[i] == "")) {
      hash[oplist[i]] = true;
      result.push(oplist[i].replace("市", "").replace("县", ""));
      var value_a = oplist[i];
      if (value_a.charAt(value_a.length - 1) == "市") {
        value_a = value_a.replace("市", "");
      }
      if (value_a.charAt(value_a.length - 1) == "县") {
        value_a = value_a.replace("县", "");
      }
      value_a += mark;
      // $("#citylist").after("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='width:50%;display:inline-block;'>" + value_a + "</a>");
      $("#citylist").append("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='width:50%;display:inline-block;background-color:#F3F3F3;'>" + value_a + "</a>");


    }
  }
  $(document).off("click", ".my-list-group-item").on("click", ".my-list-group-item", function () {//

    var $tmp = $(this), city = {};

    if (myrole == 1 || myrole == "admin") {
      ctname = {"loc_city": $tmp.attr('value')};
      ctname2 = {"involve_city": $(this).text()};
    }
    else if (myrole == 2 || myrole == 3) {
      ctname = {"loc_county": $tmp.attr('value')};
      ctname2 = {"involve_county": $(this).text()};
    }
    $('#jsonInput').val("").val(JSON.stringify(ctname));
    $('#jsonInput2').val("").val(JSON.stringify(ctname2));
    $('#jumpTmp').val("");

    $.ajax({
      type: "POST",
      async: true,
      url: "rest/qmp/searchAllQmp",
      data: ctname,
      success: function (data) {
        $tmp.addClass("my-list-group-item-hlight").siblings().removeClass("my-list-group-item-hlight").end();
        updateQmpInMap(data);

        $.ajax({
          type: "POST",
          dataType: "html",
          async: false,
          url: "rest/qmp/search",
          data: ctname,
          success: function (data) {
            $('#listAll').html(data);
          }
        });
        switch ($tmp.text()) {
          case '鞍山市':
            var extent = new esri.geometry.Extent(extents.anshan[0], extents.anshan[1], extents.anshan[2], extents.anshan[3]);
            map.setExtent(extent);
            break;
          case '辽阳市':
            var extent = new esri.geometry.Extent(extents.liaoyang[0], extents.liaoyang[1], extents.liaoyang[2], extents.liaoyang[3]);
            map.setExtent(extent);
            break;
          case '阜新市':
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

    //点击区域显示
    $.ajax({
      type: "POST",
      async: true,
      url: "rest/controlunit/search",
      data: ctname2,
      success: function (data) {
        $('#listAll2').html(data);
        var name = $("div#listAll2 #nameForMap").val();
        if (name == '') {
          name = "单元名称=''";
        }
        filterArcGISDynamicMapServiceLayer(name);
      }
    });
  });
}

function filterArcGISDynamicMapServiceLayer(value) {
  featureLayer.setDefinitionExpression(value);//开始过滤
  map.addLayer(featureLayer);
}


var elder;
$(document).off("click", "tr[id^='qmpx']").on({
  click: function () {

    $(this).addClass("hlight").siblings().removeClass("hlight").end();
    var lon = parseFloat($("#qmpjd" + this.id.substr(4)).val());
    var lat = parseFloat($("#qmpwd" + this.id.substr(4)).val());
    var infodata = {};
    var qmpname = ["sectionName", "sectionBymc","watershed", "riverName", "riverLevel", "riverTo", "sectionProperty", "locCity", "locCounty",
      "testBy", "sectionLevel", "sectionType", "isUrban", "isAddition", "testFrequency", "testItems", "qualityTarget","sectionShhl"];
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

      html = "";
      html += "<button type='button' class='btn' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关控制单元</button>";
      html += "<button type='button' class='btn' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>相关污染源</button>";
      html += "<table border='0' class='tableBasic'>";
      html += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";

      html += "<tr><td>所属控制单元名称</td><td>${sectionBymc}</td></tr>";

      html += "<tr><td>流域名称</td><td>${watershed}</td></tr>";
      html += "<tr><td>所在河流</td><td>${riverName}</td></tr>";
      html += "<tr><td>所属地市</td><td>${locCity}</td></tr>";
      html += "<tr><td>所属区县</td><td>${locCounty}</td></tr>";
      html += "<tr><td>河流级别/湖库属性</td><td>${riverLevel}</td></tr>";
      html += "<tr><td>汇入河流（湖库、海洋）</td><td>${riverTo}</td></tr>";
      html += "<tr><td>断面属性</td><td>${sectionProperty}</td></tr>";
      html += "<tr><td>测站名称</td><td>${testBy}</td></tr>";
      html += "<tr><td>断面级别</td><td>${sectionLevel}</td></tr>";
      html += "<tr><td>断面类型</td><td>${sectionType}</td></tr>";
      html += "<tr><td>是否在城市建成区</td><td>${isUrban}</td></tr>";
      html += "<tr><td>现有/拟增设</td><td>${isAddition}</td></tr>";
      html += "<tr><td>监测频次</td><td>${testFrequency}</td></tr>";
      html += "<tr><td>监测项目</td><td>${testItems}</td></tr>";
      html += "<tr><td>功能区水质目标</td><td>${qualityTarget}</td></tr>";
      html += "<tr><td>收纳河流</td><td>${sectionShhl}</td></tr>";
      html += "</table><br/>";
      html += "<table border='0' class='tableBasic'>";
      html += "总量计算：请选择下面要计算的属性";
      html += "<tr><td><select name='prop' id='prop' onchange='cal($(\"#prop\").val(),\"${sectionName}\")'>";
      html += "<option value='HXXYLCSL_D'>化学需氧量产生量（吨）</option>";
      html += "<option value='HXXYLPFL_D'>化学需氧量排放量（吨）</option>";
      html += "<option value='ADCSL_D'>氨氮产生量（吨）</option>";
      html += "<option value='ADPFL_D'>氨氮排放量（吨）</option>";
      html += "<option value='SYLCSL_D'>石油量产生量（吨）</option>";
      html += "<option value='SYLPFL_D'>石油量排放量（吨）</option>";
      html += "<option value='GYFSPFL_D'>工业废水排放量（吨）</option>";
      html += "<option value='HFFPFL_QK'>挥发酚排放量（千克）</option>";
      html += "<option value='QHWPFL_QK'>氰化物排放量（千克）</option>";
      html += "<option value='FSSPFL_QK'>废水砷排放量（千克）</option>";
      html += "<option value='FSQPFL_QK'>废水铅排放量（千克）</option>";
      html += "<option value='FSGPFL_QK'>废水镉排放量（千克）</option>";
      html += "<option value='FSGPFL_QK_DUP1'>废水汞排放量（千克）</option>";
      html += "<option value='FSZGPFL_QK'>废水总铬排放量（千克）</option>";
      html += "<option value='FSLJGPFL_QK'>废水六价铬排放量（千克）</option>";
      html += "</select>";
      html += "</td><td><span id='count'>0</span></td></tr>";
      html += "</table>";


      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html);
      var symbol1 = new PictureMarkerSymbol("app/img/qmp4rep.png", 10, 10);
      //var simpleMarkerSymbol = new SimpleMarkerSymbol();
      graphic = new Graphic(point, symbol1, infodata, infoTemplate);
      //var graphic1 = new Graphic();
      graphicLayer.remove(elder);
      graphicLayer.add(graphic);
      elder = graphic;
//					graphicLayer.on("click", function(){
//						setTimeout(function(){
//							movePopUp();
//							$("#xgCu").attr({title:"点击按钮查看此控制断面相关联的控制单元信息"}).tipso();
//							$("#xgPo").attr({title:"点击按钮查看此控制断面相关联的污染源信息"}).tipso();
//						}, 500);
//					});
    });
    //alert(abc.locLatD);
  }
}, "tr[id^='qmpx']");

function updateQmpInMap(allData) {
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
    graphicLayer.clear();
    for (var i = 0; i < allData.length; i++) {
      lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
      lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;

      attr = {
        "id": allData[i].id,
        "watershed": allData[i].watershed,
        "riverName": allData[i].riverName,
        "riverLevel": allData[i].riverLevel,
        "riverTo": allData[i].riverTo,
        "sectionName": allData[i].sectionName,
        "sectionProperty": allData[i].sectionProperty,
        "locProvince": allData[i].locProvince,
        "locCity": allData[i].locCity,
        "locCounty": allData[i].locCounty,
        "testBy": allData[i].testBy,
        "sectionLevel": allData[i].sectionLevel,
        "sectionType": allData[i].sectionType,
        "isUrban": allData[i].isUrban,
        "isAddition": allData[i].isAddition,
        "testFrequency": allData[i].testFrequency,
        "testItems": allData[i].testItems,
        "qualityTarget": allData[i].qualityTarget,

        "sectionBymc": allData[i].sectionBymc,
        "sectionShhl": allData[i].sectionShhl

      };
      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html);
      var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
      graphic = new Graphic(point, symbol1, attr, infoTemplate);
      graphicLayer.add(graphic);
//			graphicLayer.on("click", function(){
//				setTimeout(function(){
//					movePopUp();
//					$("#xgCu").attr({title:"点击按钮查看此控制断面相关联的控制单元信息"}).tipso();
//					$("#xgPo").attr({title:"点击按钮查看此控制断面相关联的污染源信息"}).tipso();
//				}, 500);
//			});
    }
  });
}


$('#map').css({
  'height': 'auto',
  'width': '100%'
});

$('#addButton').click(function () {
  var url = "rest/page/addQmp";
  $.get(url, function (data) {
    $('#addDiv').html(data);
  });
});

$('#addQmp').click(function () {
  $.ajax({
    type: "POST",
    async: false,
    url: "rest/qmp/insert",
    data: $('#insertForm').serialize(),
  });

  var url = "rest/qmp/list";
  $.get(url, function (data) {
    $('#main-content').html(data);
  });
});

$('#cal_dmbczj').click(function () {
  $('#myModal').modal({
    backdrop: 'static',
    show: true,
    keyboard: false
  });
  var qysx = $('#qysx').val();//区域筛选
  var nf = $('#nf').val();//年份
  var start_month = $('#start_month').val();//开始月份
  var end_month = $('#end_month').val();//结束月份
  //var section_level = $('#section_level').val();//类别
  var szlb_data;
  if (Number(end_month) < Number(start_month)) {
    alert("结束月份小于开始月份")
  }
  // alert(qysx);
  // alert(nf);
  var json_data = {
    "qysx": qysx,
    "nf": nf,
    "start_month": start_month,
    "end_month": end_month,
    //"section_level": section_level
  };
  var dmbczj_data;

  $.ajax({
    type: "POST",
    // dataType: "json",
    async: true,
    url: "rest/qmp/dmbczj",
    data: json_data,
    success: function (data) {
      // alert("success");
      //console.log(data);
        $("#exportnf").val(nf),
        $("#exportsm").val(start_month),
        $("#exportem").val(end_month),
        $("#exportreg").val(qysx),
        $("#exportToExcel").show(),
        $("#exportToExcel_kj").show(),
        $("#exportToExcel_hj").show(),
        $.ajax({
            type: "POST",
            async: true,
            //dataType:"json",
            url: "rest/qmp/filter",
            //data:data,
            success: function (szlb_temp) {
                szlb_data = szlb_temp;
                //alert("aaa");
                $.ajax({
                    type: "POST",
                    url: "rest/qmp/searchQmpBaseInfo",
                    success: function (allData) {
                        //console.log("aaa");
                        //console.log(szlb_data);
                        //console.log(allData);
                        updateSzxzByAll(allData, szlb_data, data.start_month, data.end_month, data.region);
                    }
                });

            }
        });
        $.ajax({
            type: "POST",
            async: true,
            //dataType:"json",
            url: "rest/qmp/filter",
            //data:data,
            success: function (szlb_temp) {
                szlb_data = szlb_temp;
                //alert("aaa");
                $.ajax({
                    type: "POST",
                    url: "rest/qmp/searchQmpBaseInfo",
                    success: function (allData) {
                        //console.log("aaa");
                        //console.log(szlb_data);
                        //console.log(allData);
                        updateSzxzByAll(allData, szlb_data, data.start_month, data.end_month, data.region);
                    }
                });

            }
        });
        $('#myModal').modal("hide"),
        $("#listAll").html(data)
    },
  });
  var data = {
    "region": json_data.qysx,
    "year": json_data.nf,
    "start_m": json_data.start_month,
    "end_m": json_data.end_month,
    //"section_l":json_data.section_level
  };
  /*var temp_region = json_data.qysx;
  var temp_year = json_data.nf;
  var temp_startm = json_data.start_month;
  var temp_endm = json_data.end_month;*/

/*  $.ajax({
    type: "POST",
    async: true,
    //dataType:"json",
    url: "rest/qmp/filter",
    //data:data,
    success: function (szlb_temp) {
      szlb_data = szlb_temp;
      //alert("aaa");
      $.ajax({
        type: "POST",
        url: "rest/qmp/searchQmpBaseInfo",
        success: function (allData) {
          //console.log("aaa");
          //console.log(szlb_data);
          //console.log(allData);
          updateSzxzByAll(allData, szlb_data, data.start_month, data.end_month, data.region);
        }
      });

    }
  });
  $.ajax({
    type: "POST",
    async: true,
    //dataType:"json",
    url: "rest/qmp/filter",
    //data:data,
    success: function (szlb_temp) {
      szlb_data = szlb_temp;
      //alert("aaa");
      $.ajax({
        type: "POST",
        url: "rest/qmp/searchQmpBaseInfo",
        success: function (allData) {
          //console.log("aaa");
          //console.log(szlb_data);
          //console.log(allData);
          updateSzxzByAll(allData, szlb_data, data.start_month, data.end_month, data.region);
        }
      });

    }
  });*/

  // alert("end");

});

// $("#export_dmbczj").click(function () {
//
//
//
// })
$("#click_bczjdm").click(function () {
  $('#myModal2').modal({
    backdrop: 'static',
    show: true
  });
  $.ajax({
    type: "POST",
    dataType: "json",
    async: true,
    url: "rest/qmp/getNotZjbcDm",
    success: function (data) {
      var html="";
      for (var i = 0; i < data.length; i++) {
        html+="<option value='"+data[i]+"'>"+data[i]+"</option>"
      }
      $("#select1").html(html)
    }
  });
  $.ajax({
    type: "POST",
    dataType: "json",
    async: true,
    url: "rest/qmp/getZjbcDm",
    success: function (data) {
      var html="";
      for (var i = 0; i < data.length; i++) {
        html+="<option value='"+data[i]+"'>"+data[i]+"</option>"
      }
      $("#select2").html(html)
    }
  });
});

$("#save_change").click(function () {
  var dms = $("#select2").find("option");
  var data = new Array();
  for (var i = 0; i <dms.length; i++) {
    data[i]=dms[i].innerText;
  }
  console.log(data)
  $.ajax({
    type: "POST",
    url: "rest/qmp/updateZjbcDm",
    async:true,
    data:{
      "dms":data.toString()
    },
    success: function () {

    }
  });
});

function updateSzxzByAll(allData, szlb_data, start_m, end_m, region) {
  // alert("aaaaa");
  // console.log(allData);
  // console.log(szlb_data);
  // console.log(szlb_data[0]);
  require([
    "esri/geometry/Point",
    "esri/symbols/SimpleMarkerSymbol",
    "esri/symbols/PictureMarkerSymbol",
    "esri/graphic",
    "esri/InfoTemplate",
    "esri/symbols/TextSymbol"
  ], function (Point,
               SimpleMarkerSymbol,
               PictureMarkerSymbol,
               Graphic,
               InfoTemplate,
               TextSymbol) {
    var lon = "";
    var lat = "";
    var attr = "";
    graphicLayer.clear();
    for (var i = 0; i < allData.length; i++) {
      lon = allData[i].longitude;
      lat = allData[i].latitude;
      //console.log(allData);
      attr = {
        "id": allData[i].id,
        "sectionLevel": allData[i].sectionLevel,
        "ykh108": allData[i].ykh108,
        "hlsz90": allData[i].hlsz90,
        "originalId": allData[i].originalId,
        "locProvince": allData[i].locProvince,
        "locCity": allData[i].locCity,
        "locDistrict": allData[i].locDistrict,
        "czName": allData[i].czName,
        "sectionName": allData[i].sectionName,
        "basin": allData[i].basin,
        "riverName": allData[i].riverName,
        "sectionSx": allData[i].sectionSx,
        "riverLevel": allData[i].riverLevel,
        "sksk": allData[i].sksk
      };
      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html);
      var symbol2;
      var textbol;
      var current_level;
      var graphic1;
      for (var j = 0; j < szlb_data.length; j++) {
        // console.log(szlb_data[j].section_name.toString() == allData[i].sectionName.toString());
        if (szlb_data[j].section_name.toString() === allData[i].sectionName.toString()) {
          //console.log("aaaaaa");
          var level = 7;
          var m;
          //console.log(szlb_data);
          console.log(szlb_data[j].szlb);

          //console.log(szlb_data[j].m);
          if (szlb_data[j].szlb == "Ⅰ") {
            current_level = 1;
          } else if (szlb_data[j].szlb == "Ⅱ") {
            current_level = 2;
          } else if (szlb_data[j].szlb == "Ⅲ") {
            current_level = 3;
          } else if (szlb_data[j].szlb == "Ⅳ") {
            current_level = 4;
          } else if (szlb_data[j].szlb == "Ⅴ") {
            current_level = 5;
          } else if (szlb_data[j].szlb == "劣Ⅴ" || szlb_data[j].szlb == "劣Ⅴ（氨氮5）") {
            current_level = 6;
          } else {
            current_level = 7;
          }
          if (current_level < level) {
            level = current_level;
          }

          if (level == 1) {
            symbol2 = new PictureMarkerSymbol("app/img/dmcategory1_new.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);

          } else if (level == 2) {
            symbol2 = new PictureMarkerSymbol("app/img/dmcategory2.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);

          } else if (level == 3) {
            symbol2 = new PictureMarkerSymbol("app/img/dmcategory3.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);

          } else if (level == 4) {
            symbol2 = new PictureMarkerSymbol("app/img/dmcategory4_new.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);

          } else if (level == 5) {
            symbol2 = new PictureMarkerSymbol("app/img/dmcategory5.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);

          } else if (level == 6) {
            textbol = new TextSymbol(allData.sectionName);
            textbol.setOffset(-10, 18);
            graphic1 = new Graphic(point, textbol);
            symbol2 = new PictureMarkerSymbol("app/img/dmcategoryL5.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr, infoTemplate);
          } else {
            /*textbol = new TextSymbol(allData.sectionName);
             textbol.setOffset(-10,18);
             graphic1 = new Graphic(point, textbol);*/
            symbol2 = new PictureMarkerSymbol("app/img/tt.png", 20, 20);
            graphic = new Graphic(point, symbol2, attr);
          }
        }
      }
      console.log(graphic1);
      graphicLayer.add(graphic);
      //graphicLayer.add(graphic1);
    }
  });
}


/**
 *
 * @param allData 从"rest/qmp/searchAllQmp"获取的数据
 * @param szsb_data 从"rest/qmp/szsb"获取的数据，每月的污染源数据
 * @param szsb_std 页面传过来的水质指标类型 id=szsb_std
 */
function updateQmpInMapWithSzsb(allData, szsb_data, szsb_std) {
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
    graphicLayer.clear();
    for (var i = 0; i < allData.length; i++) {
      lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
      lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;

      attr = {
        "id": allData[i].id,
        "watershed": allData[i].watershed,
        "riverName": allData[i].riverName,
        "riverLevel": allData[i].riverLevel,
        "riverTo": allData[i].riverTo,
        "sectionName": allData[i].sectionName,
        "sectionProperty": allData[i].sectionProperty,
        "locProvince": allData[i].locProvince,
        "locCity": allData[i].locCity,
        "locCounty": allData[i].locCounty,
        "testBy": allData[i].testBy,
        "sectionLevel": allData[i].sectionLevel,
        "sectionType": allData[i].sectionType,
        "isUrban": allData[i].isUrban,
        "isAddition": allData[i].isAddition,
        "testFrequency": allData[i].testFrequency,
        "testItems": allData[i].testItems,
        "qualityTarget": allData[i].qualityTarget,

        "sectionBymc": allData[i].sectionBymc,
        "sectionShhl": allData[i].sectionShhl

      };
      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html);
      var symbol2;
      for (var j = 0; j < szsb_data.length; j++) {
        if (szsb_data[j].sectionName === allData[i].sectionName) {
          if (szsb_std == "ad") {
            if ((szsb_data[j].ad != "-1") && (szsb_data[j].ad != "") && (szsb_data[j].adStd != "") && (szsb_data[j].ad != "-")) {
              //g代表全部匹配
              var szsb_real = szsb_data[j].ad.replace(/L/g, "");
              var szsb_standard = szsb_data[j].adStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/qmp1rep" +
                  ".png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "hxxyl") {
            if ((szsb_data[j].hxxyl != "-1") && (szsb_data[j].hxxyl != "") && (szsb_data[j].hxxylStd != "") && (szsb_data[j].hxxyl != "-")) {
              var szsb_real = szsb_data[j].hxxyl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].hxxylStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/qmp1rep.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zd") {
            if ((szsb_data[j].zd != "-1") && (szsb_data[j].zd != "") && (szsb_data[j].zdStd != "") && (szsb_data[j].zd != "-")) {
              var szsb_real = szsb_data[j].zd.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zdStd.replace(/≤/g, "");

              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/qmp1rep.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zl") {
            if ((szsb_data[j].zl != "-1") && (szsb_data[j].zl != "") && (szsb_data[j].zlStd != "") && (szsb_data[j].zl != "-")) {
              var szsb_real = szsb_data[j].zl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zlStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/qmp1rep.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          }
        }
      }
      graphicLayer.add(graphic);
    }
  });
}

/**
 *
 * @param allData 从"rest/qmp/searchAllQmp"获取的数据
 * @param szsb_data 从"rest/qmp/szsb"获取的数据，每月的污染源数据
 * @param szsb_std 页面传过来的水质指标类型 id=szsb_std
 */
function updateBadQmpInMapWithSzsb(allData, szsb_data, szsb_std) {
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
    graphicLayer.clear();
    for (var i = 0; i < allData.length; i++) {
      lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
      lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;

      attr = {
        "id": allData[i].id,
        "watershed": allData[i].watershed,
        "riverName": allData[i].riverName,
        "riverLevel": allData[i].riverLevel,
        "riverTo": allData[i].riverTo,
        "sectionName": allData[i].sectionName,
        "sectionProperty": allData[i].sectionProperty,
        "locProvince": allData[i].locProvince,
        "locCity": allData[i].locCity,
        "locCounty": allData[i].locCounty,
        "testBy": allData[i].testBy,
        "sectionLevel": allData[i].sectionLevel,
        "sectionType": allData[i].sectionType,
        "isUrban": allData[i].isUrban,
        "isAddition": allData[i].isAddition,
        "testFrequency": allData[i].testFrequency,
        "testItems": allData[i].testItems,
        "qualityTarget": allData[i].qualityTarget,

        "sectionBymc": allData[i].sectionBymc,
        "sectionShhl": allData[i].sectionShhl

      };
      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html2);
      var symbol2;
      for (var j = 0; j < szsb_data.length; j++) {//找到污染源中对应的断面
        //qmp_wrxx
        attr2 = {
          "sectionName": szsb_data[j].sectionName,
          "basin": szsb_data[j].basin,
          "riverName": szsb_data[j].riverName,
          "locProvince": szsb_data[j].locProvince,
          "testBy": szsb_data[j].testBy,
          "ad": szsb_data[j].ad,
          "adStd": szsb_data[j].adStd,
          "hxxyl": szsb_data[j].hxxyl,
          "hxxylStd": szsb_data[j].hxxylStd,
          "zd": szsb_data[j].zd,
          "zdStd": szsb_data[j].zdStd,
          "zl": szsb_data[j].zl,
          "zlStd": szsb_data[j].zlStd
        };
        if (szsb_data[j].sectionName == allData[i].sectionName) {
          if (szsb_std == "ad") {
            if ((szsb_data[j].ad != "-1") && (szsb_data[j].ad != "") && (szsb_data[j].adStd != "") && (szsb_data[j].ad != "-")) {
              //g代表全部匹配
              var szsb_real = szsb_data[j].ad.replace(/L/g, "");
              var szsb_standard = szsb_data[j].adStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr2, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "hxxyl") {
            if ((szsb_data[j].hxxyl != "-1") && (szsb_data[j].hxxyl != "") && (szsb_data[j].hxxylStd != "") && (szsb_data[j].hxxyl != "-")) {
              var szsb_real = szsb_data[j].hxxyl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].hxxylStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr2, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zd") {
            if ((szsb_data[j].zd != "-1") && (szsb_data[j].zd != "") && (szsb_data[j].zdStd != "") && (szsb_data[j].zd != "-")) {
              var szsb_real = szsb_data[j].zd.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zdStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr2, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zl") {
            if ((szsb_data[j].zl != "-1") && (szsb_data[j].zl != "") && (szsb_data[j].zlStd != "") && (szsb_data[j].zl != "-")) {
              var szsb_real = szsb_data[j].zl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zlStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr2, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          }
        }
      }
      graphicLayer.add(graphic);
    }
  });
}

/**
 *
 * @param allData 从"rest/qmp/searchAllQmp"获取的数据
 * @param szsb_data 从"rest/qmp/szsb"获取的数据
 * @param szsb_std 页面传过来的水质指标类型 id=szsb_std
 */
function updateGoodQmpInMapWithSzsb(allData, szsb_data, szsb_std) {
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
    graphicLayer.clear();
    for (var i = 0; i < allData.length; i++) {
      lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
      lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;

      attr = {
        "id": allData[i].id,
        "watershed": allData[i].watershed,
        "riverName": allData[i].riverName,
        "riverLevel": allData[i].riverLevel,
        "riverTo": allData[i].riverTo,
        "sectionName": allData[i].sectionName,
        "sectionProperty": allData[i].sectionProperty,
        "locProvince": allData[i].locProvince,
        "locCity": allData[i].locCity,
        "locCounty": allData[i].locCounty,
        "testBy": allData[i].testBy,
        "sectionLevel": allData[i].sectionLevel,
        "sectionType": allData[i].sectionType,
        "isUrban": allData[i].isUrban,
        "isAddition": allData[i].isAddition,
        "testFrequency": allData[i].testFrequency,
        "testItems": allData[i].testItems,
        "qualityTarget": allData[i].qualityTarget,

        "sectionBymc": allData[i].sectionBymc,
        "sectionShhl": allData[i].sectionShhl

      };
      var point = new Point(lon, lat, map.spatialReference);
      var infoTemplate = new InfoTemplate("控制断面信息", html);
      var symbol2;
      for (var j = 0; j < szsb_data.length; j++) {
        if (szsb_data[j].sectionName == allData[i].sectionName) {
          if (szsb_std == "ad") {
            if ((szsb_data[j].ad != "-1") && (szsb_data[j].ad != "") && (szsb_data[j].adStd != "") && (szsb_data[j].ad != "-")) {
              //g代表全部匹配
              var szsb_real = szsb_data[j].ad.replace(/L/g, "");
              var szsb_standard = szsb_data[j].adStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "hxxyl") {
            if ((szsb_data[j].hxxyl != "-1") && (szsb_data[j].hxxyl != "") && (szsb_data[j].hxxylStd != "") && (szsb_data[j].hxxyl != "-")) {
              var szsb_real = szsb_data[j].hxxyl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].hxxylStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zd") {

            if ((szsb_data[j].zd != "-1") && (szsb_data[j].zd != "") && (szsb_data[j].zdStd != "") && (szsb_data[j].zd != "-")) {
              var szsb_real = szsb_data[j].zd.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zdStd.replace(/≤/g, "");

              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                console.log("达标断面名：", szsb_data[j].sectionName, ":", szsb_real, szsb_standard);
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                console.log("不达标断面名：", szsb_data[j].sectionName, ":", szsb_real, szsb_standard);
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          } else if (szsb_std == "zl") {
            if ((szsb_data[j].zl != "-1") && (szsb_data[j].zl != "") && (szsb_data[j].zlStd != "") && (szsb_data[j].zl != "-")) {
              var szsb_real = szsb_data[j].zl.replace(/L/g, "");
              var szsb_standard = szsb_data[j].zlStd.replace(/≤/g, "");
              if (parseFloat(szsb_real) <= parseFloat(szsb_standard)) {
                symbol2 = new PictureMarkerSymbol("app/img/qmp3rep.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
              } else {
                symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
                graphic = new Graphic(point, symbol2, attr, infoTemplate);
                // symbol2 = new PictureMarkerSymbol("app/img/qmp2rep.png", 10, 10);
                // graphic = new Graphic(point, symbol2, attr, infoTemplate);
              }
            } else {
              symbol2 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
              graphic = new Graphic(point, symbol2, attr, infoTemplate);
            }
          }
        }
      }
      graphicLayer.add(graphic);
    }
  });
}

$('#searchButton').click(function () {
  var url = "rest/page/searchQmp";
  $.get(url, function (data) {
    $('#searchDiv').html(data);
  });
});

function qmpToCu(qmp) {
  var jdata = {
    "include_section": qmp
  };
  $('#jumpTmp').val("").val(JSON.stringify(jdata));

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
      data: jdata,
      success: function (data) {
        $('#listAll').html(data);
        var name = $("#nameForMap").val();
        filterArcGISDynamicMapServiceLayer(name);
        $("#map").toggle();
      }
    });
  });
}

//function qmpToPo(qmp) {
//    var jdata = {
//        "KZDM": qmp
//    };
//
//    $('#jumpTmp').val("").val(JSON.stringify(jdata));
//
//
//    $.ajax({
//        type: "POST",
//        async: true,
//        url: "rest/page/newPollSource",
//        success: function (data) {
//            $('#index-page-title').text("污染源管理");
//            $('#main-content').html(data);
//            $('#tree').treeview({
//                multiSelect: false,
//                data: [{
//                    text: "直排点源",
//                    nodes: [{
//                        text: "直排企业",
//                        selectable: true,
//                        state: {
//                            checked: false,
//                            //	disabled: true,
//                            //	expanded: true,
//                            selected: false
//                        },
//                        //nodes : [{
//                        //	text : "达标",
//                        //}, {
//                        //	text : "不达标",
//                        //}]
//                    }, {
//                        text: "污水处理厂",
//                    }, {
//                        text: "规模化畜禽养殖",
//                    }]
//                }]
//            });
//            $('#listAll').empty();
//            $("#map").toggle();
//            $("#typeselec").html("<select class='form-control' style='margin-top:15px;margin-bottom: 10px;' id='selection'> <option>直排企业</option> <option>污水处理厂</option> <option>规模化畜禽养殖</option> </select>")
//            $("#selection").on("change", function () {
//                var type = $("#selection").val();
//                switch (type) {
//                    case '直排企业':
//                        $.ajax({//载入下方表格
//                            type: "POST",
//                            dataType: "html",
//                            async: true,
//                            url: "rest/psrc/search",
//                            data: {
//                                "KZDM": $("#KZDM").val()
//                            },
//                            success: function (data) {
//                                setTimeout(function () {
//                                    $('#listAll').html(data);
//                                }, 3000);
//                            }
//                        });
//                        break;
//                    case '污水处理厂':
//                        $.ajax({
//                            type: "POST",
//                            dataType: "html",
//                            async: true,
//                            url: "rest/pfty/search",
//                            data: {
//                                "KZDM": $("#KZDM").val()
//                            },
//                            success: function (data) {
//                                setTimeout(function () {
//                                    $('#listAll').html(data);
//                                }, 3000);
//                            }
//                        });
//                        break;
//                    case '规模化畜禽养殖':
//                        $.ajax({
//                            type: "POST",
//                            dataType: "html",
//                            async: true,
//                            url: "rest/pyz/search",
//                            data: {
//                                "KZDM": $("#KZDM").val()
//                            },
//                            success: function (data) {
//                                setTimeout(function () {
//                                    $('#listAll').html(data);
//                                }, 3000);
//                            }
//                        });
//                        break;
//                }
//            })
//            $("#KZDM").val(jdata.KZDM);
//
//            $.ajax({//载入下方表格
//                type: "POST",
//                dataType: "html",
//                async: true,
//                url: "rest/psrc/search",
//                data: jdata,
//                success: function (data) {
//
//                    setTimeout(function () {
//
//                        $('#listAll').html(data);
//
//                        $.ajax({//更新地图
//                            type: "POST",
//                            async: true,
//                            url: "rest/psrc/searchAllPsrc",
//                            data: jdata,
//                            success: function (data) {
//                                updatePsrcInMap(data, 0);
//                                $("#map").toggle();
//                            }
//                        });
//                    }, 3000);
//                }
//            });
//
//            $.ajax({
//                type: "POST",
//                dataType: "html",
//                async: true,
//                url: "rest/pfty/search",
//                data: jdata,
//                success: function (data) {
//
//                    setTimeout(function () {
//
//                        // $('#listAll').append(data);
//
//                        $.ajax({
//                            type: "POST",
//                            async: true,
//                            url: "rest/pfty/searchAllPfty",
//                            data: jdata,
//                            success: function (data) {
//                                updatePftyInMap(data, 0);
//                                // $("#map").show();
//                            }
//                        });
//                    }, 3000);
//                }
//            });
//
//            $.ajax({
//                type: "POST",
//                dataType: "html",
//                async: true,
//                url: "rest/pyz/search",
//                data: jdata,
//                success: function (data) {
//
//                    setTimeout(function () {
//
//                        // $('#listAll').append(data);
//
//                        $.ajax({
//                            type: "POST",
//                            async: true,
//                            url: "rest/pyz/searchAllPyz",
//                            data: jdata,
//                            success: function (data) {
//
//                                updatePyzInMap(data, 0);
//
//                                // $("#map").show();
//                            }
//                        });
//                    }, 3000);
//                }
//            });
//        }
//    });
//}

function qmpToPo(value) {

  var json = {
    "TAG": "KZDM",
    "KZDM": value
  };
  $('#jumpTmp').val("").val(JSON.stringify(json));
  $("#jumpOrNot").text("0");
  $.get("rest/page/newPollSource", function (data) {
    $('#index-page-title').text("污染源管理");
    $('#main-content').html(data);
    $('#listAll').empty();
    $("#map").toggle();
    complexlist = "";

    $.ajax({
      type: "POST",
      dataType: "html",
      async: true,
      url: "rest/psrc/search",
      data: json,
      success: function (data) {
        $("#jumpOrNot").text("1");
        $('#listAll').html(data);
        $.ajax({
          type: "POST",
          async: true,
          url: "rest/psrc/searchAllPsrc",
          data: json,
          success: function (data) {
            updatePsrcInMap(data, 0);
            list_city(complexlist);
            $("#map").toggle();
          }
        });
      }
    });
  });
}


$('#bulkImportButton').click(function () {
  var url = "rest/page/bulkImportQmp";
  $.get(url, function (data) {
    $('#bulkImportDiv').html(data);
  });
});

$(document).ready(function () {
  $.ajax({
    type: "GET",
    dataType: "json",
    async: true,
    url: "rest/user/getRegions",
    success: function (res) {
      for (var i = 0; i < res.length; i++) {
        $("#qysx").append("<option value='" + res[i] + "'>" + res[i] + "</option>")
      }
    }
  });
});
