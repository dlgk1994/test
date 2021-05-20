<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  
	<h1>세션이 설정 되었습니다</h1>
	model.id : ${id }<br>
	model.age : ${age }<br>
	<hr>
	-->
	session.id : ${sessionScope.id }<br>
	session.age : ${sessionScope.age }<br>
	<hr>
	<a href="resultSession">resultSession 이동</a>
	<a href="delSession">delSession 이동</a>
</body>
</html>