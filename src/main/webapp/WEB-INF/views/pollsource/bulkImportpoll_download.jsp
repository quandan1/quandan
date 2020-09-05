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
    <link href="app/css/poll/fileinput.css" type="text/css" rel="stylesheet" />
    <%--<link href="app/css/poll/fileinput-rtl.css" type="text/css" rel="stylesheet" />--%>
    <%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>--%>

    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>--%>

    <link href="app/css/poll/public.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="mainBox"
     style="height: auto !important;">
    <h3>污染源信息模板下载</h3>
    <%--<form id="xlsFileUpload" action="#" enctype="multipart/form-data">--%>
    <table width="100%" border="0" cellpadding="8" cellspacing="0"
           class="tableBasic">
        <tr>
            <td width="30%" align="center">文档模板</td>
            <td width="55%"  align="center"  colspan="2">
                <%--<div class="col-sm-4">--%>
                    <select  id="poll_get_template" width="100%" >
                        <option value ="choose_template">请选择模板类型</option>
                        <option value ="zpqy">污染源——直排企业模板</option>
                        <option value ="wsclc">污染源——污水处理厂</option>
                        <option value ="gmhxqyz">污染源——规模化畜禽养殖</option>
                    </select>
            </td>

            <td width="15%" align="center">
                <a type="button" class="btnz btnz-info" id="download" href="#" readonly=""  onclick="nullWarning()"><i class='glyphicon glyphicon-download'></i> 下载</a>
            </td>

        </tr>


        <%--<tr>--%>

            <%--<td  align="center">文件上传</td>--%>
            <%--<td width="25%" id="fileType" align="center" style="z-index: 1000;">--%>
                <%--&lt;%&ndash;<input type="text"  align="center" readonly >&ndash;%&gt;--%>
                    <%--<select  id="poll_get_type" width="100%" >--%>
                        <%--<option value ="choose_template">请选择模板类型</option>--%>
                        <%--<option value ="zpqy">污染源——直排企业模板</option>--%>
                        <%--<option value ="wsclc">污染源——污水处理厂</option>--%>
                        <%--<option value ="gmhxqyz">污染源——规模化畜禽养殖</option>--%>
                    <%--</select>--%>
            <%--</td>--%>
            <%--<td width="30%" id="fileName" align="center" style="z-index: 1000;">--%>
                <%--&lt;%&ndash;<input type="text"  align="center" readonly >&ndash;%&gt;--%>

            <%--</td>--%>


            <%--<td >--%>

                <%--<div align="center">--%>
                    <%--&lt;%&ndash;<div id="uploader" style="float:left;" >&ndash;%&gt;--%>
                    <%--<input id="file" name="file" type="file" width="250px" style="z-index:0;">--%>
                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                <%--</div>--%>

            <%--</td>--%>

        <%--</tr>--%>



    </table>
    <%--</form>--%>


</div>
<script type="text/javascript">

</script>
<script type="text/javascript" src="app/js/pollsource/bulkImportpoll.js"></script>


</body>
</html>