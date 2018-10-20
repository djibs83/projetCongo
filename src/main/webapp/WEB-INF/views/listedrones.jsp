<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Liste des drones CONGO</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/style.css" />

</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>Drones CONGO</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<table>
				<tr>
					<th>ID</th>
					<th>Charge maximale</th>
					<th>Portée maximale</th>
					<th>Disponibilité</th>
					<th>Centre d'affectation</th>
					<th>Action</th>
				</tr>
				
				
				<c:forEach var="tempDrone" items="${drones}">
				
				
				<c:url var="updateLink" value="/drones/formUpdateDrone">
					<c:param name="idDrone" value="${tempDrone.idDrone}" />
				</c:url>
				
				<c:url var="deleteLink" value="/drones/delete">
					<c:param name="idDrone" value="${tempDrone.idDrone}" />
				</c:url>
				
					<tr>
						<td> ${tempDrone.idDrone} </td>
						<td> ${tempDrone.chargeMaxDrone} </td>
						<td> ${tempDrone.porteeMaxDrone} </td>
						<td> ${tempDrone.disponibiliteDrone} </td>
						<td> ${tempDrone.leCentre.idCentre} </td>
						
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
		<a href="${pageContext.request.contextPath}/drones/formAddDrone">Ajouter un drone</a>
			</h3>

</body>

</html>