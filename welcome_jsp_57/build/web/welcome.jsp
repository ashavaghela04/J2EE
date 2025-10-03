<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Flag to track if the user is a returning visitor
    boolean isReturningVisitor = false;

    // Get all cookies from the request
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            // Check if the "visited" cookie is present
            if ("visited".equals(cookie.getName())) {
                isReturningVisitor = true;
                break;
            }
        }
    }

    // If not returning, set a "visited" cookie for next time
    if (!isReturningVisitor) {
        Cookie visitCookie = new Cookie("visited", "yes");
        visitCookie.setMaxAge(60); // 1 year
        response.addCookie(visitCookie);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>
        <%= isReturningVisitor ? "Welcome back!" : "Welcome!" %>
    </h2>
</body>
</html>
