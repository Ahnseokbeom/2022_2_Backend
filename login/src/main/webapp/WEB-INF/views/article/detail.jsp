<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
<c:url var="R" value="/" />
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<style>
article {
	margin-bottom: 100px;
}

article div.header {
	border-bottom: 1px solid lightgray;
	padding-bottom: 5px;
	margin-bottom: 20px;
}

article div.header span {
	margin-right: 50px;
}

article div.body {
	line-height: 2;
	margin-bottom: 30px;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/mainMenu.jsp"%>
	<div class="container2">
		<div class="nav">&gt; 게시판 &gt; 공지사항</div>
		<article>
			<a class="btn2 small right" href="list?${pagination.queryString}">목록으로</a>
			<h2>${ article.title }</h2>
			<div class="header">
				<span>${ article.userName }</span> <span><fmt:formatDate
						value="${ article.modifiedTime }" pattern="yyyy-MM-dd HH:mm:ss" /></span>
			</div>
			<div class="body">${ article.body }</div>
			<a class="btn2 small" href="list?${pagination.queryString}">목록으로</a>
		</article>
		<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	</div>
</body>
</html>