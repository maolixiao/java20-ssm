<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<title>Insert title here</title>
		
</head>
<body>
	${stuName.x }
	${stuName}
	<div><a href="stu/toAdd">添加</a></div>
	<table border="1">
		<tr>
			<td>姓名</td>
			<td>生日</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${stuList}" var="s">
			<tr>
				<td>${s.name}</td>
				<td>${s.birthday}</td>
				<td><a href="stu/delete?id=${s.id}">删除</a>
					
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>