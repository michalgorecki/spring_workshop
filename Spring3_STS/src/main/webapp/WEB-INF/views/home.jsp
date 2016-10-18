<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<spring:message code="label.hello"></spring:message>  
</h1> 

<P> Hi,
<br>The time on the server is ${serverTime}</P>
<a href="mgorecki/hello.html">Hello</a>

<a href="mgorecki/users.html">User</a>
</body>
</html>
