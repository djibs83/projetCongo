<%-- <%response.sendRedirect("centres/liste"); %> --%>

<html>
<head>
<title>CONGO</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>

<body>
<div id="header">
	<h2>CONGO</h2>
</div>
	<h2>
		<a href="${pageContext.request.contextPath}/centres/liste">Gestion
			des centres CONGO</a>
	</h2>
	
	<h2>
		<a href="${pageContext.request.contextPath}/produits/liste">Catalogue de produits</a>
	</h2>
	
	<h2>
		<a href="${pageContext.request.contextPath}/drones/liste">Gestion drones</a>
	</h2>

</body>

</html>