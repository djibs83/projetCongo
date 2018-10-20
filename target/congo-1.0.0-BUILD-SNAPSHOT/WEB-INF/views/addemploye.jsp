<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<h2>Ajouter Employe CONGO</h2>
		</div>
	</div>

	<div id="container">
		<h3>Ajouter un Employe</h3>
	
		<form:form action="saveEmploye" modelAttribute="employe" method="POST">		
		<form:hidden path="idEmploye"/>
		
			<table>
				<tbody>
					<tr>
						<td><label>Nom:</label></td>
						<td><form:input path="nomEmploye" /></td>
					</tr>
					<tr>
						<td><label>Prénom:</label></td>
						<td><form:input path="prenomEmploye" /></td>
					</tr>
					<tr>
						<td><label>login:</label></td>
						<td><form:input path="login" /></td>
					</tr>
					<%-- <tr>
						<td><label>Fonction:</label></td>
						<td><form:input path="fonction" /></td>
					</tr> --%>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Sauvegarder" class="save" /></td>
					</tr>
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/employes/listemploye">Revenir à la liste</a>
		</p>
	
	</div>

</body>

</html>