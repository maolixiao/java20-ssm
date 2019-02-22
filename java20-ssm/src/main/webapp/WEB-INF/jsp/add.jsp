<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>添加页面</h1>
	<form action="stu/add" method="post">
		<p>姓名:<input name="name"></p>
		<p>年龄:<input name="age"></p>
		<input type="submit">
	</form>
</body>
</html>