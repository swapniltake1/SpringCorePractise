<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>

<h1> Hiieee This is help page ...</h1>

<%
String name= (String ) request.getAttribute("name");
Integer rollnumber= (Integer ) request.getAttribute("rollnumber");

%>

<h1>  Hello My name is <%=name %></h1>
<h1> My ROllnumber is <%=rollnumber %></h1>
</body>
</html>