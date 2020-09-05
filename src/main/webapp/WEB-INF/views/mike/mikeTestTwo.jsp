
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src='app/js/jquery/jquery-1.7.2.min.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
<%--    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>--%>
<%--    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>--%>
    <script type="text/javascript" src='app/js/mike/mikeTestTwo.js'></script>
    <link rel="stylesheet" type="text/css" href="app/css/mike/mikeTestTwo.css">


    <script type="text/javascript" src="app/js/jquery/jquery.fixedheadertable.js"></script>
    <link href="app/css/mike/defaultTheme.css" rel="stylesheet" media="screen" />
</head>
<body>
<%--<button id="read">读取指定文件夹中文件</button>--%>
<%--<button id="open">选中并打开文件</button>--%>
<%--<button id="readresult">读取指定文件夹中结果文件</button>--%>
<%--<button id="openresult">选中并打开结果文件</button></body></br>--%>
<%--<button id="toTxt">水位生成Txt</button>--%>
<%--<button id="toAd11">水位生成Txt</button>--%>
<%--<div id="listAll" style="width: auto"></div>--%>
<%--<div id="listAll2" style="width: auto"></div>--%>



<%--<div id="selectRiver">--%>
<%--    <div id="listAll">--%>

<%--    </div>--%>
<%--        </br>--%>
<%--    <div id="list2">--%>
<%--        <button id="btn1">选择当前项目查看</button>--%>

<%--        <input style="display:none" id="inp1">--%>

<%--&lt;%&ndash;        <div id ="div2"  style="display:none">&ndash;%&gt;--%>

<%--&lt;%&ndash;            <button id="btn3">新建项目</button>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>

<%--    </div>--%>
<%--        </br>--%>
<%--&lt;%&ndash;    <div id="divbutton">&ndash;%&gt;--%>

<%--&lt;%&ndash;    </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;    <div id="div1" >&ndash;%&gt;--%>
<%--&lt;%&ndash;        <div id="div3" style="height: 200px;width: 600px">&ndash;%&gt;--%>
<%--&lt;%&ndash;           原始数据：</br>&ndash;%&gt;--%>
<%--&lt;%&ndash;           <table id="tbl1" class="fancyTable">&ndash;%&gt;--%>
<%--&lt;%&ndash;         <thead style="width: 400px;height: 20px;" >&ndash;%&gt;--%>
<%--&lt;%&ndash;               <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>企业名称</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>废水排放量（t/a）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>COD浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>COD排放量（t/a）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>氨氮浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>氨氮排放量（t/a）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th>总磷浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                   <th> 总磷排放量（t/a）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <tbody style="width: 400px;height: 80px;" id="tbd1" >&ndash;%&gt;--%>
<%--&lt;%&ndash;           </tbody>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </table>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </br>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <div id="div4" style="height: 200px;width: 600px">&ndash;%&gt;--%>
<%--&lt;%&ndash;            可修改数据：<button>新增</button></br>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <table id="tbl2" class="tbl">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <thead style="width: 400px;height: 20px;" >&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>名称</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>类型（点元面源）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>入河口位置（上下游里程）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>废水排放量（m^3/s）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>COD排放浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>氨氮排放浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>总磷排放浓度（mg/l）</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>企业名称</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <th>？？？</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>操作</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tbody style="width: 400px;height: 20px;" >&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1">1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1">1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1" >1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><input value="1">1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td>1</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <td><button>删除</button></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </tbody>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </table>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>

<%--    </div>--%>
<div style="width: 400px;height: 400px;">

    <table id="tbl1" class="tbl" style="border: 1px solid #000;">
        <thead style="width: 400px;height: 20px;" >
        <tr>
            <th>1</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
        </tr>
        </thead>
        <tbody style="width: 400px;height: 380px;">
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        </tbody>
    </table>
    <table id="tbl2" class="tbl" style="border: 1px solid #000;">
        <thead style="width: 400px;height: 20px;" >
        <tr>
            <th>1</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
            <th>qwe</th>
        </tr>
        </thead>
        <tbody style="width: 400px;height: 380px;">
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        <tr>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>
            <td>123</td>


        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
<script type="text/javascript">

    $(document).ready(function() {
        //  $('#tbl1').fixedHeaderTable({ footer: true, cloneHeadToFoot: true, altClass: 'odd', autoShow: false });

        //   $('#tbl1').fixedHeaderTable('show', 1000);

        $('#tbl1').fixedHeaderTable({ footer: true, altClass: 'odd' });
        $('#tbl2').fixedHeaderTable({ footer: true, altClass: 'odd' });

        // $('#tbl1').fixedHeaderTable({ altClass: 'odd', footer: true, fixedColumns: 1 });

        // $('#tbl1').fixedHeaderTable({ altClass: 'odd', footer: true, fixedColumns: 1 });

        // $('#tbl1').fixedHeaderTable({ altClass: 'odd', footer: true, cloneHeadToFoot: true, fixedColumns: 3 });
    });
</script>