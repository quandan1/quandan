
var agoLayer, layer, map, tb, statesTask, riversTask, citiesTask, query, symbol;
var map, layer, graphicLayer, graphic, featureLayer, PicMarkerSymbol, infotem, grap, poi, TexSymbol,allDataGlobal;
var html="";
var num=0;
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
init();
function init() {
    require(["esri/map", "esri/layers/ArcGISDynamicMapServiceLayer", "esri/layers/FeatureLayer",
            "esri/InfoTemplate", "esri/renderers/ClassBreaksRenderer", "esri/symbols/SimpleFillSymbol", "esri/dijit/Legend",
            "esri/Color", "esri/tasks/query", "esri/geometry/Extent", "esri/renderers/SimpleRenderer", "esri/symbols/SimpleLineSymbol",
            "esri/renderers/UniqueValueRenderer","esri/symbols/TextSymbol","esri/layers/LabelClass"],
        function (Map, ArcGISDynamicMapServiceLayer, FeatureLayer, Point,PictureMarkerSymbol,Graphic,
                  InfoTemplate, ClassBreaksRenderer, SimpleFillSymbol, Legend, Color, Query, Extent, SimpleRenderer, SimpleLineSymbol, UniqueValueRenderer,TextSymbol,LabelClass) {
           poi =Point;
        PicMarkerSymbol = PictureMarkerSymbol;
        TexSymbol = TextSymbol;
        infotem = InfoTemplate;
        grap = Graphic;


            var extent =  new esri.geometry.Extent(117.309229, 39.137731, 129.957720, 43.380153);
            map = new esri.Map("map", {
                "spatialReference" : {
                    "wkid" : 4326
                },//地理坐标 4326对应GCS_WGS_1984
                showLabels : true, //very important that this must be set to true!
                extent : extent,
                logo: false, //取消地图默认的logo
            });
            var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer";
            agoLayer = new ArcGISDynamicMapServiceLayer(url);

            agoLayer.setVisibleLayers([0,1,5,6,7,8,9,10,11,12,13,14,15,16,17,20,22,23,24,25]);//设置china(9)
            map.addLayer(agoLayer);

    });


}
$("#select").click(function(){
    var Heliu =$("#haha").val();
    $.ajax({
        type: "POST",
        url: "rest/mike/searchAllQiYe",
        async:false,
        dateType: "json",
        data: {
            "snscmc": Heliu,
            "tjnf": "2017"
        },
        success: function (allData) {



            html += "<table border='0' class='table-bordered table-striped'>";
            html += "<tr><td>企业名称</td><td>${qiyename}</td></tr>";
            html += "<tr><td>流量</td><td>${liuliang}</td></tr>";
            html += "<tr><td>经度</td><td>${jd}</td></tr>";
            html += "<tr><td>纬度</td><td>${wd}</td></tr>";
            html += "<tr><td>cod排放量</td><td>${codpfl}</td></tr>";
            html += "<tr><td>cod浓度</td><td>${codnd}</td></tr>";
            html += "<tr><td>总氮排放量</td><td>${tnpfl}</td></tr>";
            html += "<tr><td>总氮浓度</td><td>${tnnd}</td></tr>";
            html += "<tr><td>总磷排放量</td><td>${tppfl}</td></tr>";
            html += "<tr><td>总磷浓度</td><td>${tpnd}</td></tr>";
            html += "</table><br/>";
            updateQmpInMap(allData);
        }
    });
});


function displayPoints(allData){

       // allDataGlobal = allData;

        for (var i = 0; i < allData.length; i++) {
            var attrs = {
                "qiyename": allData[i].qiyename,
                "liuliang": allData[i].liuliang,
                "jd":allData[i].jd,
                "wd":allData[i].wd,
                "codpfl": allData[i].codpfl,
                "codnd": allData[i].codnd,
                "tnpfl": allData[i].tnpfl,
                "tnnd": allData[i].tnnd,
                "tppfl": allData[i].tppfl,
                "tpnd": allData[i].tpnd,
            };
            var lon=attrs.jd;
            var lat=attrs.wd;
            point = new poi(lon, lat, map.spatialReference);
            var infoTemplate = new infotem("污染点源信息", html);
            var symbol1 = new PicMarkerSymbol("app/img/qmp5rep.png", 10, 10);
            graphic = new grap(point, symbol1, attrs, infoTemplate);
            var histogramsymbol = new PicMarkerSymbol("app/img/histogram_orange.png", 6, 23);
            histogramsymbol.setOffset(-10, 18);
            histogramgraph = new grap(point, histogramsymbol, attrs);
            graphicLayer = new esri.layers.GraphicsLayer();
            graphicLayer.add(graphic);
        }
            // var layer = esri.layers.GraphicsLayer({id:"layer"});
            // $.each(attrs, function(){
            //     var lon= this.jd;
            //     var lat = this.wd;
            //     var pt = new esri.geometry.Point([lon, lat]);
            //     var pictureMarkerSymbol = new esri.symbol.PictureMarkerSymbol("app/img/qmp5rep.png", 20, 20);
            //     var g = new esri.Graphic(pt, pictureMarkerSymbol);
            //     var template = new esri.InfoTemplate();
            //     g.setInfoTemplate(template);
            //     layer.add(g);
            // });
            // map.addLayer(layer);

}
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
        var graphicLayer = new esri.layers.GraphicsLayer();
       graphicLayer.clear();


        for (var i = 0; i < allData.length; i++) {
            lon = allData[i].jd;
            lat = allData[i].wd;

            attr= {
                "qiyename": allData[i].qiyename,
                "liuliang": allData[i].liuliang,
                "jd":allData[i].jd,
                "wd":allData[i].wd,
                "codpfl": allData[i].codpfl,
                "codnd": allData[i].codnd,
                "tnpfl": allData[i].tnpfl,
                "tnnd": allData[i].tnnd,
                "tppfl": allData[i].tppfl,
                "tpnd": allData[i].tpnd,
            };
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("企业点源信息", html);
            var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
            graphic = new Graphic(point, symbol1, attr, infoTemplate);
            graphicLayer.add(graphic);
            map.addLayer(graphicLayer);

        }
    });

}

var myChart2 = echarts.init(document.getElementById('second'));

myChart2.setOption({
    title:{ text:'分布图'  },
        xAxis:{ data:[] },
        yAxis:{ type : 'value',//默认为值类型       
            splitLine:{ show:true } },
        series:[] });
//实现点击某按钮显示图形
$("#mytype").click(function(){
//给柱形图赋值 
    $.ajax({ type: 'POST',
        url: "rest/mike/searchAllQiYeTwo",
        cache : false, //禁用缓存
        dataType: "json",
        success: function(data) {
//编辑组织数据，这里后台返回的data格式为{'categ': ['男', '女'], 'data': [[2, 136, 38, 4, 1, 0], [3, 75, 25, 5, 1, 0]], 'name': ['青少年', '青年人', '中年人', '老年前期', '老年人', '长寿老人']}
            var series=[];
            for (var i=0;i<data.data.length;i++){
                var item={
                    name:data.categ[i],
                    data:data.data[i],
                    type:'bar',
                    label: { normal: { show: true, position: 'top' } }
                };
                series.push(item); }
//将数据加载到图形中
            myChart2.setOption({
                title: {
                    text: data.title,
                    textStyle: {fontSize: 14}
                },
                legend: {
                    data: data.categ,
                    left: 'right'
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: { type: 'shadow' }
                },
                xAxis: {
                    type: 'category',
                    data: data.name,
                    axisLabel: {interval: 0} //x轴数据显示完整
                },
                yAxis: {name: '人'},
                series: series
            },true);
    }
    });
});
