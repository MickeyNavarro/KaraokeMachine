<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Karaoke Song</title>
</head>
<body>
<div> 
	<h2>Now playing: ${song.Title} by ${song.Artist} }</h2>
	<p>${song.YoutubeLink}</p>
</div>
</body>
</html>