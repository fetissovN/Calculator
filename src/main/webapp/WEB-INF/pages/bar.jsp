<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Николай
  Date: 21.04.2017
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bar</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css"/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css"/> ">
    <script src="<c:url value="/resources/js/script.js"/> "></script>
</head>
<body>
<div id="wrapper">
    <%--<h1><strong>ClearNav</strong> responsive navigation</h1>--%>
    <nav role="navigation" id="access">
        <a class="skip-link icon-reorder" title="Accéder au menu" href="#menu">Menu</a>
        <ul id="menu">
            <li class="active"><a class="icon-home" href="#accueil">Home</a></li><!-- whitespace
                --><li><a class="icon-group" href="#quisommesnous">About</a></li><!-- whitespace
                --><li><a class="icon-envelope-alt" href="/logout">Log out</a></li>
        </ul>
    </nav>
</div>
</body>
</html>
