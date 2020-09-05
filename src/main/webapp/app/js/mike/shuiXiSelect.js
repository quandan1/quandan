

$(document).ready(function() {

    var str = "<select id='sheng'></select><select id='shi'></select><select id='qu'></select>";//三个下拉交给一个字符串
    $("#sanji").html(str);//将三个下拉的字符串交给前边的div
    tiansheng();//加载省的数据
    tianshi();//加载市的数据
    tianqu();//加载区 的数据

    $("#sheng").change(function(){
        tianshi();//重新加载市
        tianqu();//重新加载区
    })
    $("#shi").change(function(){
        tianqu();//加载区的数据
    })
});


function tiansheng()
{
    var pcode = "0001"; //找出省的父级代号
    $.ajax({
        async:false,//同步
        url:"rest/mike/shuixi",
        data:{pcode:pcode},
        type:"POST",
        dataType:"TEXT",
        success: function(data){
            alert(data);
        }
    });
}

// function tianshi()
// {
//     var pcode = $("#sheng").val();//找市的父级代号，省选中项的值
//     $.ajax({
//         async:false,
//         url:"sanchuli.php",
//         data:{pcode:pcode},
//         type:"POST",
//         dataType:"TEXT",
//         success: function(data){
//             var hang = data.split("|");
//             var str = "";
//             for(var i=0;i<hang.length;i++)
//             {
//                 var lie = hang[i].split("^");
//                 str += "<option value='"+lie[0]+"'>"+lie[1]+"</option>";
//             }
//             $("#shi").html(str);
//         }
//     });
// }
//
// function tianqu()
// {
//     var pcode = $("#shi").val();//找区的父级代号，市选中项的值
//     $.ajax({
//         url:"sanchuli.php",
//         data:{pcode:pcode},
//         type:"POST",
//         dataType:"TEXT",
//         success: function(data){
//             var hang = data.split("|");
//             var str = "";
//             for(var i=0;i<hang.length;i++)
//             {
//                 var lie = hang[i].split("^");
//                 str += "<option value='"+lie[0]+"'>"+lie[1]+"</option>";
//             }
//             $("#qu").html(str);
//         }
//     });
//}












// $("#sel1").change(function(){
//
//     var shuixi = $("#sel1").val();
//     //alert(shuixi);
//
//     $.ajax({
//         type:"POST",// get或者post
//         url:"rest/mike/yiji",// 请求的url地址
//         data:{shuixi : shuixi},//请求的参数
//         dataType:"json",//json写了jq会帮我们转换成数组或者对象 他已经用JSON.parse弄好了
//         success: function(data) {
//             var html="<option value=\"0\" selected>一级河流选择</option>";
//             for (var i = 0; i < data.length; i++) {
//                 html+="<option value='"+data[i].yijiheliu+"'>"+data[i].yijiheliu+"</option>";
//             };
//             $("#sel2").html(html);
//             //alert(data[0].yijiheliu);
//         },
//     })


// });








