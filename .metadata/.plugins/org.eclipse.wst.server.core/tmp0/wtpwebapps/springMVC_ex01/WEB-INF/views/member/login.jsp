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
	<c:set var="context" value="<%=request.getContextPath() %>"/>
	<h1>login.jsp 페이지</h1>
	${requestScope.login }
	${login }
	<hr>
	<a href="<%=request.getContextPath() %>/index">index</a>
	<a href="${context }/logout">로그아웃</a>
</body>
</html>