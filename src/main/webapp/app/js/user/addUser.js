$('#addUser').unbind("click").click(function() {
	var city, county;
	city = $('#usercity').val();
	county = $('#county').val();
	if (county == city) {
		county = "";
	}
	var data = {
		"username" : $('#username').val(),
		"password" : $('#password').val(),
		"city" : city,
		"county" : county 
	}
	$.ajax({
		type : "POST",
		async : false,
		url : "rest/user/insert",
		data : data
	});
	var url = "rest/user/list";
	$.get(url, function(data) {
		$('#listAll').html(data);
	});
});
$("#usercity").change(function() {
	var cityName = $("#usercity").val();
	if (cityName == "辽宁") {
		$("#county option").remove();
		$("#county").append("<option value='辽宁'>辽宁</option>");
	} else {
		var data = {
			cityName : cityName
		}
		$.ajax({
			type : "POST",
			url : "rest/user/getCounty",
			data : data,
			async : false,
			success : function(result) {
				console.log(result)
				var co = [];
				co.push(cityName);
				var tt = decodeURIComponent(result).toString().split(
						",");
				for (var i = 0; i < tt.length; i++) {
					co.push(tt[i].toString().replace("+", "").replace(
							"[", "").replace("]", "").split("_"));
				}
				$("#county option").remove();
				for (i = 0; i < co.length; i++) {
					$("#county").append(
							"<option value=" + co[i] + ">" + co[i]
									+ "</option>");
				}
			}
		});
	}
});