

$(document).ready(function() {

    $('#tbl1').fixedHeaderTable({ footer: true, altClass: 'odd' });
    $('#tbl2').fixedHeaderTable({ footer: true, altClass: 'odd' });

    var str = "<select id='sheng'></select> <select id='shi'></select>    <select id='qu'></select> <select id='hr'></select>";//三个下拉交给一个字符串
    $("#listAll").html(str);//将三个下拉的字符串交给前边的div
    tiansheng();//加载省的数据
    tianshi();//加载市的数据
    tianqu();//加载区 的数据
    tianhr();//加载 的数据

    $("#sheng").change(function(){
        tianshi();//重新加载市
        tianqu();//重新加载区
        tianhr();//加载区 的数据
    });
    $("#shi").change(function(){
        tianqu();//加载区的数据
        tianhr();//加载区 的数据
    });
    $("#qu").change(function(){
        tianhr();//加载区 的数据
    });

    $("#hr").change(function(){


        var sheng = $("#sheng").val();
        var shi = $("#shi").val();
        var qu = $("#qu").val();
        var hr = $("#hr").val();
        if(sheng  != 0 && shi !=0 && qu !=0 && hr ==99){
            var html ="<button id=\"show\">边界条件设置</button>\n" +
                "        </br>\n" +
                "        </br>\n" +
                "        <button id=\"start\">开始模拟</button>\n" +
                "        </br>\n" +
                "        </br>\n" +
                "        <button id=\"result\">模拟结果查看</button>\n" +
                "        </br>\n" +
                "        </br>\n" +
                "        <button id=\"export\">模拟结果导出</button>";

            $("#divbutton").html(html);

            $.ajax({
                url:"rest/mike/newOne",
                data:{
                    sheng:sheng,
                    shi:shi,
                    qu:qu
                },
                type:"POST",
                async:false,
                dateType: "json",
                success: function(data){

                    var ht="";
                    for (var i = 0; i < data.length; i++) {
                        ht+="<tr><td>"+data[i].qiyename+"</td>";
                        ht+="<td>"+data[i].liuliang+"</td>";
                        if(data[i].codnd==null){
                            ht+="<td>无</td>";
                        }else{
                            ht+="<td>"+data[i].codnd+"</td>";
                        }
                        if(data[i].codpfl==null){
                            ht+="<td>无</td>";
                        }else{
                            ht+="<td>"+data[i].codpfl+"</td>";
                        }
                        if(data[i].tnnd==null){
                            ht+="<td>无</td>";
                        }else{
                            ht+="<td>"+data[i].tnnd+"</td>";
                        }
                        if(data[i].tnpfl==null){
                            ht+="<td>无</td>";
                        }else{
                            ht+="<td>"+data[i].tnpfl+"</td>";
                        }
                        if(data[i].tpnd==null){
                            ht+="<td>无</td>";
                        }else{
                            ht+="<td>"+data[i].tpnd+"</td>";
                        }
                        if(data[i].tppflc==null){
                            ht+="<td>无</td></tr>";
                        }else{
                            ht+="<td>"+data[i].tppfl+"</td></tr>";
                        }
                        // ht+="<td>"+data[i].codnd+"</td>";
                        // ht+="<td>"+data[i].codpfl+"</td>";
                        // ht+="<td>"+data[i].tnnd+"</td>";
                        // ht+="<td>"+data[i].tnpfl+"</td>";
                        // ht+="<td>"+data[i].tpnd+"</td>";
                        // ht+="<td>"+data[i].tppfl+"</td></tr>";
                    };

                    $('#tbl1').fixedHeaderTable({ footer: true, altClass: 'odd' });

                    $("#tbd1").html(ht);
                    alert("新建成功");

                }
            });

        }

    });


});


function tiansheng() {
    var pcode = "0001"; //找出省的父级代号
    $.ajax({
        async:false,//同步
        url:"rest/mike/getShuixi",
        data:{pcode:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
         var haha="<option value=\"0\" selected>水系选择</option>";
           // var haha="";

            for (var i = 0; i < data.length; i++) {
                haha+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#sheng").html(haha);
        }
    });
};

function tianshi() {
    var pcode = $("#sheng").val();//找市的父级代号，省选中项的值
    $.ajax({
        async:false,
        url:"rest/mike/getYiJi",
        data:{shuixi:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
           var html="<option value=\"0\" selected>一级河流选择</option>";
            //var html="";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].yijiheliu+"'>"+data[i].yijiheliu+"</option>";
            };
            $("#shi").html(html);

        }
    });
};

function tianqu() {
    var pcode = $("#shi").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getMoNi",
        data:{yiji:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
             var html="<option value=\"0\" selected>二级河流选择</option>";
            //var html="";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].moni+"'>"+data[i].moni+"</option>";
            };
            $("#qu").html(html);

        }
    });
};

function tianhr() {
    var pcode = $("#qu").val();//找区的父级代号，市选中项的值
    var pcode2 = $("#shi").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getFangan",
        data:{moni:pcode,
        yiji:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>方案选择</option>";
            html+="<option value=\"99\" >新建方案</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].fangan+"'>"+data[i].fangan+"</option>";
            };
            $("#hr").html(html);

        }
    });
};


$("#btn1").click(function(){
       var sheng = $("#sheng").val();
       var shi = $("#shi").val();
       var qu = $("#qu").val();
       var hr = $("#hr").val();


    if(sheng  != 0 && shi !=0 && qu !=0 && hr !=0 && hr !=99){
          var html ="<button id=\"show\">边界条件查看</button>\n" +
              "        </br>\n" +
              "        </br>\n" +

              "<button id=\"export\">条件设置导出</button>\n" +
              "        </br>\n" +
              "        </br>\n" +
              "        <button id=\"exportresult\">模拟结果导出</button>\n";
          $("#divbutton").html(html);
         alert(sheng+shi+qu+hr);
          $.ajax({
              url:"rest/mike/openresult",
              data:{
                  sheng:sheng,
                  shi:shi,
                  qu:qu,
                  hr:hr
              },
              type:"POST",
              dataType:"json",
              success: function(data){


              }
          });
         }else{
          alert("选择错误，请重新选择");
      }


    });
// $('#hr').on('change',"#tab1", function () {
//
//
//     $(this).fixedHeaderTable({ footer: true, altClass: 'odd' });
//
//
// })





$("body").on("click","#show",function(){
    if ($("#div1").css("display")== "none") {

        $("#div1").css("display","block");
    } else {

        $("#div1").css("display","none");
    };
});

// $("body").on("click","#tbl1",function(){
//
//     $('#tab1').fixedHeaderTable({ footer: true, altClass: 'odd' });
//
//   $('#tab2').fixedHeaderTable({ footer: true, altClass: 'odd' });
// });
function getShuJu() {
    var sheng = $("#sheng").val();
    var shi = $("#shi").val();
    var qu = $("#qu").val();
    $.ajax({
        url:"rest/mike/getShuJuList",
        data:{sheng:sheng,
            shi:shi,
            qu:qu,
            hr:hr},
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="原始数据：</br>\n" +
                "            <table id=\"tbl1\" class=\"tbl\">\n";
                html+="            <thead style=\"width: 400px;height: 20px;\" >\n" +
                    "                <tr>\n" +
                    "                    <th>企业名称</th>\n" +
                    "                    <th>详细地址</th>\n" +
                    "                    <th>污染源类型</th>\n" +
                    "                    <th>入河口位置（距源头里程）</th>\n" +
                    "                    <th>废水排放量（m^3/s）</th>\n" +
                    "                    <th>COD排放浓度（mg/l）</th>\n" +
                    "                    <th>氨氮排放浓度（mg/l）</th>\n" +
                    "                    <th>总磷排放浓度（mg/l）</th>\n" +
                    "                </tr>\n" +
                    "                </thead>\n" +
                    "                <tbody style=\"width: 400px;height: 80px;\" >\n"
            for (var i = 0; i < data.length; i++) {
                html+="<td>"+data[i].getQiyename+"</td>";
                html+="<td>面源</td>";
                html+="<td>"+data[i].getAddress+"</td>";
                html+="<td>"+data[i].getLicheng+"</td>";
                html+="<td>"+data[i].getLiuliang+"</td>";
                html+="<td>"+data[i].getCod+"</td>";
                html+="<td>"+data[i].getZn+"</td>";
                html+="<td>"+data[i].getZp+"</td>";
            };
            html+= "                </tbody> </table>";
            $("#div3").html(html);
        }
    });


}

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












    // var url = "rest/kzdm/list";
    // $.get(url, function(data) {
    //     $('#listAll').html(data);
    // });











