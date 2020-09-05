$(function() {
	var type = $("#hidden").val();
    $("#type").val(type);
	
	$('#update').click(function() {
		$.ajax({
			type : "POST",
			dataType : "Zcfg",
			async : false,
			url : "rest/Zcfg/update",
			data : $('#editForm').serialize()
		});
		list();
	});
	
	function list(){
		var url = "rest/Zcfg/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	}
	
    $('#myModal_edit').on('hidden.bs.modal', function () {
        // 关闭Dialog前移除编辑器
        UM.getEditor('editor').destroy();
    });
});