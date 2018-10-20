<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Mettre à jour</title>

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
			<h2>Centres de stockage et de livraison CONGO</h2>
		</div>
	</div>

	<div id="container">
		<h3>Mettre à jour les informations</h3>
	
		<form:form action="updateCentre" modelAttribute="centre" method="POST">
		
		<form:hidden path="idCentre"/>
		
			<table>
				<tbody>
					<tr>
						<td><label>Nom:</label></td>
						<td><form:input path="nomCentre" /></td>
					</tr>
				
					<tr>
						<td><label>Adresse:</label></td>
						<td><form:input path="adresseCentre" /></td>
					</tr>

					<tr>
						<td><label>Ville:</label></td>
						<td><form:input path="villeCentre" /></td>
					</tr>
					<tr>
						<td><label>Code postal:</label></td>
						<td><form:input path="codePostalCentre" /></td>
					</tr>
					<tr>
						<td><label>Pays:</label></td>
						<td><form:input path="paysCentre" /></td>
					</tr>
					
					<tr>
						<td><label>Latitude:</label></td>
						<td><form:input path="latitudeCentre" /></td>
					</tr>
					
					<tr>
						<td><label>Longitude:</label></td>
						<td><form:input path="longitudeCentre" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Mettre à jour" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/centres/liste">Revenir à la liste</a>
		</p>
	
	</div>

</body>

</html>