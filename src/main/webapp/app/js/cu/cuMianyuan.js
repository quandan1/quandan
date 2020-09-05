//var result=[
//    {"name":"通江口","jan":1,"feb":"2","mar":3,"apr":4,"may":1,"june":"2","july":3,"aug":4,"sept":1,"oct":"11","nov":3,"dev":4,"year":4},
//    {"name":"通江口","jan":1,"feb":"2","mar":3,"apr":4,"may":1,"june":"2","july":3,"aug":4,"sept":1,"oct":"11","nov":3,"dev":4,"year":4}
//];

$.ajax({
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/controlunit/cuMianyuan",
        data: {
            "target": "ad"
        },
        success: function (data) {
        	$("#cuMYTable tr:not(:first)").html("");
        	function getJsonObjLength(jsonObj) {
                var Length = 0;
                for (var item in jsonObj) {
                    Length++;
                }
                return Length;
            }
        	var data = JSON.parse(data);
        	console.log(getJsonObjLength(data));
            for (var i = 0; i < getJsonObjLength(data); i++) {
            	console.log(decodeURIComponent(data[i].name));
                var html = "";
                html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
                html += decodeURIComponent(data[i].name);
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].apr=="error"){
                	html += "异常";
                }else{
                    html += data[i].apr;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].may=="error"){
                	html += "异常";
                }else{
                    html += data[i].may;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].june=="error"){
                	html += "异常";
                }else{
                    html += data[i].june;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].july=="error"){
                	html += "异常";
                }else{
                    html += data[i].july;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].aug=="error"){
                	html += "异常";
                }else{
                    html += data[i].aug;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].sept=="error"){
                	html += "异常";
                }else{
                    html += data[i].sept;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].oct=="error"){
                	html += "异常";
                }else{
                    html += data[i].oct;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].nov=="error"){
                	html += "异常";
                }else{
                    html += data[i].nov;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                html += 2014;
                html += "</td></tr>";
                $("#cuMYTable").append(html);

            }
        }
});

$("#target").on("change", function () {
    
    $.ajax({
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/controlunit/cuMianyuan",
        data: {
            "target": $("#target").val()
        },
        success: function (data) {
        	$("#cuMYTable tr:not(:first)").html("");
        	function getJsonObjLength(jsonObj) {
                var Length = 0;
                for (var item in jsonObj) {
                    Length++;
                }
                return Length;
            }
        	var data = JSON.parse(data);
        	console.log(getJsonObjLength(data));
            for (var i = 0; i < getJsonObjLength(data); i++) {
            	console.log(decodeURIComponent(data[i].name));
                var html = "";
                html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
                html += decodeURIComponent(data[i].name);
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].apr=="error"){
                	html += "异常";
                }else{
                    html += data[i].apr;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].may=="error"){
                	html += "异常";
                }else{
                    html += data[i].may;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].june=="error"){
                	html += "异常";
                }else{
                    html += data[i].june;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].july=="error"){
                	html += "异常";
                }else{
                    html += data[i].july;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].aug=="error"){
                	html += "异常";
                }else{
                    html += data[i].aug;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].sept=="error"){
                	html += "异常";
                }else{
                    html += data[i].sept;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].oct=="error"){
                	html += "异常";
                }else{
                    html += data[i].oct;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                if(data[i].nov=="error"){
                	html += "异常";
                }else{
                    html += data[i].nov;
                }
                html += "</td>";
                html += "<td align=\"center\" style=\"white-space: nowrap;\">";
                html += 2014;
                html += "</td></tr>";
                $("#cuMYTable").append(html);

            }
        }
    });

});