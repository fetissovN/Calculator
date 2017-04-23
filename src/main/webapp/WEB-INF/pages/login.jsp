<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title><spring:message code="label.formName"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div align="center">
<s:form method="post" commandName="loginForm" action="login">
        <legend><spring:message code="label.formName"/></legend>
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
                <td><s:input path="username"/></td>
            </tr>
            <tr>
                <td><p><spring:message code="label.password"/></p></td>
                <td><s:password path="password"/></td>
            </tr>
            <tr>
                <td>Remember me?</td>
                <td><input type="checkbox" name="remember" value="1"></td>
            </tr>
            <tr>
                <td><input class="button" type="submit" value="Ok"/></td>
            </tr>
            <%--<p><spring:message code="label.registration"/></p>--%>
            <%--<p><spring:message code="label.login"/></p>--%>
        </table>
</s:form>
<p><a style="text-underline: none" href="/reg/">Register if u aren't a bellend!</a></p>
</div>


</body>
</html>
