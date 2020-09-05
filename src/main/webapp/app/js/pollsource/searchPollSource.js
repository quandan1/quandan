$(function() {
	var i = 0;
	var selectArray = {};
	var searchCount = 2;
	var json = {
		"test" : "test"
	};
	var hash = {};
	var reHash = {};
	var marks = $('#treeselect').val();
	if( marks == "psrc") {
		hash = {
	 
				"XZQHMC"		: "行政区划",		 
				"TBDWXXMC"		: "填报单位详细名称",
				"KZDY"			: "控制单元",	 
				"KZDM"			: "控制断面",	 
				"XXDZDQ_S_Z_M"	: "市州盟",		 
				"XXDZX_Q_S_Q"	: "区市旗",		 
				"XXDZX_Z"		: "乡镇",		 
				"SNSTMC"  		: "受纳水体",		 
				"GYFSPFL_D"		: "废水",		 
				"HXXYLPFL_D"	: "需氧量",			 
				"ADPFL_D"		: "氨氮",		 	
				"SYLPFL_D"		: "石油",			 	
				"HFFPFL_QK"		: "挥发酚",		 
				"QHWPFL_QK"		: "氰化物",		 
				"FSSPFL_QK"		: "砷",		 
				"FSQPFL_QK"		: "铅",		 
				"FSGPFL_QK"		: "镉",		 
				"FSGPFL_QK_DUP1": "汞",		 
				"FSZGPFL_QK"	: "总铬",		 	
				"FSLJGPFL_QK"	: "六价铬",



                "WTXHL_D"      :"煤炭消耗量",
				"RLYXHL_D"      :"燃料油消耗量",
		        "JTXHL_D"		: "焦炭消耗量",
			    "TRQXHL_WLFM"	: "天然气消耗量",
			    "QTRYXHL_DBZM"	: "其他燃油消耗量",
			    "YDL_WQWS"		: "用电量",
			    "GYYSL_D"		: "工业用水量",
			    "ZDPFL_D"		: "总氮",
			    "ZPPFL_D"		: "总磷",
			    "GYFQPFL_WLFM" : "工业废气",
			    "EYHSPFL_D"	    : "二氧化硫",
			    "DYHWPFL_D"  	: "氮氧化物",
			    "YCPFL_D"		: "烟尘",
			    "VOCSPFL_D"		: "挥发性有机物",
			    "FQSPFL_QK"		: "废气砷",
			    "FQQPFL_QK"		: "废气铅",
			    "FQGPFL_QK"		: "废气镉",
			    "FQZGPFL_QK"	: "废气总铬",
			    "FQLJGPFL_QK"   : "废气六价铬",
			    "YBGYGTFWDQL_D"	: "一般工业固体废物倾倒丢弃量",
			    "WXFWDQL_D"	    : "危险废物倾倒丢弃量"





		} 
		reHash = {

				"行政区划" 			: "XZQHMC",				
				"填报单位详细名称" 	: "TBDWXXMC",				
				"控制单元" 			: "KZDY",				
				"控制断面" 			: "KZDM",				
				"市州盟" 			: "XXDZDQ_S_Z_M",				
				"区市旗" 			: "XXDZX_Q_S_Q",				
				"乡镇" 				: "XXDZX_Z",				
				"受纳水体" 			: "SNSTMC",			 				
				"废水" 				: "GYFSPFL_D",		 				
				"需氧量" 			: "HXXYLPFL_D",			
				"氨氮" 				: "ADPFL_D",				
				"石油" 				: "SYLPFL_D",				
				"挥发酚" 			: "HFFPFL_QK",				
				"氰化物" 			: "QHWPFL_QK",				
				"砷" 				: "FSSPFL_QK",				
				"铅" 				: "FSQPFL_QK",				
				"镉" 				: "FSGPFL_QK",				
				"汞" 				: "FSGPFL_QK_DUP1",			
				"总铬" 				: "FSZGPFL_QK",	 			
				"六价铬" 			: "FSLJGPFL_QK"





			   "煤炭消耗量"          :"WTXHL_D"      ,
			   "燃料油消耗量"         :"RLYXHL_D"      ,
			   "焦炭消耗量"          :"JTXHL_D"		,
			   "天然气消耗量"         :"TRQXHL_WLFM"	,
			   "其他燃油消耗量"       :"QTRYXHL_DBZM"	,
			   "用电量"              :"YDL_WQWS"		,
			   "工业用水量"           :"GYYSL_D"		,
			   "总氮"                :"ZDPFL_D"		,
			   "总磷"                :"ZPPFL_D"		,
			   "工业废气"             :"GYFQPFL_WLFM" ,
			   "二氧化硫"             :"EYHSPFL_D"	    ,
			   "氮氧化物"             :"DYHWPFL_D"  	,
			   "烟尘"                 :"YCPFL_D"		,
			   "挥发性有机物"          :"VOCSPFL_D"		,
			   "废气砷"               :"FQSPFL_QK"		,
			   "废气铅"               :"FQQPFL_QK"		,
			   "废气镉"               :"FQGPFL_QK"		,
			   "废气总铬"              :"FQZGPFL_QK"	,
			   "废气六价铬"            :"FQLJGPFL_QK"   ,
			   "一般工业固体废物倾倒丢弃量":"YBGYGTFWDQL_D"	,
			   "危险废物倾倒丢弃量"      :"WXFWDQL_D"


		}
	}else if( marks == "pfty"){
	
		hash = {

			"XZQHMC"           :"行政区划名称"                 ,
			"ZZJGDM"           :"组织机构代码"                 ,
			"DWMC_GZ"         :"单位名称(公章)"               ,
			"SSDM"             :"所属断面"                     ,
			"SSKZDY"           :"所在控制单元"                 ,
			"QYXXDZ_DQ_S_Z_M" :"企业详细地址_市 "             ,
			"QYXXDZ_X_Q_S_Q"   :"企业详细地址_县 "             ,
			"QYXXDZ_X_Z"       :"企业详细地址_乡 "             ,
			"QYXXDZ_J_C_MPH"   :"企业详细地址_街 "             ,
			"JD"               :"经度"                         ,
			"WD"               :"纬度"                         ,
			"WSCLFFMC1"       :"污水处理方法名称1 "           ,
			"PSQXLXMC"         :"排水去向类型名称"             ,
			"SNSTMC"           :"受纳水体名称"                 ,
			"YXTS_T"           :"运行天数（天）"               ,
			"WSSJCLNL_D_R"     :"污水设计处理能力（吨/日） "   ,
			"WSSJCLL_WD"       :"污水实际处理量（万吨）"       ,
			"QZ_CLSHWSL_WD"   :"其中：处理生活污水量（万吨）" ,
			"QZ_CLGYFSL_WD"   :"其中：处理工业废水量（万吨） ",
			"HXXYLQCL_D"       :"化学需氧量去除量（吨） "      ,
			"HXXYLJKND_HK_S"   :"化学需氧量进口浓度（毫克/升）",
			"HXXYLCKND_HK_S"   :"化学需氧量出口浓度（毫克/升）",
			"ADQCL_D"         :"氨氮去除量（吨） "            ,
			"ADJKND_HK_S"     :"氨氮进口浓度（毫克/升）"      ,
			"ADCKND_HK_S"     :"氨氮出口浓度（毫克/升）"      ,
			"ZDQCL_D"         :"总氮去除量（吨） "            ,
			"ZDJKND_HK_S"     :"总氮进口浓度（毫克/升）"      ,
			"ZDCKND_HK_S"     :"总氮出口浓度（毫克/升）"      ,
			"ZLQCL_QK"         :"总磷去除量（千克） "          ,
			"ZLJKND_HK_S"     :"总磷进口浓度（毫克/升）"      ,
			"ZLCKND_HK_S"     :"总磷出口浓度（毫克/升）",



			"WNQDDQL_D"       :"污泥倾倒丢弃量（吨） "      ,
			"SHXYLQCL_D"   :"生化需氧量去除量（吨）",
			"SHXYLJKND_HK_S"   :"生化需氧量进口浓度（毫克/升）",
			"SHXYCKND_HK_S"         :"生化需氧量出口浓度（毫克/升） "            ,
			"XFWQCL_D"     :"悬浮物去除量（吨）"      ,
			"XFWJKND_HK_S"     :"悬浮物进口浓度（毫克/升）"      ,
			"XFWCKND_HK_S"         :"悬浮物出口浓度（毫克/升） "            ,
			"DZWYQCL_D"     :"动植物油去除量（吨）"      ,
			"DZWYJKND_HK_S"     :"动植物油进口浓度（毫克/升））"      ,
			"DZWYCKND_HK_S"         :"动植物油出口浓度（毫克/升） "          ,
			"SYLQCL_D"     :"石油类去除量（吨）"      ,
			"SYLJKND_HK_S"     :"石油类进口浓度（毫克/升）",
			"SYLCKND_HK_S"     :"石油类出口浓度（毫克/升）"      ,
			"YLZHXJQCL_D"         :"阴离子活性剂去除量（吨） "            ,
			"YLZHXJJKND_HK_S"     :"阴离子活性剂进口浓度（毫克/升）"      ,
			"YLZHXJCKND_HK_S"     :"阴离子活性剂出口浓度（毫克/升）"



	}
		reHash = {

			"行政区划名称"                 :"XZQHMC"           ,
			"组织机构代码"                 :"ZZJGDM"           ,
			"单位名称(公章)"               :"DWMC_GZ"         ,
			"所属断面"                     :"SSDM"             ,
			"所在控制单元"                 :"SSKZDY"           ,
			"企业详细地址_市 "             :"QYXXDZ_DQ_S_Z_M" ,
			"企业详细地址_县 "             :"QYXXDZ_X_Q_S_Q"   ,
			"企业详细地址_乡 "             :"QYXXDZ_X_Z"       ,
			"企业详细地址_街 "             :"QYXXDZ_J_C_MPH"   ,
			"经度"                         :"JD"               ,
			"纬度"                         :"WD"               ,
			"污水处理方法名称1 "           :"WSCLFFMC1"       ,
			"排水去向类型名称"             :"PSQXLXMC"         ,
			"受纳水体名称"                 :"SNSTMC"           ,
			"运行天数（天）"               :"YXTS_T"           ,
			"污水设计处理能力（吨/日） "   :"WSSJCLNL_D_R"     ,
			"污水实际处理量（万吨）"       :"WSSJCLL_WD"       ,
			"其中：处理生活污水量（万吨）" :"QZ_CLSHWSL_WD"   ,
			"其中：处理工业废水量（万吨） ":"QZ_CLGYFSL_WD"   ,
			"化学需氧量去除量（吨） "      :"HXXYLQCL_D"      ,
			"化学需氧量进口浓度（毫克/升）":"HXXYLJKND_HK_S"  ,
			"化学需氧量出口浓度（毫克/升）":"HXXYLCKND_HK_S"  ,
			"氨氮去除量（吨） "            :"ADQCL_D"         ,
			"氨氮进口浓度（毫克/升）"      :"ADJKND_HK_S"     ,
			"氨氮出口浓度（毫克/升）"      :"ADCKND_HK_S"     ,
			"总氮去除量（吨） "            :"ZDQCL_D"        ,
			"总氮进口浓度（毫克/升）"      :"ZDJKND_HK_S"     ,
			"总氮出口浓度（毫克/升）"      :"ZDCKND_HK_S"     ,
			"总磷去除量（千克） "          :"ZLQCL_QK"        ,
			"总磷进口浓度（毫克/升）"      :"ZLJKND_HK_S"     ,
			"总磷出口浓度（毫克/升）"      :"ZLCKND_HK_S"     ,



			"污泥倾倒丢弃量（吨）"  :"WNQDDQL_D"           ,
			"生化需氧量去除量（吨）":"SHXYLQCL_D"   ,
			"生化需氧量进口浓度（毫克/升）":"SHXYLJKND_HK_S"   ,
			"生化需氧量出口浓度（毫克/升） " :"SHXYCKND_HK_S"                    ,
			"悬浮物去除量（吨）"  :"XFWQCL_D"         ,
			"悬浮物进口浓度（毫克/升）"  :"XFWJKND_HK_S"         ,
			"悬浮物出口浓度（毫克/升） " :"XFWCKND_HK_S"                    ,
			"动植物油去除量（吨）"  :"DZWYQCL_D"         ,
			"动植物油进口浓度（毫克/升））"  :"DZWYJKND_HK_S"         ,
			"动植物油出口浓度（毫克/升） " :"DZWYCKND_HK_S"                  ,
			"石油类去除量（吨）" :"SYLQCL_D"          ,
			"石油类进口浓度（毫克/升）":"SYLJKND_HK_S"     ,
			"石油类出口浓度（毫克/升）" :"SYLCKND_HK_S"          ,
			"阴离子活性剂去除量（吨） "  :"YLZHXJQCL_D"                   ,
			"阴离子活性剂进口浓度（毫克/升）" :"YLZHXJJKND_HK_S"          ,
			"阴离子活性剂出口浓度（毫克/升）":"YLZHXJCKND_HK_S"

		}
	}else if( marks == "pyz"){
	
		hash = {
				"XZQHMC"            :"行政区划名称"           ,
				"YZCBM"             :"养殖场(小区)编码"       ,
				"YZCMC"             :"养殖场(小区)名称"       ,
				"KZDM"              :"控制断面"               ,
				"KZDY"              :"控制单元"               ,
				"JD"                :"经度（增加） "           ,
				"WD"                :"纬度（增加） "           ,
				"DZ_S"              :"地址(市、州、盟)"        ,
				"DZ_X"              :"地址(区、市、旗) "       ,
				"XZ"                :"乡(镇)"                 ,
				"JC"                :"街(村)"                 ,
				"SZLYMC"            :"所在流域名称 "           ,
				"SNSTMC"            :"受纳水体名称"           ,
				"XQZL"              :"畜禽种类"               ,
				"SYL"               :"饲养量（头/羽）"        ,
				"PFL_HXXYL"         :"排放量_化学需氧量（千克） " ,
				"PFL_ZD"            :"排放量_总氮（千克）"     ,
				"PFL_ZL"            :"排放量_总磷（千克）"    ,
				"PFL_AD"            :"排放量_氨氮（千克） "   ,
				"QCL_HXXYL"         :"去除率_化学需氧量 "            ,
				"QCL_ZD"            :"去除率_总氮"  ,
				"QCL_ZL"            :"去除率_总磷"  ,
				"QCL_AD"            :"去除率_氨氮 "                 

		}
		reHash = {

				"行政区划名称"                 :"XZQHMC"           ,
				"养殖场(小区)编码"                 :"YZCBM"           ,
				"养殖场(小区)名称"               :"YZCMC"         ,
				"控制断面"                     :"KZDM"             ,
				"控制单元"                 :"KZDY"           ,
				"经度（增加） "             :"JD" ,
				"纬度（增加） "             :"WD"   ,
				"地址(市、州、盟)"             :"DZ_S"       ,
				"地址(区、市、旗) "             :"DZ_X"   ,
				"乡(镇)"                         :"XZ"               ,
				"街(村)"                         :"JC"               ,
				"所在流域名称 "           :"SZLYMC"       ,
				"受纳水体名称"             :"SNSTMC"         ,
				"畜禽种类"                 :"XQZL"           ,
				"饲养量（头/羽）"               :"SYL"           ,
				"排放量_化学需氧量（千克） "   :"PFL_HXXYL"     ,
				"排放量_总氮（千克）"       :"PFL_ZD"       ,
				"排放量_总磷（千克）" :"PFL_ZL"   ,
				"排放量_氨氮（千克） ":"PFL_AD"   ,
				"去除率_化学需氧量 "      :"QCL_HXXYL"      ,
				"去除率_总氮":"QCL_ZD"  ,
				"去除率_总磷":"QCL_ZL"  ,
				"去除率_氨氮 "            :"QCL_AD"        
		}
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
			if (splitArray[i] != "is_del"){
				if(typeof(hash[splitArray[i]]) != "undefined"){
					var selectLi = "";
					selectLi += "<li><a>";
					selectLi += hash[splitArray[i]];
					selectLi += "</a></li>";
					$('#searchSelectTable tr:last td:first div ul').append(selectLi);
				}
				
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
		url : "rest/"+$('#treeselect').val()+"/getTableName",
		dataType : "json",
		async : false,
		success : function(result) {
			selectArray = result.toString().split(",");
			appendSelect(selectArray);
		}
	});
	$("#addSearch").click(function() {
		if(searchCount <= JSONLength(hash)){
			if($('#searchSelectTable tr:last td:first div button').text()!="查询条件"){
				var temp = "";
				temp += "<tr>";
				temp += "<td><div class='dropdown'>";
				temp += "<button class='btnz btnz-info' type='button' id='dropdownMenu";
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
	$('#searchPollSource_x').unbind("click").bind("click",function(){
		
		$('#jsonInput').val("").val(JSON.stringify(json));
		$('#jumpTmp').val("");
		
		var username = $('.username').text();
		createJson(json, "username", username);
		console.log(json);
		
		var pt;
		if($('#treeselect').val()=="psrc")
			pt = "rest/psrc/searchAllPsrc";
		else if($('#treeselect').val()=="pfty")
			pt = "rest/pfty/searchAllPfty";
		else if($('#treeselect').val()=="pyz") 
			pt = "rest/pyz/searchAllPyz";
				
		$.ajax({
			type : "POST",
			dataType : "html",
			async : false,
			url : "rest/"+$('#treeselect').val()+"/search",
			data : json,
			success : function(data) {
				$('#listAll').html(data);
				$.ajax({
					type : "POST",
					async : false,
					url : pt,
					data : json,
					success : function(data) {
						updatePsrcInMap(data,0);
					}
				});
			}
		});
	});
});