$(function() {

	App.init();
	var Index = (function() {
		var me = {};
		// 处理一级菜单点击
		me.handleMenuClick = function() {
			$('#tobBar-nav > li').click(function(e) {
				var menu = $('#tobBar-nav');
				var li = menu.find('li.active').removeClass('active');
				// 添加选中 打开的样式
				// $(this).addClass('active');
			});
		};
		// 处理子菜单点击
		me.handleSubMenuClick = function() {
			$('#tabs li a').click(function(e) {
				$('#jumpTmp').val("");
				if(($(this).attr("id")=="newQmp")||($(this).attr("id")=="newPollSource")){					
					e.preventDefault();
				}else if($(this).attr("id")=="newCu"){					
					e.preventDefault();
					$.get("rest/controlunit/list", function(data) {
						$('#listAll').html(data);
					});
				}else if($(this).attr("id")=="kzdyTotal"){					
					e.preventDefault();
					$.get("rest/controlunit/total?youkong=0", function(data) {
						$('#listAll').html(data);
					});
					$.get("rest/controlunit/water", function(result) {
						$('#right').html(result);
					});
				}else if($(this).attr("id")=="kzdmTotal"){					
					e.preventDefault();
					$.get("rest/qmp/total?youkong=0", function(data) {
						$('#listAll').html(data);
					});
					$.get("rest/qmp/water", function(result) {
						$('#right').html(result);
					});
				}
				else{			
					e.preventDefault();
				}
			});
		};

		me.init = function() {
			me.handleMenuClick();
			me.handleSubMenuClick();
		};
		return me;
	})();
	Index.init();
    $('#qmpAnalysis').trigger("click");
    //添加链接的处理事件
    $("a").click(ajax);
    //加载默认的章节
    changeContent();
    //添加popstate事件
    window.onpopstate = function(event){
        changeContent();
    };

	createUserManager();

	function createUserManager(){
		$.ajax({
			type : "POST",
			async : false,
			url : "rest/user/isAdmin",
			success : function(result) {
				var html = "";
				html += "<li class=''>";
				html += "<a href='javascript:;' id=''>";
				html += "<i class='glyphicon glyphicon-user'></i>";
				html += "<span class='title'> 用户管理 </span>";
				html += "<span class='arrow '> </span>";
				html += "</a>";
				html += "<ul class='sub-menu'>";
				html += "<li>";
				html += "<a href='rest/page/newUser' id='newUser'>基本信息管理 </a>";
				html += "</li> </ul> </li>";
				/*html += "</li>";*/
				if(result.toString()=="1"){
					$('#page-sidebar-menu').append(html);
				}
			}
		});
		
		$('#tabs ul li  a').click(function(e) {
			// debugger;
			// var pageTitle = $(this).parent().parent().parent().find('a:first span').text();
			// pageTitle = pageTitle.replace(/\ +/g,"");
			// pageTitle = pageTitle.replace(/[ ]/g,"");
			// pageTitle = pageTitle.replace(/[\r\n]/g,"");
            var pageSubTitle = $(this).text();
            pageSubTitle = pageSubTitle.replace(/\ +/g,"");
            pageSubTitle = pageSubTitle.replace(/[ ]/g,"");
            pageSubTitle = pageSubTitle.replace(/[\r\n]/g,"");
			// if(pageSubTitle==="基本信息管理" && pageTitle === "控制断面管理"){
			// 	pageSubTitle = "断面分布图";
			// }
			// console.log(pageTitle);
			console.log(pageSubTitle);
			// var newPageTitle = pageTitle + "-"+pageSubTitle;
			// console.log(newPageTitle);
			$('#index-page-title').text(pageSubTitle);
			e.preventDefault();
			var url = this.href;
			if (url != null && url != 'javascript:;') {
				$.get(url, function(data) {
					$('#main-content').html(data);
				});
			}
		});
	}

    function changeContent(){
        var query = location.href.split("?")[1];
		console.log(query);
        if (!query) {
            // 如果没有查询条件，则显示默认第1个章节
			history.replaceState(null, "", location.href + "?name=" + $("#qmpAnalysis")[0].id);
			$('#index-page-title').text("水质变化趋势分析");
            changeContent();
        } else {
            //触发按钮click事件，加载内容，
            //注意不要漏了true参数，这样可以和用户直接点击触发的页面变化区别开来
            $("#"+query.split("=")[1]).trigger("click",true);
        }
    }

    function ajax(event,isPopstate){
        var url1 = this.href;
        if (url1 != null && url1 != 'javascript:;') {
            $.get(url1, function(data) {
                $('#main-content').html(data);
            });
        }
        //$("#main-content").html(this.id+"的内容");
        var title = this.id;
        //document.title = title;
        if(!isPopstate){
            history.pushState(null, "", location.href.split("?")[0] + "?name=" + title);
        }
    }
});


