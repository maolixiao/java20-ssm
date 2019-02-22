<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="${pageContext.request.contextPath}/">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "model/query/0",
			dataType : "json",
			success : function(result) {
				console.log(result);
				var ul = $("<ul>");
				showModule(result, ul);
				$("#module").append(ul);
			}
		});

	})
	var index = 0;
	function showModule(module, parentNode) {
		for (var i = 0; i < module.length; i++) {
			var ip = $("<input type='checkbox' name='mlist["+(index++)+"].id' value='"+module[i].id+"'>");
			ip.click(function(){
				var t = this;
				$(this).parent().find("input").each(function(){
					if(t.checked){
						this.checked= true;
					}else{
						this.checked= false;
					}
				});
				$(this).parent().parents().children("input").each(function(){
					this.checked = true;
				});
				var bol = true;
				$(this).parent().parent().children().children("input").each(function(){
					if(this.checked){
						bol = false;
					}
				});
				if(bol){
					$(this).parent().parent().parent().children("input")[0].checked = false;
				}else{
					$(this).parent().parent().parent().children("input")[0].checked = true;
				}
			});
			var li = $("<li>");
			li.append(ip);
			li.append(module[i].name);
			parentNode.append(li);
			if (module[i].mlist) {
				var ul = $("<ul>");
				li.append(ul);
				showModule(module[i].mlist, ul);
			}
		}
	}
	
</script>
</head>
<body>
	<form action="role/add" method="post">
		<div>
			角色名称：<input name="name">
		</div>
		<div id="module"></div>
		<input type="submit">
	</form>
</body>
</html>