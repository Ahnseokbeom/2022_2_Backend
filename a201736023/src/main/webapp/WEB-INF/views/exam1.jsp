<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table {
	border-collapse: collapse;
}

td {
	width: 100;
	padding: 5px;
	border: 1px solid gray;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td>학번</td>
			<td>${studentNo }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${ name }</td>
		</tr>
		<tr>
			<td>학기</td>
			<td>${ semester }</td>
		</tr>
	</table>
</body>
</html>