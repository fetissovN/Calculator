<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1>${message}</h1>
    <%--<form name='f' action="count" method='POST'>--%>
	    <%--<input type='text' name='digit1' value=''>--%>
	    <%--<input type='text' name='digit2' value=''>--%>
        <%--<input name="plus" type="submit" value="plus"/>--%>
        <%--<input name="minus" type="submit" value="minus"/>--%>
        <%--<input name="mult" type="submit" value="multiply"/>--%>
        <%--<input name="divide" type="submit" value="divide"/>--%>

    <%--</form>--%>

    <a href="/calc/3/5">link</a>
    <c:if test="${not empty res}">
        ${res}
    </c:if>
    <form:form name="f" action="count" method="get" commandName="MyForm">
        <form:input path="a"/>
        <form:input path="b"/>
        <input name="plus" type="submit" value="plus"/>
        <%--<input name="minus" type="submit" value="minus"/>--%>
        <%--<input name="mult" type="submit" value="multiply"/>--%>
        <%--<input name="divide" type="submit" value="divide"/>--%>
    </form:form>

    <%--<p>${res}</p>--%>
</body>
</html>