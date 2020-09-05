$(function() {
	var i = 0;
	var selectArray = {};
	var searchCount = 2;
	var json = {
		"test" : "test"
	};

	var hash = {
		"id" : "序号",
		"watershed" : "流域名称",
		"river_name" : "所在河流",
		"river_level" : "河流级别/湖库属性",
		"river_to" : "汇入河流（湖库、海洋）",
		"section_name" : "断面名称",
		"section_property" : "断面属性",
		"loc_province" : "所属省份",
		"loc_city" : "所属地市",
		"loc_county" : "所属区县",
		"test_by" : "测站名称",
		"section_level" : "断面级别",
		"section_type" : "断面类型",
		"is_urban" : "是否在城市建成区",
		"is_addition" : "现有/拟增设",
		"test_frequency" : "监测频次",
		"test_items" : "监测项目",
		"quality_target" : "功能区水质目标",

		"sectionBymc": "所属控制单元名称",
		"sectionShhl": "收纳河流"
	}

	var reHash = {
		"序号" : "id",
		"流域名称" : "watershed",
		"所在河流" : "river_name",
		"河流级别/湖库属性" : "river_level",
		"汇入河流（湖库、海洋）" : "river_to",
		"断面名称" : "section_name",
		"断面属性" : "section_property",
		"所属省份" : "loc_province",
		"所属地市" : "loc_city",
		"所属区县" : "loc_county",
		"测站名称" : "test_by",
		"断面级别" : "section_level",
		"断面类型" : "section_type",
		"是否在城市建成区" : "is_urban",
		"现有/拟增设" : "is_addition",
		"监测频次" : "test_frequency",
		"监测项目" : "test_items",
		"功能区水质目标" : "quality_target",

		"所属控制单元名称" :"sectionBymc",
		"收纳河流":"sectionShhl"

	}

	function JSONLength(obj) {
		var size = 0, key;
		for (key in obj) {
			if (obj.hasOwnProperty(key)) size++;
		}
		return size;
	}

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

	/*$.ajax({
        type : "POST",
        url : "rest/qmp/" +
        "",
        dataType : "json",
        async : false,
        success : function(result) {
            selectArray = result.toString().split(",");
            appendSelect(selectArray);
        }
    });*/

	$.ajax({
		type : "POST",
		url : "rest/qmp/getTableName",
		dataType : "json",
		async : false,
		success : function(result) {
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
		//debugger;
		$('#jsonInput').val("");
		$('#jsonInput').val(JSON.stringify(json));
		$('#jumpTmp').val("");

		var username = $('.username').text();
		createJson(json, "username", username);

		$.ajax({
			type : "POST",
			dataType : "html",
			async : false,
			url : "rest/qmp/search",
			data : json,
			success : function(data) {
				//alert("000000");
				$('#listAll').html(data);
			}
		});

		$.ajax({
			type : "POST",
			async : false,
			url : "rest/qmp/searchAllQmp",
			data : json,
			success : function(data) {
				updateQmpInMap(data);
			}
		});
	});
});


