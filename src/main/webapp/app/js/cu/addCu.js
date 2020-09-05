$(function(){
	
	$('#addCu').click(function() {
		$.ajax({
			type : "POST",
			dataType : "ControlUnit",
			async : false,
			url : "rest/controlunit/insert",
			data : $('#insertForm').serialize(),
		});
		
		var url = "rest/controlunit/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#listCu_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#addCu_x').unbind("click").bind("click",function(){
		$.ajax({
			type : "POST",
			//dataType : "ControlUnit",
			async : true,
			url : "rest/controlunit/insert",
			data : $('#insertForm').serialize(),
			success : function() {
				var url = "rest/controlunit/list";
				$.get(url, function(data) {
					$('#listAll').html(data);
				});
			}
		});
	});
});
