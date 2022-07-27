<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	m.id : ${requsetScope.id }<br>
	s.id : ${sessionScope.id }<br>
	name : ${name }<hr>
	<a href="makeSession">세션 생성</a>
	<a href="resultSession">확인 세션</a>
</body>
</html>