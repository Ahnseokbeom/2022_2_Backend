<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/common.css" />
<style>
td:nth-child(1), td:nth-child(5), td:nth-child(7), td:nth-child(8) {
	text-align: center;
}
</style>
</head>
<body>
	<div class="container">
		<h1>프로젝트 목록</h1>
		<table class="list">
			<thead>
				<tr>
					<th>id</th>
					<th>제목</th>
					<th>매니저 이름</th>
					<th>매니저 전화</th>
					<th>진척도</th>
					<th>우선순위</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="project" items="${ project }">
					<tr>
						<td>${ project.id }</td>
						<td>${ project.title }</td>
						<td>${ project.manager.name }</td>
						<td>${ project.manager.phone }</td>
						<td>${ project.progress }</td>
						<td>${ project.priority }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>