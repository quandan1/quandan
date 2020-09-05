<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="app/js/echart/echarts-all.js"></script>
	<script type="text/javascript" src="app/js/qmp/qmpAnalysis.js"></script>

	<style type="text/css">
		.msel{
			height: 30px;
			width: 200px;
			font-size: 15px;
		}
		.lsel{
			height: 30px;
			width: auto;
			font-size: 18px;
		}
	</style>

</head>

<body>
<div class="row" style="height: 600px;">
	<div class="col-md-3" id="menu" style="background-color: #d0ffee;height: 600px;">

		<table>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
		<div class="row" id="seltarget" style="margin-top: 20px">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="target" class="lsel">类型:</label>
			</div>
			<div class="col-md-8">
				<select name="target" class="msel" id="target" title="图表类型">
					<option value="null" selected="selected">图表类型</option>
					<option value="yearCircle">多年总指标分析</option>
					<option value="YearEq">多年单月某指标分析</option>
					<option value="MonthWrxx">同年多月多指标分析</option>
					<option value="YearOne">多年多月单指标分析</option>
				</select>
			</div>
			<%--<input type="text" id="section" name="section_name" title="断面" value="红庙子">--%>
		</div>

		<div class="row" id="selsection" style="margin-top: 20px">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="section" class="lsel">断面:</label>
			</div>
			<div class="col-md-8">
				<select id="section" name="section" class="msel" title="断面">
					<option value="null" selected="selected">选择断面</option>
					<option value="红庙子">红庙子</option>
					<option value="东陵大桥">东陵大桥</option>
					<option value="旧门桥">旧门桥</option>
				</select>
			</div>
			<%--<input type="text" id="section" name="section_name" title="断面" value="红庙子">--%>
		</div>

		<div class="row" id="selyear" style="margin-top: 20px">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="year" class="lsel">年份:</label>
			</div>
			<div class="col-md-8">
				<select id="year" name="year" class="msel" title="年份">
					<option value="null" selected="selected">选择年份</option>
					<option value="2014">2014年</option>
					<option value="2014">2015年</option>
					<option value="2014">2016年</option>
				</select>
			</div>
			<%--<input type="text" id="year" name="year" title="年份" value="">--%>
		</div>

		<div class="row" id="selmonth" style="margin-top: 20px">
			<div class="col-md-1">
			</div>
			<div class="col-md-3">
				<label for="month" class="lsel">月份:</label>
			</div>
			<div class="col-md-8">
				<select id="month" name="month" class="msel" title="月份">
					<option value="null" selected="selected">选择月份</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="4">5</option>
					<option value="4">6</option>
					<option value="4">7</option>
					<option value="4">8</option>
					<option value="4">9</option>
					<option value="4">10</option>
					<option value="4">11</option>
					<option value="4">12</option>
				</select>
			</div>

			<%--<input type="text" id="year" name="year" title="年份" value="">--%>
		</div>

		<div class="row" id="seltype" style="margin-top: 20px">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="type" class="lsel">指标:</label>
			</div>
			<div class="col-md-8">
				<select name="type" id="type" class="msel" title="指标选择">
					<option value="null" selected="selected">指标选择</option>
					<option value="ad">氨氮</option>
					<option value="hxxyl">化学需氧量</option>
					<option value="zl">总磷</option>
					<option value="zd">总氮</option>
					<option value="sum">总指标</option>
				</select>
			</div>
			<%--<input type="text" id="section" name="section_name" title="断面" value="红庙子">--%>
		</div>

		<div class="row" style="margin-top: 20px">
			<div class="col-md-4"></div>
			<div class="col-md-8">
				<button type="button" onclick="searchqmpwr(${qmpWrxx})" style="font-size:18px;height: 40px; width: 80px;" class="btn btn-success">提交</button>
				<%--<input type="button"  onclick="searchqmpwr(${qmpWrxx})"  value="分析" name="分析" >--%>
			</div>
		</div>

	</div>

	<div class="col-md-9" id="canvas" style="background-color: #ffffdc;height: 600px;">
		<div class="col-md-12">
			<div class="col-md-10">
				<%--<div id="chart" style="width:80%;margin:50px auto;"></div>--%>
				<div id="chart" style="width: 800px; height: 600px; margin-left: 100px"></div>
			</div>
			<div class="col-md-2">
			</div>
			<%--<div style="width: 600px; height: 200px;"></div>--%>
		</div>
	</div>
</div>

</body>
</html>


