$(function(){

	$('#addPollSource_x').unbind("click").bind("click",function(){

		$.ajax({
			type : "POST",
			async : true,
			url : "rest/"+$('#treeselect').val()+"/insert",
			data : $('#insertForm').serialize(),		
			success : function() {
				
				var url = "rest/"+$('#treeselect').val()+"/list";
				$.get(url, function(data) {
					$('#listAll').html(data);
				});
			}
			
		});
		 
	});
	
 
});
