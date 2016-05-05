<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><%@taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Liste STB</title>
</head>
<body>
	

	<c:choose>
		<c:when test="${not empty stbs}">
			<table width=80%; align="left">
				<tr>
					<th>Titre</th>
					<th>Id</th>
					<th>Version</th>
					<th>Date</th>
					<th>Description courte</th>
				</tr>

				<c:forEach var="stb" items="${stbs}">

					<tr>
						<td align="center">${stb.titre}</td>
						<td align="center">${stb.id}</td>
						<td align="center">${stb.version}</td>
						<td align="center">${stb.date}</td>
						<td align="center">${stb.description}</td>
					</tr>
				</c:forEach>

			</table>
		</c:when>
		<c:otherwise>
		Il ny'a pas de STB / Une erreur est survenue
		</c:otherwise>
	</c:choose>
</body>
</html>