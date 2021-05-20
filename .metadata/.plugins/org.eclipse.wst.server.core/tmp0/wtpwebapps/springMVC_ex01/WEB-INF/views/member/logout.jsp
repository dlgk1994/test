<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request : <%= request.getAttribute("test") %></h1>
	${requestScope.test }<br>
	${test }
	<hr>
	<a href="/root/login">로그인</a>
	<a href="index">index</a>
</body>
</html>