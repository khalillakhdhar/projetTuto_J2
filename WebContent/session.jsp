<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="classes.Candidat"%>
<%@page import="classes.Formation"%>
<%@page import="classes.Session" %>
<!DOCTYPE html>
<html>
<head>
<%
ResultSet rs;

Formation f = new Formation();
rs = f.listFormation();
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
						<label for="formation" class="form-label">formation </label> <!--  input
							type="text" required name="formation" class="form-control"
							id="formation"-->
							<select name="formation" class="form-control">
							<% while(rs.next())
							{
								%>
								
								<option value="<%=rs.getInt("id") %>"><%= rs.getString("titre") %></option>
								<% } %>
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

				<br>
				<br>
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


</body>
</html>