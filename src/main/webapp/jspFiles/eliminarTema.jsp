<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EliminarTema</title>
</head>
<body>
	<h1>EliminarTema</h1>
	<c:set var="id" scope="request" value="${id}" />
	
	<form action="/JEE_ECP/jsp/eliminarTema" method="post">
		<p>
			Identificador: <input name="identificador" type="text"
				 /></p>
		<p>
		<input name="id" type="hidden" value="${id}"/>
		<p>
			<input type="submit" value="Añadir" />
		</p>
		
		<a href="/JEE_ECP/jsp/listaTemas">Volver</a>
	</form>

</body>
</html>