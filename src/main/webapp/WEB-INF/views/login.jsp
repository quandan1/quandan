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
    <title></title>
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
        <span>辽河流域排污许可分配系统</span>
        <hr class="line-bottom"/>
    </div>

    <!-- BEGIN LOGIN -->
    <div class="content">
        <!-- BEGIN LOGIN FORM -->
        <form class="login-form" action="rest/user/login" method="post">
            <!--
                <div class="flex-row">
                    <div class="flex-rox border-bottom" style="align-items: flex-start">
                        <h3 ><strong><i style="margin-left:50px">辽宁省水环境综合管理系统</i></strong></h3>
                        <h4 style="color: #5bc0de;filter: brightness(1.5);;font-family: 'Comic Sans MS'"><strong>Environmental protection
                            project of Liaoning</strong></h4>
                    </div>
                </div>
            -->
            <div style="padding-left: 25px;padding-right: 25px">
                <%--                <div class="m-bottom flex" style="justify-content: space-between">
                                    <!--
                                        <label class="radio-inline">
                                            <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"
                                                   checked="checked"> <strong>省级</strong>
                                        </label>
                                        <label class="radio-inline">
                                            <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> <strong>市级</strong>
                                        </label>
                                        <label class="radio-inline">
                                            <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> <strong>县区级</strong>
                                        </label>
                                    -->
                                    <label class="radio-inline,demo--label">
                                        <input class="demo--radio" type="radio" name="inlineRadioOptions" id="inlineRadio1"
                                               value="option1">
                                        <span class="demo--checkbox demo--radioInput"></span><span>省级</span>
                                    </label>
                                    <label class="radio-inline,demo--label">
                                        <input class="demo--radio" type="radio" name="inlineRadioOptions" id="inlineRadio2"
                                               value="option2">
                                        <span class="demo--checkbox demo--radioInput"></span><span>市级</span>
                                    </label>
                                    <label class="radio-inline,demo--label">
                                        <input class="demo--radio" type="radio" name="inlineRadioOptions" id="inlineRadio3"
                                               value="option3">
                                        <span class="demo--checkbox demo--radioInput"></span><span>县区级</span>
                                    </label>
                                </div>--%>

                <div class="flex" id="regioncontainer">
                    <%-- <div id="forprovince" style="display: inline-block;">
                         <select class="form-control" id="province">
                             <option>辽宁&nbsp&nbsp&nbsp</option>
                         </select>
                     </div>--%>

                    <%--<div id="forcity" style="display: inline-block;">
                        <select name="usercity" class="form-control" id="usercity" style="width: auto">
                            <option value="辽宁">辽宁</option>
                            <option value="沈阳">沈阳</option>
                            <option value="大连">大连</option>
                            <option value="鞍山">鞍山</option>
                            <option value="抚顺">抚顺</option>
                            <option value="本溪">本溪</option>
                            <option value="丹东">丹东</option>
                            <option value="锦州">锦州</option>
                            <option value="营口">营口</option>
                            <option value="阜新">阜新</option>
                            <option value="辽阳">辽阳</option>
                            <option value="盘锦">盘锦</option>
                            <option value="铁岭">铁岭</option>
                            <option value="朝阳">朝阳</option>
                            <option value="葫芦岛">葫芦岛</option>
                        </select>
                    </div>--%>

                    <div id="forrestrict" style="display: inline-block;">
                        <%--<select class="form-control" name="county" id="county">
                            <option>辽宁&nbsp&nbsp&nbsp</option>
                        </select>--%>
                    </div>
                </div>


                <div class="alert alert-danger hide alert-dismissible">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <span>输入您的用户名和密码</span>
                </div>
                <%--<c:out value="${error}"></c:out>--%>
                <c:choose>
                    <c:when test="${error!=null}">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                                    aria-hidden="true">&times;</span></button>
            <%-- <span>用户名或密码错误!</span>--%>
                            <span>${error}</span>
                        </div>
                    </c:when>
                </c:choose>

                <c:choose>
                    <c:when test="${wrong!=null}">
                        <div class="alert alert-danger alert-dismissible" id="typeerror">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                                    aria-hidden="true">&times;</span></button>
                            <span>区域错误</span>
                        </div>
                    </c:when>
                </c:choose>

                <div class="alert alert-danger hide alert-dismissible" id="typeerror">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <span>区域错误</span>
                </div>
                <div class="form-group" >
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <div class="input-group" style="margin-bottom: 0px">
                        <span class="input-group-addon">
							<i class="glyphicon glyphicon-user">&nbsp;用户名</i>
                        </span>
                        <input name="username" id="username" size="25" value="starzou"
                               class="form-control" style="width: 100%;height: 40px;"
                               type="text" autocomplete="off" placeholder=""/>
                    </div>
                    <div class="input-group" >
                        <span class="input-group-addon">
								<i class="glyphicon glyphicon-lock">&nbsp;密&nbsp;码</i>
                        </span>
                        <input name="password" id="password" size="25" value="123456"
                               class="form-control" style="width: 100%;height: 40px;"
                               type="password" autocomplete="off" placeholder=""/>
                    </div>
                </div>
                <div style="text-align: right;">
                    <a href="/rest/page/find" style="color: white">忘记密码？</a>
                </div>
                <%--                <label class="demo--label" style="margin-top:10px;">
                                   <input class="demo--radio" type="checkbox" name="" id="" value="">
                                    <span class="demo--checkbox demo--radioInput"></span><span>记住账户名</span>
                                </label>--%>
                <div class=""style="">
                    <!-- <label class="checkbox" style="display: block">
                        <input type="checkbox" name="remember" value="1"/> 记住我 </label> -->
                    <button id="loginBut" type="submit" class="btn btn-info"
                            style="width: 100%;height:40px;padding: 12px 0px;margin-top:10px">
                        登&nbsp;录
                    </button>
                </div>
            </div>
            <%--<div class="create-account">--%>
            <%--<p>--%>
            <%--如果您没有账号，请向管理员申请。--%>
            <%--</p>--%>
            <%--</div>--%>
        </form>
        <!-- END LOGIN FORM -->
    </div>
    <!-- END LOGIN -->

    <!-- BEGIN COPYRIGHT -->
    <div class="copyright" style="position: fixed;bottom: 0">
        2018 &copy; NEU & SYLU
    </div>
    <!-- END COPYRIGHT -->
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
<script>
    jQuery(document).ready(function () {
        App.init();
        Login.init();
    });
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>