<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Création de compte</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm">
    </div>
    <div class="col-sm">
<form method="post" action="InscriptionServlet">
<p><h1>Inscription</h1></p>
<div class="mb-3">
    <label for="cnom" class="form-label">Nom </label>
    <input type="text" required  class="form-control" id="cnom">
  </div>
  <div class="mb-3">
    <label for="prenom" class="form-label">Prenom </label>
    <input type="text" required  class="form-control" id="prenom">
  </div>
    <div class="mb-3">
    <label for="phone" class="form-label">téléphone </label>
    <input type="text" required  class="form-control" id="phone">
  </div>
    <div class="mb-3">
    <label for="level" class="form-label">niveau </label>
    <select required  class="form-control" id="level">
    <option value="débutant">débutant</option>
    <option value="junior">junior</option>
    <option value="senior">senior</option>
    </select>
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email </label>
    <input type="email" class="form-control" id="exampleInputEmail1">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Mot de passe</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary">S'inscrire</button>
  <br><a href="index.jsp">Connexion</a>
</form>
    </div>
    <div class="col-sm">

    </div>
  </div>
</div>
</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</html>