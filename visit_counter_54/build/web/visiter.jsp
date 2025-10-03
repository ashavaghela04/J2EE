<%-- 
    Document   : visiter
    Created on : Sep 29, 2025, 10:15:37 AM
    Author     : KSC55
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    // Get the current visitor count from application scope
    Integer visitorCount = (Integer) application.getAttribute("visitorCount");

    if (visitorCount == null) {
        visitorCount = 0;  // Initialize if not already set
    }

    // Increment the count
    visitorCount++;

    // Save the updated count back to application scope
    application.setAttribute("visitorCount", visitorCount);
%>

<h2>Welcome to Our Website!</h2>
<p>Total visitors since server started: <b><%= visitorCount %></b></p>

    </body>
</html>
