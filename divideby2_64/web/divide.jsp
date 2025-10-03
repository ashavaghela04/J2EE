<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Divisibility Check</title>
</head>
<body>

<h2>Check if a Number is Divisible by 2 (Using JSTL)</h2>

<form method="get">
    Enter a number: <input type="text" name="num" />
    <input type="submit" value="Check" />
</form>

<c:if test="${not empty param.num}">
    <c:set var="num" value="${param.num}" />

    <c:choose>
        <c:when test="${num % 2 == 0}">
            <p><strong>${num}</strong> is <span style="color:green;">divisible by 2</span>.</p>
        </c:when>
        <c:otherwise>
            <p><strong>${num}</strong> is <span style="color:red;">not divisible by 2</span>.</p>
        </c:otherwise>
    </c:choose>
</c:if>

</body>
</html>
