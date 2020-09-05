<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
<link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
<link rel="stylesheet"
	href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
<link rel="stylesheet"
	href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">

<link rel="stylesheet" type="text/css"
	href='app/js/jquery/themes/gray/easyui.css'>
<link rel="stylesheet" type="text/css"
	href="app/js/jquery/themes/icon.css">
<link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
<link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">

<link type="text/javascript" href="app/js/3.20/init.js">

<script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
<script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
<script type="text/javascript"
	src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
<script type="text/javascript" src="app/js/echart/echarts-all.js"></script>
<script type="text/javascript" src="app/js/qmp/qmpAnalysis.js"></script>
<script type="text/javascript" src='app/js/qmp/searchQmp.js'></script>

<!-- <style type="text/css">
		.msel{
			height: 30px;
			width: 100%;
			font-size: 15px;
		}
		.lsel{
			height: 30px;
			width: auto;
			font-size: 18px;
		}
	</style> -->

</head>

<body>
	<div id="all">
		<div id="up">
			<div id=right>
				<div id="canvas" style="background-color: #ffffdc；height : 600px;">

					<!-- <div id="chart" style="width:80%;margin:50px auto;"></div> -->
					<div id="chart"
						 style="width: 800px; height: 500px; margin-left: 100px"></div>
					<!-- <div style="width: 600px; height: 200px;"></div> -->
				</div>
				<!-- <div class="col-md-9" id="canvas" style="background-color: #f2ffee;height: 600px;">
            <div class="col-md-12">
                <div class="col-md-10">
                    <div id="chart" style="width:80%;margin:50px auto;"></div>
                    <div id="chart" style="width: 800px; height: 600px; margin-left: 100px"></div>
                </div>
                <div class="col-md-2">
                </div>
                <div style="width: 600px; height: 200px;"></div>
            </div>
        </div> -->
			</div>
			<div id="left">
				<div style="margin-top: 10px;">
					<div class="box" style="background-color: #3391e8;  align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
						<div class="glyphicon glyphicon-asterisk" id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px;margin-left: 20px;color: white" >
							<a style='font-size: 15px;color: white'>水质变化趋势分析</a>
						</div>
					</div>
					<div class="box">
						<div class="flex-row" style="border: none; justify-content: space-between; width: 100%; padding-left: 10px; padding-right: 10px">
							<span>断面</span> <select id="section" name="section" class="msel"
								title="断面" style="background: #ffffff; width: 100px">
								<option value="0" selected="selected">选择断面</option>

						</select>
						</div>
						<div class="flex-row" style="border: none; justify-content: space-between; width: 100%; padding-left: 10px; padding-right: 10px">
							<span>类型</span>
							<select name="target" class="msel" id="target" title="图表类型" style="background: #ffffff; width: 100px">
								<option value="null" selected="selected">图表类型</option>
								<option value="yearCircle">总指标逐年水质分析</option>
								<option value="YearEq">各指标多年单月水质分析</option>
								<option value="MonthWrxx">各指标一年逐月水质分析</option>
								<option value="YearOne">某指标逐年逐月水质分析</option>
							</select>
						</div>
						<div id="hid" style="width: 100%;height: 29.6px">
							<div class="row" id="selyear" style="margin-top: 0px;margin-right: 0px;margin-left: 0px;" hidden="hidden">
								<div class="flex-row" style="border: none; justify-content: space-between; width: 100%; padding-left: 10px; padding-right: 10px;">
									<span>年份</span>
									<select id="year" name="year" class="msel" title="年份" style="background: #ffffff; width: 100px">
										<option value="null" selected="selected">选择年份&nbsp;</option>
										<option value="2014">2014年</option>
										<option value="2015">2015年</option>
										<option value="2016">2016年</option>
									</select>
								</div>
							</div>
							<div class="row" id="selmonth"
								style="margin-top: 0px;margin-right: 0px;margin-left: 0px; padding-left: 0px"
								hidden="hidden">
								<div class="flex-row"
									style="border: none; justify-content: space-between; width: 100%; padding-left: 10px; padding-right: 10px; ">
									<span>月份</span> <select id="month" name="month" class="msel"
										title="月份"
										style="background: #ffffff; width: 100px">
										<option value="null" selected="selected">选择月份</option>
										<option value="01">1</option>
										<option value="02">2</option>
										<option value="03">3</option>
										<option value="04">4</option>
										<option value="05">5</option>
										<option value="06">6</option>
										<option value="07">7</option>
										<option value="08">8</option>
										<option value="09">9</option>
										<option value="10">10</option>
										<option value="11">11</option>
										<option value="12">12</option>
									</select>
								</div>
							</div>
							<div class="row" id="seltype"
								style="margin-top: 0px; margin-right: 0px;margin-left: 0px; padding-left: 0px"
								hidden="hidden">
								<div class="flex-row"
									style="border: none; justify-content: space-between; width: 100%; padding-left: 10px; padding-right: 10px;">
									<span>指标</span> <select name="type" id="type" class="msel"
										title="指标选择"
										style="background: #ffffff;width: 100px">
										<option value="null" selected="selected">指标选择</option>
										<option value="ad">氨氮</option>
										<option value="hxxyl">化学需氧量</option>
										<option value="zl">总磷</option>
										<option value="zd">总氮</option>
										<option value="sum">全指标</option>
									</select>
								</div>
							</div>
						</div>
						<div class="flex-row" onclick="searchqmpwr(${qmpWrxx})"
							 style="margin-top: 50px; border: none; width: 100%">
							<button type="button" class="btnz btnz-black" id="analysis"
									style="background-color: #3391e8;border-color: white">趋势分析</button>
						</div>
					</div>
				</div>
			</div>
		</div>


	</div>




















	<%--<div class="row" style="height: 100%;">
	 <div class="col-md-3" id="menu" style="border: solid; border-width: 5px; border-color: #eaeafa; background-color: #f6fcff;height: 600px;">
        <div class="row" id="selsection" style="margin-top: 10px">
				<div class="col-md-1"></div>
				<div class="col-md-3">
					<label for="section" class="lsel">达标断面:</label>
				</div>
				<div class="col-md-7">
					<select id="section" name="sectionDabiao" class="msel" title="达标断面">
						<option value="null" selected="selected">选择断面</option>
						<option value="红庙子">红庙子</option>
						<option value="东陵大桥">东陵大桥</option>
						<option value="旧门桥">旧门桥</option>
					</select>
					<div class="col-md-3">
					<label for="section" class="lsel">非达标断面:</label>
				</div>
					<select id="section" name="sectionNoDaBiao" class="msel" title="断面">
						<option value="null" selected="selected">选择断面</option>
						<option value="红庙子">红庙子</optison>
						<option value="东陵大桥">东陵大桥</option>
						<option value="旧门桥">旧门桥</option>
					</select>
				</div>
				<input type="text" id="section" name="section_name" title="断面" value="红庙子">
			</div>
			<div class="row" id="selsection" style="margin-top: 10px" >
				<div class="col-md-1"></div>
				<div class="col-md-3">
					<label for="section" class="lsel">断面:</label>
				</div>
				<div class="col-md-7">
					<select id="section" name="section" class="msel" title="断面">
						<option value="null" selected="selected">选择断面</option>
						<optgroup id="dabiao" label="达标断面">
						<!-- <option value="红庙子">红庙子</option> -->
						</optgroup>
						<optgroup id="feidabiao" label="非达标断面">
						</optgroup>
					</select>
				</div>
				<!--< input type="text" id="section" name="section_name" title="断面" value="红庙子"> -->
			</div> 
			<HR align=center id="sp2" style="color: black"  SIZE=1>
		<div class="row" id="seltarget" style="margin-top: 20px">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="target" class="lsel">类型:</label>
			</div>
			<div class="col-md-7">
				<select name="target" class="msel" id="target" title="图表类型">
					<option value="null" selected="selected">图表类型</option>
					<option value="yearCircle">总指标逐年水质分析</option>
					<option value="YearEq">各指标多年单月水质分析</option>
					<option value="MonthWrxx">各指标一年逐月水质分析</option>
					<option value="YearOne">某指标逐年逐月水质分析</option>
				</select>
			</div>
			<input type="text" id="section" name="section_name" title="断面" value="红庙子">
		</div>
		<HR align=center id="sp1" style="color: black" SIZE=1>
		<div id="hid">
		<!-- <div class="row" id="seltarget" style="margin-top: 20px" hidden="hidden">
			<div class="col-md-1"></div>
			<div class="col-md-3">
				<label for="target" class="lsel">类型:</label>
			</div>
			<div class="col-md-7">
				<select name="target" class="msel" id="target" title="图表类型">
					<option value="null" selected="selected">图表类型</option>
					<option value="yearCircle">总指标逐年水质分析</option>
					<option value="YearEq">各指标多年单月水质分析</option>
					<option value="MonthWrxx">各指标一年逐月水质分析</option>
					<option value="YearOne">某指标逐年逐月水质分析</option>
				</select>
			</div>
			<input type="text" id="section" name="section_name" title="断面" value="红庙子">
		</div>
		-->
			<div class="row" id="selsection" style="margin-top: 10px" hidden="hidden">
				<div class="col-md-1"></div>
				<div class="col-md-3">
					<label for="section" class="lsel">断面:</label>
				</div>
				<div class="col-md-7">
					<select id="section" name="section" class="msel" title="断面">
						<option value="null" selected="selected">选择断面</option>
						<option value="红庙子">红庙子</option>
						<option value="东陵大桥">东陵大桥</option>
						<option value="旧门桥">旧门桥</option>
					</select>
				</div>
				<input type="text" id="section" name="section_name" title="断面" value="红庙子">
			</div>
			<HR align=center id="sp2" style="color: black" hidden="hidden" SIZE=1>

			<div class="row" id="selyear" style="margin-top: 10px" hidden="hidden">
				<div class="col-md-1"></div>
				<div class="col-md-3">
					<label for="year" class="lsel">年份:</label>
				</div>
				<div class="col-md-7">
					<select id="year" name="year" class="msel" title="年份">
						<option value="null" selected="selected">选择年份</option>
						<option value="2014">2014年</option>
						<option value="2015">2015年</option>
						<option value="2016">2016年</option>
					</select>
				</div>
				<input type="text" id="year" name="year" title="年份" value="">
			</div>
			<HR align=center id="sp3" style="color: black" hidden="hidden" SIZE=1>

			<div class="row" id="selmonth" style="margin-top: 10px" hidden="hidden">
				<div class="col-md-1">
				</div>
				<div class="col-md-3">
					<label for="month" class="lsel">月份:</label>
				</div>
				<div class="col-md-7">
					<select id="month" name="month" class="msel" title="月份">
						<option value="null" selected="selected">选择月份</option>
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>
				</div>

				<input type="text" id="year" name="year" title="年份" value="">
			</div>
			<HR align=center id="sp4" style="color: black" hidden="hidden" SIZE=1>

			<div class="row" id="seltype" style="margin-top: 10px" hidden="hidden">
				<div class="col-md-1"></div>
				<div class="col-md-3">
					<label for="type" class="lsel">指标:</label>
				</div>
				<div class="col-md-7">
					<select name="type" id="type" class="msel" title="指标选择">
						<option value="null" selected="selected">指标选择</option>
						<option value="ad">氨氮</option>
						<option value="hxxyl">化学需氧量</option>
						<option value="zl">总磷</option>
						<option value="zd">总氮</option>
						<option value="sum">全指标</option>
					</select>
				</div>
				<input type="text" id="section" name="section_name" title="断面" value="红庙子">
			</div>
			<HR align=center id="sp5" style="color: black" hidden="hidden" SIZE=1>
		 </div> 
		<div class="row" style="margin-top: 40px">
			<div class="col-md-4"></div>
			<div class="col-md-8">
					<!-- <button type="button" id="analysis"
						style="font-size: 18px; height: 40px; width: 80px;"
						class="btn btn-success">提交</button> -->
		</div>

	</div>

	<div class="col-md-9" id="canvas" style="background-color: #f2ffee;height: 600px;">
		<div class="col-md-12">
			<div class="col-md-10">
				<div id="chart" style="width:80%;margin:50px auto;"></div>
				<div id="chart" style="width: 800px; height: 600px; margin-left: 100px"></div>
			</div>
			<div class="col-md-2">
			</div>
			<div style="width: 600px; height: 200px;"></div>
		</div>
	</div>
</div> --%>

</body>
</html>


