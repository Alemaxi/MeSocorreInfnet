<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de clientes</title>
</head>
<body>
	<div class="w3-container">
		<h3>Lista de clientes</h3>
	</div>


	<table class="w3-table">
		<tr>
			<th>Nome</th>
			<th>Endereço</th>
			<th>Hora de abertura</th>
			<th>Hora de fechamento</th>
			<th></th>
		</tr>
		<c:forEach var="clinica" items="${Listagem}">
			<tr>
			<td>${clinica.nome}</td>
			<td>${clinica.endereco}</td>
			<td>${clinica.abertura }</td>
			<td>${clinica.fechamento }</td>
			<td><a href="/clinica/${clinica.id }/excluir">Excluir</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>