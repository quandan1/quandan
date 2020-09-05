$(document).ready(function() {//在页面加载完，自动执行定义js代码
	
	var url = "rest/user/list";
	$.get(url, function(data) {
		$('#listAll').html(data);
	});

    $('#addButton').click(function(){
		var url = "rest/page/addUser";
		$.get(url, function(data) {
			$('#addDiv').html(data);
		});
	});
   
});
