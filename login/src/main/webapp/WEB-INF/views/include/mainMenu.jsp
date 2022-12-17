<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div class="main-menu">
	<div>
		<a data-url="${R}"><h1>로그인 연습</h1></a>
		<sec:authorize access="not authenticated">
			<a class="right" href="${R}login">로그인</a>
			<a class="right" href="${R}signUp">회원가입</a>
		</sec:authorize>
		<sec:authorize access="authenticated">
			<a href="${R}user/list">사용자 목록</a>
			<a class="right" href="${R}logout_processing">로그아웃</a>
		</sec:authorize>
	</div>
</div>