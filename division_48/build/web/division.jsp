<%-- 
    Document   : division
    Created on : Sep 8, 2025, 10:32:59 AM
    Author     : KSC55
--%>

<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Division Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f4f6;
            padding: 40px;
        }

        .container {
            max-width: 450px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #2c3e50;
        }

        label {
            font-weight: bold;
            display: block;
            margin-top: 15px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            margin-top: 20px;
            width: 100%;
            background-color: #3498db;
            color: white;
            padding: 12px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        .result {
            margin-top: 20px;
            padding: 15px;
            background-color: #ecf0f1;
            border-left: 5px solid #2ecc71;
            font-size: 18px;
            color: #2c3e50;
        }

        .error {
            color: red;
            margin-top: 15px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Division Calculator</h2>
        <form method="post" action="division.jsp">
            <label>Enter Dividend:</label>
            <input type="text" name="num1" />

            <label>Enter Divisor:</label>
            <input type="text" name="num2" />

            <input type="submit" value="Divide" />
        </form>

        <%
            String n1 = request.getParameter("num1");
            String n2 = request.getParameter("num2");

            if (n1 != null && n2 != null && !n1.isEmpty() && !n2.isEmpty()) {
                try {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int result = num1 / num2;

                    out.println("<div class='result'>Result: " + num1 + " ÷ " + num2 + " = <strong>" + result + "</strong></div>");
                } catch (NumberFormatException e) {
                    out.println("<div class='error'>Please enter valid numeric values.</div>");
                }
            }
        %>
    </div>
</body>
</html>
