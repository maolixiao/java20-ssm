<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<title>学生查询</title>
<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"user",
			data:"name=123&id=2&_method=put",
			type:"post",
			success:function(data){
				console.log(data);
			}
		
		});
	})
</script>
</head>
<body>
	查询所有
</body>
</html>