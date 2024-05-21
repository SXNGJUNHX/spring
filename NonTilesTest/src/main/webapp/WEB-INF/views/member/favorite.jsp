<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NonTiles</title>
<%@include file="/WEB-INF/views/inc/asset.jsp" %>
</head>
<body>
	<header>
		<h1>NonTiles</h1>
		<%@include file="/WEB-INF/views/inc/main_menu.jsp" %>
		<%@include file="/WEB-INF/views/inc/member_menu.jsp" %>
	</header>
	
	<h1>회원 <small>즐겨찾기</small></h1>
	
	<div><a href="#">Google</a></div>
	<div><a href="#">Stack Overflow</a></div>
	<div><a href="#">GitHub</a></div>
</body>
</html>
