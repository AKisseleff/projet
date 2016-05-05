<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<c:if test="${empty stb}">
		Cette STB n'existe pas 
	</c:if>
	<c:if test="${not empty stb}">
		<dir>
			<li>Titre : ${stb.titre}</li>
			<li>ID : ${stb.id}</li>
			<li>Date : ${stb.date }</li>
			<li>Version : ${stb.version}</li>
			<li>Description : ${stb.description}</li>
			<li>Client :
				<dir>
					<li>Entit&eacute; : ${stb.client.entite}</li>
					<li>Contact : ${stb.client.contact}</li>
					<li>Code postal : ${stb.client.codePostal }</li>
				</dir>
			</li>
			<li>&Eacute;quipe :
				<dir>
					<c:forEach var="perso" items="${stb.equipe.personne}">
						<c:choose>
							<c:when test="${perso.gender == false}">
								<li>Mme ${perso.nom} ${perso.prenom}
							</c:when>
							<c:when test="${perso.gender == true }">
								<li>M ${perso.nom} ${perso.prenom}</li>
							</c:when>
						</c:choose>
						
					</c:forEach>
				</dir>
			</li>
			<li>Fonctionnalit&eacute;s:
				<dir>
					<c:forEach var="exiFonc" items="${stb.fonctionnalite}">
						<li>Descriptif : ${exiFonc.description}</li>
						<li>Priorit&eacute; : ${exiFonc.priorite}</li>
						<li>Exigences fonctionnelle</li>
						<dir>
							<c:forEach var="exi" items="${exiFonc.exigenceFonctionnelle}">
								<li>Identifiant : ${exi.identifiant}</li>
								<li>Priorit&eacute; : ${exi.priorite}</li>
								<li>But : ${exi.description}</li>
								<br />
							</c:forEach>
						</dir>
					</c:forEach>
				</dir>
			</li>
			<c:if test="${not empty stb.commentaire}">
			<li>Commentaire : ${stb.commentaire}</li>
			</c:if>
		</dir>
	</c:if>
</body>
</html>