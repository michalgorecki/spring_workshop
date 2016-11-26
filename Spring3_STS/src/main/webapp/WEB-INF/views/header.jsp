<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/header.css"/> "
	rel="stylesheet">
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<div class="header">
	<h1>
		<spring:message code="label.title"></spring:message>
	</h1>
	<a href="?appLang=pl"> <img
		src="<c:url value="/resources/images/pl_flag.png"/>" height="20px"
		width="20px">
	</a> <a href="?appLang=en"> <img
		src="<c:url value="/resources/images/en_flag.png"/>" height="20px"
		width="20px">
	</a>
</div>

