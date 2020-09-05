<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="app/css/qmp/public.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div id="all">
		<div id="left">
			<div class="form-group">
				<div>
					<button type="button" class="btnz btnz-info"
						data-toggle="modal" data-target="#myModal" id="addButton">添加用户</button>
				</div>
			</div>
		</div>
		<div id="right">
			<div id="listAll" style="width:70% ;margin-left:auto ;margin-right:auto" ></div>
		</div>
	</div>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">用户管理</h4>
				</div>
				<div class="modal-body">
					<div id="addDiv"></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btnz btnz-info" data-dismiss="modal" id="addUser">添加</button>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="app/js/user/user.js"></script>
</body>
</html>