<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="classes.Inscription"%>


<%
	ResultSet rs;

Inscription f = new Inscription();
rs = f.afficheInscription();


%>
<!DOCTYPE html>
<html>
<head>
<%

int id=Integer.parseInt(request.getParameter("id"));


%>

<meta charset="ISO-8859-1">
<title>Inscriptions</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<% if(rs!=null)
{
		
		%>

<table class="table table-bordered">
		<thead>
			<tr>
				<th>Formation</th>
				<th>nom</th>
				<th>prenom</th>
				<th>Date</th>
			
			</tr>
		</thead>
		<tbody>
			<%
			
			while(rs.next())
			
			{
				if(rs.getInt("id_session")==id)
				{
			
			%>
			<tr>

				<td><%=rs.getString("titre") %></td>
				<td><%= rs.getString("nom") %></td>
				<td>
					<%= rs.getString("prenom") %>
				</td>
				<td><%= rs.getString("date_heure") %></td>
			


			</tr>
			<% 
				}
				} 
}
	
			%>
		</tbody>

	</table>
</body>
</html>