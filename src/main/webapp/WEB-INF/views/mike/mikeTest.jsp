</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="app/js/echart/echarts.js"></script>
    <script type="text/javascript" src='app/js/mike/mikeTest.js'></script>

    <script type="text/javascript" src='app/js/bootstrap.js'></script>


    <link rel="stylesheet" type="text/css" href="app/css/mike/mikeTest.css">



    <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
    <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
    <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">

    <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
    <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">


    <link type="text/javascript" href="app/js/3.20/init.js">

    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>




    <link  rel="stylesheet" href="app/css/mike/jquery-ui.min.css" />
    <!-- 引入jQuery的js文件 -->
    <script type="text/javascript" src="app/js/jquery/jquery-1.7.2.min.js" ></script>
    <!-- 引入jQuery UI的js文件 -->
    <script type="text/javascript" src="app/js/jquery/jquery-ui.js" ></script>



<style>
    li{
        list-style: none;
        width: 200px;
    }
</style>

<%--    echart--%>
</head>
<body>
    河流：<input id="haha" >
    <button id="select">选择</button>
    <div id="map">

    </div>
    <button id="mytype">展示</button>
    <div id="second" style="height:400px;width: 550px;float:right;border: 1px solid#000"></div>

    <div style="width: 200px;height: 80px">
        <input id="inp1" placeholder="请输入河流名称" style="width: 200px">
        <div id="lsn" style="width: 200px">

        </div>
    </div>



</body>


</html>
<script>
$(document).ready(function() {
    $("#inp1").keyup(function() {
        var uname = $(this).val();
        var reg = /^[\u4e00-\u9fa5]+$/;

//&&reg.test(uname)
        if(uname != ""&&reg.test(uname)){
            $("#lsn").show();
            $.ajax({
                url:"rest/mike/test",
                type:"post",
                data:{"term":uname},
                dataType:"json",
                async:true,
                success:function(result){
                    var html="";
                    for(var i = 0;i < result.length ; i++){
                      html+="<li>"+result[i]+"</li>";
                    }

                    $("#lsn").html(html);
                    $("li").unbind("click").bind("click", function(){
                        $("#inp1").val($(this).html());
                        $("#inp1").focus();
                        $("#lsn").hide();
                    });
                }
              });

        }else{
            $("#lsn").html("");
            $("#lsn").hide();
        }





    })
    })
</script>




