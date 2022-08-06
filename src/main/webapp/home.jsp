<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='https://fonts.googleapis.com/css?family=Lora:400italic'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="styles.css" media="screen" />


<title>Spring Boot Testing Ground!</title>
</head>
<body>

	<h2>Spring Boot Testing Ground!</h2>
	<h4>Following guide by Telusko</h4>

	<p>Submit new Alien data!</p>
	<form method="post" id="submit" action="addAlien">
		<input type="text" name="aid"><br> <input type="text"
			name="aname"><br> <input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>

	<p>Search Alien based on ID</p>
	<form method="get" action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit"><br>
	</form>

	<p>Update Alien based on ID</p>

	<p>
		Showing time:
		<%=new java.util.Date().toString().substring(8, 10)%>th!
	</p>

	<p>
		<span id="gotten"></span>
	</p>

	<script src="action.js"></script>

</body>
</html>