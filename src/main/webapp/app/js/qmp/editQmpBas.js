$(function() {
    //debugger;
    $('#update').click(function() {
        $.ajax({
            type : "POST",
            dataType : "Qmp",
            async : false,
            url : "rest/qmp/updateBas",
            data : $('#editForm').serialize()
        });

        list();
    });

    function list(){
        var url = "rest/qmp/listBas";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    }

    $('#editQmp_1').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            //dataType : "Qmp",
            async : true,
            url : "rest/qmp/updateBas",
            data : $('#editForm').serialize(),
            success : function() {
                var url = "rest/qmp/listBas";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});