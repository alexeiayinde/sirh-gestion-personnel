<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>SGP - App</title>
<link rel="stylesheet"
	href="<c:url value='../bootstrap-4.3.1-dist/css/bootstrap.css'/>" />
</head>

<body>
	<div class="container-fluid">
		<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="<c:url value="lister"/>">Collaborateurs</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="<c:url value="../statistiques"/> ">Statistiques</a></li>
	</ul>
	</div>
	


</body>

</html>