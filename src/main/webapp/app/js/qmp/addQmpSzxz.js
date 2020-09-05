$(function(){
    $('#addQmp').click(function() {
        $.ajax({
            type : "POST",
            dataType : "Qmp",
            async : false,
            url : "rest/qmp/insert",
            data : $('#insertForm').serialize(),
        });

        var url = "rest/qmp/list";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    });

    $('#listQmp_1').click(function(e) {
        e.preventDefault();
        var url = this.href;
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    });

    $('#addQmp_szxz').unbind("click").bind("click",function(){
		var section_name = $('#section_name').val();
        $.ajax({
            type : "POST",
            //dataType : "QmpTestData",
            async : true,
            url : "rest/qmp/insertTestDataPanduan",
            data : {"section_name":section_name},
			// data : $('#insertForm').serialize(),
            success : function(data) {
            	//alert(data);
                if(data == ""){
                    var newmsgPanduan = "以下断面并未存在过，您确定上传吗？\n请确认！\n" + section_name;
                    //alert(newmsgPanduan);
                    if(confirm(newmsgPanduan) == true) {
                        $.ajax({
                            type: "POST",
                            //dataType : "QmpTestData",
                            async: true,
                            url: "rest/qmp/insertTestData",
                            data: $('#insertForm').serialize(),
                            success: function () {
                                var url = "rest/qmp/list";
                                $.get(url, function (data) {
                                    $('#listAll').html(data);
                                });
                            }
                        });
                        return ture;
                    } else {
                    	return false;
					}} else {
                    $.ajax({
                        type: "POST",
                        //dataType : "QmpTestData",
                        async: true,
                        url: "rest/qmp/insertTestData",
                        data: $('#insertForm').serialize(),
                        success: function () {
                            var url = "rest/qmp/list";
                            $.get(url, function (data) {
                                $('#listAll').html(data);
                            });
                        }
                    });
				}
            }});
	});
});
