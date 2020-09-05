$(function(){
	
	$('#addZcfg').click(function() {
		$.ajax({
			type : "POST",
			dataType : "Zcfg",
			async : false,
			url : "rest/Zcfg/insert",
			data : $('#insertForm').serialize(),
		});
		
		var url = "rest/Zcfg/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	$('#listZcfg_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
});
