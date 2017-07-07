<%--
  Created by IntelliJ IDEA.
  User: Ahmed
  Date: 15/05/2017
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department of Biomedical Engineering</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
    <script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-replace.js"></script>
    <script type="text/javascript" src="js/Molengo_400.font.js"></script>
    <script type="text/javascript" src="js/Expletus_Sans_400.font.js"></script>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="js/html5.js"></script>
    <style type="text/css">.bg, .box2{behavior:url("js/PIE.htc");}</style>
    <![endif]-->
</head>
<body id = "page1">
<div id="body1">
    <div id="main">
        <nav>
            <ul id="menu">
                <!--div id = "some">
                <!--li class = "drop"><a href="#">Departments</a></li-->
                <div class = "dropdown">
                    <button class="dropbtn">Departments</button>
                    <div class="dropdown_content">
                        <a href="${pageContext.request.contextPath}/chem.html">Chemical Engineering</a>
                        <a href="${pageContext.request.contextPath}/mme.html">Materials & Metallurgical Engineering</a>
                        <a href="${pageContext.request.contextPath}/ce.html">Civil Engineering</a>
                        <a href="${pageContext.request.contextPath}/wre.html">Water Resources Engineering</a>
                        <a href="${pageContext.request.contextPath}/me.html">Mechanical Engineering</a>
                        <a href="${pageContext.request.contextPath}/name.html">Naval Architecture & Marine Engineering</a>
                        <a href="${pageContext.request.contextPath}/ipe.html">Industrial & Production Engineering</a>
                        <a href="${pageContext.request.contextPath}/eee.html">Electrical & Electronic Engineering</a>
                        <a href="${pageContext.request.contextPath}/cse.html">Computer Science & Engineering</a>
                        <a href="${pageContext.request.contextPath}/bme.html">Biomedical Engineering</a>
                        <a href="${pageContext.request.contextPath}/arch.html">Architecture</a>
                        <a href="${pageContext.request.contextPath}/urp.html">Urban & Regional Planning</a>
                    </div>
                </div>
                <div class = "dropdown">
                    <button class="dropbtn">About</button>
                    <div class="dropdown_content">
                        <a href="#">About Us</a>
                        <a href="#">About BUET</a>
                    </div>
                </div>
            </ul>
        </nav>
        <!-- header -->
        <header style="margin-left: 10%">
            <div class="wrapper">
                <div class="wrapper">
                    <h1 id = "logo"></h1>
                    <h1 style="font-family: Lucida Bright,serif; color: white; font-size: 40px">BIOMEDICAL ENGINEERING</h1>
                    <div id="slogan"></div>
                </div>
            </div>
        </header>
        <!-- header -->
    </div>
</div>
</body>
</html>
