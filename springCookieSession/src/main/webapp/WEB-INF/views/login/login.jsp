<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/quiz_cookie"/>
	<c:choose>
		<c:when test="${login == null || login ==''} ">
			<form method="post" action="chkUser">
				<input type="text" name="id"><br>
				<input type="text" name="pwd"><br>
				<input type="submit" value="로그인"><br>
			</form>
		</c:when>
		<c:otherwise>
			${login }님이 로그인 상태입니다<br>
			아이디 : ${loginId }
		</c:otherwise>
	</c:choose>
	
</body>
</html>