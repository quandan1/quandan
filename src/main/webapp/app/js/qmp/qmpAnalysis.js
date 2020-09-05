//页面加载时执行的操作
$(function(){
	 getPreData();
})

$("#target").change(function() {
	var value = $("#target").val();
	chartChose(value);
});

$("#analysis").click(function () {
    searchqmpwr();
})

function chartChose(type){
    //getPreData();
    //$('#hid').show();
    switch (type){
        case 'yearCircle':
            //$('#selsection').show();
            //$('#sp2').show();
            $('#selyear').show();
            $('#sp3').show();
            $('#selmonth').hide();
            $('#sp4').hide();
            $('#seltype').hide();
            $('#sp5').hide();
            break;
        case 'YearEq':
           // $('#selsection').show();
           // $('#sp2').show();
            $('#selyear').hide();
            $('#sp3').hide();
            $('#selmonth').show();
            $('#sp4').show();
            $('#seltype').hide();
            $('#sp5').hide();
            break;
        case 'MonthWrxx':
           // $('#selsection').show();
            //$('#sp2').show();
            $('#selyear').show();
            $('#sp3').show();
            $('#selmonth').hide();
            $('#sp4').hide();
            $('#seltype').hide();
            $('#sp5').hide();
            break;
        case 'YearOne':
            //$('#selsection').show();
            //$('#sp2').show();
            $('#selyear').hide();
            $('#sp3').hide();
            $('#selmonth').hide();
            $('#sp4').hide();
            $('#seltype').show();
            $('#sp5').show();
            //break;
    }
}

/**
 * 取到数据
 */
var predata = null;
function getPreData() {
    //alert($("#target").find("option:selected").text());
    if(predata!=null)
    	return;
    var json = {
        //target:$("#target").find("option:selected").val()
    		target:"yearCircle"
    }

    $.ajax({
        type : "POST",
        dataType : "html",
        async : false,
        url : "rest/qmpa/prewrxx",
        data:json,
        success : function(data) {
            if(data!=null){
                predata = JSON.parse(data);
                //alert(predata['section'][1]);
                var sections = predata['section'];
                //$("#section option").remove();
                //$("#selsection").options.remove(indx);
                for(var i=0;i<sections.length;i++){
                	
                $("#section").append("<option value='"+sections[i]+"'>"+sections[i]+"</option>");
                }
                /*var sonsDaBiao;
                for (var i=0;i<sonsDaBiao.length;i++){
                	$("#section").append("达标:");
                    $("#section").append("<option value='"+sonsDaBiao[i]+"'>"+sonsDaBiao[i]+"</option>");
                }
                var sonsFeiDaBiao;
                for (var i=0;i<sonsFeiDaBiao.length;i++){
                	$("#section").append("非达标:");
                    $("#section").append("<option value='"+sonsFeiDaBiao[i]+"'>"+sonsFeiDaBiao[i]+"</option>");
                    
                }*/
            }
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
    // console.log(serie)
    return serie;
}

/**
 * 请求画图数据
 * @param parm
 */
function searchqmpwr() {
    var year = $("#year").find("option:selected").val();
    var section = $("#section").find("option:selected").val();
    var target = $("#target").find("option:selected").val();
    var type = $("#type").find("option:selected").val();
    var month = $("#month").find("option:selected").val();
    
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
            // console.log("OK!")
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
        grid:{
            y:'13%',
            y2:'15%'
        },
        legend: {
            x:'center',y:'bottom',
            data:legenddata,
            textStyle:{
                fontSize:15
            }
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
            nameTextStyle:{
                verticalAlign: 'bottom',
                fontSize: 20
            },
            type: 'category',
            boundaryGap: false,
            data: xdata,
            axisLine:{
                lineStyle:{
                    color: '#333',
                    with: 1,
                    type: 'solid'
                }
            },
            axisLabel: {
                x:'bottom',
                formatter: '{value}'+xpostfix,
                textStyle:{
                    fontSize:20
                }
            }
        },
        yAxis: {
            name:yname,
            nameTextStyle:{
                fontSize: 20
            },
            type: 'value',
            axisLabel: {
                show:true,
                formatter: '{value}'+ypostfix,
                textStyle:{
                    fontSize:20,
                }
            },
            axisLine:{
                lineStyle:{
                    color: '#000',
                    with: 1,
                    type: 'solid'
                }
            },
            //splitNumber:3,
            splitLine: {
                show: true
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

