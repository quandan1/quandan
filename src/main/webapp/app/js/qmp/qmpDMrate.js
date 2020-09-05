doing();
initchart();

function toDecimal(x) {
  var f = parseFloat(x);
  if (isNaN(f))
    return;
  f = Math.round(x * 10) / 10; //*1N个零 N位小数
  return f;
}


$("#target1").on("change", function () {
  doing();
});

$("#target2").on("change", function () {
  doing();
});

$("#target3").on("change", function () {
  doing();
});
$("#target4").on("change", function () {
  doing();
});

function doing() {
  var polls = $("#target1").val();
  var year = $("#target2").val();
  var dm = $("#target3").val();
  var month = $("#target4").val();
  $("#DMrateTable").html(
      "<tr >"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>断面名称</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>五月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>六月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>七月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>八月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>九月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>十月</th>"
      + "<th align='center' style='white-space: nowrap; text-align: center; background: #99A4AF; color: white'>十一月</th>"
      + "</tr>'");
  $.ajax({
    type: "POST",
    dataType: "html",
    async: true,
    url: "rest/qmp/qmpDMrate",
    data: {
      "polls": polls,
      "year": year,
      "dm":dm,
      "month":month
    },
    success: function (data) {
      //console.log(data);
      if (data == "null") {
        //nothing
      } else {

        result = eval("(" + data + ")");
        for (var i = 0; i < result.length; i = i + 7) {
          var html = "";
          html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
          var sec_name = (decodeURIComponent(result[i].name)).replace(",", "").replace(/\d+/g, '');
          html += (decodeURIComponent(result[i].name)).replace(",", "").replace(/\d+/g, '');
          html += "</td>";
          var tmp;
          for (var k = 0; k < 7; k++) {
            html += "<td align=\"center\" style=\"white-space: nowrap;\">";
            //if(k==0){
            //	html += toDecimal(result[i+k].dRate);
            //}else{
            if (result[i + k].dRate == 0 || result[i + k].dRate == "NaN" || result[i + k].dRate == "Infinity" || result[i + k].mRate == 0 || result[i + k].mRate == "NaN" || result[i + k].mRate == "Infinity") {
              html += "数据缺失";
            } else {
              if (result[i + k].dRate >= 1 || result[i + k].mRate >= 1) {

                html += "异常";
              } else {
                html += toDecimal(result[i + k].dRate * 100) + "%";
                html += " / ";
                html += toDecimal(result[i + k].mRate * 100) + "%";
                if (sec_name==dm){
                  if (k+5==month){
                    initchart(toDecimal(result[i + k].dRate * 100),toDecimal(result[i + k].mRate * 100))
                  }
                }else if (dm==null){
                  if (i==0){
                    if (k+5==month){
                      initchart(toDecimal(result[i + k].dRate * 100),toDecimal(result[i + k].mRate * 100))
                    }
                  }
                }
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
  $.ajax({
    type: "POST",
    dataType: "json",
    async: true,
    url: "rest/qmp/qmpDMs",
    data: {
      data: {
        "polls": polls,
        "year": year,
        "dm":dm,
        "month":month
      },
    },
    success: function (res) {
      $("#target3").empty();
      if (dm !== null) {
        $("#target3").append("<option value='" + dm + "'>" + dm + "</option>");
      }
      for (var i = 0; i < res.length; i++) {
        $("#target3").append("<option value='" + res[i].section_name + "' style='text-align: center'>" + res[i].section_name + "</option>")
      }
    }
  })
}

function initchart(dy,my) {
  var myChart = echarts.init(document.getElementById('piechart'));
  option = {
    title: {
      text: '点源面源贡献率',
      subtext: '占比情况',
      left: 'center'
    },
    tooltip: {
      trigger: 'item',
      formatter: "{a} <br/>{b} : ({d}%)"
    },
    series: [
      {
        name:'点源面源占比',
        type: 'pie',
        radius: '65%',
        center: ['50%', '50%'],
        selectedMode: 'single',
        data: [
          {
            value: dy,
            name: '点源',
          },
          {value: my, name: '面源'},
        ],
        itemStyle: {
          emphasis: {
            shadowBlur: 10,
            shadowOffsetX: 0,
            shadowColor: 'rgba(0, 0, 0, 0.5)'
          }
        }
      }
    ]
  };

  myChart.setOption(option);
}