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
		<input type="text" name="aid"><br> <input type="submit"><br>
	</form>


	<%!String d = new java.util.Date().toString();%>
	<p>
		Showing full string value:
		<%=d%>
	</p>
	<%!Character c = new java.util.Date().toString().charAt(8);%>
	<p>
		Showing char value:
		<%=c%>
	</p>

	<%
		if (c == '0') {
	%>
	<div>It's a single digit day!</div>
	<%
		} else {
	%>
	<p>It's a double digit day!</p>
	<%
		}
	%>

	<p>
		<span id="gotten">${c}</span>
	</p>

	<script src="action.js"></script>

</body>
</html>