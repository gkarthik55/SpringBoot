<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
<form action="addPerson">
	Enter the Person ID:<input type="text" name="personId"><br>
	Enter the Person Name:<input type="text" name="personName"><br>
	Enter the Technology:<input type="text" name="technology"><br>
	<input type="submit"><br>
</form>

<form action="getPerson">
	Enter the Person ID to Search:<input type="text" name="personId"><br>
	<input type="submit"><br>
</form>

</body>
</html>