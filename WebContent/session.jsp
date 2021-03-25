<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="classes.Candidat"%>
<%@page import="classes.Formation"%>
<%@page import="classes.Session"%>
<!DOCTYPE html>
<html>
<head>
<%
	ResultSet rs;
String grade="";
Formation f = new Formation();
rs = f.listFormation();

ResultSet r;
Session ses = new Session();
r = ses.afficheSession();

Candidat current = new Candidat();
if (session.getAttribute("cuser") == null)
	response.sendRedirect("index.jsp");
else {
	current = (Candidat) session.getAttribute("cuser");
	 grade=current.getGrade();
}
%>


<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-sm"></div>
			<div class="col-sm">
				<form method="post" action="SessionServlet">
					<p>
					<h1>Gestion des Session</h1>
					</p>

					<div class="mb-3">
						<label for="formation" class="form-label">formation </label>
						<!--  input
							type="text" required name="formation" class="form-control"
							id="formation"-->
						<select name="formation" class="form-control">
							<%
								while (rs.next()) {
							%>

							<option value="<%=rs.getInt("id")%>"><%=rs.getString("titre")%></option>
							<%
								}
							%>
						</select>
					</div>
					<div class="mb-3">
						<label for="duree" class="form-label">durée </label> <input
							type="number" min="3" required name="duree" class="form-control"
							id="duree">
					</div>
					<div class="mb-3">
						<label for="date" class="form-label">Date </label> <input
							type="date" required name="date" class="form-control" id="date">
					</div>
					<div class="mb-3">
						<label for="prix" class="form-label">Prix </label> <input
							type="number" required name="prix" min="1" class="form-control"
							id="prix">
					</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>

				</form>

				<br> <br>
				<%
					if (request.getAttribute("message2") != null) {
				%>
				<span class="badge bg-danger"><%=request.getAttribute("message2")%></span>
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
				<th>Formation</th>
				<th>Description</th>
				<th>formateur</th>
				<th>prix</th>
				<th>date</th>
				<th>durée</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<% while(r.next())
			{%>
			<tr>

				<td><%=r.getString("titre") %></td>
				<td><%= r.getString("description") %></td>
				<td>
					<%= r.getString("formateur") %>
				</td>
				<td><%=r.getFloat("prix") %></td>
				<td><%= r.getString("date") %></td>
				<td><%= r.getInt("duree") %></td>
				<td>
				<a href="SessionServlet?id=<%=r.getInt("id")%> "
					class="btn btn-danger">Supprimer</a>&nbsp;&nbsp;&nbsp; <a
					href="InscriptionServlet?id=<%=r.getInt("id")%> "
					class="btn btn-success">S'inscrire</a>&nbsp;&nbsp;&nbsp; <a
					href="inscriptions.jsp?id=<%=r.getInt("id")%> "
					class="btn btn-info">&nbsp;voir list</a></td>


			</tr>
			<% } %>
		</tbody>

	</table>


</body>
</html>