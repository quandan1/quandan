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
		
		$.get("rest/Zcfg/list", function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('a#showContent').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('a#updateButton').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#editDiv').html(data);
		});
		$('#editModelButton').trigger("click");
	});
	
	$('a#deleteButtonWZGLGJJ').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
                var url_new = "rest/Zcfg/list";
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});
	$('a#deleteButtonWZGLSJ').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
                var url_new = "rest/Zcfg/listSJ";
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});
    $('a#deleteButtonzKtcg').click(function(e){

        e.preventDefault();
        var url = this.href;
        // alert(url);
        var json = {
            "delfile" : this.name
        };
        $.ajax({
            type : "POST",
            async : true,
            url : url,
            data: json,
            success : function(data) {
                console.log("删除成功")
                var type = "GJJ";
                var url_new = "rest/Zcfg/selectKTCG?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
            }
        });



    });



    $('a#deleteButtonzGjj').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
                var type = "GJJ";
                var url_new = "rest/Zcfg/selectGJJ?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});


    $('a#deleteButtonzSj').click(function(e){

        e.preventDefault();
        var url = this.href;
        // alert(url);
        var json = {
            "delfile" : this.name
        };
        $.ajax({
            type : "POST",
            async : true,
            url : url,
            data: json,
            success : function(data) {
                console.log("删除成功")
                var type = "SJ";
                var url_new = "rest/Zcfg/selectSJ?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
            }
        });



    });


    $('a#deleteButtonzShj').click(function(e){

        e.preventDefault();
        var url = this.href;
        // alert(url);
        var json = {
            "delfile" : this.name
        };
        $.ajax({
            type : "POST",
            async : true,
            url : url,
            data: json,
            success : function(data) {
                console.log("删除成功")
                var type = $("#hasGetRoleName").val();
                var role_sign = $("#hasGetRoleSign").val();
                var role_name;
                if(role_sign === "admin" ){
                    role_name = "管理员";
                }else if(role_sign === "1"){
                    role_name = "省级";
                }
                else{
                    role_name=type.substring(0,2)+"市";
                }
                // alert(role_name);
                var new_role_name = encodeURI(encodeURI(role_name));
//		alert(role_name);
                var url = "rest/Zcfg/selectSHJ?type="+new_role_name;

                $.get(url, function(data) {
                    console.log(data);
                    $('#listAll').html(data);
                    $('#inst').toggle();
                });
            }
        });



    });


    $('a#deleteButtonz').click(function(e){

        e.preventDefault();
        var url = this.href;

        var json = {
            "delfile" : this.name
        };
        $.ajax({
            type : "POST",
            async : true,
            url : url,
            data: json,
            success : function(data) {
                $.get("rest/Zcfg/list", function(data) {
                    $('#listAll').html(data);
                });
            }
        });


    });


	
	$('#addZcfg_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#find').click(function() {
		var name = $('#findName').val();
		if(name == "" || name == null){
			$.post("rest/Zcfg/list", function(data) {
				$('#main-content').html(data);
			});
		}else{
			name = encodeURI(encodeURI(name))
			var url = "rest/Zcfg/select?name="+name		
			$.post(url, function(data) {
				$('#main-content').html(data);
			});
		}		
	});
	$('#page a').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	$('.search_A').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
    // ktcgPage
    $('#ktcgPage a').click(function(e){
        e.preventDefault();
        var url = this.href+"&type=KTCG";
        $.get(url, function(data) {
            $('#listAll').html(data);
        });
    });
    $('.fold_ktcg').click(function(e){
        e.preventDefault();
        var url = this.href;
        $.get("rest/page/zcfgKtcgA", function(data) {
            var u = [];
            u = url.split('?');
            var p = u[1];
            var type = p;
            console.log(type);
            var name = $("#"+type).html();
            $('#index-page-title').text("政策法规管理-课题成果-"+name);
            $('#main-content').html(data);
            $('#listAll').empty();
            $("#typeA").val(type);
            $(function(){
                function initFileInput() {
                    var type = encodeURI(encodeURI($("#typeA").val()));
                    var toUrl = "rest/Zcfg/save?type="+type;
                    $('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
                    $("#file").fileinput({

                        language: 'zh', //设置语言
                        uploadUrl: toUrl, //上传的地址
                        allowedPreviewTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
                        allowedPreviewMimeTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
                        allowedFileTypes : ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
                        allowedFileExtensions: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],//接收的文件后缀
                        //uploadExtraData:{"id": 1, "fileName":'123.mp3'},//额外传递参数
                        uploadAsync: false, //默认true异步上传
                        uploadLabel: "确认上传",//设置上传按钮的汉字
                        browseLabel: "浏览",
                        showUpload: true, //是否显示上传按钮
                        showRemove : false, //显示移除按钮
                        showPreview : false, //是否显示预览
                        showCaption: false,//是否显示标题
                        browseClass: "btnz btnz-info", //按钮样式
                        dropZoneEnabled: false,//是否显示拖拽区域
                        //autoReplace: true, //替换
                        //showCaption: true,//是否显示标题
                        //showCaption: true,
                        //mainclass： "input-group-lg",
                        maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
                        //minFileCount: 1,
                        maxFileCount: 1, //表示允许同时上传的最大文件个数
                        enctype: 'multipart/form-data',
                        validateInitialCount:true,
                        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
                        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",

                    }).on('filebatchselected', function (event, data, id, index) {

                        var filename = data[0].name;
                        var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
                        if(!(fileExtension == 'doc'||fileExtension == 'DOC'||
                                fileExtension == 'docx'||fileExtension == 'DOCX'||
                                fileExtension == 'pdf'||fileExtension == 'PDF'||
                                fileExtension == 'txt'||fileExtension == 'TXT')){
                            alert('选择上传文件格式错误！\n格式要求[doc,docx,pdf,txt].\n请重新选择文件！');
                            initFileInput();
                            throw SyntaxError();
                        }
                        var json = {
                            "jsfile" : filename
                        };
                        $.ajax({
                            type : "POST",
                            async : true,
                            url : "rest/Zcfg/getType",
                            data: json,
                            success : function(data) {
                                if(data == "true"){
                                    $('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
                                    initFileInput();
                                    alert('文件已存在！\n请重新选择文件！');
                                }

                            }
                        });
                        debugger;
                    }).on("filebatchuploadsuccess", function (event, data) {
                        console.log(data.response);
                        debugger;
                        var type = $("#typeA").val();
                        var url ="rest/Zcfg/selectKTCGA?type="+type;
                        $.get(url, function(data) {
                            $('#listAll').html(data);
                        });

                    });
                }

                initFileInput();

                //异步上传成功结果处理
                //$('#' + ctrlName).on("fileuploaded", function (event, data, previewId, index) {})
                //异步上传错误结果处理
                //$('#' + ctrlName).on('fileerror', function(event, data, msg) {});
                //同步上传错误结果处理
                //$('#' + ctrlName).on('filebatchuploaderror', function(event, data, msg) {});
                //同步上传成功结果处理
            });


            var url_new = "rest/Zcfg/selectKTCGA?type="+type;
            $.get(url_new, function(data) {
                $('#listAll').html(data);
            });
        });
    });

    $('#ktcgAPage a').click(function(e){
        e.preventDefault();
        var type = $("#typeA").val();
        console.log(type);
        var url = this.href+"&type="+type;
        $.get(url, function(data) {
            $('#listAll').html(data);
        });
    });


    $('#gjjPage a').click(function(e){
		e.preventDefault();
		var url = this.href+"&type=GJJ";
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});


	$('#shjPage a').click(function(e){
		e.preventDefault();
		var type = $("#hasGetRoleName").val();
        var role_sign = $("#hasGetRoleSign").val();
		var role_name;
        if(role_sign === "admin" ){
            role_name = "管理员";
		}else if(role_sign === "1"){
            role_name = "省级";
		}
		else{
            role_name=type.substring(0,2)+"市";
		}
		var new_role_name = encodeURI(encodeURI(role_name));
		console.log("留心:"+role_name);
		var url = this.href+"&type="+new_role_name;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	$('#sjPage a').click(function(e){
		e.preventDefault();
		var url = this.href+"&type=SJ";
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	$('.fold').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get("rest/page/zcfgGjjA", function(data) {	
			var u = [];
			u = url.split('?');
			var p = u[1];
			var type = p;
			console.log(type);
			var name = $("#"+type).html();
			$('#index-page-title').text("政策法规管理-国家级-"+name);
			$('#main-content').html(data);
			$('#listAll').empty();
			$("#typeA").val(type);
		$(function(){
				function initFileInput() {
				    var type = encodeURI(encodeURI($("#typeA").val()));
				    var toUrl = "rest/Zcfg/save?type="+type;
					$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");		
					$("#file").fileinput({  
							 
						language: 'zh', //设置语言
						uploadUrl: toUrl, //上传的地址
						allowedPreviewTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
						allowedPreviewMimeTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileTypes : ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileExtensions: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],//接收的文件后缀
						//uploadExtraData:{"id": 1, "fileName":'123.mp3'},//额外传递参数
						uploadAsync: false, //默认true异步上传
						uploadLabel: "确认上传",//设置上传按钮的汉字
						browseLabel: "浏览",
						showUpload: true, //是否显示上传按钮
						showRemove : false, //显示移除按钮
						showPreview : false, //是否显示预览
						showCaption: false,//是否显示标题
						browseClass: "btnz btnz-info", //按钮样式
						dropZoneEnabled: false,//是否显示拖拽区域
						//autoReplace: true, //替换
						//showCaption: true,//是否显示标题  
						//showCaption: true,
						//mainclass： "input-group-lg",
						maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
						//minFileCount: 1,
						maxFileCount: 1, //表示允许同时上传的最大文件个数
						enctype: 'multipart/form-data',
						validateInitialCount:true,
						previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
						msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
						
					}).on('filebatchselected', function (event, data, id, index) {
				
						var filename = data[0].name;
						var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
						if(!(fileExtension == 'doc'||fileExtension == 'DOC'||
							  fileExtension == 'docx'||fileExtension == 'DOCX'||
								 fileExtension == 'pdf'||fileExtension == 'PDF'||
									fileExtension == 'txt'||fileExtension == 'TXT')){
							alert('选择上传文件格式错误！\n格式要求[doc,docx,pdf,txt].\n请重新选择文件！');
							initFileInput();
							throw SyntaxError();
						}
						var json = {
							"jsfile" : filename
						}; 
						$.ajax({
							type : "POST",
							async : true,
							url : "rest/Zcfg/getType",
							data: json,
							success : function(data) {
								if(data == "true"){
									$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
									initFileInput();
									alert('文件已存在！\n请重新选择文件！');	
								}
								
							}
						});
						debugger;
					}).on("filebatchuploadsuccess", function (event, data) { 
						console.log(data.response);
		                debugger;
		                var type = $("#typeA").val();
		                var url ="rest/Zcfg/selectGJJA?type="+type;
						$.get(url, function(data) {
							$('#listAll').html(data);
						});
				 
					});
				}
				 
				initFileInput();
					
				//异步上传成功结果处理
				//$('#' + ctrlName).on("fileuploaded", function (event, data, previewId, index) {})
				//异步上传错误结果处理		
				//$('#' + ctrlName).on('fileerror', function(event, data, msg) {});   
				//同步上传错误结果处理
				//$('#' + ctrlName).on('filebatchuploaderror', function(event, data, msg) {});   
				//同步上传成功结果处理
			});   
		
		
			var url_new = "rest/Zcfg/selectGJJA?type="+type;
			$.get(url_new, function(data) {
				$('#listAll').html(data);
			});
		}); 
	});
	
	$('#gjjAPage a').click(function(e){
		e.preventDefault();
		var type = $("#typeA").val();
		console.log(type);
		var url = this.href+"&type="+type;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});

    $('a#deleteButtonzKtcgA').click(function(e){

        e.preventDefault();
        var url = this.href;
        // alert(url);
        var json = {
            "delfile" : this.name
        };
        $.ajax({
            type : "POST",
            async : true,
            url : url,
            data: json,
            success : function(data) {
                console.log("删除成功")
                var type = $("#typeA").val();
                var url_new = "rest/Zcfg/selectKTCGA?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
            }
        });



    });

	
	$('a#deleteButtonzGjjA').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
                var type = $("#typeA").val();
                var url_new = "rest/Zcfg/selectGJJA?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});
	
	
	//省级文件夹
	$('.fold_sj').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get("rest/page/zcfgSjB", function(data) {	
			var u = [];
			u = url.split('?');
			var p = u[1];
			var type = p;
			console.log(type);
			var name = $("#"+type).html();
			$('#index-page-title').text("政策法规管理-省级-"+name);
			$('#main-content').html(data);
			$('#listAll').empty();
			$("#typeB").val(type);
		$(function(){
				function initFileInput() {
				    var type = encodeURI(encodeURI($("#typeB").val()));
				    var toUrl = "rest/Zcfg/save?type="+type;
					$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");		
					$("#file").fileinput({  
							 
						language: 'zh', //设置语言
						uploadUrl: toUrl, //上传的地址
						allowedPreviewTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
						allowedPreviewMimeTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileTypes : ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileExtensions: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],//接收的文件后缀
						//uploadExtraData:{"id": 1, "fileName":'123.mp3'},//额外传递参数
						uploadAsync: false, //默认true异步上传
						uploadLabel: "确认上传",//设置上传按钮的汉字
						browseLabel: "浏览",
						showUpload: true, //是否显示上传按钮
						showRemove : false, //显示移除按钮
						showPreview : false, //是否显示预览
						showCaption: false,//是否显示标题
						browseClass: "btnz btnz-info", //按钮样式
						dropZoneEnabled: false,//是否显示拖拽区域
						//autoReplace: true, //替换
						//showCaption: true,//是否显示标题  
						//showCaption: true,
						//mainclass： "input-group-lg",
						maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
						//minFileCount: 1,
						maxFileCount: 1, //表示允许同时上传的最大文件个数
						enctype: 'multipart/form-data',
						validateInitialCount:true,
						previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
						msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
						
					}).on('filebatchselected', function (event, data, id, index) {
				
						var filename = data[0].name;
						var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
						if(!(fileExtension == 'doc'||fileExtension == 'DOC'||
							  fileExtension == 'docx'||fileExtension == 'DOCX'||
								 fileExtension == 'pdf'||fileExtension == 'PDF'||
									fileExtension == 'txt'||fileExtension == 'TXT')){
							alert('选择上传文件格式错误！\n格式要求[doc,docx,pdf,txt].\n请重新选择文件！');
							initFileInput();
							throw SyntaxError();
						}
						var json = {
							"jsfile" : filename
						}; 
						$.ajax({
							type : "POST",
							async : true,
							url : "rest/Zcfg/getType",
							data: json,
							success : function(data) {
								if(data == "true"){
									$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
									initFileInput();
									alert('文件已存在！\n请重新选择文件！');	
								}
								
							}
						});
						debugger;
					}).on("filebatchuploadsuccess", function (event, data) { 
						console.log(data.response);
		                debugger;
		                var type = $("#typeB").val();
		                var url ="rest/Zcfg/selectSJB?type="+type;
						$.get(url, function(data) {
							$('#listAll').html(data);
						});
				 
					});
				}
				 
				initFileInput();
					
				//异步上传成功结果处理
				//$('#' + ctrlName).on("fileuploaded", function (event, data, previewId, index) {})
				//异步上传错误结果处理		
				//$('#' + ctrlName).on('fileerror', function(event, data, msg) {});   
				//同步上传错误结果处理
				//$('#' + ctrlName).on('filebatchuploaderror', function(event, data, msg) {});   
				//同步上传成功结果处理
			});   
		
		
			var url_new = "rest/Zcfg/selectSJB?type="+type;
			$.get(url_new, function(data) {
				$('#listAll').html(data);
			});
		}); 
	});
	
	$('#sjBPage a').click(function(e){
		e.preventDefault();
		var type = $("#typeB").val();
		console.log(type);
		var url = this.href+"&type="+type;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	
	$('a#deleteButtonzSjB').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
                var type = $("#typeB").val();
                var url_new = "rest/Zcfg/selectSJB?type="+type;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});
	
	
	//市级文件夹
	$('.fold_shj').click(function(e){
		e.preventDefault();
		var url = this.href;
		$.get("rest/page/zcfgShjC", function(data) {	
			var u = [];
			u = url.split('?');
			var para = u[1];
			console.log("para"+para);
			var name = $("#"+para).html();
			$('#index-page-title').text("政策法规管理-市级-"+name);
			$('#main-content').html(data);
			$('#listAll').empty();
			$("#typeC").val(para);
			
			
			
		$(function(){
				function initFileInput() {
					var type = $("#hasGetRoleName").val();
					console.log(type+"是级别");
				    var role_sign = $("#hasGetRoleSign").val();
					var role_name;
				    if(role_sign === "admin" ){
				        role_name = "管理员";
					}else if(role_sign === "1"){
				        role_name = "省级";
					}
					else{
				        role_name=type.substring(0,2)+"市";
					}
					var type_new = $("#typeC").val();
					role_name = role_name+"_"+type_new;
					console.log(role_name);
					var new_role_name = encodeURI(encodeURI(role_name)); 
				    var toUrl = "rest/Zcfg/save?type="+new_role_name;
					$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");		
					$("#file").fileinput({  
							 
						language: 'zh', //设置语言
						uploadUrl: toUrl, //上传的地址
						allowedPreviewTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],
						allowedPreviewMimeTypes: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileTypes : ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'], 
						allowedFileExtensions: ['doc,docx,pdf,txt,DOC,DOCX,PDF,TXT'],//接收的文件后缀
						//uploadExtraData:{"id": 1, "fileName":'123.mp3'},//额外传递参数
						uploadAsync: false, //默认true异步上传
						uploadLabel: "确认上传",//设置上传按钮的汉字
						browseLabel: "浏览",
						showUpload: true, //是否显示上传按钮
						showRemove : false, //显示移除按钮
						showPreview : false, //是否显示预览
						showCaption: false,//是否显示标题
						browseClass: "btnz btnz-info", //按钮样式
						dropZoneEnabled: false,//是否显示拖拽区域
						//autoReplace: true, //替换
						//showCaption: true,//是否显示标题  
						//showCaption: true,
						//mainclass： "input-group-lg",
						maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
						//minFileCount: 1,
						maxFileCount: 1, //表示允许同时上传的最大文件个数
						enctype: 'multipart/form-data',
						validateInitialCount:true,
						previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
						msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
						
					}).on('filebatchselected', function (event, data, id, index) {
				
						var filename = data[0].name;
						var fileExtension = filename.substring(filename.lastIndexOf('.') + 1);
						if(!(fileExtension == 'doc'||fileExtension == 'DOC'||
							  fileExtension == 'docx'||fileExtension == 'DOCX'||
								 fileExtension == 'pdf'||fileExtension == 'PDF'||
									fileExtension == 'txt'||fileExtension == 'TXT')){
							alert('选择上传文件格式错误！\n格式要求[doc,docx,pdf,txt].\n请重新选择文件！');
							initFileInput();
							throw SyntaxError();
						}
						var json = {
							"jsfile" : filename
						}; 
						$.ajax({
							type : "POST",
							async : true,
							url : "rest/Zcfg/getType",
							data: json,
							success : function(data) {
								if(data == "true"){
									$('#uploader').empty().html("<input id=\"file\" name=\"file\" type=\"file\" width=\"250px\">");
									initFileInput();
									alert('文件已存在！\n请重新选择文件！');	
								}
								
							}
						});
						debugger;
					}).on("filebatchuploadsuccess", function (event, data) { 
						console.log(data.response);
		                debugger;
		                var type = $("#hasGetRoleName").val();
					    var role_sign = $("#hasGetRoleSign").val();
						var role_name;
					    if(role_sign === "admin" ){
					        role_name = "管理员";
						}else if(role_sign === "1"){
					        role_name = "省级";
						}
						else{
					        role_name=type.substring(0,2)+"市";
						}
						var type_new = $("#typeC").val();
						role_name = role_name+"_"+type_new;
						var new_role_name = encodeURI(encodeURI(role_name)); 
						var url ="rest/Zcfg/selectSHJC?type="+new_role_name;
						$.get(url, function(data) {
							$('#listAll').html(data);
						});
				 
					});
				}
				 
				initFileInput();
					
				//异步上传成功结果处理
				//$('#' + ctrlName).on("fileuploaded", function (event, data, previewId, index) {})
				//异步上传错误结果处理		
				//$('#' + ctrlName).on('fileerror', function(event, data, msg) {});   
				//同步上传错误结果处理
				//$('#' + ctrlName).on('filebatchuploaderror', function(event, data, msg) {});   
				//同步上传成功结果处理
			});   
		
			var type = $("#hasGetRoleName").val();
		    var role_sign = $("#hasGetRoleSign").val();
			var role_name;
		    if(role_sign === "admin" ){
		        role_name = "管理员";
			}else if(role_sign === "1"){
		        role_name = "省级";
			}
			else{
		        role_name=type.substring(0,2)+"市";
			}
			var type_new = $("#typeC").val();
			role_name = role_name+"_"+type_new;
			console.log("role:"+role_name);
			var new_role_name = encodeURI(encodeURI(role_name)); 
			console.log(new_role_name);
			var url_new = "rest/Zcfg/selectSHJC?type="+new_role_name;
			$.get(url_new, function(data) {
				$('#listAll').html(data);
			});
		}); 
	});
	
	$('#shjCPage a').click(function(e){
		e.preventDefault();
		var type = $("#hasGetRoleName").val();
	    var role_sign = $("#hasGetRoleSign").val();
		var role_name;
	    if(role_sign === "admin" ){
	        role_name = "管理员";
		}else if(role_sign === "1"){
	        role_name = "省级";
		}
		else{
	        role_name=type.substring(0,2)+"市";
		}
		var type_new = $("#typeC").val();
		role_name = role_name+"_"+type_new;
		var new_role_name = encodeURI(encodeURI(role_name)); 
		var url = this.href+"&type="+new_role_name;
		$.get(url, function(data) {
			$('#listAll').html(data);
		});
	});
	
	$('a#deleteButtonzShjC').click(function(e){

		e.preventDefault();
		var url = this.href;
		// alert(url);
		var json = {
			"delfile" : this.name
		}; 
		$.ajax({
			type : "POST",
			async : true,
			url : url,
			data: json,
			success : function(data) {
				console.log("删除成功")
				var type = $("#hasGetRoleName").val();
			    var role_sign = $("#hasGetRoleSign").val();
				var role_name;
			    if(role_sign === "admin" ){
			        role_name = "管理员";
				}else if(role_sign === "1"){
			        role_name = "省级";
				}
				else{
			        role_name=type.substring(0,2)+"市";
				}
				var type_new = $("#typeC").val();
				role_name = role_name+"_"+type_new;
				var new_role_name = encodeURI(encodeURI(role_name)); 
                var url_new = "rest/Zcfg/selectSHJC?type="+new_role_name;
                $.get(url_new, function(data1) {
                    $('#listAll').html(data1);
                });
			}
		});

	 
		
	});
	
});
