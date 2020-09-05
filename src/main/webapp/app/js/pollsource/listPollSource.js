$(function() {

	$('.updateButton').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#editDiv').html(data);
		});
		$('#editModelButton').trigger("click");
	});
	
	$('.deleteButton').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.ajax({
			async : true,
			url : url,
			success : function(result) {
				$.get("rest/"+$('#treeselect').val()+"/list", function(data) {
					$('#listAll').html(data);
				});
			},
		});	
	});
	
	
	
	$('#addPollSource_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#find').click(function() {
		var name = $('#findName').val();
		if(name == ""){
			$.get("rest/"+$('#treeselect').val()+"/list", function(data) {
				$('#main-content').html(data);
			});
		}else{
			var url = "rest/"+$('#treeselect').val()+"/select?name="+name	;	
			$.get(url, function(data) {
				$('#main-content').html(data);
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
});
