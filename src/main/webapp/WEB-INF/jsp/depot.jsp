<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cr&eacute;ation STB</title>
</head>
<body>
	<form:form method="post" modelAttribute="stb" action="${userActionUrl}">
		<table>
			<tr>
				<td>Titre:</td>
				<td><form:input path="titre" /></td>
			</tr>
			<tr>
				<td>Version:</td>
				<td><form:input path="version" /></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><form:textarea path="description" rows="3" cols="20" /></td>
			</tr>
				<td>Equipe</td>
				<td> Nom <form:input path="description" rows="3" cols="20" />
				<br> Prenom
				</td>
			<tr>
			
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>