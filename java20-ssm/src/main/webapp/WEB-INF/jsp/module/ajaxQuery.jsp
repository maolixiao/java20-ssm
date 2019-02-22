<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		goPage(1);
		$("[type=button]").click(function(){
			goPage(1);
		});
	});
	
	function goPage(page){
		var name = $("[name=name]").val();
		$.ajax({
			url:"model/ajaxQuery",
			data:"currentPage="+page+"&name="+name,
			success:function(result){//result = pageBean
				$("#tb").html("");
				for(var v in result.list){ // 循环分页数据
					console.log(v);
					var tr = $("<tr>");
					var td1 = $("<td>").html(result.list[v].id);
					var td2 = $("<td>").html(result.list[v].name);
					tr.append(td1).append(td2);
					$("#tb").append(tr);
				}
				$("#pageMenu").remove();
				var pageMenu = '<div id="pageMenu">'+
					'<span><a param="'+result.prevPage+'">上一页</a></span>'+
					'<span><a param="'+result.nextPage+'">下一页</a></span>'+
					'<span><a param=1>首页</a></span>'+
					'<span><a param="'+result.totalPage+'">尾页</a></span>'+
					'<span>'+result.totalPage+'/'+result.currentPage+'</span>'+
				'</div>';
				$("body").append(pageMenu);
				
				
				$("#pageMenu span").click(function(){
					var param = $(this).find("a").attr("param");
					goPage(param);
				});
			}
		});
	}
</script>

</head>
<body>
	<input name="name" value="${module.name}"><input type="button" value="查询">
	<table border="1">
		<tr>
			<td>编号</td>
			<td>名称</td>
		</tr>
		<tbody id="tb">
		
		</tbody>
	</table>
</body>
</html>