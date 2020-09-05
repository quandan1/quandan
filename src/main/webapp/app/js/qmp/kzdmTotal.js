$(function() {
	$('#find').click(function() {
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
	        url : "rest/qmp/sum",
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
