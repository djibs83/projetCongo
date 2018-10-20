<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Nouveau drone</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/add-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Drones CONGO</h2>
		</div>
	</div>

	<div id="container">
		<h3>Ajouter un nouveau drone</h3>
	
		<form:form action="saveDrone" modelAttribute="formulaire"  method="POST">
		
		<%-- <form:hidden path="idDrone"/> --%>
		
		
			<table>
				<tbody>
					<tr>
						<td><label>Charge maximale en kg :</label></td>
						<td><form:input path="chargeMaxDrone" /></td>
					</tr>
				
					<tr>
						<td><label>Portée maximale en km :</label></td>
						<td><form:input path="porteeMaxDrone" /></td>
					</tr>
					<tr>
						<td><label>Disponibilité :</label></td>
						<td><form:input path="disponibiliteDrone" /></td>
					</tr>
					
					<tr>
						<td><label>Centre d'affectation :</label></td>
						<td><form:select path="idCentre">
						<c:forEach var="leCentre" items="${lescentres}">
         					<form:option value="${leCentre.idCentre}" label="${leCentre.idCentre}, ${leCentre.nomCentre}"/>
         				</c:forEach>
						</form:select>
						</td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Sauvegarder" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/drones/liste">Revenir à la liste</a>
		</p>
	
	</div>

</body>

</html>