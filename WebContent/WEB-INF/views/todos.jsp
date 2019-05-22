<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
</head>
<body>
	<h1>Biblioteca virtual</h1>
	<h3>Hay ${nLibros} libros en existencia, de ${nAutores} cantidad de autores
		diferentes</h3>

	<a href="${pageContext.request.contextPath}/">Regresar</a>
	<table>
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