<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="list" style="display: block">
    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic" id="searchSelectTable">
        <tr>
            <button type="button" class="btnz btnz-info" id="addSearch">添加</button>
            <button type="button" class="btnz btnz-info" id="removeSearch">删除</button>
        </tr>
        <tr>
            <td>
                <div class="dropdown">
                    <button class="btnz btnz-info dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">查询条件<span class="caret"></span></button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                    </ul>
                </div>
            </td>
            <td><input type="text" size="40" class="inpMain" /></td>
        </tr>
    </table>
</div>

<script type="text/javascript" src="app/js/kzdm/searchKzdm.js"></script>
</body>
</html>