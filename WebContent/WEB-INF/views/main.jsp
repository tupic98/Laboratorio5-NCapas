<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Labo5</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/formData"
		method="POST" modelAttribute="students">
		<label>Ingrese el código del estudiante que quiere revisar: </label>
		<form:input type="text" name="cStudent" path="cStudent" />
		<br>
		<input type="submit" value="Buscar estudiante">
	</form:form>
</body>
</html>