function change(){
		if($('#choose option:selected').val()=="source"){
			var value = $("#youkong").val();
			var json = {
			        "youkong": value
			};
			$('#jsonInput').val(JSON.stringify(json));
			$.ajax({
				type : "POST",
		        dataType: "html",
				async : false,
		        data: json,
				url : "rest/controlunit/total",
				success: function(data){
					$('#listAll').html(data);
				}
			});
			$.get("rest/controlunit/water", function(result) {
				$('#right').show();
				$('#right').html(result);
			});
		}
		if($('#choose option:selected').val()=="yangzhi"){
				var value = $("#youkong").val();
				var json = {
				        "youkong": value
				};
				$('#jsonInput').val(JSON.stringify(json));
				$.ajax({
					type : "POST",
			        dataType: "html",
					async : false,
			        data: json,
					url : "rest/controlunit/yangZhiTotal",
					success: function(data){
						$('#listAll').html(data);
					}
				});
				$.get("rest/controlunit/waterYangZhi", function(result) {
					console.log("yangzhi");
					$('#right').show();
					$('#right').html(result);
				});
		}
		if($('#choose option:selected').val()=="factory"){
				var value = $("#youkong").val();
				var json = {
				        "youkong": value
				};
				$('#jsonInput').val(JSON.stringify(json));
				$.ajax({
					type : "POST",
			        dataType: "html",
					async : false,
			        data: json,
					url : "rest/controlunit/factoryTotal",
					success: function(data){
						$('#listAll').html(data);
					}
				});
				$.get("rest/controlunit/waterFactory", function(result) {
					$('#right').show();
					$('#right').html(result);
				});
		}
		if($('#choose option:selected').val()=="total"){
			var value = $("#youkong").val();
			var name = $('#findName').val();
			var json = {
			        "youkong": value,
			        "name":name
			};
			$('#jsonInput').val(JSON.stringify(json));
			$.ajax({
				type : "POST",
		        dataType: "html",
				async : false,
		        data: json,
				url : "rest/controlunit/sum",
				success: function(data){
					$('#listAll').html(data);
				}
			});
			$('#right').hide();
	    }
}

$("#youkong").on("change",function () {
	if($('#choose option:selected').val()=="source"){
		var value = $("#youkong").val();
		var sy = $("#sy").val();
		console.log($("#sy").val());
			var json = {
			        "youkong": value,
			        "sy" : sy
		    };
		    $('#jsonInput').val(JSON.stringify(json));
		    $.ajax({
		        type: "POST",
		        dataType: "html",
		        async: false,
		        url: "rest/controlunit/total",
		        data: json,
		        success: function (data) {
		            $('#listAll').html(data);
		        }
		    });
	}
	if($('#choose option:selected').val()=="yangzhi"){
		var value = $("#youkong").val();
		var sy = $("#sy").val();
		console.log($("#sy").val());
			var json = {
			        "youkong": value,
			        "sy" : sy
		    };
		    $('#jsonInput').val(JSON.stringify(json));
		    $.ajax({
		        type: "POST",
		        dataType: "html",
		        async: false,
		        url: "rest/controlunit/yangZhiTotal",
		        data: json,
		        success: function (data) {
		            $('#listAll').html(data);
		        }
		    });
	}
	if($('#choose option:selected').val()=="factory"){
		var value = $("#youkong").val();
		var sy = $("#sy").val();
		console.log($("#sy").val());
			var json = {
			        "youkong": value,
			        "sy" : sy
		    };
		    $('#jsonInput').val(JSON.stringify(json));
		    $.ajax({
		        type: "POST",
		        dataType: "html",
		        async: false,
		        url: "rest/controlunit/factoryTotal",
		        data: json,
		        success: function (data) {
		            $('#listAll').html(data);
		        }
		    });
	}
	if($('#choose option:selected').val()=="total"){
		    var value = $("#youkong").val();
			var name = $('#findName').val();
			var json = {
			        "youkong": value,
			        "name":name
		    };
		    $('#jsonInput').val(JSON.stringify(json));
		    $.ajax({
		        type: "POST",
		        dataType: "html",
		        async: false,
		        url: "rest/controlunit/sum",
		        data: json,
		        success: function (data) {
		            $('#listAll').html(data);
		        }
		    });
	}
});