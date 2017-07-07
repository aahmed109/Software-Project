<%--
  Created by IntelliJ IDEA.
  User: graphics
  Date: 5/18/2017
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Homepage-Add, Remove, Modify Contents</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
    <script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-replace.js"></script>
    <script type="text/javascript" src="js/Molengo_400.font.js"></script>
    <script type="text/javascript" src="js/Expletus_Sans_400.font.js"></script>
    <!--[if lt IE 9]-->
    <script type="text/javascript" src="js/html5.js"></script>
    <style type="text/css">.bg, .box2{behavior:url("js/PIE.htc");}</style>
    <!--[endif]-->
</head>
<body id = page5>

<div id = "body1">
    <div id="main">
        <nav>
            <ul id="menu">
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
        <header style="margin-left: 20%">
            <div class="wrapper">
                <div class="wrapper">
                    <h1 id = "logo">BUET OPEN COURSEWARE</h1>
                    <div id="slogan">We Will Open The World<span>of knowledge for you!</span></div>
                </div>
            </div>
        </header>
        <!-- / header -->
    </div>
</div>
<div class="body2">
    <div class="main">
        <!-- content -->
        <section id = "content">
            <div class="box1">
                <!--User Profile-->
                <div class="wrapper">
                    <h2 style="text-align: center">User Profile</h2>
                    <h3 style="padding-left: 20%">Name: </h3>
                    <h3 style="padding-left: 20%">Email: </h3>
                    <h3 style="padding-left: 20%">Institution: </h3>
                    <h3 style="padding-left: 20%">Profession: </h3>
                    <h3 style="padding-left: 20%">Gender: </h3>
                    <h3 style="padding-left: 20%">Country: </h3>
                    <h3 style="padding-left: 20%">District: </h3>
                    <h3 style="padding-left: 20%">Division: </h3>
                    <h3 style="padding-left: 20%">Road No: </h3>
                    <h3 style="padding-left: 20%">House No: </h3>
                    <h3 style="padding-left: 20%">Contact No: </h3>
                    <h3 style="padding-left: 20%">Date of Birth: </h3>
                    <h3 style="padding-left: 20%">Join Date: </h3>
                </div>
                <!--User Profile-->
                <div class="wrapper">
                    <article class="col1">
                        <div class="pad_left1">
                            <h2>Course List</h2>
                            <!--
                            show database list here
                            -->
                            <li><a href="${pageContext.request.contextPath}/upload.jsp">CSE 404</a></li>
                        </div>
                    </article>
                </div>
            </div>
        </section>
    </div>
</div>
</body>
</html>
