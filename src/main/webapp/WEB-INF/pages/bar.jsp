<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
<%--<div style="float: right; margin-right: 50px">--%>
    <a style="float: right; margin-right: 50px" href="?lang=en">en</a>
    |
    <a style="float: right; margin-right: 50px" href="?lang=ru">ru</a>
<%--</div>--%>
    <nav role="navigation" id="access">
        <a class="skip-link icon-reorder" title="Accéder au menu" href="#menu">Menu</a>
        <ul id="menu">
            <li class="active"><a class="icon-home" href="#accueil"><spring:message code="label.bar.1"/></a></li><!-- whitespace
                --><li><a class="icon-group" href="#quisommesnous"><spring:message code="label.bar.2"/></a></li><!-- whitespace
                --><li><a class="icon-envelope-alt" href="/logout"><spring:message code="label.bar.3"/></a></li>
        </ul>
    </nav>
</div>
</body>
</html>
