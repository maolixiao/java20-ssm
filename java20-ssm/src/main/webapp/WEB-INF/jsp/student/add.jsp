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
			var ht = '<div>学生名称：<input name="name">学生年龄：<input name="age"></div>';
			$(".stuList").append(ht);
		});
		
		$("[type=button]").click(function(){
			
			//ajax提交时，有两种（普通入参，json入参）
			//jquery底层会将json对象转换成?name=1&id=2
			var json = {};
			json.name = $("[name=name]:eq(0)").val();
			
			//获取学生集合数据
			var stus = [];
			$(".stuList div").each(function(){
				
				var stu = {};
				stu.name = $(this).find("input:eq(0)").val();
				stu.age = $(this).find("input:eq(1)").val();
				stus.push(stu);
			});
			json.stuList = stus;
			
			json = JSON.stringify(json);//将json对象转换成字符串
			$.ajax({
				url:"stu/ajaxAdd",
				data:json,
				type:"post",
// 				data:"name=1&id=2",
				contentType:"application/json",
				success:function(data){
					
				}
				
			});
			
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
				<div>学生名称：<input name="name">学生年龄：<input name="age"></div>
			</div>
			<div class="clickAdd">增加学生</div>
		</div>
		
		<input type="button" value="添加">
	</form>
</body>
</html>