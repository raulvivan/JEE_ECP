<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Temas</title>
</head>
<body>
	<h1>Lista Temas</h1>
	<c:set var="temas" scope="request" value="${temas}" />
	${temas.update()}
	
	<a href="/JEE_ECP/jsp/añadirTema">Añadir tema</a>
	
	<c:forEach var="tema" items="${temas.temas}">
		<p>${tema.nombre}  <a href="/JEE_ECP/jsp/verVotaciones?id=${tema.id}">Ver votaciones</a><a href="/JEE_ECP/jsp/eliminarTema?id=${tema.id}">Eliminar Tema</a> <a href="/JEE_ECP/jsp/votar?id=${tema.id}">Votar</a> </p>
	</c:forEach>
	
</body>
</html>