<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de hospitais</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="w3-container">
		<h3>Lista de hospitais</h3>
	</div>
	<table class="w3-table">
		<tr>
			<th>Nome</th>
			<th>Endereço</th>
			<th>Emergencia</th>
			<th>Internação</th>
			<th></th>
		</tr>
		<c:forEach var="hosp" items="${listagem}">
			<tr>
				<td>${hosp.nome}</td>
				<td>${hosp.endereco}</td>
				<td>${hosp.emergencia }</td>
				<td>${hosp.internacao }</td>
				<td><a href="/hospital/${hosp.id }/excluir">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>