<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.0.3
Version: 1.5.5
Author: KeenThemes
Website: http://www.keenthemes.com/
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <title>修改密码</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <meta name="MobileOptimized" content="320">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL STYLES -->
    <!-- END PAGE LEVEL SCRIPTS -->
    <!-- BEGIN THEME STYLES -->
    <link href="assets/css/pages/login-soft.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME STYLES -->
    <!-- END THEME STYLES -->
    <link rel="shortcut icon" href="assets/app/img/favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
<div style="width:100%;height: 100%;" class="flex-login">
    <div class="title">
        <hr class="line-top"/>
        <span style="width: 80%">修改密码</span>
        <hr class="line-bottom"/>
    </div>

    <!-- BEGIN LOGIN -->
    <div class="content">
        <!-- BEGIN LOGIN FORM -->
        <form class="login-form" action="rest/user/update" method="post">
            <div class="form-group" style="margin-bottom: 0px">
                <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                <div class="list-group" style="margin-bottom: 0px">
                    <c:choose>
                        <c:when test="${msg!=null}">
                            <div class="alert alert-danger alert-dismissible">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                    <%-- <span>用户名或密码错误!</span>--%>
                                <span>${msg}</span>
                            </div>
                        </c:when>
                    </c:choose>
<%--                    <input name="username"  size="25"--%>
<%--                           class="placeholder-no-fix list-group-item" style="width: 100%;"--%>
<%--                           type="text" autocomplete="off" placeholder="请输入用户名"/>--%>
                    <input name="pwd1"  size="25"
                           class="placeholder-no-fix list-group-item" style="width: 100%;"
                           type="password" autocomplete="off" placeholder="请输入密码"/>
                    <input name="pwd2"  size="25"
                           class="placeholder-no-fix list-group-item" style="width: 100%;"
                           type="password" autocomplete="off" placeholder="再次输入密码"/>
                </div>
                <div class=""style="">
                    <!-- <label class="checkbox" style="display: block">
                        <input type="checkbox" name="remember" value="1"/> 记住我 </label> -->
                    <button id="loginBut" type="submit" class="btn btn-info"
                            style="width: 100%;height:40px;padding: 12px 0px;margin-top:10px">
                        修改密码
                    </button>
                </div>
            </div>

    </div>

</div>


<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js"
        type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="assets/scripts/app.js" type="text/javascript"></script>
<script src="assets/scripts/login-soft.js" type="text/javascript"></script>

<script src="app/lib/security/sha256.js" type="text/javascript"></script>
<script src="app/js/judgeRegion.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->

<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>
