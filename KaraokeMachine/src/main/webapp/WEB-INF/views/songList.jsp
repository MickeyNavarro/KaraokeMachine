<!-- //Almicke Navarro 
//CST-323
//January 15, 2020 
//This is my own work.

//songList will output all the songs in the database-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song List</title>
</head>
<body>
<div class="container text-center">
	<h2>Song List</h2>
	<div class="table-responsive">
	<table class="table table-borderless table-dark" style="width:50%">
			<tr>
				<th><label>Song Title</label></th>
				<th><label>Artist</label></th>
				<th><label>Youtube Link</label></th>
			</tr>
			<c:forEach var = "song" items = "${songs}">
			<tr>
				<td><label>$song.Title</label></td>
				<td><label>$song.Artist</label></td>
				<td><label>$song.YoutubeLink</label></td>
			</tr>
			</c:forEach>
    </table>
	</div>
</div>
</body>
</html>