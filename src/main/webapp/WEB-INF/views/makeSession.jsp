<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션이 생성되었습니다<br>
	m.id : ${requestScope.id }<br>
	s.id : ${sessionScope.id }<br>
	name : ${name }<hr>
	<a href="resultSession">확인 세션</a>
</body>
</html>