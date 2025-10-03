<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>
<%
    String selectedTheme = request.getParameter("theme");
    if (selectedTheme != null) {
        // Create a cookie with the selected theme, expires in 7 days
        Cookie themeCookie = new Cookie("userTheme", selectedTheme);
        themeCookie.setMaxAge(7 * 24 * 60 * 60); // 7 days
        response.addCookie(themeCookie);

        // Redirect to welcome page after setting cookie
        response.sendRedirect("welcome.jsp");
        return;
    }
%>

<html>
<head>
    <title>Select Theme</title>
</head>
<body>
    <h2>Select Your Preferred Theme</h2>
    <form method="post" action="theme.jsp">
        <input type="radio" name="theme" value="light" id="light" checked />
        <label for="light">Light</label><br/>

        <input type="radio" name="theme" value="dark" id="dark" />
        <label for="dark">Dark</label><br/><br/>

        <input type="submit" value="Save Theme" />
    </form>
</body>
</html>
