function water(){
	var sy = $('#sy').val();
	var value = $("#youkong").val(); 
	var json = {
	        "youkong": value,
	        "sy" : sy
    };
    $('#jsonInput').val(JSON.stringify(json));
	if($('#choose option:selected').val()=="source"){
		$.ajax({
			type : "POST",
			dataType: "html",
			async : false,
			url : "rest/controlunit/total",
			data: json,
			success: function(data){
				$('#listAll').html(data);
			}
		});
	}
	if($('#choose option:selected').val()=="yangzhi"){
		$.ajax({
			type : "POST",
			dataType: "html",
			async : false,
			url : "rest/controlunit/yangZhiTotal",
			data: json,
			success: function(data){
				$('#listAll').html(data);
			}
		});
	}
	if($('#choose option:selected').val()=="factory"){
		$.ajax({
			type : "POST",
			dataType: "html",
			async : false,
			data: json,
			url : "rest/controlunit/factoryTotal",
			success: function(data){
				$('#listAll').html(data);
			}
		});
	}
}


