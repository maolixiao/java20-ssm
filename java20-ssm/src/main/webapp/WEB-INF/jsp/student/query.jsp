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
			url:"stu/query",
			data:null,
			dataType:"json",
			success:function(data){
				
				console.log(data);
				$("body").html(data[0].name);
			}
		});
	})
</script>
</head>
<body>

</body>
</html>