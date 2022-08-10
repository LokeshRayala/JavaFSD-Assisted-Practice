<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> JSP </title>
</head>
<body>
<h1>Use Bean DEMO</h1>

<!-- id is the object of class -->
<jsp:useBean id="obj" class="jspUseBeanWeb.Student" scope="session"></jsp:useBean>

<h3>Value Before Set</h3>

<!-- let's call getter -->
ROLL NO:  <jsp:getProperty property="rollNo" name="obj"/><br>
NAME:  <jsp:getProperty property="name" name="obj"/><br>

<!--  let's call Setter  -->
<!-- name means usebean object -->
<jsp:setProperty property="rollNo" name="obj" value="21"/><br>
<jsp:setProperty property="name" name="obj" value="Lokesh Rayala"/><br>


<h3>Value After Set</h3>

<!-- let's call getter after set -->
ROLL NO:  <jsp:getProperty property="rollNo" name="obj"/><br>
NAME:  <jsp:getProperty property="name" name="obj"/><br>


<a href="next.jsp">Next Page</a>
</body>
</html>