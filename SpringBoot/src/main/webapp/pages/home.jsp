<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
<!--  Here we are directly accessing attributes. 		URI: http://localhost:8080/home?fname=karthik&lname=g
Welcome to Spring Boot ${fname} ${lname}	-->

<!--  Here we are accessing object. 					URI: http://localhost:8080/homepage?pid=10&pname=karthik&language=java -->
Welcome to Spring Boot : ${obj.pid} ${obj.pname} ${obj.language}

</body>
</html>