<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<script>
	$(document).ready(function() {
		$("select").material_select();
	});
</script>
<link rel="stylesheet" href="resources/css/admin.css">
</head>
<body class="container">
	<h1>Biblioteca virtual</h1>
	<div class="row">
		<form method="get"
			action="${pageContext.request.contextPath}/buscarTexto">
			<div class="input-field col s7">
				<label for="search">Texto a buscar:</label> <input
					class="input-field" id="search" name="search" type="text" required />
			</div>
			<div class="input-field col s3">
				<select name="selected">
					<option value="0">Título</option>
					<option value="1">Autor</option>
					<option value="2">ISBN</option>
					<option value="3">Genero</option>
				</select> <label>Buscar por:</label>
			</div>
			<div class="col s2">
				<button type="submit" value="Buscar"
					class="btn btn-small blue white-text waves-effect z-depth-1 y-depth-1 centered">Buscar</button>
			</div>
		</form>
	</div>
	<div class="row">
		<form method="get"
			action="${pageContext.request.contextPath}/buscarExistencia">
			<div class="input-field col s7">
				<label for="amount">Cantidad de existencias:</label> <input
					id="amount" name="amount" class="input-field" type="number" min="1"
					required />
			</div>
			<div class="col s2">
				<button type="submit"
					class="btn btn-small blue white-text waves-effect z-depth-1 y-depth-1 centered"
					value="Buscar">Buscar</button>
			</div>
		</form>
	</div>
	<div class="row">
		<form action="${pageContext.request.contextPath}/buscarTodos"
			method="get">
			<button type="submit"
				class="btn btn-small blue white-text waves-effect z-depth-1 y-depth-1 centered"
				value="Ver todos">Ver todos</button>
		</form>
	</div>
</body>
</html>