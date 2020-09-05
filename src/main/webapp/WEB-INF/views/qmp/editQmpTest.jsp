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
    <h3>修改实测数据</h3>
    <form id="editForm">
        <table width="100%" border="0" cellpadding="8" cellspacing="0"
               class="tableBasic">
            <tr>
                <td width="90" align="right">序号</td>
                <td><input readonly="readonly" type="text" name="id" id="id" size="60"
                           class="inpMain" value="${qmpTestData.id }"/></td>
            </tr>
            <tr>
                <td width="90" align="right">年份</td>
                <td><input type="text" name="year" id="year" size="60"
                           class="inpMain" value="${qmpTestData.year }"/></td>
            </tr>
            <tr>
                <td width="90" align="right">月份</td>
                <td><input type="text" name="month" id="month" size="60"
                           class="inpMain" value="${qmpTestData.month }"/></td>
            </tr>

            <tr>
                <td align="right">断面编码</td>
                <td><input type="text" name="sectionBm" id="sectionBm"
                           size="60" class="inpMain" value="${qmpTestData.sectionBm }"/></td>
            </tr>

            <tr>
                <td align="right">断面名称</td>
                <td><input type="text" name="sectionName" id="sectionName"
                           size="60" class="inpMain" value="${qmpTestData.sectionName }"/></td>
            </tr>

            <tr>
                <td align="right">所在地区</td>
                <td><input type="text" name="locCity" id="locCity"
                           size="60" class="inpMain" value="${qmpTestData.locCity }"/></td>
            </tr>

            <tr>
                <td align="right">所在河流</td>
                <td><input type="text" name="locRiver" id="locRiver" size="60"
                           class="inpMain" value="${qmpTestData.locRiver }"/></td>
            </tr>

            <tr>
                <td align="right">电导率</td>
                <td><input type="text" name="ddl" id="ddl"
                           size="60" class="inpMain" value="${qmpTestData.ddl }"/></td>
            </tr>
            <tr>
                <td align="right">水温</td>
                <td><input type="text" name="waterTemperature" id="waterTemperature"
                           size="60" class="inpMain" value="${qmpTestData.waterTemperature }"/></td>
            </tr>
            <tr>
                <td align="right">PH值</td>
                <td><input type="text" name="ph" id="ph"
                           size="60" class="inpMain" value="${qmpTestData.ph }"/></td>
            </tr>
            <tr>
                <td align="right">溶解氧</td>
                <td><input type="text" name="rjy" id="rjy"
                           size="60" class="inpMain" value="${qmpTestData.rjy }"/></td>
            </tr>
            <tr>
                <td align="right">透明度</td>
                <td><input type="text" name="tmd" id="tmd"
                           size="60" class="inpMain" value="${qmpTestData.tmd }"/></td>
            </tr>
            <tr>
                <td align="right">盐度</td>
                <td><input type="text" name="yd" id="yd"
                           size="60" class="inpMain" value="${qmpTestData.yd }"/></td>
            </tr>
            <tr>
                <td align="right">高锰酸盐指数标准</td>
                <td><input type="text" name="codMn" id="codMn"
                           size="60" class="inpMain" value="${qmpTestData.codMn }"/></td>
            </tr>
            <tr>
                <td align="right">化学需氧量标准</td>
                <td><input type="text" name="codCr" id="codCr"
                           size="60" class="inpMain" value="${qmpTestData.codCr }"/></td>
            </tr>
            <tr>
                <td align="right">氨氮标准</td>
                <td><input type="text" name="nhN" id="nhN"
                           size="60" class="inpMain" value="${qmpTestData.nhN }"/></td>
            </tr>
            <tr>
                <td align="right">总磷标准</td>
                <td><input type="text" name="tP" id="tP"
                           size="60" class="inpMain" value="${qmpTestData.tP }"/></td>
            </tr>
            <tr>
                <td align="right">总氮标准</td>
                <td><input type="text" name="tN" id="tN"
                           size="60" class="inpMain" value="${qmpTestData.tN }"/></td>
            </tr>
            <tr>
                <td align="right">铜标准</td>
                <td><input type="text" name="cu" id="cu"
                           size="60" class="inpMain" value="${qmpTestData.cu }"/></td>
            </tr>
            <tr>
                <td align="right">锌标准</td>
                <td><input type="text" name="zn" id="zn"
                           size="60" class="inpMain" value="${qmpTestData.zn }"/></td>
            </tr>
            <tr>
                <td align="right">铅标准</td>
                <td><input type="text" name="pb" id="pb"
                           size="60" class="inpMain" value="${qmpTestData.pb }"/></td>
            </tr>
            <tr>
                <td align="right">镉标准</td>
                <td><input type="text" name="cd" id="cd"
                           size="60" class="inpMain" value="${qmpTestData.cd }"/></td>
            </tr>
            <tr>
                <td align="right">生化需氧量标准</td>
                <td><input type="text" name="bod5" id="bod5"
                           size="60" class="inpMain" value="${qmpTestData.bod5 }"/></td>
            </tr>
            <tr>
                <td align="right">砷标准</td>
                <td><input type="text" name="tAs" id="tAs"
                           size="60" class="inpMain" value="${qmpTestData.tAs }"/></td>
            </tr>
            <tr>
                <td align="right">硒标准</td>
                <td><input type="text" name="tSe" id="tSe"
                           size="60" class="inpMain" value="${qmpTestData.tSe }"/></td>
            </tr>
            <tr>
                <td align="right">汞标准</td>
                <td><input type="text" name="tHg" id="tHg"
                           size="60" class="inpMain" value="${qmpTestData.tHg }"/></td>
            </tr>
            <tr>
                <td align="right">六价铬标准</td>
                <td><input type="text" name="cr6" id="cr6"
                           size="60" class="inpMain" value="${qmpTestData.cr6 }"/></td>
            </tr>
            <tr>
                <td align="right">氟化物标准</td>
                <td><input type="text" name="f" id="f"
                           size="60" class="inpMain" value="${qmpTestData.f }"/></td>
            </tr>
            <tr>
                <td align="right">氰化物标准</td>
                <td><input type="text" name="cn" id="cn"
                           size="60" class="inpMain" value="${qmpTestData.cn }"/></td>
            </tr>
            <tr>
                <td align="right">挥发酚</td>
                <td><input type="text" name="hff" id="hff"
                           size="60" class="inpMain" value="${qmpTestData.hff }"/></td>
            </tr>
            <tr>
                <td align="right">石油类</td>
                <td><input type="text" name="syl" id="syl"
                           size="60" class="inpMain" value="${qmpTestData.syl }"/></td>
            </tr>
            <tr>
                <td align="right">阴离子表面活性剂标准</td>
                <td><input type="text" name="las" id="las"
                           size="60" class="inpMain" value="${qmpTestData.las }"/></td>
            </tr>
            <tr>
                <td align="right">硫化物标准</td>
                <td><input type="text" name="s2" id="s2"
                           size="60" class="inpMain" value="${qmpTestData.s2 }"/></td>
            </tr>
            <tr>
                <td align="right">Chla</td>
                <td><input type="text" name="chla" id="chla"
                           size="60" class="inpMain" value="${qmpTestData.chla }"/></td>
            </tr>
            <tr>
                <td align="right">NO3</td>
                <td><input type="text" name="no3" id="no3"
                           size="60" class="inpMain" value="${qmpTestData.no3 }"/></td>
            </tr>
            <tr>
                <td align="right">NO2</td>
                <td><input type="text" name="no2" id="no2"
                           size="60" class="inpMain" value="${qmpTestData.no2 }"/></td>
            </tr>
            <tr>
                <td align="right">流量</td>
                <td><input type="text" name="ll" id="ll"
                           size="60" class="inpMain" value="${qmpTestData.ll }"/></td>
            </tr>
            <tr>
                <td align="right">水位</td>
                <td><input type="text" name="sw" id="sw"
                           size="60" class="inpMain" value="${qmpTestData.sw }"/></td>
            </tr>
            <tr>
                <td align="right">粪大肠菌群标准</td>
                <td><input type="text" name="fdcjqbz" id="fdcjqbz"
                           size="60" class="inpMain" value="${qmpTestData.fdcjqbz }"/></td>
            </tr>
            <tr>
                <td align="right">标注</td>
                <td><input readonly="readonly" type="text" name="isDel" id="isDel"
                           size="60" class="inpMain" value="${qmpTestData.isDel }"/></td>
            </tr>

        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/qmp/editQmpTest.js"></script>
</body>
</html>