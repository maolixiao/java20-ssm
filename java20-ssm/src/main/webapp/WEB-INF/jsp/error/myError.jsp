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
	系统发生内部异常，异常能容：${ex.exmsg }，请联系管理员，或者跳转到<a href="stu/show">首页</a>
</body>
</html>