<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Get parameters from request (with default values if not provided)
    String strNum1 = request.getParameter("num1");
    String strNum2 = request.getParameter("num2");

    double num1 = 0, num2 = 0;
    boolean validInput = true;

    try {
        if (strNum1 != null) num1 = Double.parseDouble(strNum1);
        if (strNum2 != null) num2 = Double.parseDouble(strNum2);
    } catch (NumberFormatException e) {
        validInput = false;
    }

    // Set attributes to use EL for calculations
    if (validInput && strNum1 != null && strNum2 != null) {
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
    } else {
        request.setAttribute("num1", null);
        request.setAttribute("num2", null);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Calculator using Expression Language</title>
</head>
<body>
    <h2>Simple Calculator</h2>

    <form action="calculator.jsp" method="get">
        Number 1: <input type="text" name="num1" value="${param.num1}"/><br/>
        Number 2: <input type="text" name="num2" value="${param.num2}"/><br/>
        <input type="submit" value="Calculate"/>
    </form>

    <hr/>

    <c:choose>
        <c:when test="${num1 != null and num2 != null}">
            <p>Addition: ${num1 + num2}</p>
            <p>Subtraction: ${num1 - num2}</p>
            <p>Multiplication: ${num1 * num2}</p>
            <p>Division: 
                <c:choose>
                    <c:when test="${num2 != 0}">
                        ${num1 / num2}
                    </c:when>
                    <c:otherwise>
                        Division by zero not allowed
                    </c:otherwise>
                </c:choose>
            </p>
        </c:when>
        <c:otherwise>
            <p>Please enter valid numbers to calculate.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
