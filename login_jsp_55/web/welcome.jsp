<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");

    if (username != null && !username.trim().isEmpty()) {
        // New login, store username in session
        session.setAttribute("username", username);
    } else {
        // No username in request — check session
        username = (String) session.getAttribute("username");
    }

    if (username == null) {
        // No session or no username — redirect to login page
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head><title>Welcome</title></head>
<body>

<h2>Welcome, <%= username %>!</h2>

<p><a href="logout.jsp">Logout</a></p>

</body>
</html>
