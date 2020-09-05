<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<!-- -->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8"/>
  <title>辽河流域污染物输入响应分析可视化系统</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
  <meta content="" name="description"/>
  <meta content="" name="author"/>
  <meta name="MobileOptimized" content="320">

  <!-- BEGIN GLOBAL MANDATORY STYLES -->
  <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
  <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
  <!-- END GLOBAL MANDATORY STYLES -->

  <!-- BEGIN THEME STYLES -->
  <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
  <link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
  <!-- END THEME STYLES -->
  <link rel="stylesheet" href="app/js/Ueditor/themes/default/css/ueditor.css">
  <link rel="shortcut icon" href="app/img/favicon.ico"/>
  <link rel="stylesheet" type="text/css" href="app/css/tipso.css">

  <link rel="stylesheet" href="app/css/header.css" />
  <!--引用阿里巴巴的图标-->
  <link rel="stylesheet" href="app/css/font.css" />
  <script type="text/javascript" src="app/js/jquery-3.5.1.js"></script>
  <script type="text/javascript" src="app/js/header.js"></script>


</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body>
<!-- BEGIN HEADER -->
<!--头部-->
<div class="tobBar">
  <!--系统图标-->
  <div class="tobBar-logo">
    <!--图标-->
    <img src="app/img/logo.jpg" />
    <!--字体-->
    <span>辽河流域水环境综合管理调控平台</span>
  </div>
  <!--导航栏-->
  <div class="tobBar-list">
    <ul class="tobBar-nav">
      <li><a href="#"><i class="iconfont">&#xe602;</i>功能分区管控</a></li>
      <li class="active"><a href="javascript:;" id="pwxk"><i class="iconfont">&#xe6c0;</i>排污许可分配</a></li>
      <li><a href="#"><i class="iconfont">&#xe604;</i>承载力监测</a></li>
      <li><a href="#"><i class="iconfont">&#xe607;</i>大数据支持</a></li>
    </ul>
  </div>
  <!--用户信息-->
  <div class="tobBar-users">
    <ul>
      <li><a href="javascript:;"><i class="iconfont">&#xe617;</i>${userInfo.username }</a></li>
      <li><a href="javascript:;"><i class="iconfont">&#xe603;</i>修改信息</a></li>
      <li><a href="rest/user/logout"><i class="iconfont">&#xe638;</i>退出</a></li>
    </ul>
  </div>
</div>
<!--子菜单-->
<div class="tabs" id="tabs">
  <ul>
    <!--把对应的请求写到href里面就行-->
    <li><a href="#">控制单元信息</a></li>
    <li><a href="rest/page/newQmp" id="newQmp" >
      监测断面信息
    </a></li>
    <li><a href="rest/page/kzdmwater" id="kzdmwater">
      断面水质识别
    </a></li>
    <li><a href="rest/page/qmpAnalysis" id="qmpAnalysis">
      水质变化趋势分析
    </a></li>
<%--    <li><a href="#">污染源信息</a></li>--%>
    <li><a href="#">单元负荷核定</a></li>
    <li><a href="#">单元容量计算</a></li>
    <li><a href="#">排污许可分配</a></li>
    <li><a href="#">浓度总量双控</a></li>
  </ul>

  <span id="jumpOrNot" display="none">1</span>
  <input id="myRole" type="hidden" value="${role}"/>
  <input id="jumpTmp" type="hidden" value=""/>
  <input id="city" type="hidden" value=""/>

</div>
<!-- END HEADER -->

<!-- BEGIN CONTAINER -->
<div >
  <!-- BEGIN SIDEBAR -->
    <!-- BEGIN CONTENT -->
      <div class="page-content">
        <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
        <div class="modal fade" id="portlet-config" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel"
             aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true"></button>
                <h4 class="modal-title">Modal title</h4>
              </div>
              <div class="modal-body">
                Widget settings form goes here
              </div>
              <div class="modal-footer">
                <button type="button" class="btn blue">
                  Save changes
                </button>
                <button type="button" class="btn default" data-dismiss="modal">
                  Close
                </button>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
        <!-- /.modal -->
        <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->


        <!-- BEGIN PAGE HEADER-->
        <div class="row">
          <div class="col-md-12">
            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
            <h3 class="page-title" style="">
              <div style="padding-bottom: 10px;border-bottom: 2px solid #F3F3F3">
                <div style="border-left: solid 10px #00C0C2;padding-left: 2px;">
                  <div id="index-page-title"
                       style="padding-left:8px;border-left: solid 3px #00C0C2;">
                  </div>
                </div>
              </div>
            </h3>
            <!-- <ul class="page-breadcrumb breadcrumb">
                <li>
                    <i class="fa fa-home"></i>
                    <a href="javascript:;">
                        首页
                    </a>
                    <i class="fa fa-angle-right"></i>
                </li>
                <li>
                    <a href="javascript:;">
                        Dashboard
                    </a>
                </li>
            </ul> -->
            <!-- END PAGE TITLE & BREADCRUMB-->
          </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->
        <div id="main-content"></div>

        <!-- END PORTLET-->
      </div>
    </div>
    <!-- END CONTENT -->

  <!-- END CONTAINER -->
  <!-- BEGIN FOOTER -->
  <div class="footer">
    <div class="footer-inner">
      2017 &copy; By NEU&SYLU.
    </div>
    <div class="footer-tools">
      <span class="go-top"><i class="fa fa-angle-up"></i></span>
    </div>
  </div>
  <!--[if lt IE 9]>
  <script src="assets/plugins/respond.min.js"></script>
  <script src="assets/plugins/excanvas.min.js"></script>
  <![endif]-->

  <script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
  <script src="assets/plugins/bootstrap/js/bootstrap.js" type="text/javascript"></script>
  <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js"
          type="text/javascript"></script>
  <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
  <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
  <script src="assets/plugins/select2/select2.min.js" type="text/javascript"></script>
  <script src="assets/scripts/app.js" type="text/javascript"></script>
  <script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
  <script src="app/js/index.js" type="text/javascript"></script>
  <script src="app/js/init-arcgis.js"></script>
  <script type="text/javascript" src="app/js/tipso.js"></script>
</div>
</body>
</html>
