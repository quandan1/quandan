


// getPreData();

/**
 * 取到数据
 */
var predata = null;
//
function getPreData() {
    $.ajax({
        type : "POST",
        dataType : "html",
        async : false,
        url : "rest/qmpa/prewrxx",

        success : function(data) {
            predata = data;

        }

    });
}

/**
 * 得到series数据
 * @param legenddata
 * @param ydata
 * @returns {Array}
 */
function getparam(legenddata,ydata){
    var serie=[];
    for( var i=0;i < legenddata.length;i++){
        var item={
            name:legenddata[i],
            type:'line',
            data:ydata[i]
        }
        serie.push(item);
    };
    console.log(serie)
    return serie;
}

/**
 * 请求画图数据
 * @param parm
 */
function searchqmpwr(parm) {
    var year = $("#year").val();
    var section = $("#section").val();
    var target = $("#target").val();
    var type = $("#type").val();
    var month = $("#month").val();

    var json = {
        "year" : year,
        "section" : section,
        "target" : target,
        "type" : type,
        "month": month
    };

    $.ajax({
        type : "POST",
        dataType : "html",
        async : false,
        url : "rest/qmpa/qmpwrxx",
        data : json,
        success : function(data) {
            formatJsonToSeries(data);//对数据进行处理
            console.log("OK!")
        }
    });
}


/**
 * 给Option赋值，画图类型为折线图
 * @param name
 * @param subname
 * @param xname
 * @param yname
 * @param xpostfix
 * @param ypostfix
 * @param xdata
 * @param legenddata
 * @param ydata
 * @returns {{title: {text: *, subtext: *}, tooltip: {trigger: string}, legend: {data: *}, toolbox: {show: boolean, feature: {dataZoom: {yAxisIndex: string}, dataView: {readOnly: boolean}, magicType: {type: string[]}, restore: {}, saveAsImage: {}}}, xAxis: {name: *, type: string, boundaryGap: boolean, data: *, axisLabel: {formatter: string}}, yAxis: {name: *, type: string, axisLabel: {formatter: string}, splitLine: {show: boolean}}, series}}
 * @constructor
 */
function AssignOption(name,subname,xname,yname,xpostfix,ypostfix, xdata,legenddata,ydata) {

    var param = getparam(legenddata,ydata)
    var option = {
        title: {
            x:'center',y:'top',
            text: name,
            //subtext: subname
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            x:'right',y:'35',
            data:legenddata
        },
        calculable : false,
        // grid:{
        //     y2: 20
        // },
        toolbox: {
            show: true,
            feature: {
                mark : {show: false},
                dataView : {show: true, readOnly: false},
                magicType : {show: true, type: ['line', 'bar']},
                restore : {show: true},
                saveAsImage : {show: true},
                dataZoom: {
                    yAxisIndex: 'none'
                },
            }
        },
        xAxis:  {
            name:xname,
            type: 'category',
            boundaryGap: false,
            data: xdata,
            axisLabel: {
                x:'bottom',
                formatter: '{value}'+xpostfix
            }
        },
        yAxis: {
            name:yname,
            type: 'value',
            axisLabel: {
                formatter: '{value}'+ypostfix
            },
            //splitNumber:3,
            splitLine: {
                show: false
                // lineStyle:{
                //     color: ['#ccc','#f00',"#455"],
                //     width: 1,
                //     type: 'solid'
                // }
            }
        },
        series:param
    };
    return option;
}

/**
 * 将收到的图表数据转换为Json数据，并序列化
 * @param data
 */
function formatJsonToSeries(data) {

    Jsondata = JSON.parse(data);  //把后台传来的数据转来JSON格式
    var datas = Jsondata[0];
    var option = AssignOption(datas.name, datas.subname, datas.xname,
        datas.yname,datas.xpostname,datas.ypostname,
        datas.xdata,datas.legenddata,datas.ydata);

    // 基于准备好的dom，初始化echarts实例
    // 使用刚指定的配置项和数据显示图表。
    var myChart = echarts.init(document.getElementById('chart'));
    // 指定图表的配置项和数据
    myChart.setOption(option);
}

