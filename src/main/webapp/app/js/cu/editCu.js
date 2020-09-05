$(function() {
	
	$('#update').click(function() {
		$.ajax({
			type : "POST",
			dataType : "ControlUnit",
			async : false,
			url : "rest/controlunit/update",
			data : $('#editForm').serialize()
		});
		
		list();
	});
	
	function list(){
		var url = "rest/controlunit/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	}
	
	$('#editCu_1').unbind("click").bind("click",function(){
		$.ajax({
			type : "POST",
			//dataType : "ControlUnit",
			async : true,
			url : "rest/controlunit/update",
			data : $('#editForm').serialize(),
			success : function() {
				var url = "rest/controlunit/list";
				$.get(url, function(data) {
					$('#listAll').html(data);
				});
			}
		});
	});
});