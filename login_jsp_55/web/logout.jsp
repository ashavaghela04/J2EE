<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();  // Destroy session
    response.sendRedirect("login.jsp");  // Redirect to login page
%>
