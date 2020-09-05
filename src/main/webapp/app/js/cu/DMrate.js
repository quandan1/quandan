doing();

function toDecimal(x) { 
	var f = parseFloat(x); 
	if (isNaN(f))
		return; 
	f = Math.round(x*10)/10; //*1N个零 N位小数
	return f; 
} 


$("#target1").on("change", function () {
	doing();
});

$("#target2").on("change", function () {
	doing();
});



function doing(){
	var polls = $("#target1").val();
	var year = $("#target2").val();
	$("#DMrateTable").html(
			"<tr >"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>单元名称</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>五月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>六月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>七月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>八月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>九月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>十月</th>"
			+"<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>十一月</th>"
		+"</tr>'" );
    $.ajax({
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/controlunit/DMrate",
        data: {
            "polls": polls,
            "year": year
        },
        success: function (data) {
        	//console.log(data);
        	if(data=="null"){
        		//nothing
        	}else{
 
	        	result = eval("("+data+")"); 
	        	for (var i = 0; i < result.length; i=i+7) {
	        	    var html = "";
	        	    html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
	        	    html += (decodeURIComponent(result[i].name)).replace(",","").replace(/\d+/g,''); ;
	        	    html += "</td>";
	        	    var tmp;
	        	    for(var k=0;k<7;k++){ 
	        		    html += "<td align=\"center\" style=\"white-space: nowrap;\">";
	        		    //if(k==0){
	        		    //	html += toDecimal(result[i+k].dRate);	
	        		    //}else{
	        		  
		        		    if(typeof(result[i+k])=="undefined"||result[i+k].dRate==0||result[i+k].dRate=="NaN"||result[i+k].dRate=="Infinity"||result[i+k].mRate==0||result[i+k].mRate=="NaN"||result[i+k].mRate=="Infinity"){
		        		    	html += "数据缺失";	
		        		    	
		        		    }else{
		        		    	if(result[i+k].dRate>=1||result[i+k].mRate>=1){
		        		   
		        			    	html += "异常值";	
		        			    }else{
		        			    	html += toDecimal(result[i+k].dRate*100)+"%";
		        			    	html += " / ";
		        			    	html += toDecimal(result[i+k].mRate*100)+"%";
		        		    	}
		        		    }
		        		    html += "</td>";
	        		    //}
	        		}
	        	    html += "</tr>";
	        	    $("#DMrateTable").append(html);

	        	}
        	}
        }
    });
}






