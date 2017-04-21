<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<jsp:include page="bar.jsp"/>
	<h1>${message}</h1>
    <%--<form name='f' action="count" method='POST'>--%>
	    <%--<input type='text' name='digit1' value=''>--%>
	    <%--<input type='text' name='digit2' value=''>--%>
        <%--<input name="plus" type="submit" value="plus"/>--%>
        <%--<input name="minus" type="submit" value="minus"/>--%>
        <%--<input name="mult" type="submit" value="multiply"/>--%>
        <%--<input name="divide" type="submit" value="divide"/>--%>

    <%--</form>--%>

    <%--<a href="/calc/3/5">link</a>--%>

    <div align="center">
        <br>
    <form:form name="f" action="count" method="post" commandName="MyForm">
        <form:input path="a"/>
        <form:input path="b"/><br>
        <input class="button" name="plus" type="submit" value="plus"/><br>
        <input class="button" name="minus" type="submit" value="minus"/><br>
        <input class="button" name="mult" type="submit" value="multiply"/><br>
        <input class="button" name="divide" type="submit" value="divide"/><br>
    </form:form>

        <c:if test="${not empty res}">
            <div style="color: lightseagreen">
                <h3>Result:</h3>
                    ${res}
            </div>

        </c:if>
    </div>
    <%--<p>${res}</p>--%>
</body>
</html>