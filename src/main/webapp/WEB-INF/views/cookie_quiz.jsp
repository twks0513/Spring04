<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=" https://cdn.jsdelivr.net/npm/js-cookie@rc/dist/js.cookie.min.js "></script>
<script type="text/javascript">
const co = Cookies.get("myCookie")
	function popup(){
	alert(co)
		console.log('${cook}' =='')
		console.log('${cook}' ==null)
		if(co != undefined){
			alert('쿠키생성')
		}
		
		if('${cook}' ==''){
			window.open("popup","","width=300,height=200")
		}
	}
	popup()
	
</script>
</head>
<body>
	cook : ${cook }
	<hr>
	cookie_quiz<br>
	
	<c:choose>
		<c:when test="${sessionScope.id !=null }">
			${sessionScope.name }님 로그인 상태입니다	<br>
			<a href="main">main 이동</a>
			
		</c:when>
		<c:otherwise>
			<form action="main">
				id<input type="text" name="id"><br>
				pw<input type="password" name="pw"><br>
				<input type="submit" value="로그인">
			</form>
		</c:otherwise>
	</c:choose>
	
	
	
	
	
	
	
	
</body>
</html>