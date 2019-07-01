<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>SGP - APP</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css" />
</head>

<body>
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active" href="#">Collaborateurs</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="#">...</a>
		</li>

	</ul>
	<h2 class="mt-3 ml-5">Nouveau collaborateur</h2>

	<div class="container-fluide">
		<form method="post" class="needs-validation" novalidate>
			<div class="row justify-content-center mt-4">
				<div class="col-2">
					<label for="nom">Nom </label>
				</div>
				<div class="col-3">
					<input type="text" class="form-control" name="nom" id="nom" required>
					<div class="invalid-feedback">Le nom est obligatoire</div>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-2">
					<label for="prenom">Prénom </label>
				</div>
				<div class="col-3">
					<input type="text" class="form-control" name="prenom" id="prenom" required>
					<div class="invalid-feedback">Le prénom est obligatoire</div>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-2">
					<label for="dateNaissance">Date de naissance </label>
				</div>
				<div class="col-3">
					<input type="date" class="form-control" name="dateNaissance" id="dateNaissance" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire</div>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-2">
					<label for="adresse">Adresse </label>
				</div>
				<div class="col-3">
					<textarea class="form-control" name="adresse" id="adresse" rows="3" required></textarea>
					<div class="invalid-feedback">L'adresse est obligatoire</div>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-2">
					<label for="securiteSociale">Numéro de sécurité sociale (15 chiffres) </label>
				</div>
				<div class="col-3">
					<input type="text" class="form-control" name="securiteSociale" id="securiteSociale" maxlength="15" minlength="15" pattern="[0-9]{15}" placeholder="n° de sécurité sociale" required>
					<div class="invalid-feedback">Le numéro de sécurité sociale
						est obligatoire</div>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-2"></div>
				<div class="col-3">
					<button class="btn btn-primary" type="submit">Créer</button>
				</div>
			</div>
		</form>
		<script>
			// Example starter JavaScript for disabling form submissions if there are invalid fields
			(function() {
				'use strict';
				window
						.addEventListener(
								'load',
								function() {
									// Fetch all the forms we want to apply custom Bootstrap validation styles to
									var forms = document
											.getElementsByClassName('needs-validation');
									// Loop over them and prevent submission
									var validation = Array.prototype.filter
											.call(
													forms,
													function(form) {
														form
																.addEventListener(
																		'submit',
																		function(
																				event) {
																			if (form
																					.checkValidity() === false) {
																				event
																						.preventDefault();
																				event
																						.stopPropagation();
																			}
																			form.classList
																					.add('was-validated');
																		},
																		false);
													});
								}, false);
			})();
		</script>
	</div>

</body>


</html>