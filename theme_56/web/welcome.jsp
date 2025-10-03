<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>
<%
    // Default theme
    String theme = "light";

    // Retrieve cookies
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if ("userTheme".equals(c.getName())) {
                theme = c.getValue();
                break;
            }
        }
    }
%>

<html>
<head>
    <title>Welcome</title>
    <style>
        body.light {
            background-color: white;
            color: black;
        }
        body.light a {
            color: blue;          /* Light theme link color */
            text-decoration: none;
        }
        body.light a:hover {
            text-decoration: underline;
        }

        body.dark {
            background-color: #121212;
            color: white;
        }
        body.dark a {
            color: #66ccff;       /* Dark theme link color (light blue) */
            text-decoration: none;
        }
        body.dark a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body class="<%= theme %>">
    <h1>Welcome to the site!</h1>
    <p>Your selected theme is: <b><%= theme %></b></p>
    <p><a href="theme.jsp" >Change Theme</a></p>
</body>
</html>
