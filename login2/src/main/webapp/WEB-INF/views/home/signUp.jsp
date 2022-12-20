<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="${R}res/common.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="${R}res/common.js"></script>
<style>
div.container2 {
	padding: 20px;
}

div.nav {
	padding: 5px;
	border-bottom: 1px solid #ddd;
	margin-bottom: 25px;
}

div.panel {
	width: 600px;
	margin-bottom: 50px;
	border: 1px solid #ddd;
	border-radius: 5px;
	box-shadow: 3px 3px 3px #ccc;
}

div.panel h1 {
	margin: 0;
	font-size: 14pt;
	font-weight: bold;
	background: linear-gradient(90deg, #def, #bcd);
	padding: 10px 15px 7px 15px;
}

div.panel-body {
	padding: 20px;
	font-size:
}

div.panel input {
	padding: 0.7em 1em;
	margin-bottom: 7px;
	width: 300px;
	border: 2px solid #dee;
	border-radius: 8px;
}

div.panel input:focus {
	border: 2px solid #aaf;
	outline: none;
}

div.panel .btn2 {
	margin-top: 10px;
	padding: 0.7em 1.5em;
}

form>div {
	margin-bottom: 20px;
}

label {
	font-size: 11pt;
	font-weight: bold;
	display: block;
	padding:
}
</style>
</head>
<body>
	<div class="main-menu">
		<ul>
			<li class="title" data-url="${R}">로그인</li>
			<sec:authorize access="not authenticated">
				<li data-url="${R}login" class="right">로그인</li>
				<li data-url="${R}signUp" class="right">회원가입</li>
			</sec:authorize>
			<sec:authorize access="authenticated">
				<li data-url="${R}logout_processing" class="right">로그아웃</li>
			</sec:authorize>
		</ul>
	</div>
	<div class="container2">
		<div class="nav">&gt; 회원가입</div>
		<div class="panel">
			<h1 class="panel-header">회원가입</h1>
			<div class="panel-body">
				<form:form method="post" modelAttribute="userSignUp">
					<div>
						<label>사용자 아이디:</label>
						<form:input path="loginName" placeholder="아이디를 입력하세요" />
						<form:errors path="loginName" class="error" />
					</div>
					<div>
						<label>비밀번호:</label>
						<form:password path="passwd1" placeholder="비밀번호를 입력하세요" />
						<form:errors path="passwd1" class="error" />
					</div>
					<div>
						<label>비밀번호 확인:</label>
						<form:password path="passwd2" placeholder="비밀번호를 한 번 더 입력하세요" />
						<form:errors path="passwd2" class="error" />
					</div>
					<div>
						<label>이름:</label>
						<form:input path="name" placeholder="이름을 입력하세요" />
						<form:errors path="name" class="error" />
					</div>
					<div>
						<label>이메일:</label>
						<form:input path="email" placeholder="이메일 주소를 입력하세요" />
						<form:errors path="email" class="error" />
					</div>
					<button type="submit" class="btn2 blue">
						<i class="fa fa-user-plus"></i> 회원가입
					</button>
					<a href="${R}" class="btn2 cyan"><i class="fa fa-google"></i>
						google 계정으로 가입</a>
					<a href="${R}" class="btn2"><i class="fa fa-times"></i> 취소</a>
				</form:form>
			</div>
		</div>
		<div class="footer">
			<div style="margin-top: 5px;">로그인</div>
		</div>
	</div>
</body>
</html>