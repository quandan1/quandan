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
<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">
 
<script type="text/javascript" src="app/js/pollsource/editPollSource.js"></script>
</head>
<body>	
	<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
        <h3>修改污染源</h3>

	 	<form id="editForm">
			<table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
			    <tr style="display:none">
					<td width="90" align="right">id</td>
					<td><input type="text" name="id" id="id" readonly="readonly" value="${pollsource.id}" size="60" class="inpMain"/></td>
				</tr>	                                                                                                                             
				<tr><td width="90" align="right">行政区划</td><td><input type="text" name="xzqhmc" id="xzqhmc" size="60" class="inpMain"              value="${pollsource.xzqhmc}"        /></td></tr>
				<tr><td width="90" align="right">填报单位详细名称</td><td><input type="text" name="tbdwxxmc" id="tbdwxxmc" size="60" class="inpMain"  value="${pollsource.tbdwxxmc}"                      /></td></tr>
				<tr><td width="90" align="right">控制单元</td><td><input type="text" name="kzdy" id="kzdy" size="60" class="inpMain"                  value="${pollsource.kzdy}"      /></td></tr>
				<tr><td width="90" align="right">控制断面</td><td><input type="text" name="kzdm" id="kzdm" size="60" class="inpMain"                  value="${pollsource.kzdm}"     /></td></tr>
				<tr><td width="90" align="right">市州盟</td><td><input type="text" name="xxdzdqSZM" id="xxdzdqSZM" size="60" class="inpMain"          value="${pollsource.xxdzdqSZM}"               /></td></tr>
				<tr><td width="90" align="right">区市旗</td><td><input type="text" name="xxdzxQSQ" id="xxdzxQSQ" size="60" class="inpMain"            value="${pollsource.xxdzxQSQ}"            /></td></tr>
				<tr><td width="90" align="right">乡镇</td><td><input type="text" name="xxdzxZ" id="xxdzxZ" size="60" class="inpMain"                  value="${pollsource.xxdzxZ}"     /></td></tr>
				<tr><td width="90" align="right">受纳水体</td><td><input type="text" name="snstmc" id="snstmc" size="60" class="inpMain"              value="${pollsource.snstmc}"       /></td></tr>
				<tr><td width="90" align="right">废水</td><td><input type="text" name="gyfspflD" id="gyfspflD" size="60" class="inpMain"              value="${pollsource.gyfspflD}"          /></td></tr>
				<tr><td width="90" align="right">需氧量</td><td><input type="text" name="hxxylpflD" id="hxxylpflD" size="60" class="inpMain"          value="${pollsource.hxxylpflD}"             /></td></tr>
				<tr><td width="90" align="right">氨氮</td><td><input type="text" name="adpflD" id="adpflD" size="60" class="inpMain"                  value="${pollsource.adpflD}"      /></td></tr>
				<tr><td width="90" align="right">石油</td><td><input type="text" name="sylpflD" id="sylpflD" size="60" class="inpMain"                value="${pollsource.sylpflD}"        /></td></tr>
				<tr><td width="90" align="right">挥发酚</td><td><input type="text" name="hffpflQk" id="hffpflQk" size="60" class="inpMain"            value="${pollsource.hffpflQk}"        /></td></tr>
				<tr><td width="90" align="right">氰化物</td><td><input type="text" name="qhwpflQk" id="qhwpflQk" size="60" class="inpMain"            value="${pollsource.qhwpflQk}"        /></td></tr>
				<tr><td width="90" align="right">砷</td><td><input type="text" name="fsspflQk" id="fsspflQk" size="60" class="inpMain"                value="${pollsource.fsspflQk}"    /></td></tr>
				<tr><td width="90" align="right">铅</td><td><input type="text" name="fsqpflQk" id="fsqpflQk" size="60" class="inpMain"                value="${pollsource.fsqpflQk}"    /></td></tr>
				<tr><td width="90" align="right">镉</td><td><input type="text" name="fsgpflQk" id="fsgpflQk" size="60" class="inpMain"                value="${pollsource.fsgpflQk}"    /></td></tr>
				<tr><td width="90" align="right">汞</td><td><input type="text" name="fsgpflQkDup1" id="fsgpflQkDup1" size="60" class="inpMain"        value="${pollsource.fsgpflQkDup1}"                        /></td></tr>
				<tr><td width="90" align="right">总铬</td><td><input type="text" name="fszgpflQk" id="fszgpflQk" size="60" class="inpMain"            value="${pollsource.fszgpflQk}"                    /></td></tr>
				<tr><td width="90" align="right">六价铬</td><td><input type="text" name="fsljgpflQk" id="fsljgpflQk" size="60" class="inpMain"        value="${pollsource.fsljgpflQk}"                        /></td></tr>
				<tr><td width="90" align="right">经度</td><td><input type="text" name="jdG" id="jdG" size="60" class="inpMain"              value="${pollsource.jdG}"                  /></td></tr>
				<tr><td width="90" align="right">纬度</td><td><input type="text" name="wdG" id="wdG" size="60" class="inpMain"              value="${pollsource.wdG}"                  /></td></tr>

				
			</table>
		</form>
 
 	</div>
</body>
</html>