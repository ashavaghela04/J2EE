<%-- 
    Document   : asscept_jsp
    Created on : Aug 28, 2025, 9:30:48 AM
    Author     : KSC55
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
        <h2>Student Details Submitted</h2>
    <p><strong>Name:</strong> <%= request.getParameter("name") %></p>
    <p><strong>Roll Number:</strong> <%= request.getParameter("roll") %></p>
    <p><strong>Course:</strong> <%= request.getParameter("course") %></p>
    <p><strong>Email:</strong> <%= request.getParameter("email") %></p>
    <p><strong>Gender:</strong> <%= request.getParameter("gender") %></p>
    </body>
</html>
