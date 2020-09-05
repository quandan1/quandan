/**
 * Created by zhi on 2017/8/16 0016.
 */
$('#forcity').hide();
$('#forrestrict').hide();
$('#inlineRadio1').click(function () {
    if ($('#inlineRadio1').attr('checked')) {
        $('#regioncontainer').css('justify-content','space-around');
        $('#forprovince').show(500);
        $('#forcity').hide(500);
        $('#forrestrict').hide(500);
    }else{
    }
});
$('#inlineRadio2').click(function () {
    if ($('#inlineRadio2').attr('checked')) {
        $('#forprovince').show(500);
        $('#forcity').show(500);
        $('#forrestrict').hide(500);
    }
});
$('#inlineRadio3').click(function () {
    if ($('#inlineRadio3').attr('checked')) {
        $('#regioncontainer').css('justify-content','space-between');
        $('#forprovince').show(500);
        $('#forcity').show(500);
        $('#forrestrict').show(500);
    }
});
$("#usercity").change(function() {
    var cityName = $("#usercity").val();
    if (cityName == "辽宁") {
        $("#county option").remove();
        $("#county").append("<option value='辽宁'>辽宁</option>");
    } else {
        var data = {
            cityName : cityName
        }
        $.ajax({
            type : "POST",
            url : "rest/user/getCounty",
            data : data,
            async : false,
            success : function(result) {
                var co = [];
                co.push(cityName);
                var tt = decodeURIComponent(result).toString().split(
                    ",");
                for (var i = 0; i < tt.length; i++) {
                    co.push(tt[i].toString().replace("+", "").replace(
                        "[", "").replace("]", "").split("_"));
                }
                $("#county option").remove();
                for (i = 0; i < co.length; i++) {
                    $("#county").append(
                        "<option value=" + co[i] + ">" + co[i]
                        + "</option>");
                }
            }
        });
    }
});
