<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	session.id : ${sessionScope.id }<br>
	session.age : ${sessionScope.age }<br>
	<hr>
	<a href="set">setSession 이동</a>
	<a href="delSession">delSession 이동</a>
</body>
</html>