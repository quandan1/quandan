$(function() {
	$('#find').click(function() {
		var name = encodeURI(encodeURI($('#findName').val()));
		if(name == ""){
			$.get("rest/controlunit/yangZhiTotal", function(data) {
				$('#listAll').html(data);
			});
		}else{
			var url = "rest/controlunit/selectYangZhiTotal?name="+name;		
			$.get(url, function(data) {
				$('#listAll').html(data);
			});
		}
	});
	$('#page a').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	$('.search_A').click(function(e){
		//console.log(1);
		var value = $("#youkong").val();
		var sy = $("#sy").val();
		e.preventDefault();
		var url = this.href;
		var json = {
		        "youkong": value,
		        "sy": sy
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
