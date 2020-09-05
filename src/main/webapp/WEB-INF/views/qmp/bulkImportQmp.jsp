<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="app/js/fileinput.js" type="text/javascript" ></script>
    <%--<script src="app/js/fileinput_locale_zh.js" type="text/javascript"></script>--%>
    <%--<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="app/js/Ueditor/themes/default/css/ueditor.css" rel="stylesheet" type="text/css">--%>
    <link href="app/css/qmp/fileinput.css" type="text/css" rel="stylesheet" />
    <%--<link href="app/css/qmp/fileinput-rtl.css" type="text/css" rel="stylesheet" />--%>
    <%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>--%>

    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>--%>

    <link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">
</head>
<body>

    <div class="mainBox"
         style="height: auto !important;">
        <h3>控制断面批量导入</h3>
        <%--<form id="xlsFileUpload" action="#" enctype="multipart/form-data">--%>
            <table width="100%" border="0" cellpadding="8" cellspacing="0"
                   class="tableBasic">
                <tr>
                    <td width="30%" align="center">文档模板</td>
                    <td width="55%"  align="center">控制断面模板.xls</td>

                    <td width="15%" align="center">
                        <a type="button" class="btnz btnz-info" id="download" href="download/qmp/控制断面模板.xls" readonly=""><i class='glyphicon glyphicon-download'></i> 下载</a>
                    </td>

                </tr>


                <tr>

                    <td  align="center">文件上传</td>
                    <td id="fileName" align="center" style="z-index: 1000;">
                        <%--<input type="text"  align="center" readonly >--%>
                    </td>


                    <td >

                       <div align="center">
                           <%--<div id="uploader" style="float:left;" >--%>
                               <input id="file" name="file" type="file" width="250px" style="z-index:0;">
                           <%--</div>--%>
                       </div>

                    </td>

                </tr>



            </table>
        <%--</form>--%>


    </div>
    <script type="text/javascript">

    </script>
<script type="text/javascript" src="app/js/qmp/bulkImportQmp.js"></script>


</body>
</html>