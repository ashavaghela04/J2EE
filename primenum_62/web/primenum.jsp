<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Prime Numbers from 1 to 100</title>
</head>
<body>

<h2>Prime Numbers from 1 to 100 using JSTL</h2>

<p>
<c:forEach var="num" begin="2" end="100">
    <!-- Assume number is prime -->
    <c:set var="isPrime" value="true" />
    
    <!-- Check divisibility from 2 to num-1 -->
    <c:forEach var="i" begin="2" end="${num - 1}">
        <c:if test="${num % i == 0}">
            <c:set var="isPrime" value="false" />
        </c:if>
    </c:forEach>

    <!-- If isPrime is still true, then print -->
    <c:if test="${isPrime}">
        ${num}
        <c:out value=", " />
    </c:if>
</c:forEach>
</p>

</body>
</html>
