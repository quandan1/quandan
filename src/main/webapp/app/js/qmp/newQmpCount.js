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
initList()


var map, layer, graphicLayer, graphic, featureLayer, PicMarkerSymbol, infotem, grap, poi, TexSymbol;
var myrole = $("#myRole").val();
var html = "";
var bigtmp;
var allDataGlobal;
var histogramgraph;


//html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";
html += "<table border='0' class='table-bordered table-striped'>";
html += "<tr><td>序号</td><td>${id}</td></tr>";
html += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";

html += "<tr><td>所属控制单元名称</td><td>${sectionBymc}</td></tr>";

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

html += "<tr><td>收纳河流</td><td>${sectionShhl}</td></tr>";

html += "</table><br/>";
html += "<table border='0' class='tableBasic'>";
html += "超标倍数：请选择下面要计算的属性";
html += "<tr><td><select name='prop_chaobiao' id='prop_chaobiao' onchange='cal_chaobiao($(\"#prop_chaobiao\").val(),\"${sectionName}\")'>";
html += "<option value='HXXYLCSL_D'>化学需氧量产生量（吨）</option>";
html += "<option value='HXXYLPFL_D'>化学需氧量排放量（吨）</option>";
html += "<option value='ADCSL_D'>氨氮产生量（吨）</option>";
html += "<option value='ADPFL_D'>氨氮排放量（吨）</option>";
html += "<option value='SYLCSL_D'>石油量产生量（吨）</option>";
html += "<option value='SYLPFL_D'>石油量排放量（吨）</option>";
//html += "<option value='GYFSPFL_D'>工业废水排放量（吨）</option>";
html += "<option value='HFFPFL_QK'>挥发酚排放量（千克）</option>";
html += "<option value='QHWPFL_QK'>氰化物排放量（千克）</option>";
html += "<option value='FSSPFL_QK'>废水砷排放量（千克）</option>";
html += "<option value='FSQPFL_QK'>废水铅排放量（千克）</option>";
html += "<option value='FSGPFL_QK'>废水镉排放量（千克）</option>";
html += "<option value='FSGPFL_QK_DUP1'>废水汞排放量（千克）</option>";
//html += "<option value='FSZGPFL_QK'>废水总铬排放量（千克）</option>";
html += "<option value='FSLJGPFL_QK'>废水六价铬排放量（千克）</option>";
html += "</select>";
html += "</td><td><b><span id='count_chaobiao'>0</span></b></td></tr>";
html += "</table>";
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
html += "</td><td><b><span id='count'>0</span></b></td></tr>";
html += "</table>";


function initList() {
    var username = $('.username').text();
    var json = {
        "username": username
        //"tjnf": "2014"
    };
    $('#jsonInput').val(JSON.stringify(json));
    if($('#jumpOrNot').text()=="1"){
        $.ajax({
            type: "POST",
            dataType: "html",
            async: false,
            url: "rest/qmp/searchQmpBaeInfo",
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
       // var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer/14";
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
        //layer = new ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer")
       layer.setVisibleLayers([0 ,11 ,13 ,14 ,16 ,22]);

       // layer.setVisibleLayers([2,3,4,5,11,12,13,14,15,16,17,18,19,20,21,22,29,30,31,33,34,35,36,37,38,39]);
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

function wait4globaldata() {
    // map.removeLayer(graphicLayer);
    graphicLayer.clear();
    for (var i = 0; i < allDataGlobal.length; i++) {
        attrs = {
            "id": allDataGlobal[i].id,
            "watershed": allDataGlobal[i].watershed,
            "riverName": allDataGlobal[i].riverName,
            "riverLevel": allDataGlobal[i].riverLevel,
            "riverTo": allDataGlobal[i].riverTo,
            "sectionName": allDataGlobal[i].sectionName,
            "sectionProperty": allDataGlobal[i].sectionProperty,
            "locProvince": allDataGlobal[i].locProvince,
            "locCity": allDataGlobal[i].locCity,
            "locCounty": allDataGlobal[i].locCounty,
            "testBy": allDataGlobal[i].testBy,
            "sectionLevel": allDataGlobal[i].sectionLevel,
            "sectionType": allDataGlobal[i].sectionType,
            "isUrban": allDataGlobal[i].isUrban,
            "isAddition": allDataGlobal[i].isAddition,
            "testFrequency": allDataGlobal[i].testFrequency,
            "testItems": allDataGlobal[i].testItems,
            "qualityTarget": allDataGlobal[i].qualityTarget,

            "sectionBymc": allData[i].sectionBymc,
            "sectionShhl": allData[i].sectionShhl
        };
        lon = allDataGlobal[i].longitude;
        lat = allDataGlobal[i].latitude;
        var point = new poi(lon, lat, map.spatialReference);
        var infoTemplate = new infotem("控制断面信息", html);
        var symbol1 = new PicMarkerSymbol("app/img/tt.png", 10, 10);
        graphic = new grap(point, symbol1, attrs, infoTemplate);
        graphicLayer.add(graphic);

    }
    var value = $("#count_source").val();
    chartHeight = 23;
    if (value == 0 || value == 1) {//化学需氧产生量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].longitude;
                    lat = allDataGlobal[i].latitude;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].HXXYLCSL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].HXXYLCSL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                        // graphicLayer.on("click",showDetailChart);
                    }
                    break;
                }
            }
        }
    } else if (value == 2) {//化学需氧排放量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    lon = allDataGlobal[i].longitude;
                    lat = allDataGlobal[i].latitude;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].HXXYLPFL_D % 80;
                    if (chartHeight !== 0) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].HXXYLPFL_D);
                        histogramsymbol3.setOffset(-10, 18);
                        histogramsymbol2.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }

    } else if (value == 3) {//氨氮产生量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].longitude;
                    lat = allDataGlobal[i].latitude;
                    var point = new poi(lon, lat, map.spatialReference);

                    chartHeight = polldata[k].ADCSL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].ADCSL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }
    } else {//氨氮排放量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].longitude;
                    lat = allDataGlobal[i].latitude;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].ADPFL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].ADPFL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }
    }

    // map.addLayer(graphicLayer);
}

$("#count_source").on("change", function () {
    var obj_1 = $('#currentplace').val();
    if (obj_1!==""&&obj_1!==null){
        obj_1 = JSON.parse(obj_1);
    }
    console.log(obj_1);
    $.ajax({
        type: "POST",
        async: true,
        url: "rest/qmp/searchAllQmp",
        data: obj_1,
        success: function (data) {
            allDataGlobal=data;
            // updateQmpInMap(data);//显示选择的市县点
            wait4globaldata();
        }
    });

});


function showDetailChart(evt) {
    var graphic = evt.graphic;
    console.log(graphic);
    graphic.symbol.url = "";
    graphicLayer.redraw();
    map.infoWindow.setTitle("<b>" + graphic + "</b>");
    var content = "<div style='text-align: center;'><img src=''/></div>";
    map.infoWindow.setContent(content);
    map.infoWindow.show(graphic.geometry);
    $(".maximize").hide();
    $(".close").click(function () {
        restoreChart(evt);
    });
};

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
            //alert("sss");
            $('#count').text(data);
        }
    });
}

var num1 = 0;

function cal_chaobiao(prop_chaobiao, kzdm) {
    num1 = num1 + 1;
    $.ajax({
        type: "POST",
        dataType: "json",
        async: false,
        url: "rest/qmp/compute_chaobiao",
        data: {
            kzdm: kzdm,
            prop_chaobiao: prop_chaobiao
        },
        success: function (data) {
            //alert(data);
            $('#count_chaobiao').text(data);
        }
    });
}

//------------------------------------- 省市县导航 ----------------------------------------//

function list_city(citylist) {
    var oplist = [];
    oplist = citylist.split("、");

    var hash = {}, title = "";
    var mark = "";
    if (myrole == 1) {
        $("#citylist").css("justify-content", "");
        title = "所辖市断面";
        mark = "市"
    }
    else if (myrole == 2) {
        title = "所辖县/区断面";
        mark = "县"
    }
    else if (myrole == "admin") {
        $("#citylist").css("justify-content", "");
        title = "所辖市断面";
        mark = "市"
    }
    else {
        title = "所辖县/区断面";
        mark = "县"
    }

    $("#citylisthead").append($("<a id='xxx1' style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'></a>").text("" + title));

    for (var i = 0; i < oplist.length; i++) {

        if (!(hash[oplist[i]] || oplist[i] == "")) {

            hash[oplist[i]] = true;
            var value_a = oplist[i];

            if (myrole == 1 || myrole == "admin") {

                $("#citylist").append("<select title='点击查看' href='#' name='op" + i + "' class='my-list-group-item' style='width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>"
                    + "<option style='display:none' selected>" + value_a + "</option>"
                    + "<option value='" + value_a + "'>" + value_a + "</option>"
                    + "</select>");

            } else {
                if (value_a.length > 6) {
                    var value_atmp = value_a.substring(0, 6) + "..";
                    $("#citylist").append("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='white-space: nowrap;overflow:hidden;width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>" + value_atmp + "</a>");
                } else {
                    $("#citylist").append("<a title='点击查看' href='#' class='my-list-group-item' value='" + oplist[i] + "' style='white-space: nowrap;overflow:hidden;width:50%;display:inline-block;background-color:#F3F3F3;text-align: center'>" + value_a + "</a>");
                }
            }
        }
    }

    //市县级视图，绑定点击事件
    if (myrole == 2 || myrole == 3) {

        $(document).off("click", ".my-list-group-item").on("click", ".my-list-group-item", function () {

            var $tmp = $(this), city = {};

            $tmp.css('background-color', '#CCFFFF').siblings().css('background-color', '#F3F3F3').end();

            ctname = {
                "loc_county": $tmp.attr('value'),
                "tjnf": $("#qmpmark").val()
            };
            ctname2 = {"involve_county": $tmp.attr('value')};

            afterclick(ctname, ctname2, $tmp.attr('value'));

        });

        //管理员和省级视图，绑定下拉框 Change事件
    } else {

        //自定义下拉框补全事件
        $(document).off("makeopts", ".my-list-group-item").on("makeopts", ".my-list-group-item", function () {//

            if ($(this).hasClass('on')) {

                return;
            }
            $(this).addClass("on");

            var CTname = $(this).val();
            var CTnb = this.name;

            $.ajax({
                type: "POST",
                async: true,
                url: "rest/qmp/getCity",
                data: {
                    "roleSign": 2,
                    "loc_city": CTname,
                    "tjnf": $("#qmpmark").val()
                },
                success: function (data) {
                    var TMP = eval("(" + data + ")");
                    var hsh = {};
                    hsh[CTname] = true;

                    $.each(TMP, function (i, item) {
                        var arrs = [];
                        arrs.push(item);

                        if (item.indexOf("、") != -1) {
                            arrs = [];
                            arrs = item.split("、");

                        }
                        $.each(arrs, function (k, ktem) {
                            if (!(hsh[ktem] || ktem == "")) {

                                hsh[ktem] = true;

                                $("select[name=" + CTnb + "]").append("<option value='" + ktem + "'>" + ktem + "</option>");
                                //console.log(ktem);
                            }
                        });
                    });
                }
            });
        });

        //整个页面加载完毕后，自动触发下拉框补全事件
        $(document).ready(function () {

            $("select[name^=op]").trigger('makeopts');

        });

        $(document).off("change", ".my-list-group-item").on("change", ".my-list-group-item", function () {//

            var selectFirst = $("select[name=" + this.name + "] option:first").attr("value");//下拉列表第一个的值，市名
            var $tmp = $(this), city = {};
            var patt = new RegExp("[县区]$")

            if (bigtmp != null && this.name != bigtmp[1]) {
                $("select[name=" + bigtmp[1] + "]").val(bigtmp[0]);
            }
            bigtmp = [selectFirst, this.name];

            $tmp.css('background-color', '#CCFFFF').siblings().css('background-color', '#F3F3F3').end();

            ctname = {"loc_city": $tmp.attr('value')};
            ctname2 = {"involve_city": $tmp.val()};
            //console.log('????? '+"$tmp.val():"+ $tmp.val()+"selectFirst:"+ selectFirst);
            if ($tmp.val() !== selectFirst) {
                ctname = {
                    "loc_county": $tmp.val(),
                    "tjnf": $("#qmpmark").val()
                };
                ctname2 = {"involve_county": $tmp.val()};

                console.log('Child ' + "loc_county:" + $tmp.val() + "involve_county:" + $tmp.val());
            }

            //console.log("ctname2",bigtmp)

            afterclick(ctname, ctname2, $tmp.val());
        });
    }
}

function filterArcGISDynamicMapServiceLayer(value) {

    featureLayer.setDefinitionExpression(value);//开始过滤

    map.addLayer(featureLayer, 100);
}

//(ctname,ctname2,)
function afterclick(obj_1, obj_2, str_1) {
    $('#jsonInput').val("").val(JSON.stringify(obj_1));
    $('#currentplace').val("").val(JSON.stringify(obj_1));
    $('#jsonInput2').val("").val(JSON.stringify(obj_2));
    $('#jumpTmp').val("");
    console.log(obj_1);
    $.ajax({
        type: "POST",
        async: true,
        url: "rest/qmp/searchAllQmp",
        data: obj_1,
        success: function (data) {
            console.log(data.length);
            updateQmpInMap(data);//显示选择的市县点

            $.ajax({
                type: "POST",
                dataType: "html",
                async: false,
                url: "rest/qmp/search",
                data: obj_1,
                success: function (data) {
                    $('#listAll').html(data);
                }
            });
            switch (str_1) {
                case '鞍山市':
                case '海城市':
                    console.log('鞍山');
                    var extent = new esri.geometry.Extent(extents.anshan[0], extents.anshan[1], extents.anshan[2], extents.anshan[3]);
                    map.setExtent(extent);
                    break;
                case '辽阳市':
                case '辽阳县':
                case '弓长岭区':
                case '太子河区':
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
                case '大洼县':
                case '兴隆台区':
                case '双台子区':
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
                case '昌图':
                case '铁岭县':
                case '开原':
                case '铁岭市':
                case '调兵山':
                case '西丰':
                    var extent = new esri.geometry.Extent(extents.tieling[0], extents.tieling[1], extents.tieling[2], extents.tieling[3]);
                    map.setExtent(extent);
                    break;
                case '沈阳市':
                case '辽中县':
                case '新民市':
                case '康平县':
                case '法库县':
                case '沈北新区':
                case '东陵区':
                case '和平区':
                case '于洪区':
                case '沈河区':
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
                case '明山区':
                case '平山区':
                    var extent = new esri.geometry.Extent(extents.benxi[0], extents.benxi[1], extents.benxi[2], extents.benxi[3]);
                    map.setExtent(extent);
                    break;
                case '抚顺市':
                case '东洲区':
                case '望花区':
                case '新抚区':
                case '顺城区':
                case '清原县':
                case '新宾县':
                case '抚顺县':
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

            var name = $("div#listAll2 #nameForMap").val();

            //console.log('name:',name);
            if (name == '') {

                name = "单元名称=''";
            }
            filterArcGISDynamicMapServiceLayer(name);


        }
    });
}

//------------------------------------- 省市县导航 [ 结束 ]---------------------------------------//
var elder;
$(document).off("click", "tr[id^='qmpx']").on({
    click: function () {

        $(this).addClass("hlight").siblings().removeClass("hlight").end();
        //debugger;
        var lon = parseFloat($("#qmpjd" + this.id.substr(4)).val());
        var lat = parseFloat($("#qmpwd" + this.id.substr(4)).val());
        var infodata = {};
        var qmpname = ["sectionName", "basin", "riverName", "sectionSx", "riverLevel", "sksk", "sectionLevel", "locCity",
            "locDistrict", "czName", "sectionBymc", "sectionShhl", "longitude", "latitude"];
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
//      html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
            /*html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";*/
            html += "<table border='0' class='table-bordered table-striped'>";
            html += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";
            html += "<tr><td>所属流域</td><td>${basin}</td></tr>";
            html += "<tr><td>所属河流</td><td>${riverName}</td></tr>";
            html += "<tr><td>断面属性</td><td>${sectionSx}</td></tr>";
            html += "<tr><td>河流级别</td><td>${sectionLevel}</td></tr>";
            html += "<tr><td>受控水库</td><td>${sksk}</td></tr>";
            html += "<tr><td>断面级别</td><td>${sectionLevel}</td></tr>";
            html += "<tr><td>所属地市</td><td>${locCity}</td></tr>";
            html += "<tr><td>所属区县</td><td>${locDistrict}</td></tr>";
            html += "<tr><td>测站名称</td><td>${czName}</td></tr>";
            /*html += "<tr><td>所属河流</td><td>${riverName}</td></tr>";
            html += "<tr><td>断面属性</td><td>${sectionSx}</td></tr>";
            html += "<tr><td>河流级别</td><td>${riverLevel}</td></tr>";
            html += "<tr><td>受控水库</td><td>${sksk}</td></tr>";
            html += "<tr><td>经度（度）</td><td>${longitude}</td></tr>";
            html += "<tr><td>纬度（度）</td><td>${latitude}</td></tr>";*/
            html += "</table><br/>";
            /*html += "<table border='0' class='tableBasic'>";
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
        console.log('highlight');
    }
}, "tr[id^='qmpx']");

var complexlist = "";

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

            if (myrole == 1 || myrole == "admin")
                complexlist += allData[i].locCity + "、";
            else if (myrole == 2 || myrole == 3)
                complexlist += allData[i].locCounty + "、";


            lon = allData[i].longitude;
            lat = allData[i].latitude;

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
            var symbol1 = new PictureMarkerSymbol("app/img/tt.png", 10, 10);
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

//水质识别
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
            lon = allData[i].longitude;
            lat = allData[i].latitude;

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
                            var szsb_real = szsb_data[j].ad.replace(/L/g, "");
                            var szsb_standard = szsb_data[j].adStd.replace(/≤/g, "");
                            if (szsb_real <= szsb_standard) {
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
                            if (szsb_real <= szsb_standard) {
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
                            if (szsb_real <= szsb_standard) {
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
                            if (szsb_real <= szsb_standard) {
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

$('#map').css({
    'height': '470px',
    'width': '100%'
});

$('#addButton').click(function () {
    var url = "rest/page/addNewQmpCount";
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

$('#search_szsb').click(function () {
    var szsb_std = $('#szsb_std').val();
    var szsb_month = $('#szsb_month').val();

    var data = {
        "szsb_month": szsb_month
    };

    var szsb_data;

    $.ajax({
        type: "POST",
        dataType: "json",
        async: true,
        url: "rest/qmp/szsb",
        data: data,
        success: function (szsb_temp) {
            szsb_data = szsb_temp;
            $.ajax({
                type: "POST",
                url: "rest/qmp/searchAllQmp",
                success: function (allData) {
                    updateQmpInMapWithSzsb(allData, szsb_data, szsb_std);
                }
            });
        }
    });

});

$('#searchButton').click(function () {
    var url = "rest/page/searchNewQmpCount";
    $.get(url, function (data) {
        $('#searchDiv2').html(data);
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

/*
function qmpToPo(qmp) {
  var jdata = {
    "KZDM": qmp
  };

  $('#jumpTmp').val("").val(JSON.stringify(jdata));


  $.ajax({
    type: "POST",
    async: true,
    url: "rest/page/newPollSource",
    success: function (data) {
      $('#index-page-title').text("污染源管理");
      $('#main-content').html(data);
      $('#tree').treeview({
        multiSelect: false,
        selectedBackColor: "#00c3c1",
        backColor: " #F3F3F3",
        data: [{
          text: "直排点源",
          nodes: [{
            text: "直排企业",
            selectable: true,
            state: {
              checked: false,
              //	disabled: true,
              //	expanded: true,
              selected: false
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
        }]
      });
      $('#listAll').empty();
      $("#map").toggle();
      $("#typeselec").html("<select class='form-control' style='margin-top:15px;margin-bottom: 10px;' id='selection'> <option>直排企业</option> <option>污水处理厂</option> <option>规模化畜禽养殖</option> </select>")
      $("#selection").on("change", function () {
        console.log('selection changed');
        var type = $("#selection").val();
        switch (type) {
          case '直排企业':
            $.ajax({//载入下方表格
              type: "POST",
              dataType: "html",
              async: true,
              url: "rest/psrc/search",
              data: {
                "KZDM": $("#KZDM").val()
              },
              success: function (data) {
                setTimeout(function () {
                  $('#listAll').html(data);
                }, 3000);
              }
            });
            break;
          case '污水处理厂':
            $.ajax({
              type: "POST",
              dataType: "html",
              async: true,
              url: "rest/pfty/search",
              data: {
                "KZDM": $("#KZDM").val()
              },
              success: function (data) {
                setTimeout(function () {
                  $('#listAll').html(data);
                }, 3000);
              }
            });
            break;
          case '规模化畜禽养殖':
            $.ajax({
              type: "POST",
              dataType: "html",
              async: true,
              url: "rest/pyz/search",
              data: {
                "KZDM": $("#KZDM").val()
              },
              success: function (data) {
                setTimeout(function () {
                  $('#listAll').html(data);
                }, 3000);
              }
            });
            break;
        }
      })
      $("#KZDM").val(jdata.KZDM);

      $.ajax({//载入下方表格
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/psrc/search",
        data: jdata,
        success: function (data) {

          setTimeout(function () {

            $('#listAll').html(data);

            $.ajax({//更新地图
              type: "POST",
              async: true,
              url: "rest/psrc/searchAllPsrc",
              data: jdata,
              success: function (data) {
                updatePsrcInMap(data, 0);
                $("#map").toggle();
              }
            });
          }, 3000);
        }
      });

      $.ajax({
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/pfty/search",
        data: jdata,
        success: function (data) {

          setTimeout(function () {

            // $('#listAll').append(data);

            $.ajax({
              type: "POST",
              async: true,
              url: "rest/pfty/searchAllPfty",
              data: jdata,
              success: function (data) {
                updatePftyInMap(data, 0);
                // $("#map").show();
              }
            });
          }, 3000);
        }
      });

      $.ajax({
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/pyz/search",
        data: jdata,
        success: function (data) {

          setTimeout(function () {

            // $('#listAll').append(data);

            $.ajax({
              type: "POST",
              async: true,
              url: "rest/pyz/searchAllPyz",
              data: jdata,
              success: function (data) {

                updatePyzInMap(data, 0);

                // $("#map").show();
              }
            });
          }, 3000);
        }
      });
    }
  });
}
*/
function qmpToPo(value) {

    var json = {
        "TAG":"KZDM",
        "KZDM":value
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




function movePopUp() {
//
//	$(".esriPopupVisible").css("left","0px");
//	$(".esriPopupVisible").css("top","0px");
//	$(".esriPopupVisible").css("right","0px");
//	$(".esriPopupVisible").css("bottom","0px");
//	$(".esriPopupVisible").removeAttr("style");

}

$('#bulkImportButton').click(function () {
    var url = "rest/page/bulkImportQmpBas";
    $.get(url, function (data) {
        $('#bulkImportDiv').html(data);
    });
});


function bulkImportBas() {
    var fileName = $("#fileName").text();
    //debugger;
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "rest/qmp/bulkImportBasPanduan",
        async: false,
        data: {name: fileName},
        success: function (data) {
            //alert(data);
            /*console.log(data);
            var msgPanduan = data.msg;*/
            if(data != ""){
                var newmsgPanduan = "以下断面并未存在过，您确定上传吗？\n请确认！\n" + data;
                //alert(newmsgPanduan);
                if(confirm(newmsgPanduan) == true) {
                    $.ajax({
                        type: "POST",
                        dataType: "json",
                        url: "rest/qmp/bulkImportBas",
                        async: false,
                        data: {name: fileName},
                        success: function (data) {
                            console.log(data);
                            var msg = data.msg;
                            console.log(data.msg)
                            var time = data.time;
                            console.log(data.updateCount)
                            var updateCount = data.updateCount;
                            console.log(data.insertCount)
                            var insertCount = data.insertCount;
                            var newMsg = msg + "\n用时: " + time + "\n更新了：" + updateCount + "条数据；\n新增了：" + insertCount + "条数据。";
                            alert(newMsg);
                            // alert(data);
                        }
                    });
                    return true;
                } else {
                    return false;
                }}else{
                $.ajax({
                    type: "POST",
                    dataType: "json",
                    url: "rest/qmp/bulkImportBas",
                    async: false,
                    data: {name: fileName},
                    success: function (data) {
                        console.log(data);
                        var msg = data.msg;
                        console.log(data.msg)
                        var time = data.time;
                        console.log(data.updateCount)
                        var updateCount = data.updateCount;
                        console.log(data.insertCount)
                        var insertCount = data.insertCount;
                        var newMsg = msg + "\n用时: " + time + "\n更新了：" + updateCount + "条数据；\n新增了：" + insertCount + "条数据。";
                        alert(newMsg);
                        // alert(data);
                    }
                });
            }
        }
    });

}

$("#qmp_youkong").on("change", function () {

    var value = $("#qmp_youkong").val();
    if (value != 0) {
        var json = {
            "youkong": value,
            "tjnf": $("#qmpmark").val()
        };
        $('#jsonInput').val(JSON.stringify(json));
        $.ajax({
            type: "POST",
            dataType: "html",
            async: false,
            url: "rest/qmp/searchYoukong",
            data: json,
            success: function (data) {
                $('#listAll').html(data);
            }
        });
    }
});


$("#exportExcel").click(function () {
    tmp = $('#jsonInput').val();
    test = JSON.parse(tmp);
    debugger;
    $.ajax({
        type: "POST",
        dataType: "html",
        async: false,
        url: "rest/qmp/exportExcelBas",
        data: test,
        success: function (data) {
            window.location.href = "rest/qmp/uploadBas";
        }
    });
});


$("#qmpmark").on("change", function () {

    complexlist = "";

    var value = $("#qmpmark").val();
    //if(value!=2013){
    if ($("#qmpmark").val() == "请选择") alert(1);
    var datas = {
        "youkong": value,
        "tjnf": $("#qmpmark").val()
    };
    $('#jsonInput').val(JSON.stringify(datas));
    //alert(value+":"+$('#treeselect').val());

    $.ajax({//载入下方表格
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/qmp/search",
        data: datas,
        success: function (data) {

            setTimeout(function () {

                $('#listAll').html(data);

                $.ajax({//更新地图
                    type: "POST",
                    async: true,
                    url: "rest/qmp/searchAllQmp",
                    data: datas,
                    success: function (data) {
                        updateQmpInMap(data, 0);
                        //alert(complexlist);
                        $("#citylisthead").html("");
                        $("#citylist").html("");
                        list_city(complexlist);
                    }
                });
            }, 1000);
        }
    });

    //}
    $("#qmpmark").val(value);
    //$("#map").toggle();
    /**/
});


