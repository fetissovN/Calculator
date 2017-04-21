<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<s:form method="post" commandName="loginForm" action="login">
        <legend>Login</legend>
        <table>
            <tr>
                <td>Username</td>
                <td><s:input path="username"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><s:password path="password"/></td>
            </tr>
            <tr>
                <td>Remember me?</td>
                <td><input type="checkbox" name="remember" value="1"></td>
            </tr>
            <tr>
                <td><input class="button" type="submit" value="Login"/></td>
            </tr>
        </table>
</s:form>

</body>
</html>
