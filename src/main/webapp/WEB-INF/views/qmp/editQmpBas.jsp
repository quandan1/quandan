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
<div class="mainBox"
     style="height: auto !important; height: 550px; min-height: 550px;">
    <h3>修改控制断面</h3>
    <form id="editForm">
        <table width="100%" border="0" cellpadding="8" cellspacing="0"
               class="tableBasic">
            <tr>
                <td width="90" align="right">序号</td>
                <td><input readonly="readonly" type="text" name="id" id="id" size="60"
                           class="inpMain" value="${qmpBaseInfo.id }"/></td>
            </tr>
            <tr>
                <td width="90" align="right">断面级别</td>
                <td><input type="text" name="sectionLevel" id="sectionLevel" size="60"
                           class="inpMain" value="${qmpBaseInfo.sectionLevel }"/></td>
            </tr>
            <tr>
                <td width="90" align="right">原考核108</td>
                <td><input type="text" name="ykh108" id="ykh108" size="60"
                           class="inpMain" value="${qmpBaseInfo.ykh108 }"/></td>
            </tr>

            <tr>
                <td align="right">河流水质90</td>
                <td><input type="text" name="hlsz90" id="hlsz90"
                           size="60" class="inpMain" value="${qmpBaseInfo.hlsz90 }"/></td>
            </tr>

            <tr>
                <td align="right">原序号</td>
                <td><input type="text" name="originalId" id="originalId"
                           size="60" class="inpMain" value="${qmpBaseInfo.originalId }"/></td>
            </tr>

            <tr>
                <td align="right">所属省份</td>
                <td><input type="text" name="locProvince" id="locProvince"
                           size="60" class="inpMain" value="${qmpBaseInfo.locProvince }"/></td>
            </tr>

            <tr>
                <td align="right">所属地市</td>
                <td><input type="text" name="locCity" id="locCity" size="60"
                           class="inpMain" value="${qmpBaseInfo.locCity }"/></td>
            </tr>

            <tr>
                <td align="right">所属区县</td>
                <td><input type="text" name="locDistrict" id="locDistrict"
                           size="60" class="inpMain" value="${qmpBaseInfo.locDistrict }"/></td>
            </tr>
            <tr>
                <td align="right">测站名称</td>
                <td><input type="text" name="czName" id="czName"
                           size="60" class="inpMain" value="${qmpBaseInfo.czName }"/></td>
            </tr>
            <tr>
                <td align="right">断面名称</td>
                <td><input type="text" name="sectionName" id="sectionName"
                           size="60" class="inpMain" value="${qmpBaseInfo.sectionName }"/></td>
            </tr>
            <tr>
                <td align="right">所属流域</td>
                <td><input type="text" name="basin" id="basin"
                           size="60" class="inpMain" value="${qmpBaseInfo.basin }"/></td>
            </tr>
            <tr>
                <td align="right">所属河流</td>
                <td><input type="text" name="riverName" id="riverName"
                           size="60" class="inpMain" value="${qmpBaseInfo.riverName }"/></td>
            </tr>
            <tr>
                <td align="right">断面属性</td>
                <td><input type="text" name="sectionSx" id="sectionSx"
                           size="60" class="inpMain" value="${qmpBaseInfo.sectionSx }"/></td>
            </tr>
            <tr>
                <td align="right">河流级别</td>
                <td><input type="text" name="riverLevel" id="riverLevel"
                           size="60" class="inpMain" value="${qmpBaseInfo.riverLevel }"/></td>
            </tr>
            <tr>
                <td align="right">受控水库</td>
                <td><input type="text" name="sksk" id="sksk"
                           size="60" class="inpMain" value="${qmpBaseInfo.sksk }"/></td>
            </tr>
            <tr>
                <td align="right">经度（度）</td>
                <td><input type="text" name="longitude" id="longitude"
                           size="60" class="inpMain" value="${qmpBaseInfo.longitude }"/></td>
            </tr>

            <tr>
                <td align="right">纬度（度）</td>
                <td><input type="text" name="latitude" id="latitude"
                           size="60" class="inpMain" value="${qmpBaseInfo.latitude }"/></td>
            </tr>

            <tr>
                <td align="right">标注</td>
                <td><input readonly="readonly" type="text" name="isDel" id="isDel"
                           size="60" class="inpMain" value="${qmpBaseInfo.isDel }"/></td>
            </tr>

        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/qmp/editQmpBas.js"></script>
</body>
</html>