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
	<c:set var="tema" scope="request" value="${tema}" />
	<h1>${tema.nombre}</h1>
	
	<h2>${tema.pregunta}</h2>
	
	<p>
		Valoracion: <select name="valoracion">
			<c:forEach begin="0" end="10" var="val">
				<option value="${val}">${val}</option>
			</c:forEach>
		</select>
	</p>
	<p>
		Nivel de estudios: <select name="estudios">
			<c:forEach var="" items="${pView.roles}">
				<option value="${rol}">${rol}</option>
			</c:forEach>
		</select>
	</p>
	

</body>
</html>