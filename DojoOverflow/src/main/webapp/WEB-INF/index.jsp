<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>QuestionsDashboard</title>
</head>
<body>
		<div id="container">
		<h1>QuestionsDashboard</h1>
		<table class="table table-striped table-bordered table-hover dark">
			<thead>
				<tr>
					<th scope="col">Question</th>
					<th scope="col">Tags</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Mark</td>
					<td>otto</td>
				</tr>
			</tbody>
		</table>
		<a href="/questions/new">
		<h3 class="shiftright">New Question</h3></a>
	</div>

</body>
</html>