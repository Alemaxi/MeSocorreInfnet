<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de usuários</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="w3-container">
		<h3>Lista de usuários</h3>
	</div>
	<table class="w3-table">
		<tr>
			<th>id</th>
			<th>Nome</th>
			<th>email</th>
			<th></th>
		</tr>
		<c:forEach var="item" items="${listagem}">
			<tr>
				<td>${item.id}</td>
				<td>${item.nome}</td>
				<td>${item.email }</td>
				<td><a href="/usuario/${item.id}/excluir">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
