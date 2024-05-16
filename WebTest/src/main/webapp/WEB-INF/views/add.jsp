<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
</head>
<body>
	<!-- <h1>글쓰기</h1>
	<form action="/web/board/addok.do" method="POST">
		<input type="submit" value="보내기">
	</form> -->
	<h1>보내기</h1>
	<h2>단일 데이터</h2>
	<form method="POST" action="/web/addok.do">
		<input type="text" name="num">
		<input type="submit" value="보내기">
	</form>
	
	<h2>다중 데이터</h2>
	<form method="POST" action="/web/addok.do">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="text" name="address"><br>
		<input type="submit" value="보내기">
		
		<!-- <input type="hidden" name="id" value="1234"> -->
	</form>
	
	<h2>다중 데이터</h2>
	<form method="POST" action="/web/addok.do">
		<input type="checkbox" name="cb" value="1">사과<br>
		<input type="checkbox" name="cb" value="2">딸기<br>
		<input type="checkbox" name="cb" value="3">바나나<br>
		<input type="checkbox" name="cb" value="4">수박<br>
		<input type="checkbox" name="cb" value="5">파인애플<br>
		<input type="submit" value="보내기">
		
		<!-- <input type="hidden" name="id" value="1234"> -->
	</form>
</body>
</html>