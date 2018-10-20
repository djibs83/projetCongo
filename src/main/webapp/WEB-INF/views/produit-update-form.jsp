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
			<h2>Catalogue de produits CONGO</h2>
		</div>
	</div>

	<div id="container">
		<h3>Mettre à jour les informations</h3>
	
		<form:form action="updateProduit" modelAttribute="produit" method="POST">
		
		<form:hidden path="idProduit"/>
		
			<table>
				<tbody>
					<tr>
						<td><label>Designation:</label></td>
						<td><form:input path="designation" /></td>
					</tr>
				
					<tr>
						<td><label>Description:</label></td>
						<td><form:input path="description" /></td>
					</tr>

					<tr>
						<td><label>Poids en kg:</label></td>
						<td><form:input path="poidsProduit" /></td>
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
			<a href="${pageContext.request.contextPath}/produits/liste">Revenir à la liste</a>
		</p>
	
	</div>

</body>

</html>