<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Catalogue de produits CONGO</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/style.css" />

</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>Catalogue de produits CONGO</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<table>
				<tr>
					<th>ID</th>
					<th>Designation</th>
					<th>Description</th>
					<th>Poids</th>
					<th>Action</th>
					
				</tr>
				
				
				<c:forEach var="tempProduit" items="${produits}">
				
				
				<c:url var="updateLink" value="/produits/formUpdateProduit">
					<c:param name="idProduit" value="${tempProduit.idProduit}" />
				</c:url>
				
				<c:url var="deleteLink" value="/produits/delete">
					<c:param name="idProduit" value="${tempProduit.idProduit}" />
				</c:url>
				
					<tr>
						<td> ${tempProduit.idProduit} </td>
						<td> ${tempProduit.designation} </td>
						<td> ${tempProduit.description} </td>
						<td> ${tempProduit.poidsProduit} </td>
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
		<a href="${pageContext.request.contextPath}/produits/formAddProduit">Ajouter un produit</a>
			</h3>

</body>

</html>