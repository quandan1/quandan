var result = [
  {
    "name": "通江口",
    "jan": 1,
    "feb": "2",
    "mar": 3,
    "apr": 4,
    "may": 1,
    "june": "2",
    "july": 3,
    "aug": 4,
    "sept": 1,
    "oct": "11",
    "nov": 3,
    "dev": 4,
    "year": 4
  },
  {
    "name": "通江口",
    "jan": 1,
    "feb": "2",
    "mar": 3,
    "apr": 4,
    "may": 1,
    "june": "2",
    "july": 3,
    "aug": 4,
    "sept": 1,
    "oct": "11",
    "nov": 3,
    "dev": 4,
    "year": 4
  }
];
// $(function () {
//   $.ajax({
//     type:"POST",
//     url:"rest/qmpa/dmmyjs",
//     data:{
//       "zhibiao":$("#target").val()
//     },
//     success:function (res) {
//
//     }
//   })
// });
$("#target").on("change", function () {
  console.log($("#target").val());
  $.ajax({
    type: "POST",
    dataType: "html",
    async: true,
    url: "rest/qmpa/dmmyjs",
    data: {
      "zhibiao": $("#target").val()
    },
    success: function (result) {
      result=JSON.parse(result);
      console.log(result);
      $("#qmpMYTable  tr:not(:first)").html("");
      for (var i = 0; i < result.length; i++) {
        var html = "";
        html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].name;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].apr<0?'异常':result[i].apr;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].may<0?'异常':result[i].may;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].june<0?'异常':result[i].june;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].july<0?'异常':result[i].july;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].aug<0?'异常':result[i].aug;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].sept<0?'异常':result[i].sept;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].oct<0?'异常':result[i].oct;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].nov<0?'异常':result[i].nov;
        html += "</td>";
        html += "<td align=\"center\" style=\"white-space: nowrap;\">";
        html += result[i].year<0?'异常':result[i].year;
        html += "</td></tr>";
        $("#qmpMYTable").append(html);
      }
    }
  });

});

$.ajax({
  type: "POST",
  dataType: "html",
  async: true,
  url: "rest/qmpa/dmmyjs",
  data: {
    "zhibiao": "ad"
  },
  success: function (result) {
    result=JSON.parse(result);
    console.log(result);
    $("#qmpMYTable  tr:not(:first)").html("");
    for (var i = 0; i < result.length; i++) {
      var html = "";
      html += "<tr> <td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].name;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].apr<0?'异常':result[i].apr;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].may<0?'异常':result[i].may;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].june<0?'异常':result[i].june;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].july<0?'异常':result[i].july;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].aug<0?'异常':result[i].aug;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].sept<0?'异常':result[i].sept;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].oct<0?'异常':result[i].oct;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].nov<0?'异常':result[i].nov;
      html += "</td>";
      html += "<td align=\"center\" style=\"white-space: nowrap;\">";
      html += result[i].year<0?'异常':result[i].year;
      html += "</td></tr>";
      $("#qmpMYTable").append(html);
    }
  }
});