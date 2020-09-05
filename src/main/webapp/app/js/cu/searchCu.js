$(function() {
	var i = 0;
	var selectArray = {};
	var searchCount = 2;
	var json = {
		"test" : "test"
	};

	var hash = {
		"id" : "序号",
		"unit_name" : "控制单元名称",
		"include_section" : "所含控制断面名称",
		"watershed" : "流域",
		"loc_province" : "所属省份",
		"involve_city" : "涉及地市",
		"involve_county" : "涉及区（县）名称",
		"involve_village" : "涉及乡镇名称",
		"village_amount" : "乡镇个数",
		"involve_river" : "涉及河流名称",
		"unit_type" : "控制单元类别",
		"water_resource" : "水资源区",
	    "hr_river" : "汇入河流",

		"include_sx":"包含水系",
		"include_gl":"所含干流",
		"include_1jzl":"所含一级支流",
		"include_2jzl":"所含二级支流",
		"include_3jzl":"所含三级支流",
		"include_4jzl":"所含四级支流",
		"kzdy_time":"控制单元划分时间"

	}

	var reHash = {
		"序号" : "id",
		"控制单元名称" : "unit_name",
		"所含控制断面名称" : "include_section",
		"流域" : "watershed",
		"所属省份" : "loc_province",
		"涉及地市" : "involve_city",
		"涉及区（县）名称" : "involve_county",
		"涉及乡镇名称" : "involve_village",
		"乡镇个数" : "village_amount",
		"涉及河流名称" : "involve_river",
		"控制单元类别" : "unit_type",
		"水资源区" : "water_resource",
	    "汇入河流" : "hr_river",

		"包含水系":"include_sx",
		"所含干流":"include_gl",
		"所含一级支流":"include_1jzl",
		"所含二级支流":"include_2jzl",
		"所含三级支流":"include_3jzl",
		"所含四级支流":"include_4jzl",
		"控制单元划分时间":"kzdy_time"

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
			if (splitArray[i] != "is_del") {
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
		url : "rest/controlunit/getTableName",
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
				$("#searchSelectTable").append(temp);//向所有段落中追加一些HTML标记，加到末尾
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

	$('#searchCu_x').unbind("click").bind("click",function(){
		 
		$('#jsonInput').val("").val(JSON.stringify(json));
		$('#jumpTmp').val("");
		
		$.ajax({
			type : "POST",
			dataType : "html",
			async : false,
			url : "rest/controlunit/search",
			data : json,
			success : function(data) {
				$('#listAll').html(data);
				var name=$("#nameForMap").val();
				//console.log(name)
				click();
				filterArcGISDynamicMapServiceLayer(name);
			}
		});
	});
});


