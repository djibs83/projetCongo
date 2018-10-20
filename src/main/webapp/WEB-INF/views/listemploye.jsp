<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
<title>Liste des Employes</title>

<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<div id="container">
				<div id="form">
					<!-- <f:form action="addEmploye" modelAttribute="employe" method="post"
						enctype="multipart/form-data"> -->


						<table>
							<tr>
								<td><input type="submit" value="Ajouter un employé"
									onclick="window.location.href='addemploye'; return false;" /></td>
								<!--td><a href="editCategValide"><input type="button" value="Editer" /></a></td-->
							</tr>

						</table>
					<!-- </f:form> -->
				</div>
			</div>
		</div>
	</div>

	<div id="container">



		<div id="content">


			<h2>Liste des Employes</h2>
			<table>
				<tr>
					<th>IdEmploye</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Login</th>
					<th>Fonction</th>
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="employe" items="${employes}">
					<tr>
						<td>${employe.idEmploye}</td>
						<td>${employe.nomEmploye}</td>
						<td>${employe.prenomEmploye}</td>
						<td>${employe.login}</td>
						<td>${employe.fonction}</td>

					</tr>
				</c:forEach>

			</table>

		</div>

	</div>


</body>

</html>