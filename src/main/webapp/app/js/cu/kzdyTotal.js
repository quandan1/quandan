$(function() {
	$('#find').click(function() {
//		var name = encodeURI(encodeURI($('#findName').val()));
//		if(name == ""){
//			$.get("rest/controlunit/factoryTotal", function(data) {
//				$('#listAll').html(data);
//			});
//		}else{
//			var url = "rest/controlunit/selectFactoryTotal?name="+name;		
//			$.get(url, function(data) {
//				$('#listAll').html(data);
//			});
//		}
		var value = $("#youkong").val();
		var name = $('#findName').val();
		var json = {
		        "youkong": value,
		        "name":name
		};
	    $('#jsonInput').val(JSON.stringify(json));
	    $.ajax({
	        type: "POST",
	        dataType: "html",
	        async: false,
	        url : "rest/controlunit/sum",
	        data: json,
	        success: function (data) {
	            $('#listAll').html(data);
	        }
	    });
	});
	$('#page a').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	$('.search_A').click(function(e){
		var value = $("#youkong").val();
		var name = $('#findName').val();
		e.preventDefault();
		var url = this.href;
		var json = {
		        "youkong": value,
		        "name":name
		};
	    $('#jsonInput').val(JSON.stringify(json));
	    $.ajax({
	        type: "POST",
	        dataType: "html",
	        async: false,
	        url: url,
	        data: json,
	        success: function (data) {
	            $('#listAll').html(data);
	        }
	    });
	});
});
