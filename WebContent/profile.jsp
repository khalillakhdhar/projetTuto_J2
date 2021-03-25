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


<h1>Bienvenu <%=current.getNom()+" "+ current.getPrenom()  %></h1>
</body>
</html>