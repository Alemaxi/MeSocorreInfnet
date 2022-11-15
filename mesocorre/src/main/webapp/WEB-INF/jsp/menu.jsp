<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="w3-bar w3-blue-grey">
	<a href="/" class="w3-bar-item w3-button">MeSocorre</a> <a
		href="/usuario/lista" class="w3-bar-item w3-button">Usuário</a> <a
		href="/clinica/lista" class="w3-bar-item w3-button">Clinica</a> <a
		href="/hospital/lista" class="w3-bar-item w3-button">Hospital</a> <a
		href="/laboratorio/lista" class="w3-bar-item w3-button">Laboratório</a>
	<a href="/plano/lista" class="w3-bar-item w3-button">Plano</a> <a
		href="/rede/lista" class="w3-bar-item w3-button">Rede</a>

	<c:if test="${empty user }">
		<a href="/usuario/cadastro"
			class="w3-bar-item w3-button w3-green w3-right">Sign in</a>
		<a href="/login" class="w3-bar-item w3-button w3-green w3-right">Login</a>
	</c:if>

	<c:if test="${not empty user }">
		<a href="/logout" class="w3-bar-item w3-button w3-green w3-right">Logout
			${user.nome }</a>
	</c:if>
</div>

