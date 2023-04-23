<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Successfully</title>
</head>
<body>

<h1> Welcome, ${user.userName} </h1>
<h1>Mail : ${user.userEmail}</h1>
<h1> Your Pasword is ${user.userPassword} , Dont share with any one else </h1>

</body>
</html>