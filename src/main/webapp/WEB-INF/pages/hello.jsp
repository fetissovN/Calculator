<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
        <input class="button" name="plus" type="submit" value="<spring:message code="label.plus"/>"/><br>
        <input class="button" name="minus" type="submit" value="<spring:message code="label.minus"/>"/><br>
        <input class="button" name="mult" type="submit" value="<spring:message code="label.mult"/>"/><br>
        <input class="button" name="divide" type="submit" value="<spring:message code="label.divide"/>"/><br>
    </form:form>

        <c:if test="${not empty res}">
            <div style="color: lightseagreen">
                <h3><spring:message code="label.result"/></h3>
                    ${res}
            </div>

        </c:if>
    </div>
    <%--<p>${res}</p>--%>
</body>
</html>