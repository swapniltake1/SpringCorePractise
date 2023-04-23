<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
<h1> Home Page </h1>
<h2> Hello World !!</h2>
<hr>
<%

  String name=(String) request.getAttribute("name");
       int id=(Integer)request.getAttribute("ID");
       
       List<String> friends=(List<String>)request.getAttribute("f");

%>
<h3> My name is <%=name %></h3>
<h2>My is is <%=id %></h2>

<h3>Pooja's Niknames are : </h3>
<%
for(String s:friends)
{ %>
<h2><%=s %></h2>	
	<% 
}
%>
</body>
</html>