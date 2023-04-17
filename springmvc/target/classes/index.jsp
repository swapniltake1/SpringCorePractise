<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>THis is home pageee</h1>
<h2> Called by controoler </h2>
<h3> url/home</h3>


<% 
 String name = (String)  request.getAttribute("name");
 Integer id = (Integer)  request.getAttribute("Id");                        
 // List<String> friend=(List<String>) request.getAttribute("f");
%>
 <h1> My Name is <%=name %></h1>
 <h2>  My ID is <%=id %></h2>


                  
</body>
</html>