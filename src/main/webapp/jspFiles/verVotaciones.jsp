<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ver votaciones</title>
</head>
<body>
	<h1>Ver votaciones</h1>
	<c:set var="votaciones" scope="request" value="${votaciones}" />
	${votaciones.update()}
	
	<h2>${votacion.tema.nombre}</h2>
	<p>Cantidad de votos: ${votaciones.cantidad}</p>
	
	<p>Valoracion media nivel bajo de estudios: ${votaciones.nivelBajo}</p>
	<p>Valoracion media nivel medio de estudios: ${votaciones.nivelMedio}</p>
	<p>Valoracion media nivel alto de estudios: ${votaciones.nivelAlto}</p>
	
	<a href="/JEE_ECP/jsp/listaTemas">Volver</a>

</body>
</html>