<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="resources/css/materialize.min.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js">
      </script>
<link rel="stylesheet" href="resources/css/admin.css">
</head>
<body class = "container"> 
	<h1>Biblioteca virtual</h1>
	<p>Hay <b>${nLibros}</b> libros en existencia de <b>${nAutores}</b> autores
		diferentes</p>

	<a href="${pageContext.request.contextPath}/">Regresar</a>
	<table class="highlight responsive-table y-depth-1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Autor</th>
				<th>ISBN</th>
				<th>Genero</th>
				<th>Cantidad</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${libros}" var="item">
				<tr>
					<td>${item.idLibro}</td>
					<td>${item.lTitulo}</td>
					<td>${item.lAutor}</td>
					<td>${item.lISBN}</td>
					<td>${item.lGenero}</td>
					<td>${item.lCantidad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>