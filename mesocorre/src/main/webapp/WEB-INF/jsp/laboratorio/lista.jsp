<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de planos</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />
	
	
	<a href="/laboratorio/incluir">>Incluir</a>

	<div class="w3-container">
		<h3>Lista de laboratórios</h3>
	</div>
	<table class="w3-table">
		<tr>
			<th>Nome</th>
			<th>Endereço</th>
			<th>Hora de abertura</th>
			<th>Hora de fechamento</th>
			<th></th>
		</tr>
		<c:forEach var="lab" items="${listagem}">
			<tr>
				<td>${lab.nome}</td>
				<td>${lab.endereco}</td>
				<td>${lab.horaAbertura }</td>
				<td>${lab.horaFechamento }</td>
				<td><a href="/laboratorio/${lab.id }/excluir">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>