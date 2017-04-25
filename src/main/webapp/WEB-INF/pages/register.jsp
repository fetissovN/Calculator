<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="label.reg.reg"/></title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/foundation.min.css"/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/foundation.css"/> ">
    <style type="text/css">
        span.error {
            color: red;
        }
    </style>
</head>
<body>
<div class="row">

    <div class="large-4 column"><!-- ... --></div>
    <div class="large-4 large-centered column">
        <s:form method="post" commandName="user" action="do.reg">
            <div align="center">
                <legend><spring:message code="label.reg.reg"/></legend>
                <p align="center">
            <span style="float: inherit">
                <a href="?lang=en">en</a>
                |
                <a href="?lang=ru">ru</a>
            </span>
                </p>
            </div>
            <table>
                <tr>
                    <td><p><spring:message code="label.username"/></p></td>
                    <td><s:input path="usernameReg"/></td>
                    <td><span class="error"><s:errors path="usernameReg" /></span></td>
                </tr>
                <tr>
                    <td><p><spring:message code="label.reg.email"/></p></td>
                    <td><s:input path="emailReg"/></td>
                    <td><span class="error"><s:errors path="emailReg" /></span></td>
                </tr>
                <tr>
                    <td><p><spring:message code="label.password"/></p></td>
                    <td><s:password path="passwordReg"/></td>
                    <td><span class="error"><s:errors path="passwordReg" /></span></td>
                </tr>
                <tr>
                    <td><p><spring:message code="label.password.check"/></p></td>
                    <td><s:password path="passwordRegCheck"/></td>
                    <td><span class="error"><s:errors
                            path="passwordRegCheck" /></span></td>
                </tr>
                <tr>
                    <td><input class="button" type="submit" value="Ok"/></td>
                </tr>
            </table>
        </s:form>
    </div>
    <div class="large-4 columns"><!-- ... --></div>
</div>


</body>
</html>
