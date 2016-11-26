<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>

<html>
<head>


    
<title>Home</title>


 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="resources/startbootstrap-creative-gh-pages/css/creative.min.css">


</head>


<body>
	<div id="content"></div>
	<meta name="viewport" content="width=device-width, initial-scale=1"><a></a>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">My website</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-left">
				<li class="active"><a href="#">Home</a></li>
				<li class="active"><a href="admin.html">Admin page</a></li>
				<li class="active"><a href="users.html">User</a></li>

			</ul>
		</div>
		
	</nav>
	
	<header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 id="homeHeading">Welcome to my website</h1>
            </div>
        </div>
    </header>


	<section class="bg-dark">
		<div class="container">
			<div class="row">
				<h1>See our hello page!</h1>
				<div class="col-*-*">

					<a class="btn btn-default" href="hello.html">Go to hello page</a>

				</div>
			</div>
		</div>
	</section>

	<section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">We've got what you need!</h2>
                    <hr class="light">
                    <p class="text-faded">The users view allows you to register or edit a user!</p>
                    <a href="users.html" class="page-scroll btn btn-default btn-xl sr-button">Preview users!</a>
                </div>
            </div>
        </div>
    </section>


</body>
</html>
