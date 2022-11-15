<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="w3-container w3-teal">
		<h2>Login</h2>
	</div>

	<form class="w3-container" action="/login" method="post">
		<label class="w3-text-teal"><b>Email</b></label> <input
			class="w3-input w3-border w3-light-grey" type="text" name="email">
		<label class="w3-text-teal"><b>Senha</b></label> <input
			class="w3-input w3-border w3-light-grey" type="text" name="senha">

		<button class="w3-btn w3-blue-grey">Register</button>
	</form>

</body>
</html>