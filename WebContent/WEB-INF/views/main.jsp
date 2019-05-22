<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
</head>
<body>
	<h1>Biblioteca virtual</h1>
	<form method="get"
		action="${pageContext.request.contextPath}/buscarTexto">
		<label for="search">Texto a buscar:</label> <input id="search"
			name="search" type="text" /> <input type="submit" value="Buscar" />
		<label>Buscar por:</label> <select name="selected">
			<option value="0">Título</option>
			<option value="1">Autor</option>
			<option value="2">ISBN</option>
			<option value="3">Genero</option>
		</select>
	</form>
	<br>
	<form method="get"
		action="${pageContext.request.contextPath}/buscarExistencia">
		<label for="amount">Cantidad de existencias:</label> <input
			id="amount" name="amount" type="number" min="1" /> <input
			type="submit" value="Buscar" />
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/buscarTodos" method="get">
		<input type="submit" value="Ver todos">
	</form>
</body>
</html>