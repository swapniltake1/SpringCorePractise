<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored ="false" %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Help Page </title>
</head>
<body>

<h1> This is help page  </h1>
<h3><a href="#">Click here for contact us </a></h3>


<%
   String name =(String) request.getAttribute("Name");
		String address =(String) request.getAttribute("address");
%>

<h3> Hiii my name is <%=name %> And my address is <%=address %> this is get ny scriptlet tag </h3>
<br>
<h3> Hii this is my name : ${Name}</h3>
<h4> Time is now : ${time}</h4>
<hr>
<h4>My Marks is  </h4>

<c:forEach var="item" items="${marks}"> 
      <h4>${item}</h4>
</c:forEach>

</body>
</html>