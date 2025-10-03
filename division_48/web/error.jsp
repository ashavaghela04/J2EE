<%-- 
    Document   : error
    Created on : Sep 8, 2025, 10:33:36 AM
    Author     : KSC55
--%>

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error - Division Operation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ffe6e6;
            padding: 50px;
        }

        .error-box {
            max-width: 500px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(255, 0, 0, 0.2);
            border-left: 6px solid #e74c3c;
        }

        h2 {
            color: #e74c3c;
            text-align: center;
        }

        p {
            font-size: 16px;
            color: #333;
            margin: 10px 0;
        }

        a {
            display: inline-block;
            margin-top: 15px;
            color: #3498db;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="error-box">
        <h2>Oops! An Error Occurred</h2>
        <p><strong>Exception Type:</strong> <%= exception.getClass().getName() %></p>
        <p><strong>Message:</strong> <%= exception.getMessage() %></p>
        <a href="division.jsp">? Back to Calculator</a>
    </div>
</body>
</html>
