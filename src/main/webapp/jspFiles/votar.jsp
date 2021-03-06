<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Votacion</title>
</head>
<body>
	<c:set var="votar" scope="request" value="${votar}" />
	${votar.update()}
	<h1>Tema: ${votar.tema.nombre}</h1>
	
	<h2>Pregunta: ${votar.tema.pregunta}</h2>
	<form action="/JEE_ECP/jsp/votar" method="post">
		<p>
			Valoracion: <select name="valoracion">
				<c:forEach begin="0" end="10" var="val">
					<option value="${val}">${val}</option>
				</c:forEach>
			</select>
		</p>
		<p>
			Nivel de estudios: <select name="estudios">
				<c:forEach var="nivel" items="${votar.estudios}">
					<option value="${nivel}">${nivel}</option>
				</c:forEach>
			</select>
		</p>
		<input name="id" type="hidden" value="${votar.tema.id}"/>
		<p>
			<input type="submit" value="Votar" />
		</p>
	</form>
	
	<p>
		<a href="/JEE_ECP/jsp/listaTemas">Volver a Home</a>
	</p>
	
</body>
</html>