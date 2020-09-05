$(document).ready(function() {

    $('#addButton').click(function(){
        var url = "rest/page/addZcfg";
        $.get(url, function(data) {
            $('#addDiv').html(data);
        });
    });

});
