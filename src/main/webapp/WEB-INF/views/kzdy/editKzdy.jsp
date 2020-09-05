<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
    <h3>修改控制单元</h3>
    <form id="editForm">
        <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
            <tr hidden="true">
                <td width="90" align="right">控制单元id</td>
                <td><input type="text" name="id" id="id" size="60" value="${kzdyJbxx.id}"
                           class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">控制单元编号</td>
                <td><input type="text" name="kzdyBh" id="kzdyBh" size="60" value="${kzdyJbxx.kzdyBh}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元名称</td>
                <td><input type="text" name="kzdyMc" id="kzdyMc" size="60" value="${kzdyJbxx.kzdyMc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元级别</td>
                <td><input type="text" name="kzdyJb" id="kzdyJb" size="60" value="${kzdyJbxx.kzdyJb}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属省份</td>
                <td><input type="text" name="kzdySheng" id="kzdySheng" size="60" value="${kzdyJbxx.kzdySheng}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属地市</td>
                <td><input type="text" name="kzdyShi" id="kzdyShi" size="60" value="${kzdyJbxx.kzdyShi}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含区（县）名称</td>
                <td><input type="text" name="kzdyQx" id="kzdyQx" size="60" value="${kzdyJbxx.kzdyQx}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含乡镇名称</td>
                <td><input type="text" name="kzdyXz" id="kzdyXz " size="60"  value="${kzdyJbxx.kzdyXz}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含乡镇个数</td>
                <td><input type="text" name="kzdyXzs" id="kzdyXzs" size="60" value="${kzdyJbxx.kzdyXzs}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">流域</td>
                <td><input type="text" name="kzdy_lymc" id="kzdy_lymc" size="60" value="${kzdyJbxx.kzdyLymc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">包括水系</td>
                <td><input type="text" name="kzdySx" id="kzdySx" size="60" value="${kzdyJbxx.kzdySx}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含干流</td>
                <td><input type="text" name="kzdyGl" id="kzdyGl" size="60" value="${kzdyJbxx.kzdyGl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含一级支流</td>
                <td><input type="text" name="kzdy1jzl" id="kzdy1jzl" size="60" value="${kzdyJbxx.kzdy1jzl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含二级支流</td>
                <td><input type="text" name="kzdy2jzl" id="kzdy2jzl" size="60" value="${kzdyJbxx.kzdy2jzl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含三级支流</td>
                <td><input type="text" name="kzdy3jzl" id="kzdy3jzl" size="60" value="${kzdyJbxx.kzdy3jzl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含四级支流</td>
                <td><input type="text" name="kzdy4jzl" id="kzdy4jzl" size="60" value="${kzdyJbxx.kzdy4jzl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含水源地</td>
                <td><input type="text" name="kzdySyd" id="kzdySyd" size="60" value="${kzdyJbxx.kzdySyd}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元划定时间</td>
                <td><input type="text" name="kzdyTime" id="kzdyTime" size="60" value="${kzdyJbxx.kzdyTime}"
                           class="inpMain" /></td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/kzdy/editKzdy.js"></script>
</body>
</html>