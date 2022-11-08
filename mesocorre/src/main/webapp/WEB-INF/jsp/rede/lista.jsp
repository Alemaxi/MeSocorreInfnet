<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de redes</title>
</head>
<body>
	<div class="w3-container">
		<h3>Lista de redes</h3>
	</div>
	<table class="w3-table">
		<tr>
			<th>id</th>
			<th>Nome</th>
			<th>Telefone</th>
			<th></th>
		</tr>
		<c:forEach var="rede" items="${listagem}">
			<tr>
				<td>${rede.id}</td>
				<td>${rede.nome}</td>
				<td>${rede.telefone }</td>
				<td><a href="/rede/${rede.id}/excluir">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
