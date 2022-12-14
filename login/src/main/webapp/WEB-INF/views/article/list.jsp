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
div.panel {
	width: 1100px;
}

select:nth-child(1) {
	margin-left: 200px;
}

table {
	width: 100%;
	margin: 10px 0px 20px 0px;
	border-collapse: collapse;
}

td, th {
	border: 1px solid #ddd;
	padding: 7px;
	text-align: left;
	font-size: 11pt;
	font-weight: normal;
}

th {
	background-color: #eee;
}

td:nth-child(1), th:nth-child(1) {
	text-align: center;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/mainMenu.jsp"%>
	<div class="container2">
		<div class="nav">&gt; 게시판 &gt; ${ board.title }</div>
		<div class="panel">
			<h1 class="panel-header">${ board.title }</h1>
			<div class="panel-body">
				<form:form method="get" modelAttribute="pagination">
					<form:select path="si">
						<form:option value="0" label="조회조건" />
						<form:option value="1" label="제목" />
						<form:option value="2" label="글쓴이" />
					</form:select>
					<form:input path="st" />
					<form:hidden path="bd" value="${ pagination.bd }" />
					<button type="submit" class="btn2 cyan small">조회</button>
					<a class="btn2 small" href="list?bd=${pagination.bd}">초기화</a>
					<c:if test="${ permission.createGranted }">
						<a class="btn2 blue small right"
							href="create?${pagination.queryString}"> 
							<i class="fa fa-pencil-square-o"></i> 글 등록</a>
					</c:if>
				</form:form>
				<table>
					<thead>
						<tr>
							<th style="width: 7%;">no</th>
							<th style="width: 53%;">제목</th>
							<th style="width: 15%;">작성자</th>
							<th style="width: 26%;">수정시각</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="article" items="${ articles }">
							<tr data-url="detail?id=${article.id }&${pagination.queryString}">
								<td>${ article.no }</td>
								<td>${ article.title }</td>
								<td>${ article.userName }</td>
								<td><fmt:formatDate value="${ article.modifiedTime }"
										pattern="yyyy-MM-dd HH:mm:ss" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<my:pagination pageSize="${ pagination.sz }"
					recordCount="${ pagination.recordCount }" queryStringName="pg" />
			</div>
		</div>
		<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	</div>
</body>
</html>