$(function() {	
	
	$('a#deleteButton').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$.get("rest/user/list", function(data) {
				$('#listAll').html(data);
			});
		});
		
	});
	
	$('#addZcfg_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#page a').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
});
