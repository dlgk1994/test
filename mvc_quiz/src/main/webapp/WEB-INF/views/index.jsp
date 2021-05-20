<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/*
	var log = ${login}
	
	if(log == 0){
		alert("로그인성공")
	}else if(log == 1){
		alert("비밀번호 틀림")
	}else if(log == -1){
		alert("해당 아이디 없ㅇ므")
	}*/
	function userCheck(log) {
		if(log == 0){
			alert("로그인성공")
		}else if(log == 1){
			alert("비밀번호 틀림")
		}else if(log == -1){
			alert("해당 아이디 없ㅇ므")
		}
	}
	
</script>
</head>
<body>
	<script>userCheck(${login})</script>
	model.name : ${model.userName }<br>
	model.login : ${model.login }
	<hr>
	name : ${userName }<br>
	login : ${login }<br>
	<c:choose>
		<c:when test="${model.login == null || model.login != 0 }">
			<form action="check" method="post">
				<input type="text" name="id" placeholder="아이디입력"><br>
				<input type="text" name="pwd" placeholder="비밀번호입력"><br>
				<input type="submit" value="로그인"><br>
			</form>
			<a href="saveView">회원가입</a> &nbsp;&nbsp;&nbsp;
		</c:when>
		<c:otherwise>
			<img src="<%= request.getContextPath() %>/resources/img.jpg" width="100" height="100">
			<br>${model.userName }님 환영합니다
		</c:otherwise>			
	</c:choose>
	<a href="list">모든 회원 보기</a>
</body>
</html>