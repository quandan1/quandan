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
								<tr>
									<td width="90" align="right">控制单元名称</td>
									<td><input type="text" name="unitName" id="unitName" size="60"
										class="inpMain" /></td>
								</tr>
								<tr>
									<td width="90" align="right">所含控制断面名称</td>
									<td><input type="text" name="includeSection" id="includeSection" size="60"
										class="inpMain" /></td>
								</tr>

								<tr>
									<td width="90" align="right">流域</td>
									<td><input type="text" name="watershed" id="watershed"
										size="60" class="inpMain" /></td>
								</tr>

								<tr>
									<td width="90" align="right">所属省份</td>
									<td><input type="text" name="locProvince"
										id="locProvince" size="60" class="inpMain" /></td>
								</tr>
							
								<tr>
									<td width="90" align="right">涉及地市</td>
									<td><input type="text" name="involveCity" id="involveCity"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">涉及区（县）名称</td>
									<td><input type="text" name="involveCounty" id="involveCounty"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">涉及乡镇名称</td>
									<td><input type="text" name="involveVillage" id="involveVillage"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">乡镇个数</td>
									<td><input type="text" name="villageAmount" id="villageAmount"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">涉及河流名称</td>
									<td><input type="text" name="involveRiver" id="involveRiver"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">控制单元类别</td>
									<td><input type="text" name="unitType" id="unitType"
										size="60" class="inpMain" /></td>
								</tr>
								
								<tr>
									<td width="90" align="right">水资源区</td>
									<td><input type="text" name="waterResource" id="waterResource"
										size="60" class="inpMain" /></td>
								</tr>
                                
                                <tr>
									<td width="90" align="right">汇入河流</td>
									<td><input type="text" name="hrRiver" id="hrRiver"
										size="60" class="inpMain" /></td>
								</tr>
							</table>
						</form>
					</div>
	<script type="text/javascript" src="app/js/cu/addCu.js"></script>
</body>
</html>