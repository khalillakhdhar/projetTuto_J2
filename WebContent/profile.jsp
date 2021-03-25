<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="classes.Candidat" %>
<!DOCTYPE html>
<html>
<head>
<%
Candidat current=new Candidat();
if(session.getAttribute("cuser")==null)
	response.sendRedirect("index.jsp");
else
{
 current=(Candidat) session.getAttribute("cuser");
}
%>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>



<div class="container">
  <div class="row">
    <div class="col-sm">
    </div>
    <div class="col-sm">
<form method="post" action="InscriptionServlet">
<h1>Bienvenu <%=current.getNom()+" "+ current.getPrenom()  %></h1>
<div class="mb-3">
    <label for="cnom" class="form-label">Nom </label>
    <input type="text" required  class="form-control" value="<%=current.getNom() %>" name="nom" id="cnom">
  </div>
  <div class="mb-3">
    <label for="prenom" class="form-label">Prenom </label>
    <input type="text" required  class="form-control" value="<%=current.getPrenom() %>" name="prenom" id="prenom">
  </div>
    <div class="mb-3">
    <label for="phone" class="form-label">téléphone </label>
    <input type="text" required name="tel" value="<%=current.getTel() %>"  class="form-control" id="phone">
  </div>
    <div class="mb-3">
    <label for="level" class="form-label">niveau </label>
    <select required name="niveau"  class="form-control" id="level">
    <option value="débutant">débutant</option>
    <option value="junior">junior</option>
    <option value="senior">senior</option>
    </select>
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1"  class="form-label">Email </label>
    <input type="email" name="mail" value="<%=current.getEmail() %>" class="form-control" id="exampleInputEmail1">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Mot de passe</label>
    <input type="password" required name="pass" class="form-control" id="exampleInputPassword1"><input type="hidden" name="id" value="<%=current.getId() %>">
  </div>
  <button type="submit" class="btn btn-primary">Modifier profile</button>
  
</form>
    </div>
    <div class="col-sm">

    </div>
  </div>
</div>
</body>
</html>