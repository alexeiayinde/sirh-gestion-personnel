<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="dev.sgp.entite.Departement"%>
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
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="<c:url value="lister"/>">Collaborateurs</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="<c:url value="../statistiques"/> ">Statistiques</a></li>
	</ul>

	<div class="container">
		<div class="m-1">
			<div class="row justify-content-end">
				<a href="<c:url value='nouveau'/>"
					class="btn btn-secondary btn-lg active" role="button"
					aria-pressed="true">Ajouter un nouveau collaborateur</a>
			</div>
		</div>
	</div>

	<h2 class="mt-3 ml-5 mb-5">Les collaborateurs</h2>

	<div class="container-fluid">
		<form>
			<div class="row ml-3">
				<div class="col-3">
					<label for="rechercher">Rechercher un nom ou un prénom qui
						commence par : </label>
				</div>
				<div class="col-2">
					<input type="text" class="form-control" name="rechercher"
						id="rechercher">
				</div>
				<div class="col-2">
					<button type="submit" class="btn btn-primary mb-2">Rechercher</button>
				</div>
				<div class="col">
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck1"> <label class="custom-control-label"
							for="customCheck1">Voir les collaborateurs désactivés</label>
					</div>
				</div>
			</div>
			<div class="row ml-3">
				<div class="col-3">
					<label for="filtreRechercher">Filtrer par département : </label>
				</div>

				<div class="col-2">
					<select class="custom-select" name="filtreRechercher"
						id="filtreRechercher">
						<option selected value="0">Tous</option>
						<c:forEach items='${listeDeparts}' var='d'>
							<option value="<c:out value='${d.id}'/>"><c:out
									value='${d.nom}' /></option>
						</c:forEach>
					</select>
				</div>
			</div>
		</form>
	</div>

	<br />

	<div class="container-fluide">
		<div class="row justify-content-center">

			<c:forEach items="${listeCollabs}" var="p">
				<div class="col-3 ml-2">
					<div class="card mb-3" style="max-width: 540px;">
						<div class="card-header">
							<c:out value="${p.nom}" />
							<c:out value="${p.prenom}" />
						</div>
						<div class="row no-gutters">
							<div class="col-md-4">
								<div class="m-2">
									<img src="<c:url value='${p.photo}'/>" class="card-img"
										alt="photoID">
								</div>
							</div>
							<div class="col-md-8">
								<div class="card-body">
									<div class="row">
										<div class="col">
											<p>
												Fonction <br />Département <br />Email <br />Téléphone
											</p>
										</div>
										<div class="col">
											<p>
												? <br />? <br />? <br />?
											</p>
										</div>
									</div>

								</div>
							</div>
						</div>
						<div class="d-flex justify-content-end m-1">
							<a href="<c:url value='editer?matricule=${p.matricule}'/>"
								class="btn btn-light" role="button" aria-pressed="true">Editer</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

	</div>
</body>


</html>