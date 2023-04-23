<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page isELIgnored ="false" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Join Us</title>
</head>
<body>
	<div class="container mt-5">
	 <h3 class="text-center"> ${head}</h3>
	 <h2 class="text-center"> ${desc} </h2>
		<form action="processform" method="post">
			<div class="form-group">
				<label for="username">User Name</label>
				 <input type="text"
					class="form-control" id="username" placeholder="Enter Your Name" name="userName">
			</div>

			<div class="form-group">
				<label for="email">Email address</label> 
				<input type="email"
					class="form-control" id="email"
					aria-describedby="emailHelp" placeholder="Enter email" name="userEmail">
			</div>

			<div class="form-group">
				<label for="Password">Password</label>
				 <input
					type="password" class="form-control" id="password"
					placeholder="Enter Password" name="userPassword">
			</div>

			<div class="form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<div class="container text-center">
			<button type="submit" class="btn btn-success ">Sign Up</button>
			</div>
		</form>
	</div>
	
	
	
	
	
	
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>