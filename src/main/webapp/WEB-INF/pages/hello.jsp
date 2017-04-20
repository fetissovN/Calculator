<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>${message}</h1>
    <form name='f' action="count" method='POST'>
	    <input type='text' name='digit1' value=''>
	    <input type='text' name='digit2' value=''>
        <input name="plus" type="submit" value="plus"/>
        <input name="minus" type="submit" value="minus"/>
        <input name="mult" type="submit" value="multiply"/>
        <input name="divide" type="submit" value="divide"/>

    </form>
    <c:if test="${not empty res}">
        ${res}
    </c:if>

    <%--<p>${res}</p>--%>
</body>
</html>