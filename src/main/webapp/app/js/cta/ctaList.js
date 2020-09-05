$(function() {

//	$('#updateButton').click(function(e) {
//		e.preventDefault();
//		var url = this.href;
//		if (url != null && url != 'javascript:;') {
//			$.get(url, function(data) {
//				$('#main-content').html(data);
//			});
//		}
//	});
//
//	$('#deleteButton').click(function(e) {
//		e.preventDefault();
//		var url = this.href;
//		$.get(url, function(data) {
//			$('#main-content').html(data);
//		});
//	});
	
	$('#editButton a').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
		
		$.get("rest/qmp/list", function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#addQmp_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#find').click(function() {
		var name = $('#findName').val();
		if(name == ""){
			$.get("rest/qmp/list", function(data) {
				$('#main-content').html(data);
			});
		}else{
			var url = "rest/qmp/select?name="+name		
			$.get(url, function(data) {
				$('#main-content').html(data);
			});
		}		
	});
});
