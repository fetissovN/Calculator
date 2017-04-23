<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Николай
  Date: 23.04.2017
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div align="center">
<s:form method="post" commandName="registrationForm" action="reg">
    <legend><spring:message code="label.reg.reg"/></legend>
    <table>
        <p align="inherit">
            <span style="float: inherit">
                <a href="?lang=en">en</a>
                |
                <a href="?lang=ru">ru</a>
            </span>
        </p>
        <tr>
            <td><p><spring:message code="label.username"/></p></td>
            <td><s:input path="usernameReg"/></td>
        </tr>
        <tr>
            <td><p><spring:message code="label.reg.email"/></p></td>
            <td><s:input path="emailReg"/></td>
        </tr>
        <tr>
            <td><p><spring:message code="label.password"/></p></td>
            <td><s:password path="passwordReg"/></td>
        </tr>
        <tr>
            <td><p><spring:message code="label.password.check"/></p></td>
            <td><input type="password"></td>
        </tr>
        <tr>
            <td><input class="button" type="submit" value="Ok"/></td>
        </tr>
    </table>


</s:form>
</div>
</body>
</html>
