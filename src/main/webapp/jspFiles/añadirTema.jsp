<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Añadir Tema</title>
</head>
<body>
	<H1>Añadir Tema</H1>
	
	<form action="/JEE_ECP/jsp/añadirTema" method="post">
		<p>
			Tema: <input name="tema" type="text"
				 /></p>
		<p>
			Pregunta: <input name="pregunta" type="text"
				 /></p>
		<p>
			<input type="submit" value="Añadir" />
		</p>
	</form>
	
	<p>
		<a href="/JEE_ECP/jsp/listaTemas">Volver a Home</a>
	</p>

</body>
</html>