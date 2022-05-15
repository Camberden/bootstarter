<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Submit new Alien data!</p>
	<form action="addAlien">
		<input type="text" name="aid"><br> 
		<input type="text" name="aname"><br> 
			<input type="submit"><br>
	</form>

<p>Search Alien based on ID</p>
	<form action="getAlien">
		<input type="text" name="aid"><br> 
		<input type="submit"><br>

	</form>

</body>
</html>