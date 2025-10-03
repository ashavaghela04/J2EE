<%-- 
    Document   : leapyear.jsp
    Created on : Sep 8, 2025, 10:14:27 AM
    Author     : KSC55
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Leap Year Checker</title>
</head>
<body>
    <h2>Check if a Year is a Leap Year</h2>

    <form method="post" action="leapyear.jsp">
        Enter a year: <input type="text" name="year" />
        <input type="submit" value="Check" />
    </form>

    <%
        String yearStr = request.getParameter("year");
        if (yearStr != null && !yearStr.trim().isEmpty()) {
            try {
                int year = Integer.parseInt(yearStr);
                boolean isLeap = false;

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    isLeap = true;
                }

                if (isLeap) {
                    out.println("<p>" + year + " is a <strong>Leap Year</strong>.</p>");
                } else {
                    out.println("<p>" + year + " is <strong>Not a Leap Year</strong>.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Please enter a valid numeric year.</p>");
            }
        }
    %>
</body>
</html>
