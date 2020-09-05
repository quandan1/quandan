initMap();
var map, layer, graphicLayer, graphic, featureLayer;
var myrole = $("#myRole").val();

var html1 = "";
//html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
//html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";

//qmp_bas_info
html1 += "<table border='0' class='tableBasic'>";
html1 += "<tr><td>序号</td><td>${id}</td></tr>";
html1 += "<tr><td>断面级别</td><td>${sectionLevel}</td></tr>";
html1 += "<tr><td>原考核108</td><td>${ykh108}</td></tr>";
html1 += "<tr><td>河流水质90</td><td>${hlsz90}</td></tr>";
html1 += "<tr><td>原序号</td><td>${originalId}</td></tr>";
html1 += "<tr><td>所属省份</td><td>${locProvince}</td></tr>";
html1 += "<tr><td>所属地市</td><td>${locCity}</td></tr>";
html1 += "<tr><td>所属区县</td><td>${locDistrictl}</td></tr>";
html1 += "<tr><td>测站名称</td><td>${czName}</td></tr>";
html1 += "<tr><td>断面名称</td><td>${sectionName}</td></tr>";
html1 += "<tr><td>所属流域</td><td>${basin}</td></tr>";
html1 += "<tr><td>所属河流</td><td>${riverName}</td></tr>";
html1 += "<tr><td>断面属性</td><td>${sectionSx}</td></tr>";
html1 += "<tr><td>河流级别</td><td>${riverLevel}</td></tr>";
html1 += "<tr><td>受控水库</td><td>${sksk}</td></tr>";
html1 += "</table><br/>";

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
        //dojo.parser.parse();
        dojoConfig = {
            parseOnLoad : true
        };
        var extent = new Extent(117.309229, 39.137731, 129.957720, 43.380153);
        map = new Map("map", {
            "spatialReference": {
                "wkid": 4326,
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
    layer.setVisibleLayers([0 ,11 ,13 ,14 ,16 ,22]);
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
        //添加图例
        //debugger;
        map.on("layers-add-result", function (evt) {
            alert("aa");
            //debugger;
            var layerInfo = arrayUtils.map(evt.layers, function (layer, index) {
                return { layer: layer.layer, title: layer.layer.name };
            });
            if (layerInfo.length > 0) {
                var legendDijit = new esri.dijit.Legend({
                    map: map,
                    layerInfos:layerInfo
                }, "legendDiv");
                legendDijit.startup();
            }
        });


        //添加比例尺
        // alert("aaa");
/*        var scalebar = new Scalebar({
            map: map,
            //比例尺单位
            scalebarUnit: "dual",
            //放置的位置
            attachTo:"top-left"
        });*/
        var scalebar=new esri.dijit.Scalebar({map:map,scalebarStyle:"line",scalebarUnit:"dual"});


        //创建绘图对象
        var toolBar = new Draw(map);
        //线符号
        lineSymbol = new SimpleLineSymbol(SimpleLineSymbol.STYLE_DASH, new Color([255, 0, 0]), 3);
        //面符号
        polygonSymbol = new SimpleFillSymbol(SimpleFillSymbol.STYLE_SOLID, lineSymbol, new Color([255, 0, 0, 0.25]));

        var citylist = "";
        //给绘制polygon的按钮绑定事件
        query(".pbtn").on("click",function(event){
            //激活绘制多边形
            toolBar.activate(Draw.POLYGON, {
                showTooltips:true
            })

        })
        //绘图结束绑定事件
        on(toolBar,"draw-end",function(result){
            //获得面形状
            var geometry=result.geometry;
            //创建Graphic
            var graphicpoint= new Graphic(geometry, polygonSymbol);
            map.graphics.add(graphicpoint);
            //关闭绘图工具
            toolBar.deactivate();
        })
        //给地图打印按钮绑定事件
        on(dom.byId("Btn"),"click",function(){
            //创建地图打印对象
            var printMap = new PrintTask("http://localhost:6080/arcgis/rest/services/Utilities/PrintingTools/GPServer/Export%20Web%20Map%20Task");
            //创建地图打印模版
            var template = new PrintTemplate();
            //创建地图的打印参数，参数里面包括：模版和地图
            var params = new PrintParameters();
            //输出图片的空间参考
            printMap.outSpatialReference = map.SpatialReference;
            //打印图片的各种参数
            template.exportOptions = {
                width: 1200,
                height: 650,
                dpi: 96
            };
            //打印输出的格式
            template.format = "JPG";
            //输出地图的布局
            template.layout = "MAP_ONLY";
            PrintTemplate
            //设置参数地图
            params.map = map;
            //设置参数模版
            params.template = template;
            //运行结果
            printMap.execute(params, function(result){
                if (result != null) {
                    //网页打开生成的地图
                    window.open(result.url);
                }
            })
        })
    });
}

$('#map').css({
    'height': 'auto',
    'width': '100%'
});

$("#count_szxz").click(function () {
    var region = $("#szxz_region").val();//区域
    var level = $("#section_level").val();
    var year = $("#szxz_year").val();
    var start_m = $("#szxz_startm").val();
    var end_m = $("#szxz_endm").val();

    var data = {
        "region":region,
        "level":level,
        "year":year,
        "start_m":start_m,
        "end_m":end_m
    };
    var szlb_data;//水质类别

   $.ajax({
        type:"POST",
        dataType:"json",
        url:"rest/qmp/szlb",
        data:data,
        success:function (szlb_temp) {
            szlb_data = szlb_temp;

            $.ajax({
                type: "POST",
                url: "rest/qmp/searchQmpBaseInfo",
                success: function (allData) {
                    console.log(szlb_data);
                    //debugger;
                    updateSzxzByAll(allData, szlb_data, start_m, end_m, region,level);
                    updateSzxzByAll(allData, szlb_data, start_m, end_m, region,level);
                }
            });

        }
    });
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"rest/qmp/szlb",
        data:data,
        success:function (szlb_temp) {
            szlb_data = szlb_temp;

            $.ajax({
                type: "POST",
                url: "rest/qmp/searchQmpBaseInfo",
                success: function (allData) {
                    console.log(szlb_data);
                    updateSzxzByAll(allData, szlb_data, start_m, end_m,region,level);
                }
            });

        }
    });

  $('#myModal').modal({
    show: true,
    keyboard: false
  });
  $.ajax({
    type: "POST",
    // dataType: "json",
    async: true,
    url: "rest/qmp/count_szxz",
    data: {
      "region": region,
      "year": year,
      "start_m": start_m,
      "end_m": end_m,
      "level": level
    },
    success: function (res) {
      // console.log(res);
      $("#listAll").html(res)
      $("#exportToExcel").show()
      $('#myModal').modal("hide");
      $('#exportToExcelCbyz').hide();
    }
  });
});


$("#count_cbyz").click(function () {
    var region = $("#szxz_region").val();//区域
    var level = $("#section_level").val();
    var year = $("#szxz_year").val();
    var start_m = $("#szxz_startm").val();
    var end_m = $("#szxz_endm").val();

    var data = {
        "region":region,
        "level":level,
        "year":year,
        "start_m":start_m,
        "end_m":end_m
    };
    var szlb_data;//水质类别

    $.ajax({
        type:"POST",
        dataType:"json",
        url:"rest/qmp/szlb",
        data:data,
        success:function (szlb_temp) {
            szlb_data = szlb_temp;

            $.ajax({
                type: "POST",
                url: "rest/qmp/searchQmpBaseInfo",
                success: function (allData) {
                    console.log(szlb_data);
                    //debugger;
                    updateSzxzByAll(allData, szlb_data, start_m, end_m, region,level);
                    updateSzxzByAll(allData, szlb_data, start_m, end_m, region,level);
                }
            });

        }
    });
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"rest/qmp/szlb",
        data:data,
        success:function (szlb_temp) {
            szlb_data = szlb_temp;

            $.ajax({
                type: "POST",
                url: "rest/qmp/searchQmpBaseInfo",
                success: function (allData) {
                    console.log(szlb_data);
                    updateSzxzByAll(allData, szlb_data, start_m, end_m,region,level);
                }
            });

        }
    });

    $('#myModal').modal({
        show: true,
        keyboard: false
    });
    $.ajax({
        type: "POST",
        // dataType: "json",
        async: true,
        url: "rest/qmp/count_cbyz",
        data: {
            "region": region,
            "year": year,
            "start_m": start_m,
            "end_m": end_m,
            "level": level
        },
        success: function (res) {
            // console.log(res);
            $("#exportnf").val(year),
            $("#listAll").html(res)
            $("#exportToExcelCbyz").show()
            $('#myModal').modal("hide");
            $('#exportToExcel').hide();
        }
    });
});



$('#addButton').click(function () {
    var url = "rest/page/addQmpSzxz";
    $.get(url, function (data) {
        $('#addDiv').html(data);
    });
});

$('#bulkImportButton').click(function () {
    var url = "rest/page/bulkImportQmpSzxz";
    $.get(url, function (data) {
        $('#bulkImportDiv').html(data);
    });
});

function bulkImportSzxz() {
    var fileName = $("#fileName").text();
    //debugger;
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "rest/qmp/bulkImportSzxzPanduan",
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
                    url: "rest/qmp/bulkImportSzxz",
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
                    url: "rest/qmp/bulkImportSzxz",
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

function updateSzxzByAll(allData, szlb_data, start_m, end_m, region,level_pre) {
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
            var infoTemplate = new InfoTemplate("控制断面信息", html1);
            var symbol2;
            var textbol;
            var current_level;
            var graphic1;
            for (var j = 0; j < szlb_data.length; j++) {
                // console.log(szlb_data[j].section_name.toString() == allData[i].sectionName.toString());
                if (szlb_data[j].section_name.toString() == allData[i].sectionName.toString()) {
                    var level = 7;
                    var m;
                    console.log(szlb_data[3]);
                    for(m = start_m; m<= end_m; m++){
                        //console.log(szlb_data[j].m);
                        if (szlb_data[j]['category_info'+m]=="Ⅰ") {
                            current_level = 1;
                        } else if (szlb_data[j]['category_info'+m]=="Ⅱ") {
                            current_level = 2;
                        } else if (szlb_data[j]['category_info'+m]=="Ⅲ") {
                            current_level = 3;
                        } else if (szlb_data[j]['category_info'+m]=="Ⅳ") {
                            current_level = 4;
                        } else if (szlb_data[j]['category_info'+m]=="Ⅴ") {
                            current_level = 5;
                        } else if (szlb_data[j]['category_info'+m]=="劣Ⅴ" || szlb_data[j]['category_info'+m]=="劣Ⅴ（氨氮5）") {
                            current_level = 6;
                        } else{
                            current_level = 7;
                        }
                        if (current_level < level) {
                            level = current_level;
                        }
                    }
                    if (level == 1) {
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategory1_new.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);

                    } else if (level == 2) {
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategory2.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);

                    } else if (level == 3) {
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategory3.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);

                    } else if (level == 4) {
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategory4_new.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);

                    } else if (level == 5) {
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategory5.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);

                    } else if (level == 6){
                        textbol = new TextSymbol(allData.sectionName);
                        textbol.setOffset(-10,18);
                        graphic1 = new Graphic(point, textbol);
                        symbol2 = new PictureMarkerSymbol("app/img/dmcategoryL5.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr,infoTemplate);
                    } else {
                        /*textbol = new TextSymbol(allData.sectionName);
                        textbol.setOffset(-10,18);
                        graphic1 = new Graphic(point, textbol);*/
                        symbol2 = new PictureMarkerSymbol("app/img/tt.png", 20, 20);
                        graphic = new Graphic(point, symbol2,attr);
                    }
                }
            }
            //console.log(graphic1);
            graphicLayer.add(graphic);
            //graphicLayer.add(graphic1);
        }
    });
}

$("#exportToExcel").click(function () {
    $.ajax({
        type: "POST",
        // dataType: "json",
        async: true,
        url: "rest/qmp/exportToExcel",
        success: function (res) {
            console.log(res);
        }
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
                $("#szxz_region").append("<option value='"+res[i]+"'>"+res[i]+"</option>")
            }
        }
    });
});

var elder;
$(document).off("click", "tr[id^='qmpx']").on({
    click: function () {

        $(this).addClass("hlight").siblings().removeClass("hlight").end();
        var lon = parseFloat($("#qmpjd" + this.id.substr(4)).val());
        var lat = parseFloat($("#qmpwd" + this.id.substr(4)).val());
        var infodata = {};
        var qmpname = ["section_level", "ykh_108", "hlsz_90", "original_id", "loc_city", "section_name", "basin", "river_name",
            "section_sx", "sksk", "target_2020", "target_2016", "target_2017", "target_2018"];
        for (var i = 0; i < $(this).children('td').length; i++) {
            infodata[qmpname[i]] = $(this).children('td').eq(i).text();
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
            //html += "<button type='button' class='btnz btnz-info' id='xgCu' onclick='qmpToCu(\"${sectionName}\")'>相关单元</button>";
            //html += "<button type='button' class='btnz btnz-info' id='xgPo' onclick='qmpToPo(\"${sectionName}\")'>跳转至相关污染源</button>";
            html += "<table border='0' class='tableBasic'>";
            html += "<tr><td>断面性质</td><td>${section_level}</td></tr>";
            html += "<tr><td>原考核108</td><td>${ykh_108}</td></tr>";
            html += "<tr><td>河流水质90</td><td>${hlsz_90}</td></tr>";
            html += "<tr><td>原序号</td><td>${original_id}</td></tr>";
            html += "<tr><td>城市</td><td>${loc_city}</td></tr>";
            html += "<tr><td>断面名称</td><td>${section_name}</td></tr>";
            html += "<tr><td>所属流域</td><td>${basin}</td></tr>";
            html += "<tr><td>所属河流</td><td>${river_name}</td></tr>";
            html += "<tr><td>断面属性</td><td>${section_sx}</td></tr>";
            html += "<tr><td>受控水库</td><td>${sksk}</td></tr>";
            html += "<tr><td>2020年目标</td><td>${target_2020}</td></tr>";
            html += "<tr><td>2016年目标</td><td>${target_2016}</td></tr>";
            html += "<tr><td>2017年目标</td><td>${target_2017}</td></tr>";
            html += "<tr><td>2018年目标</td><td>${target_2018}</td></tr>";
            html += "</table><br/>";

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