/**
 * Created by FYZBXX on 2017/8/18.
 */

$('#Mydraw').hide();
$('#asection').hide();


var goption ;
var format ;

/**
 * 排序函数
 */
function msort(){

    var arr = [
        {
            name:"zlw",
            age:24
        },{
            name:'wlz',
            age:23
        }
    ];

    var compare = function (prop) {
        // 升序
        return function (obj1,obj2) {
            var val1 = obj1[prop];
            var val2 = obj2[prop];
            if(val1<val2)return -1;
            else if(val1>val2)return 1;
            else return 0;
        }
    }
    arr.sort(compare('age'));
}

function onCtrl(elem){

    if(elem=='section'){
        //$('#ctrl').text("断面");
        $('#clear').text("分析");
        $('#asection').show();
        $('#type').hide();

    }
    if(elem=='elem'){
        //$('#ctrl').text("元素");
        $('#clear').text("分析");
        $('#asection').hide();
        $('#type').show();

    }
}

// function onCtrl(){
//
//     var value = $('#ctrl').text();
//
//     if(value=='section'){
//         //$('#ctrl').text("断面");
//         $('#clear').text("分析");
//         $('#asection').show();
//         $('#type').hide();
//     }
//     if(value=='elem'){
//         //$('#ctrl').text("元素");
//         $('#clear').text("分析");
//         $('#asection').hide();
//         $('#type').show();
//     }
// }

/**
 * 点击绘制事件消息
 */
function clearMyDiv(show){

    var value = $('#clear').text();

    if(value=='恢复'){
        $('.mclear').show();
        $('#Mydraw').hide();
        $('#clear').text("分析");
    }
    if(value=='分析'||show){
        $('.mclear').hide();
        drawCoordinate();
        $('#Mydraw').show();
        $('#clear').text("恢复");
    }

}

$('#asection').change(function () {
    var elem =$('#asection').find("option:selected").val();
    params = elem.split('&');
    var content = $('#gaindata').val()
    gainDataBySection(content,params[0],params[1],params[2],params[3],params[4]);
})

/**
 * 通过断面获取数据 柱形图
 * @param data 数据源clist
 * @param section KZDY或者KZDM
 * @param mkey 控制断面中文名
 * @param seriesname section各污染物含量统计
 * @param name 基于断面的统计
 * @param subname 控制断面中文名
 */
function gainDataBySection(content,section,mkey,seriesname,name,subname){
    $('#clear').text("分析");
    // console.log(content)
    var data = content.substring(1,content.length-1);
    console.log(data)
    var s2 = ParseData(data)
   // var legenddata = ['化学需氧量产生量（吨）','化学需氧量排放量（吨）','氨氮产生量（吨）','氨氮排放量（吨）','石油量产生量（吨）','石油量排放量（吨）','工业废水排放量（吨）','挥发酚排放量（千克）','氰化物排放量（千克）','废水砷排放量（千克）','废水铅排放量（千克）','废水镉排放量（千克）','废水汞排放量（千克）','废水总铬排放量（千克）','废水六价铬排放量（千克）'];
    var lengenddata = {}
    var id;
    // console.log('val():'+$('#elem1').val())
    // console.log('text():'+$('#elem1').text())
    for(var i=1;i<16;i++) {
        id = '#elem' + i;
        lengenddata[$(id).attr("value")]=$(id).text();
        // alert($("#elem1").attr("value"));
    }

    // console.log('-----lengenddata begin-------');
    // var k=0;
    // for (var item in lengenddata){
    //         k++;
    //         console.log("item["+k+"]:("+item+","+lengenddata[item]+")");
    // }
    // console.log('-----lengenddata end-------');
    console.log('------gainDataBySection begin-----------');
    var legend = []
    var pdata = [];
    var flag = false;
    var k=0;
    console.log('---------------------')
    for(var i = 0;i<s2.length;i++){
        if(s2[i][section]==mkey){
            for(var s in s2[i]){
                var digital = parseInt(s2[i][s]);
                if(isNaN(s2[i][s])||digital==0
                   // ||lengenddata[s].indexOf('排放量')<0
                    || typeof lengenddata[s] == 'undefined'
                    ||lengenddata[s].indexOf('工业废水')>=0){
                    continue;
                }
                // var item={
                //     name:lengenddata[s],
                //     value:s2[i][s]
                // }
                // console.log('legend['+i+"]:"+lengenddata[s]+'['+lengenddata[s].indexOf('工业废水')+']')

                pdata[k]=s2[i][s];
                legend[k++]=lengenddata[s].substring(0,lengenddata[s].indexOf('（'))

                // pdata.push(item)
            }
            flag = true;
        }
        if(flag)break;
    }
    console.log('---------------------')
    // console.log("name"+name)
    // console.log("subname"+subname)
    // console.log("seriesname"+seriesname)
    // console.log("legenddata"+lengenddata)
    // console.log("pdata"+pdata)
    // console.log('------gainDataBySection end-----------');
    goption = ExOption(name,subname,seriesname,legend,pdata);
}



$('#type').change(function () {
   var elem =$('#type').find("option:selected").val();
    params = elem.split('&');
    gainData($('#gaindata').val(),params[0],params[1],params[2],params[3],params[4]);
})


/**
 * 基于元素分析的图形绘制
 * @param data
 * @param mkey
 * @param seriesname section各污染物含量统计
 * @param name 名字
 * @param subname 子名字
 */
function gainData(content,section,mkey,seriesname,name,subname) {
    $('#clear').text("分析");
    // clearMyDiv();
    // var Jsondata = JSON.parse(data);  //把后台传来的数据转来JSON格式
    // alert(Jsondata)
    var data = content.substring(1,content.length-1);

    console.log(data);
    
    var s2 = ParseData(data)
    var ldata = [];
    var pd = [];

    for(var i = 0;i<s2.length;i++){
        // var st = '';
        // for (var s in s2[i]){
        //     st = st + s + ':' + s2[i][s] + ',:';
        //     if(s==mkey){
        //         alert('mkey:'+s2[i][mkey]);
        //     }
        //     if(s=='KZDM'){
        //         alert('kzdm:'+s2[i]['KZDM']);
        //     }
        // }
        //alert(s2[i]['KZDM']+":"+s2[i][mkey]);

        ldata.push(s2[i][section]);
        pd.push(s2[i][mkey]);
    }
    console.log('-----gainData-------')
    console.log(pd)
    console.log(ldata)
    console.log('-----gainData end-------')
    goption = AssignOption(name,subname,seriesname,ldata,pd);
}

// function getExparam(legenddata,pdata) {
//     var data=[];
//     // console.log("legenddata:"+legenddata)
//     // console.log("pdata:"+pdata)
//     for( var i=0;i < legenddata.length;i++){
//
//         var item={
//             value:pdata[i],
//             name:legenddata[i]
//         }
//         // console.log("item"+i+":"+item['value']+","+item['name'])
//         data.push(item);
//     };
//     // console.log("data:"+data)
//     return data;
// }


function sortParam(legenddata,pdata) {
    var dic = new Object();
    if(pdata.length>10){
        // 排序
        for(var i=0; i < pdata.length-1;i++){
            for (var j=i+1;j<pdata.length;j++){
                if(parseInt(pdata[i])>parseInt(pdata[j])){
                    var tmp = pdata[i];
                    pdata[i]=pdata[j];
                    pdata[j]=tmp;

                    tmp = legenddata[i];
                    legenddata[i]=legenddata[j];
                    legenddata[j]=tmp;
                }
            }
        }

        ldd=[]
        pdd=[]

        var leng = pdata.length-8;
        for(var i=0;i<(leng)/2;i+=2){
            tmp=pdata[i];
            pdata[i]=pdata[leng-1-i];
            pdata[leng-1-i]=tmp;
        }

        console.log(legenddata)
        console.log(pdata)


        var tmp=pdata[pdata.length-2];
        pdata[pdata.length-2]=pdata[pdata.length-7];
        pdata[pdata.length-7] = tmp;
        tmp=legenddata[pdata.length-2];
        legenddata[pdata.length-2]=legenddata[pdata.length-7];
        legenddata[pdata.length-7] = tmp;

        tmp=pdata[pdata.length-4];
        pdata[pdata.length-4]=pdata[pdata.length-5];
        pdata[pdata-5] = tmp;
        tmp=legenddata[pdata.length-4];
        legenddata[pdata.length-4]=legenddata[pdata.length-5];
        legenddata[pdata.length-5] = tmp;

        tmp=pdata[pdata.length-1];
        pdata[pdata.length-1]=pdata[pdata.length-5];
        pdata[pdata.length-5] = tmp;

        tmp=legenddata[pdata.length-1];
        legenddata[pdata.length-1]=legenddata[pdata.length-5];
        legenddata[pdata.length-5] = tmp;

        console.log("pdata::::::::")
        console.log(pdata)
        console.log(legenddata)
        console.log("legenddata::::::::")

        //分割组合
        step = Math.floor((pdata.length)/8);
        console.log(step)
        var j=1;
        for(var i=0;i<pdata.length-8;i++){
            if(0==(i%step)){
              ldd.push(legenddata[legenddata.length-j])
              pdd.push(pdata[pdata.length-j])
              j++;
            }
            pdd.push(pdata[i])
            ldd.push(legenddata[i])
        }
        while(j<=8){
            ldd.push(legenddata[legenddata.length-j])
            pdd.push(pdata[pdata.length-j])
            j++;
        }
        legenddata=ldd;
        pdata=pdd;

        console.log("pdata::::::::")
        console.log(pdata)
        console.log("legenddata::::::::")
        console.log(legenddata)
    }
    dic.legenddata=legenddata;
    dic.pdata=pdata;
    return dic;
}
/**
 * 参数整理
 * @param legenddata
 * @param pdata
 * @returns {Array}
 */
function getparam(legenddata,pdata){
    var dic = sortParam(legenddata,pdata)
    legenddata = dic.legenddata
    pdata = dic.pdata
    var data=[];
    for( var i=0;i < legenddata.length;i++){
        var digital = parseInt(pdata[i]);
        if(isNaN(pdata[i])||digital==0){
            continue;
        }
        var item={
            itemStyle:{
                show:true ,
                normal: {
                    label: {
                        show: true,
                        formatter: "{b} : {c} ({d}%)"
                    },
                    labelLine: {
                        show: true
                    }
                },
                emphasis: {
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: true
                    }
                }
            },
            value:pdata[i],
            name:legenddata[i]
        }
        data.push(item);
    };
    return data;
}

/**
 * 词法分析
 * @param data
 * @returns {Array} [{key:value,key:value},{key:value,key:value}]
 * @constructor
 */
function ParseData(data) {
    var s2=[],s1={},s0='';
    for(var i=0;i<data.length;i++){
        if(data[i]=='{'){
            ++i;
            while (data[i]!='}'){
                if(data[i]==','){
                    i++;
                    if(s0!=null&&s0.length!=0){
                        var str = s0.split('=');
                        s1[str[0]] = str[1];
                        // alert(str[0]+":"+str[1])
                        s0='';
                        continue;
                    }
                }
                if(data[i]==' ')i++;
                s0+=data[i];
                ++i;
            }
        }

        if(data[i]=='}'){
            if(s0!=null&&s0.length!=0){
                var str = s0.split('=');
                if(str[1]!=null&&str[1].length!=0){
                    s1[str[0]] = str[1];
                }else {
                    str[str[0]] = 0;
                }
                s0='';
            }
            i++;
            // var st = '';
            // for (var s in s1){
            //     st = st + s + ':' + s1[s] + ',';
            // }
            if(data[i]==',')i++;
            if(s1!=null&&s1.length!=0) {
                s2.push(s1);
                s1 = {};
            }
        }
    }
    console.log("s2")
    console.log(s2)
    console.log("end")
    return s2;
}


/**
 *
 * @param name 名称
 * @param subname 子名称
 * @param seriesname section各污染物含量的统计
 * @param legenddata 图例{化学需氧产生量,...}
 * @param pdata series的date数据
 * @returns {{title: {text: string, subtext: string}, tooltip: {trigger: string}, legend: {data: string[]}, toolbox: {show: boolean, feature: {mark: {show: boolean}, dataView: {show: boolean, readOnly: boolean}, restore: {show: boolean}, saveAsImage: {show: boolean}}}, xAxis: *[], yAxis: *[], series: *[]}}
 * @constructor
 */
function ExOption(name,subname,seriesname,legenddata,pdata) {


    // console.log("-------ExOption begin-----------");
    // console.log("name:"+name);
    // console.log("subname:"+subname);
    // console.log("legenddata:"+legenddata);
    // console.log('pdata:'+pdata);
    // console.log("-------ExOption end-----------");

    var option = {
        title : {
            x:'center',y:'top',
            text: name,
            //subtext: subname
        },
        tooltip : {
            trigger: 'axis'
        },
        grid:{
            x:'20%',
            y:'10%',
            x2:'10%',
            y2:'20%'
        },
        legend: {
            data:['排放量'],
            x:'center',
            y:'90%',
            textStyle:{
                fontSize:15
            }
        },
        toolbox: {
            show : true,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        xAxis : [
            {
                name : '污染指标',
                nameTextStyle:{
                    verticalAlign: 'bottom',
                    fontSize: 17
                },
                type : 'category',
                data : legenddata,
                axisLabel: {
                    // x:'bottom',
                    // x:'center',
                    // interval:0,
                    // rotate:10,
                    formatter: '{value}',
                    // textStyle:{
                    //     fontSize:15
                    // }
                }
            }
        ],
        yAxis : [
            {
                name : '排放量',
                nameTextStyle:{
                    fontSize: 17
                },
                axisLabel: {
                    show:true,
                    formatter: '{value}',
                    textStyle:{
                        fontSize:15,
                    }
                },
                type : 'value'
            }
        ],
        series : [
            {

                barWidth : 30,//柱图宽度
                itemStyle :
                // insideTop
                    { normal: {label : {show: true, position: 'top',textStyle:{color:'#000'}}}},
                name:'排放量',
                type:'bar',
                data:pdata
            }
        ]
    };
    return option;
}

/**
 * 基于元素的分析赋值
 * @param name 图名
 * @param subname 图子名
 * @param seriesname 序列名
 * @param legenddata 图例
 * @param pdata 图例对应的数据
 * @returns {{title: {text: *, subtext: *, x: string}, tooltip: {trigger: string, formatter: string}, legend: {orient: string, x: string, y: string, data: *}, series: *[]}}
 * @constructor
 */
function AssignOption(name,subname,seriesname, legenddata,pdata) {
    var data = getparam(legenddata,pdata);
    legenddata=[]
    for(var i = 0;i<data.length;i++){
        legenddata[i]=data[i].name
    }
    // console.log(data)
    var option = {
        title : {
            text: name,
            subtext: subname,
            x:'center'
        },
        tooltip : {
            show : false,
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
      /*  color:['rgba(255,0,0,1)', 'rgba(0,255,0,1)', 'rgba(0,0,255,1)',
            'rgba(255,128,0,1)', 'rgba(0,255,255,1)', 'rgba(255,0,255,1)',
            'rgba(128,0,0,0.5)', 'rgba(0,128,0,1)', 'rgba(0,0,128,1)',
            'rgba(128,128,0,1)', 'rgba(128,0,128,1)', 'rgba(0,128,128,1)',
            'rgba(128,128,128,1)', 'rgba(54,0,54,1)', 'rgba(0,54,0,1)'],*/
        toolbox: {
            show : true,
            feature : {
                mark : {show: false},
                dataView : {show: true, readOnly: true},
                magicType : {
                    show: true,
                    type: ['pie'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'left',
                            max: 1548
                        }
                    }
                },
                restore : {show: true},//配置还原项
                saveAsImage : {show: true}
            }
        },
        legend: {
            orient: 'vertical',//
            x: 'right',
            y:'35',
            data: legenddata
        },
        backgroundColor: '#F0FFFF',
        series : [
            {
            	name: seriesname,
                type: 'pie',
                radius : '55%',
                selectedMode: 'single',
                //roseType: 'angle',
                center: ['40%', '60%'],
                data:data,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
        
    };
    return option;
}

/**
 * 图形绘制
 */
function  drawCoordinate() {

    //var option = getOptionExample();
    // 基于准备好的dom，初始化echarts实例
    // 使用刚指定的配置项和数据显示图表。
    var myChart = echarts.init(document.getElementById('Mydraw'));
    //var myChart = echarts.init($('#Mydraw'));//document.getElementById('#Mydraw')
    // 指定图表的配置项和数据
    myChart.setOption(goption);
}
