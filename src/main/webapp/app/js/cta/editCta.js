$(function() {
	
	$('#update').click(function() {
		$.ajax({
			type : "POST",
			dataType : "Qmp",
			async : false,
			url : "rest/qmp/update",
			data : $('#editForm').serialize()
		});
		
		list();
	});
	
	function list(){
		var url = "rest/qmp/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	}
});