<!-- //Almicke Navarro 
//CST-323
//January 14, 2020 
//This is my own work.

//Request will act as the form for players to input their request to add a new song to the database -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Request a Song</title>
</head>
<body>
<div class="container text-center">
	<h2>Request a Song</h2>
		<form:form method= "POST" modelAttribute="song" action="requestSuccess">
			<table> 
				<tr>
					<td>Artist:</td>
					<td><form:input path="artist"/></td>
				</tr>
				<tr>
					<td>Title:</td>
					<td><form:input path="title"/></td>
				</tr>
				<tr>
					<td>Youtube Link:</td>
					<td><form:input path="youtubeLink"/></td>
				</tr>
				<tr>
					<td colspan="2"> 
						<input type = "submit" value = "Submit"/>
					</td>
				</table>
		</form:form> 

</div>
</body>
</html>