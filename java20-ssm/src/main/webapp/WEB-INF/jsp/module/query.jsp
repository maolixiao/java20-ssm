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
		$("#pageMenu span").click(function(){
			var param = $(this).find("a").attr("param");
			$("[name=currentPage]").val(param);
			$("form").submit();
		});
		$("[type=button]").click(function(){
			var xzV = "";
			$("[name=xz]:checked").each(function(){
				xzV += "&xz="+$(this).val();
			})
			$.ajax({
				url:"model/delete",
				data:xzV,
				success:function(){
					
				}
			})
			
		});
	});
</script>
</head>
<body>
	<form action="model/toQueryByPage" method="post">
		<input type="hidden" name="currentPage">
		<input name="name" value="${module.name}"><input type="submit">
		<input type="button" value="选中删除的">
	</form>
	<table border="1">
		<tr>
			<td><input type="checkbox"></td>
			<td>编号</td>
			<td>名称</td>
		</tr>
		<c:forEach items="${page.list}" var="l">
			<tr>
				<td><input name="xz" value="${l.id }" type="checkbox"></td>
				<td>${l.id }</td>
				<td>${l.name }</td>
			</tr>
		</c:forEach>
	</table>
	<div id="pageMenu">
		<span><a param='${page.prevPage}'>上一页</a></span>
		<span><a param='${page.nextPage}'>下一页</a></span>
		<span><a param='1'>首页</a></span>
		<span><a param='${page.totalPage}'>尾页</a></span>
		<span>${page.totalPage}/${page.currentPage }</span>
	</div>
</body>
</html>