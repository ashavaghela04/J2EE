<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Set the current date and time as a request attribute
    request.setAttribute("currentDateTime", new Date());
%>

<!DOCTYPE html>
<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time:</h2>
    <p>
        ${currentDateTime}
    </p>
</body>
</html>
