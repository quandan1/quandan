<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="mainBox"
		style="height: auto !important; height: 550px; min-height: 550px;">
		<h3>添加控制断面</h3>
		<form id="insertForm">
			<table width="100%" border="0" cellpadding="8" cellspacing="0"
				class="tableBasic">
				<tr>
					<td width="90" align="right">流域名称</td>
					<td><input type="text" name="watershed" id="watershed" size="60"
						class="inpMain" /></td>
				</tr>
				<tr>
					<td width="90" align="right">所在河流</td>
					<td><input type="text" name="riverName" id="riverName" size="60"
						class="inpMain" /></td>
				</tr>

				<tr>
					<td align="right">河流级别/湖库属性</td>
					<td><input type="text" name="riverLevel" id="riverLevel"
						size="60" class="inpMain" /></td>
				</tr>

				<tr>
					<td align="right">汇入河流（湖库、海洋）</td>
					<td><input type="text" name="riverTo" id="riverTo"
						size="60" class="inpMain" /></td>
				</tr>

				<tr>
					<td align="right">断面名称</td>
					<td><input type="text" name="sectionName" id="sectionName"
						size="60" class="inpMain" /></td>
				</tr>

				<tr>
					<td align="right">断面属性</td>
					<td><input type="text" name="sectionProperty" id="sectionProperty" size="60"
						class="inpMain" /></td>
				</tr>

				<tr>
					<td align="right">所属省份</td>
					<td><input type="text" name="locProvince" id="locProvince"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">所属地市</td>
					<td><input type="text" name="locCity" id="locCity"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">所属区县</td>
					<td><input type="text" name="locCounty" id="locCounty"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">测站名称</td>
					<td><input type="text" name="testBy" id="testBy"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">断面级别</td>
					<td><input type="text" name="sectionLevel" id="sectionLevel"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">断面类型</td>
					<td><input type="text" name="sectionType" id="sectionType"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">是否在城市建成区</td>
					<td><input type="text" name="isUrban" id="isUrban"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">现有/拟增设</td>
					<td><input type="text" name="isAddition" id="isAddition"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">监测频次</td>
					<td><input type="text" name="testFrequency" id="testFrequency"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">监测项目</td>
					<td><input type="text" name="testItems" id="testItems"
						size="60" class="inpMain" /></td>
				</tr>
				<tr>
					<td align="right">断面位置经度	</td>
					<td><input type="text" name="locLonD" id="locLonD"
						size="15" class="inpMain" />度
						<input type="text" name="locLonM" id="locLonM"
						size="15" class="inpMain" />分
						<input type="text" name="locLonS" id="locLonS"
						size="15" class="inpMain" />秒
						</td>
				</tr>
				<tr>
					<td align="right">断面位置纬度</td>
					<td><input type="text" name="locLatD" id="locLatD"
						size="15" class="inpMain" />度
						<input type="text" name="locLatM" id="locLatM"
						size="15" class="inpMain" />分
						<input type="text" name="locLatS" id="locLatS"
						size="15" class="inpMain" />秒
						</td>
				</tr>
				<tr>
					<td align="right">功能区水质目标</td>
					<td><input type="text" name="qualityTarget" id="qualityTarget"
						size="60" class="inpMain" /></td>
				</tr>
				
			</table>
		</form>
	</div>
	<script type="text/javascript" src="app/js/qmp/addQmp.js"></script>
</body>
</html>