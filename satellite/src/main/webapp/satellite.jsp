<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Satellite Details</title>
<h3>${ msg }</h3>
</head>
<body bgcolor="cyan">

	<form action="sat.all" method="post">
	Name:<input type="text" name = "name">
	Launch Date:<input type="text" name="launchDate">
	Orbit Type: <input type="text" name = "orbitType">
	Application:<input type="text" name = "application">
	<input type="submit" value="SUBMIT" >
	

	</form>


</body>
</html>