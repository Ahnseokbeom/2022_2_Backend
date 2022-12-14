<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<div class="main-menu">
		<div>
			<h1>로그인 연습</h1>
			<sec:authorize access="not authenticated">
				<a class="right" href="${R}login">로그인</a>
				<a class="right" href="${R}signUp">회원가입</a>
			</sec:authorize>
			<sec:authorize access="authenticated">
				<a class="btn" href="${R}logout_processing">로그아웃</a>
			</sec:authorize>
		</div>
	</div>
</body>
</head>
</html>