<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="app/css/cu/public.css" rel="stylesheet" type="text/css">

</head>
<body>

<div class="mainBox"
     style="height: auto !important; height: 550px; min-height: 550px;">
    <h3>添加控制单元</h3>
    <form id="insertForm">
        <table width="100%" border="0" cellpadding="8" cellspacing="0"
               class="tableBasic">
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元id</td>--%>
<%--                <td><input type="text" name="id" id="id" size="60"--%>
<%--                           class="inpMain" /></td>--%>
<%--            </tr>--%>
            <tr>
                <td width="90" align="right">控制单元编号</td>
                <td><input type="text" name="kzdyBh" id="kzdyBh" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元名称</td>
                <td><input type="text" name="kzdyMc" id="kzdyMc" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元级别</td>
                <td><input type="text" name="kzdyJb" id="kzdyJb" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所属省份</td>
                <td><input type="text" name="kzdySheng"
                           id="kzdySheng" size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">所属地市</td>
                <td><input type="text" name="kzdyShi" id="kzdyShi"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">所含区（县）名称</td>
                <td><input type="text" name="kzdyQx" id="kzdyQx"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">所含乡镇名称</td>
                <td><input type="text" name="kzdyXz" id="kzdyXz"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">乡镇个数</td>
                <td><input type="text" name="kzdyXzs" id="kzdyXzs"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">流域</td>
                <td><input type="text" name="kzdyLymc" id="kzdyLymc"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">包括水系</td>
                <td><input type="text" name="kzdySx" id="kzdySx"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">所含干流</td>
                <td><input type="text" name="kzdyGl" id="kzdyGl"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含一级河流</td>
                <td><input type="text" name="kzdy1jzl" id="kzdy1jzl"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含二级河流</td>
                <td><input type="text" name="kzdy2jzl" id="kzdy2jzl"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含三级河流</td>
                <td><input type="text" name="kzdy3jzl" id="kzdy3jzl"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所含四级河流</td>
                <td><input type="text" name="kzdy4jzl" id="kzdy4jzl"
                           size="60" class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">所含水源地</td>
                <td><input type="text" name="kzdySyd" id="kzdySyd"
                           size="60" class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">控制单元划分时间</td>
                <td><input type="text" name="kzdyTime" id="kzdyTime"
                           size="60" class="inpMain" /></td>
            </tr>
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元预留一</td>--%>
<%--                <td><input type="text" name="kzdyBl1" id="kzdyBl1"--%>
<%--                           size="60" class="inpMain" /></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元预留二</td>--%>
<%--                <td><input type="text" name="kzdyBl2" id="kzdyBl2"--%>
<%--                           size="60" class="inpMain" /></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元预留三</td>--%>
<%--                <td><input type="text" name="kzdyBl3" id="kzdyBl3"--%>
<%--                           size="60" class="inpMain" /></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元预留四</td>--%>
<%--                <td><input type="text" name="kzdyBl4" id="kzdyBl4"--%>
<%--                           size="60" class="inpMain" /></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td width="90" align="right">控制单元预留五</td>--%>
<%--                <td><input type="text" name="kzdyBl5" id="kzdyBl5"--%>
<%--                           size="60" class="inpMain" /></td>--%>
<%--            </tr>--%>
        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/kzdy/addKzdy.js"></script>
</body>
</html>