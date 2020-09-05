// function init(){
//
// }
// window.onload=init;

function initFileInput() {
    var thisFileName;

    $("#file").fileinput({
        language: 'zh', //设置语言
        uploadUrl: "rest/controlunit/fileUpload", //上传的地址
        allowedPreviewTypes: ['xls,XLS'],
        allowedPreviewMimeTypes: ['xls,XLS'],
        allowedFileTypes : ['xls,XLS'],
        allowedFileExtensions:['xls,XLS'],//接收的文件后缀
        uploadAsync: false, //默认true异步上传
        uploadLabel: "确认上传",//设置上传按钮的汉字
        browseLabel: "浏览",
        autoReplace:false,
        showUpload: true, //是否显示上传按钮
        showRemove : false, //显示移除按钮
        showPreview : false, //是否显示预览
        showCaption: false,//是否显示标题
        browseClass: "btnz btnz-info", //按钮样式
        dropZoneEnabled: false,//是否显示拖拽区域
        maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 1,
        maxFileCount: 10, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount:true,
        previewFileIcon: "<i class='glyphicon glyphicon-king' id='upload'></i>",
        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",

    }).on('filebatchselected', function (event, data) {

        var filename = data[0].name;
        thisFileName = filename;
        var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
        if(!(fileExtension == 'xls'||fileExtension == 'XLS')){
            alert('选择上传文件格式错误！\n请上传填写好的模板文件.\n请重新选择文件！');
            initFileInput();
            throw SyntaxError();

        }
        // alert(filename);
        $("#fileName").text(filename);
        // document.getElementsByClassName("btn btn-primary btn-file").className="btn btn-primary btn-file hide";
        $('.btn-file').hide()

    }).on("filebatchuploadsuccess", function (event, data) {
        console.log(data.response);
        var filename = thisFileName;
        $('.btn-file').show()
        // alert(filename);
        // console.log(filename);
        $("#fileName").text("上传成功! "+filename);
        // document.getElementById("file").disabled = true
        // if(document.getElementById("fileName").value!= null){


        // $(".btn-file").hide();
        // $(".btn-file").attr("disabled", true);
        // $(".btn-file").click(function(data){
        //     alert("yijing");
        //
        // });
        // }
    });
}

initFileInput();

//