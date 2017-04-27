<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<body>
<jsp:include page="bar.jsp"/>
	<h1 align="center" style="color: greenyellow">Hi ${user.getUsernameReg()}, try to do some math! </h1>
    <div align="center">
        <p>${name}</p>
        <br>
    <form:form name="f" action="count" method="post" commandName="form">
        <form:input path="a"/>
        <span class="error"><form:errors path="a"/></span>
        <form:input path="b"/><br>
        <span class="error"><form:errors path="b"/></span>
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