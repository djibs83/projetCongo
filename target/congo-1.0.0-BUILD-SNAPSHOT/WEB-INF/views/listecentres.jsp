<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Liste des centres</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/style.css" />

</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>Centres de stockage et de livraison CONGO</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<table>
				<tr>
					<th>ID</th>
					<th>Nom</th>
					<th>Adresse</th>
					<th>Ville</th>
					<th>Code postal</th>
					<th>Pays</th>
					<th>Latitude</th>
					<th>Longitude</th>
					<th>Action</th>
					
				</tr>
				
				
				<c:forEach var="tempCentre" items="${centres}">
				
				
				<c:url var="updateLink" value="/centres/formUpdateCentre">
					<c:param name="idCentre" value="${tempCentre.idCentre}" />
				</c:url>
				
				<c:url var="deleteLink" value="/centres/delete">
					<c:param name="idCentre" value="${tempCentre.idCentre}" />
				</c:url>
				
					<tr>
						<td> ${tempCentre.idCentre} </td>
						<td> ${tempCentre.nomCentre} </td>
						<td> ${tempCentre.adresseCentre} </td>
						<td> ${tempCentre.villeCentre} </td>
						<td> ${tempCentre.codePostalCentre} </td>
						<td> ${tempCentre.paysCentre} </td>
						<td> ${tempCentre.latitudeCentre} </td>
						<td> ${tempCentre.longitudeCentre} </td>
						<td><a href="${deleteLink}" onclick="if(!(confirm('Validez la suppression'))) return false">Supprimer</a>
						|
						<a href="${updateLink}">Mettre à jour</a>
						</td>						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
			<h3>
		<a href="${pageContext.request.contextPath}/centres/formAddCentre">Ajouter un centre</a>
			</h3>

</body>

</html>