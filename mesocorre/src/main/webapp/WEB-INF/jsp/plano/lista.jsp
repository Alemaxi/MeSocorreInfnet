<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
	<div class="w3-container">
		<h3>Lista de planos</h3>
	</div>
	<table class="w3-table">
		<tr>
			<th>Nome</th>
			<th>Acomodaçãoo</th>
			<th>Rede</th>
			<th></th>
		</tr>
		<c:forEach var="plano" items="${listagem}">
			<tr>
			<td>${plano.nome}</td>
			<td>${plano.acomodacao}</td>
			<td>${plano.rede.nome }</td>
			<td><a href="/plano/${plano.id }/excluir">Excluir</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>