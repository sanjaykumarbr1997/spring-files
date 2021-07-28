<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicine Booking</title>
<h3>${ msg }</h3>
</head>
<body bgcolor="yellow">

	<form action="med.all" method="post">
	Name:<input type="text" name="name">
	Price:<input type="text" name ="price">
	Quantity:<input type="text" name = "quantity">
	Manufacturer:<input type="text" name="manufacturer">
	<input type="submit" value = "SUBMIT">
	
	
	
	</form>

</body>
</html>