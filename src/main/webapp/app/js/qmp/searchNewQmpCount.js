$(function() {
    var i = 0;
    var selectArray = {};
    var searchCount = 2;
    var json = {
        "test" : "test"
    };

    var hash = {
        "id" : "序号",
        "section_level" : "断面级别",
        "ykh_108" : "原考核108",
        "hlsz_90" : "河流水质90",
        "original_id" : "原序号",
        "loc_province" : "所属省份",
        "loc_city" : "所属地市",
        "loc_district" : "所属区县",
        "cz_name" : "测站名称",
        "section_name" : "断面名称",
        "basin" : "所属流域",
        "river_name" : "所属河流",
        "section_sx" : "断面属性",
        "river_level" : "河流级别",
        "sksk" : "受控水库",
        "longitude" : "经度（度）",
        "latitude" : "纬度（度）",
    }

    var reHash = {
        "序号":"id" ,
        "断面级别":"section_level" ,
        "原考核108":"ykh_108" ,
        "河流水质90":"hlsz_90" ,
        "原序号":"original_id",
        "所属省份":"loc_province" ,
        "所属地市":"loc_city",
        "所属区县":"loc_district",
        "测站名称":"cz_name",
        "断面名称":"section_name",
        "所属流域":"basin",
        "所属河流":"river_name",
        "断面属性":"section_sx",
        "河流级别":"river_level",
        "受控水库":"sksk",
        "经度（度）":"longitude",
        "纬度（度）":"纬度（度）",
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
        url : "rest/qmp/getQmpBasInfoTableName",
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
            url : "rest/qmp/searchQmpBaeInfo",
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


