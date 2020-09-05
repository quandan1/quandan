<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>断面补偿资金</title>

  <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
  <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
  <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
  <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">

  <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
  <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
  <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">

  <link type="text/javascript" href="app/js/3.20/init.js">

  <script type="text/javascript" src='app/js/qmp/qmpZijinCount.js'></script>
  <script type="text/javascript" src='app/js/qmp/searchQmp.js'></script>
  <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
  <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
  <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
  <script type="text/javascript">
    //下拉框交换JQuery
    $(function () {
      //移到右边
      $('#add').click(function () {
        //获取选中的选项，删除并追加给对方
        $('#select1 option:selected').appendTo('#select2');
      });
      //移到左边
      $('#remove').click(function () {
        $('#select2 option:selected').appendTo('#select1');
      });
      //全部移到右边
      $('#add_all').click(function () {
        //获取全部的选项,删除并追加给对方
        $('#select1 option').appendTo('#select2');
      });
      //全部移到左边
      $('#remove_all').click(function () {
        $('#select2 option').appendTo('#select1');
      });
      //双击选项
      $('#select1').dblclick(function () { //绑定双击事件
        //获取全部的选项,删除并追加给对方
        $("option:selected", this).appendTo('#select2'); //追加给对方
      });
      //双击选项
      $('#select2').dblclick(function () {
        $("option:selected", this).appendTo('#select1');
      });
    });

  </script>
</head>
<body>
<div id="all">
  <div id="up">
    <div id="left">
      <div>

      </div>


      <input type="text" id="jsonInput" class="hide"/>


      <div style="margin-top: 10px;">
        <div class="box"
             style="align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
          <div id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px">
            <a style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'>断面补偿资金计算</a>
          </div>
        </div>

        <div id="dmszsb_body">
          <div class="box"
               style="margin-bottom: 0px;border-top-left-radius: 0 !important;border-top-right-radius: 0px !important;">
            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;域</span>
              <select id="qysx" style="background: #ffffff;width: 100px">
                <option value="all">所有</option>
              </select>
            </div>

            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;份</span>
              <select id="nf" style="background: #ffffff;width: 100px">
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
              </select>
            </div>
            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>月份区间</span>
              <select id="start_month" style="background: #ffffff;width: 40px">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>
              <span>-</span>
              <%-- <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">--%>
              <%-- <span>结束月份</span>--%>
              <select id="end_month" style="background: #ffffff;width: 40px">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>
            </div>
            <%--</div>--%>
            <%--<div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                <span>类别</span>
                <select id="section_level" style="background: #ffffff;width: 100px">
                    <option value="86">86</option>
                    <option value="24">24</option>
                    <option value="7">7</option>
                </select>
            </div>--%>

            <div class="flex-row" style="border: none;width: 100%">
              <button type="button" class="btnz btnz-black" id="cal_dmbczj"
                      style="">计算
              </button>
            </div>
            <div class="flex-row" style="border: none;width: 100%">
              <button class="btnz btnz-black" id="click_bczjdm">补偿资金断面维护</button>
            </div>
            <%--<div class="flex-row" style="border: none;width: 100%">--%>
            <%--<button type="button" class="btnz btnz-black" id="export_dmbczj"--%>
            <%--style="">导出--%>
            <%--</button>--%>
            <%--</div>--%>
          </div>
        </div>
      </div>


    </div>
    <div id="right" style="position:relative">
      <div id="map" style="height:470px;width:100%"></div>
      <div id="qmpBilichi" class="box"
           style="width:80px !important;height:20px !important;position:absolute;left:31px;top:400px">
        <div class="head-title">
          <a class="" style="font-size: 15px">比例尺</a>
        </div>
      </div>
      <div id="qmpTuli" class="box"
           style="width:120px !important;height:180px !important;position:absolute;right:0px;top:250px">
        <div class="head-title">
          <a class="" style="font-size: 15px">水质类别</a>
        </div>
        <div class="flex" style="margin-bottom: 0px">
          <div style="width:15px;float:left">
            <img src="app/img/dmcategory1_new.png" style="width:24px;height:24px"/>
            <img src="app/img/dmcategory2.png" style="width:24px;height:24px;"/>
            <img src="app/img/dmcategory3.png" style="width:24px;height:24px"/>
            <img src="app/img/dmcategory4_new.png" style="width:24px;height:24px"/>
            <img src="app/img/dmcategory5.png" style="width:24px;height:24px"/>
            <img src="app/img/dmcategoryL5.png" style="width:24px;height:24px"/>
          </div>
          <div style="width:50px;float:left;margin-left:10px">
            <p style="margin-bottom: 5px">Ⅰ</p>
            <p style="margin-bottom: 5px">Ⅱ</p>
            <p style="margin-bottom: 5px">Ⅲ</p>
            <p style="margin-bottom: 5px">Ⅳ</p>
            <p style="margin-bottom: 5px">Ⅴ</p>
            <p style="margin-bottom: 5px">劣Ⅴ</p>
          </div>
        </div>
      </div>
    </div>

    <%--<div id="down2">--%>
    <%--<div id="listAll2" class="hide"></div>--%>
    <%--</div>--%>
    <div id="down">
      <form action="rest/qmp/dmbczjExportToExcel" method="post">
        <input id="exportToExcel" class="btn btn-success" type="submit"
               style="display: none;background-color:#00c0c2!important;margin-bottom: 2px;margin-top: 25px;" value="断面补偿资金计算表" name="断面补偿资金计算表"/>
        <input id="exportToExcel_kj" class="btn btn-success" type="submit"
               style="display: none;background-color:#00c0c2!important;margin-bottom: 2px;margin-top: 25px;" value="扣缴补偿资金详表" name="扣缴补偿资金详表"/>
        <input id="exportToExcel_hj" class="btn btn-success" type="submit"
               style="display: none;background-color:#00c0c2!important;margin-bottom: 2px;margin-top: 25px;" value="扣缴及补偿资金合计表" name="扣缴及补偿资金合计表"/>
        <input id="exportnf" style="display: none;" value="" name="exportnf"/>
        <input id="exportsm" style="display: none;" value="" name="exportsm"/>
        <input id="exportem" style="display: none;" value="" name="exportem"/>
        <input id="exportreg" style="display: none;" value="" name="exportreg"/>
      </form>
      <div id="listAll" style="width: auto"></div>
    </div>


    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-body" style="text-align: center">
            <img src="app/img/Loading.gif" width="100px" alt="">
            <strong>加载中，请稍后......</strong>
          </div>
        </div>
      </div>
    </div>
  </div>

  <%--<div id="down">--%>
  <%--<div id="listAll" style="width: auto"></div>--%>
  <%--</div>--%>
  <%--<button type="button" class="btnz btnz-info"  style="">导出</button>--%>
  <!-- Modal -->
  <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title"><strong>参与断面资金计算断面维护</strong></h1>
        </div>
        <div class="modal-body" style="height:230px;">
          <div style="width: 100%;display: flex;flex-direction: row;justify-content: center">
            <div>
              <p>所有控制断面</p>
              <select multiple="multiple" id="select1"
                      style="width:150px;height:200px; float:left; border:1px #A0A0A4 outset; padding:4px; ">
              </select>
            </div>
            <div style="float:left;margin-top: 30px"> <span id="add">
          <input type="button" class="btn" value=">" style="background-color: #00000033;width: 100%;margin: 2px"/>
          </span><br/>
              <span id="add_all">
          <input type="button" class="btn" value=">>" style="background-color: #00000033;width: 100%;margin: 2px"/>
          </span> <br/>
              <span id="remove">
          <input type="button" class="btn" value="<" style="background-color: #00000033;width: 100%;margin: 2px"/>
          </span><br/>
              <span id="remove_all">
          <input type="button" class="btn" value="<<" style="background-color: #00000033;width: 100%;margin: 2px"/>
          </span></div>
            <div>
              <p>已选资金补偿断面</p>
              <select multiple="multiple" id="select2"
                      style="width: 150px;height:200px; float:left;border:1px #A0A0A4 outset; padding:4px;">
              </select>
            </div>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          <button type="button" class="btn btn-default" id="save_change">保存更改</button>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
