<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<p><spring:message code="label.menu"></spring:message>

<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="resources/startbootstrap-creative-gh-pages/css/creative.min.css">
</head>
<div class="body">
<a class="btn btn-primary" href=users.html>Users</a>
<br>
<a class="btn btn-primary" href=address.html>Addresses</a>
<br>
<a class="btn btn-primary" href="userRole.html"><spring:message code="label.role"/></a>
</div>