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
<link href="app/css/cta/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="app/lib/jquery/jquery.js"></script>
<script type="text/javascript" src="app/js/cta/editCta.js"></script>
</head>
<body>	
	<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
            <h3>修改控制单元总量目标</h3>
    <form id="editForm">
     <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
      <tr>
       <td width="90" align="right">控制单元名称</td>
       <td>
        <input type="text" name="name" id="name" size="60" class="inpMain" value="${cta.name }"/>
       </td>
      </tr>
      <tr>
       <td width="90" align="right">地域范围</td>
       <td>
        <input type="text" name="area" id="area" size="60" class="inpMain" value="${cta.river }"/>
       </td>
      </tr>     
      <tr>
       <td align="right">现状</td>
       <td>
        <input type="text" name="condition" id="condition" value="${Integer.valueOf(cta.cityNumber) }"size="60" class="inpMain" />
       </td>
      </tr>
      
      <tr>
       <td align="right">目标</td>
       <td>
        <input type="text" name="goal" id="goal" value="${Integer.valueOf(cta.countryNumber) }"size="60" class="inpMain" />
       </td>
      </tr>
      
      <tr>
       <td align="right">起始时间</td>
       <td>
        <input type="text" name="starttime" id="starttime" value="${Integer.valueOf(cta.villageNumber) }"size="60" class="inpMain" />
       </td>
      </tr>
      
      <tr>
       <td align="right">达标年限</td>
       <td>
        <input type="text" name="deadline" id="deadline" size="60" class="inpMain" value="${cta.address }"/>
       </td>
      </tr>
      
      

     </table>
    </form>
           </div>
</body>
</html>