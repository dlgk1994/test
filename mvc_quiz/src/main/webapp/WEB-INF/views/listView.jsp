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
	${list.size() }
	<table border="1">
		<tr><th>id</th><th>pwd</th><th>name</th></tr>
			<c:choose>
				<c:when test="${list.size() ==0 }">
					<tr><th colspan="3">데이터가 존재하지 않습니다</th></tr>
				</c:when>
				
				<c:otherwise>
					<c:forEach var="dto" items="${list }">
						<tr>
							<td>${dto.id }</td>
						
							<td>${dto.pwd }</td>
						
							<td>${dto.name }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			<tr>
				<td colspan="3">
					<a href="index">index이동</a> &nbsp;&nbsp;
					<a href="saveView">게시글 등록</a>
				</td>
			</tr>
	</table>
</body>
</html>






























