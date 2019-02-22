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
		
		$.ajax({
			url:"model/query/0",
			dataType:"json",
			success:function(result){
				console.log(result);
				var ul = $("<ul>");
				showModule(result,ul);
				$("body").append(ul);
			}
		});
		
	})
	
	function showModule(module,parentNode){
		for(var i=0;i<module.length;i++){
			var li = $("<li>").html(module[i].name);
			parentNode.append(li);
			if(module[i].mlist){
				var ul = $("<ul>");
				li.append(ul);
				showModule(module[i].mlist,ul);
			}
		}
	}

</script>
</head>
<body>
	
</body>
</html>