<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="classes.Candidat"%>
<%@page import="classes.Formation"%>

<!DOCTYPE html>
<html>
<head>
<%
	ResultSet rs;
Formation f = new Formation();
rs = f.listFormation();

Candidat current = new Candidat();
if (session.getAttribute("cuser") == null)
	response.sendRedirect("index.jsp");
else {
	current = (Candidat) session.getAttribute("cuser");
}
%>
<meta charset="ISO-8859-1">
<title>Gestion des formations</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-sm"></div>
			<div class="col-sm">
				<form method="post" action="FormationServlet">
					<p>
					<h1>Gestion des formation</h1>
					</p>

					<div class="mb-3">
						<label for="title" class="form-label">titre </label> <input
							type="text" required name="titre" class="form-control" id="title">
					</div>
					<div class="mb-3">
						<label for="formateur" class="form-label">Formateur </label> <input
							type="text" required name="formateur" class="form-control"
							id="formateur">
					</div>
					<div class="mb3">
						<label for="description" class="form-label">Description</label>
						<textarea class="form-control" required name="description"
							id="description"></textarea>

					</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>

				</form>
				<br>
				<br>
				<%
					if (request.getAttribute("erreur") != null) {
				%>
				<span class="badge bg-danger"><%=request.getAttribute("erreur")%></span>
				<%
					}
				%>
			</div>
			<div class="col-sm"></div>
		</div>
	</div>

	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Titre</th>
				<th>Formateur</th>
				<th>Desciption</th>
				<th>Action
			</tr>
		</thead>
		<tbody>
			<%
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("titre")%></td>
				<td><%=rs.getString("formateur")%></td>
				<td><%=rs.getString("description")%></td>
				<td></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>