<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Leap Year Checker</title>
</head>
<body>

<h2>Check Leap Year using JSTL</h2>

<form method="get">
    Enter Year: <input type="text" name="year" />
    <input type="submit" value="Check" />
</form>

<c:if test="${not empty param.year}">
    <c:set var="year" value="${param.year}" />
    
    <!-- Check leap year logic using JSTL -->
    <c:choose>
        <c:when test="(${year % 4 == 0} and ${year % 100 != 0}) or (${year % 400 == 0})">
            <p><b>${year}</b> is a <span style="color:green;">leap year</span>.</p>
        </c:when>
        <c:otherwise>
            <p><b>${year}</b> is <span style="color:red;">not a leap year</span>.</p>
        </c:otherwise>
    </c:choose>
</c:if>

</body>
</html>
