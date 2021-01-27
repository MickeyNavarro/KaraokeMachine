<!-- //Almicke Navarro
//CST323
//January 17, 2021
//I used source from the following website:https://startbootstrap.com/theme/creative --> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS Stylesheet -->
        <link href="/WEB-INF/resources/style.css" rel="stylesheet" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
		<meta charset="UTF-8">
<title>Karaoke Song</title>
</head>
<body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">Karaoke Machine</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto my-2 my-lg-0">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="home">Home</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="songList">Song List</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="requestASong">Request a Song</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead">
            <div class="container h-100">
                <div class="row h-100 align-items-center justify-content-center text-center">
                    <div class="col-lg-10 align-self-end">
                        <h2 class="text-uppercase text-white">Now playing: </h2>
                        <h1 class="text-uppercase text-white font-weight-bold">${song.title}</h1>
                        <h2 class="text-uppercase text-white font-weight-bold">by ${song.artist}</h2>
                        <hr class="divider my-4" />
                    </div>
                    <div class="col-lg-8 align-self-baseline">
						<iframe width="560" height="315" src="${song.youtubeLink}" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <p class="text-white">If you cannot view this video, please visit ${song.youtubeLink} to sing your song!</p>
                </div>
            </div>
        </header>
        <!-- Footer-->
        <footer class="bg-light py-5">
            <div class="container"><div class="small text-center text-muted">By Almicke Navarro</div></div>
        </footer>
    </body>
</html>