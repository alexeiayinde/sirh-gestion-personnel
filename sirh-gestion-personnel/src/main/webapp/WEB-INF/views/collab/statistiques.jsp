<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>SGP - App</title>
<link rel="stylesheet"
	href="<c:url value='bootstrap-4.3.1-dist/css/bootstrap.css'/>" />
</head>

<body>
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link"
			href="<c:url value="/collaborateurs/lister"/>">Collaborateurs</a></li>
		<li class="nav-item"><a class="nav-link active"
			href="<c:url value="statistiques"/> ">Statistiques</a></li>
	</ul>

	<h2 class="mt-3 ml-5">Statistiques</h2> <br/>

	<div class="container">
		<table class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Chemin</th>
					<th scope="col">Nombre de visites</th>
					<th scope="col">Min (ms)</th>
					<th scope="col">Max (ms)</th>
					<th scope="col">Moyenne (ms)</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items='${statistiques}' var='s'>
					<tr>
						<td><c:out value="${s.chemin}"/></td>
						<td><c:out value="${s.nbreVisites}"/></td>
						<td><c:out value="${s.tempsExecutionMin}"/></td>
						<td><c:out value="${s.tempsExecutionMax}"/></td>
						<td><c:out value="${s.tempsExecutionMoyenne}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>

</html>
