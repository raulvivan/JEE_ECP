<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A�adir Tema</title>
</head>
<body>
	<H1>A�adir Tema</H1>
	
	<form action="/listaVotaciones" method="post">
		<p>
			Tema: <input name="tema" type="text"
				 />${pView.errorMsg}</p>
		<p>
			Pregunta: <input name="pregunta" type="text"
				 />${pView.errorMsg}</p>
		<p>
			<input type="submit" value="A�adir" />
		</p>
	</form>
	
	<p>
		<a href="/listaVotaciones">Volver a Home</a>
	</p>

</body>
</html>