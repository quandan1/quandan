$(function() {
	var i = 0;
	var selectArray = {};
	var searchCount = 2;
	var json = {
		"test" : "test"
	};
//qmp_wrxx
	var hash = {
        "id" : "序号",
		"year" : "年份",
		"month" : "月份",
		"section_bm" : "断面编码",
		"section_name" : "断面名称",
		"loc_city" : "所在地区",
		"loc_river" : "所在河流",
		"ddl" : "电导率",
		"water_temperature" : "水温",
		"ph" : "PH值",
		"rjy" : "溶解氧",
		"tmd" : "透明度",
		"yd" : "盐度",
		"cod_mn" : "高锰酸盐指数标准",
		"cod_cr" : "化学需氧量标准",
		"nh_n" : "氨氮标准",
		"t_p" : "总磷标准",
		"t_n" : "总氮标准",
		"cu" : "铜标准",
		"zn" : "锌标准",
		"pb" : "铅标准",
		"cd" : "镉标准",
		"bod5" : "生化需氧量标准",
		"t_as" : "砷标准",
		"t_se" : "硒标准",
		"t_hg" : "汞标准",
		"cr_6" : "六价铬标准",
		"f_" : "氟化物标准",
		"cn_" : "氰化物标准",
		"hff" : "挥发酚",
		"syl" : "石油类",
		"las" : "阴离子表面活性剂标准",
		"s2_" : "硫化物标准",
		"chla" : "Chla",
		"no3" : "NO3-",
        "no2" : "NO2-",
        "ll" : "流量",
        "sw" : "水位",
        "fdcjqbz" : "粪大肠菌群标准"

	}

	var reHash = {
        "序号" : "id",
        "年份" : "year",
        "月份" : "month",
        "断面编码" : "section_bm",
        "断面名称" : "section_name",
        "所在地区" : "loc_city",
        "所在河流" : "loc_river",
        "电导率" : "ddl",
        "水温" : "water_temperature",
        "PH值" : "ph",
        "溶解氧" : "rjy",
        "透明度" : "tmd",
        "盐度" : "yd",
        "高锰酸盐指数标准" : "cod_mn",
        "化学需氧量标准" : "cod_cr",
        "氨氮标准" : "nh_n",
        "总磷标准" : "t_p",
        "总氮标准" : "t_n",
        "铜标准" : "cu",
        "锌标准" : "zn",
        "铅标准" : "pb",
        "镉标准" : "cd",
        "生化需氧量标准" : "bod5",
        "砷标准" : "t_as",
        "硒标准" : "t_se",
        "汞标准" : "t_hg",
        "六价铬标准" : "cr_6",
        "氟化物标准" : "f_",
        "氰化物标准" : "cn_",
        "挥发酚" : "hff",
        "石油类" : "syl",
        "阴离子表面活性剂标准" : "las",
        "硫化物标准" : "s2_",
        "Chla" : "chla",
        "NO3-" : "no3",
        "NO2-" : "no2",
        "流量" : "ll",
        "水位" : "sw",
        "粪大肠菌群标准" : "fdcjqbz"
	}
	
	function JSONLength(obj) {
		var size = 0, key;
		for (key in obj) {
			if (obj.hasOwnProperty(key)) size++;
		}
		return size;
	};
	
	function createJson(json, prop, val) {
		if (typeof val === "undefined") {
			delete json[prop];
		} else {
			json[prop] = val;
		}
	}
	
	function appendSelect(splitArray) {
		for (i = 0; i < splitArray.length; i++) {
			if (splitArray[i] != "is_del" && splitArray[i] != "loc_lon_d"
					&& splitArray[i] != "loc_lon_m"
					&& splitArray[i] != "loc_lon_s"
					&& splitArray[i] != "loc_lat_d"
					&& splitArray[i] != "loc_lat_m"
					&& splitArray[i] != "loc_lat_s") {
				var selectLi = "";
				selectLi += "<li><a>";
				selectLi += hash[splitArray[i]];
				selectLi += "</a></li>";
				$('#searchSelectTable tr:last td:first div ul').append(selectLi);
			}
		}
	}

	function removeByValue(arr, val) {
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				arr.splice(i, 1);
				break;
			}
		}
	}
	
	$.ajax({
		type : "POST",
		url : "rest/qmp/getQmpTestDataTableName",
		dataType : "json",
		async : false,
		success : function(result) {
			console.log(result);
			selectArray = result.toString().split(",");
			appendSelect(selectArray);
		}
	});

	$("#addSearch").click(function() {
		if(searchCount <= JSONLength(hash)){
			if($('#searchSelectTable tr:last td:first div button').text() != "查询条件"){
				var temp = "";
				temp += "<tr>";
				temp += "<td><div class='dropdown'>";
				temp += "<button class='btnz btnz-info dropdown-toggle' type='button' id='dropdownMenu";
				temp += searchCount;
				temp += "' data-toggle='dropdown' aria-haspopup='true' aria-expanded='true'>";
				temp += "查询条件";
				temp += "<span class='caret'></span>";
				temp += "</button>";
				temp += "<ul class='dropdown-menu' aria-labelledby='dropdownMenu";
				temp += searchCount++;
				temp += "'>";
				temp += "</ul></div></td>";
				temp += "<td><input type='text' size='40' class='inpMain' /></td>";
				temp += "</tr>";	

				$("#searchSelectTable").append(temp);
				appendSelect(selectArray);
			}else{
				alert("请您填写完整上一条查询后，再添加新的查询条件，谢谢。")
			}
		}else{
			alert("您不能添加更多的查询条件了=。=")
		}
	});

	$("#removeSearch").click(function() {
		if(searchCount == 2){		
			alert("您必须保留至少一条查询条件 ：）")
		}else{
			selectArray.push(reHash[$('#searchSelectTable tr:last td:first div button').text()]);
			$("#searchSelectTable tr:last").remove();
			searchCount--;
		}
		
	});

	$("#searchSelectTable").on("blur","tr:last td:last input",function(){  
		if ($('#searchSelectTable tr:last td:first div button').text().replace(/(^\s*)|(\s*$)/g, '') != "Dropdown") {
			if (reHash[$(this).parent().parent().find('button').text()] != "undefined") {
				var key = reHash[$(this).parent().parent().find('button').text()];
			}else{
				var key = $(this).parent().parent().find('button').text();
			}			
			var value = $(this).val();
			createJson(json, key, value);
			createJson(json, "test");
		}
	}); 
	
	$('#searchSelectTable').on("click","tr td div ul a",function(e) {
		e.preventDefault();
		var text = reHash[$(this).text()];
		$(this).parent().parent().parent().find('button').text(hash[text]);
		removeByValue(selectArray, text);
	});

	$('#searchQmp_x').unbind("click").bind("click",function(){
		debugger;
		$('#jsonInput').val("");
		$('#jsonInput').val(JSON.stringify(json));
		$('#jumpTmp').val("");
		
		var username = $('.username').text();
		createJson(json, "username", username);

		$.ajax({
			type : "POST",
			dataType : "html",
			async : false,
			url : "rest/qmp/searchSzxz",
			data : json,
			success : function(data) {
				$('#listAll').html(data);
			}
		});
		
		$.ajax({
			type : "POST",
			async : false,
			url : "rest/qmp/searchAllQmp",
			data : json,
			success : function(data) {
				//updateQmpInMap(data);
			}
		});
	});
});


