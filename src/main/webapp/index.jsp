<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="http://localhost/JQueryBootstrap/resources/javascript/jquery-1.11.1.js"></script> <!-- src= webresource/JQueryBootstrap/resources/javascript/jquery-1.11.1.js-->
<title>欢迎</title>
</head>
<body>
	<p>WELCOME!</p>
	<button type="button">Click me</button>
	<script>
		$(document).ready(function(){
			$("button").click(function(){
				$("p").hide();
			})
		});
	</script>
</body>
</html>