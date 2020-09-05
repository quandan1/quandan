<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="mainBox" style="height: auto !important; height: 350px; min-height: 350px;">
		<h3>添加用户</h3>
		<form id="insertForm">
			<table width="100%" border="0" cellpadding="8" cellspacing="0"
				class="tableBasic">
				<tr>
					<td width="90" align="right">用户名</td>
					<td><input type="text" size="40" class="inpMain" name="username"
						id="username" /></td>
				</tr>
				<tr>
					<td width="90" align="right">密码</td>
					<td><input type="text" size="40" class="inpMain"
						name="password" id="password" /></td>
				</tr>
				<tr>
					<td width="90" align="right">所属市</td>
					<td><select name="usercity" id="usercity" style="width: 255px;">
                      <option value="辽宁">辽宁</option>
                      <option value="沈阳">沈阳</option>
                      <option value="大连">大连</option>
                      <option value="鞍山">鞍山</option>
                      <option value="抚顺">抚顺</option>
                      <option value="本溪">本溪</option>
                      <option value="丹东">丹东</option>
                      <option value="锦州">锦州</option>
                      <option value="营口">营口</option>
                      <option value="阜新">阜新</option>
                      <option value="辽阳">辽阳</option>
                      <option value="盘锦">盘锦</option>
                      <option value="铁岭">铁岭</option>
                      <option value="朝阳">朝阳</option>
                      <option value="葫芦岛">葫芦岛</option>
					</select></td>
				</tr>
				<tr>
					<td width="90" align="right">所属县</td>
					<td><select name="county" id="county" style="width: 255px;">
					<option value="辽宁">辽宁</option>
					</select></td>
				</tr>

			</table>
		</form>
		<script type="text/javascript" src="app/js/user/addUser.js"></script>
</body>
</html>