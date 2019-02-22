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
		
		$(".clickAdd").click(function(){
			var l = $(".stuList div").length
			var ht = '<div>学生名称：<input name="stuList['+l+'].name">学生年龄：<input name="stuList['+l+'].age"></div>';
			$(".stuList").append(ht);
		});
		
	})

</script>
</head>
<body>
	<form action="clz/add" method="post">
		<div>
			<h1>班级添加</h1>
			<div>
				班级名称：<input name="name">
			</div>
			<div class="stuList">
				学生列表
				<div>学生名称：<input name="stuList[0].name">学生年龄：<input name="stuList[0].age"></div>
			</div>
			<div class="clickAdd">增加学生</div>
		</div>
		
		<input type="submit">
	</form>
</body>
</html>