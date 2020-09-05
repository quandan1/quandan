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
    <h3>修改控制断面</h3>
    <form id="editForm">

        <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
            <tr hidden="true">
                <td width="90" align="right">控制断面id</td>
                <td><input type="text" name="id" id="id" size="60" value="${kzdmJbxx.id}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制断面编号</td>
                <td><input type="text" name="kzdmBh" id="kzdmBh" size="60" value="${kzdmJbxx.kzdmBh}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属控制单元编号</td>
                <td><input type="text" name="kzdmDybh" id="kzdmDybh" size="60" value="${kzdmJbxx.kzdmDybh}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属控制单元名称</td>
                <td><input type="text" name="kzdmDymc" id="kzdmDymc" size="60" value="${kzdmJbxx.kzdmDymc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">流域名称</td>
                <td><input type="text" name="kzdmLymc" id="kzdmLymc" size="60" value="${kzdmJbxx.kzdmLymc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所在河流（湖库）</td>
                <td><input type="text" name="kzdmSzhl" id="kzdmSzhl" size="60" value="${kzdmJbxx.kzdmSzhl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">河流级别/湖库属性</td>
                <td><input type="text" name="kzdmHljb" id="kzdmHljb" size="60" value="${kzdmJbxx.kzdmHljb}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">汇入河流（湖库、海洋）</td>
                <td><input type="text" name="kzdmHrhl" id="kzdmHrhl " size="60"  value="${kzdmJbxx.kzdmHrhl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">断面名称</td>
                <td><input type="text" name="kzdmMc" id="kzdmMc" size="60" value="${kzdmJbxx.kzdmMc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">断面属性</td>
                <td><input type="text" name="kzdmSx" id="kzdmSx" size="60" value="${kzdmJbxx.kzdmSx}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属省份</td>
                <td><input type="text" name="kzdmSheng" id="kzdmSheng" size="60" value="${kzdmJbxx.kzdmSheng}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属地市</td>
                <td><input type="text" name="kzdmShi" id="kzdmShi" size="60" value="${kzdmJbxx.kzdmShi}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属区县</td>
                <td><input type="text" name="kzdmQx" id="kzdmQx" size="60" value="${kzdmJbxx.kzdmQx}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">测站名称</td>
                <td><input type="text" name="kzdmCzmc" id="kzdmCzmc" size="60" value="${kzdmJbxx.kzdmCzmc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">断面级别</td>
                <td><input type="text" name="kzdmJb" id="kzdmJb" size="60" value="${kzdmJbxx.kzdmJb}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">断面类型</td>
                <td><input type="text" name="kzdmLx" id="kzdmLx" size="60" value="${kzdmJbxx.kzdmLx}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">是否在城市建成区</td>
                <td><input type="text" name="kzdmSfcq" id="kzdmSfcq" size="60" value="${kzdmJbxx.kzdmSfcq}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">现有/拟增设/新增</td>
                <td><input type="text" name="kzdmSzzk" id="kzdmSzzk" size="60" value="${kzdmJbxx.kzdmSzzk}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">监测频次</td>
                <td><input type="text" name="kzdmJcpc" id="kzdmJcpc" size="60" value="${kzdmJbxx.kzdmJcpc}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">监测项目</td>
                <td><input type="text" name="kzdmJcxm" id="kzdmJcxm" size="60" value="${kzdmJbxx.kzdmJcxm}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">经度度</td>
                <td><input type="text" name="kzdmJdd" id="kzdmJdd" size="60" value="${kzdmJbxx.kzdmJdd}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">经度分</td>
                <td><input type="text" name="kzdmJdf" id="kzdmJdf" size="60" value="${kzdmJbxx.kzdmJdf}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">经度秒</td>
                <td><input type="text" name="kzdmJds" id="kzdmJds" size="60" value="${kzdmJbxx.kzdmJds}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">纬度度</td>
                <td><input type="text" name="kzdmWdd" id="kzdmWdd" size="60" value="${kzdmJbxx.kzdmWdd}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">纬度分</td>
                <td><input type="text" name="kzdmWdf" id="kzdmWdf" size="60" value="${kzdmJbxx.kzdmWdf}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">纬度秒</td>
                <td><input type="text" name="kzdmWds" id="kzdmWds" size="60" value="${kzdmJbxx.kzdmWds}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">功能区水质目标</td>
                <td><input type="text" name="kzdmSzmb" id="kzdmSzmb" size="60" value="${kzdmJbxx.kzdmSzmb}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">经度</td>
                <td><input type="text" name="kzdmJd" id="kzdmJd" size="60" value="${kzdmJbxx.kzdmJd}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">纬度</td>
                <td><input type="text" name="kzdmWd" id="kzdmWd" size="60" value="${kzdmJbxx.kzdmWd}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含河流</td>
                <td><input type="text" name="kzdmShhl" id="kzdmShhl" size="60" value="${kzdmJbxx.kzdmShhl}"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">设置时间</td>
                <td><input type="text" name="kzdmTime" id="kzdmTime" size="60" value="${kzdmJbxx.kzdmTime}"
                           class="inpMain" /></td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/kzdm/editKzdm.js"></script>
</body>
</html>