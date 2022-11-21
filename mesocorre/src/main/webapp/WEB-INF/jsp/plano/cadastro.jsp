<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Cadastramento de plano</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="w3-container">
		<h3>Cadastro de planos</h3>
	</div>
	<form class="w3-container" action="/plano/incluir" method="post">
		<label class="w3-text-teal"><b>Nome</b></label> 
		<input class="w3-input w3-border w3-light-grey" type="text" name="nome"> 
		<label class="w3-text-teal"><b>Acomodação</b></label> 
		<input class="w3-input w3-border w3-light-grey" type="text" name="acomodacao">
		<label class="w3-text-teal">Redes</label>
		<select name="rede">
			<c:forEach var="rede" items="${redes}">
				<option value=${rede.id}>${rede.nome}</option>
			</c:forEach>
		</select>

		<button class="w3-btn w3-blue-grey">Register</button>
	</form>
</body>
</html>
