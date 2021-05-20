<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<c:set var="context" value="<%=request.getContextPath() %>" />
<P>  The time on the server is ${serverTime}. </P>

<img src="/resources/img.jpg" width="150" height="150"><br>
<img src="resources/img.jpg" width="150" height="150"><br>
<img src="<c:url value='/resources/img.jpg'/>" width="150" height="150"><br>
<img src="${context }/resources/img.jpg" width="150" height="150"><br>
<hr>
<img src="${context }/resources/css/img.jpg" width="150" height="150"><br>
<img src="${context }/resources/js/img.jpg" width="150" height="150"><br>
<hr>
css js<br>
<img src="${context }/css/img.jpg" width="150" height="150"><br>
<img src="${context }/js/img.jpg" width="150" height="150"><br>

</body>
</html>

























