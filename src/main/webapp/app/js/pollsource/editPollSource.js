$(function() {
	
	$('#update').click(function() {
		$.ajax({
			type : "POST",
			dataType : "PollSource",
			async : false,
			url : "rest/"+$('#treeselect').val()+"/update",
			data : $('#editForm').serialize()
		});
		
		list();
	});	
	
	function list(){
		var url = "rest/"+$('#treeselect').val()+"/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	}
	
	
	
 
	$('#editPollSource_1').unbind("click").bind("click",function(){
		$.ajax({
			type : "POST",
			//dataType : "PollSource",
			async : false,
			url : "rest/"+$('#treeselect').val()+"/update",
			data : $('#editForm').serialize(),
			success : function() {
				var url = "rest/"+$('#treeselect').val()+"/list";
				$.get(url, function(data) {
					$('#listAll').html(data);
				});
			}
		});
		
		
	});
 
});