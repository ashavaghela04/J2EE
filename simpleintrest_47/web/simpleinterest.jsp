<%-- 
    Document   : simpleinterest
    Created on : Sep 8, 2025, 10:20:09 AM
    Author     : KSC55
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Interest Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f7;
            padding: 40px;
        }

        .container {
            max-width: 400px;
            margin: auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #2c3e50;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #3498db;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        .result {
            margin-top: 20px;
            font-size: 18px;
            text-align: center;
            color: green;
        }

        .error {
            margin-top: 20px;
            font-size: 16px;
            text-align: center;
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Simple Interest Calculator</h2>

        <form method="post" action="simpleinterest.jsp">
            <label for="principal">Principal (P):</label>
            <input type="text" id="principal" name="principal" />

            <label for="rate">Rate of Interest (R %):</label>
            <input type="text" id="rate" name="rate" />

            <label for="time">Time (T in years):</label>
            <input type="text" id="time" name="time" />

            <input type="submit" value="Calculate Interest" />
        </form>

        <%
            String principalStr = request.getParameter("principal");
            String rateStr = request.getParameter("rate");
            String timeStr = request.getParameter("time");

            if (principalStr != null && rateStr != null && timeStr != null &&
                !principalStr.trim().isEmpty() && !rateStr.trim().isEmpty() && !timeStr.trim().isEmpty()) {

                try {
                    double principal = Double.parseDouble(principalStr);
                    double rate = Double.parseDouble(rateStr);
                    double time = Double.parseDouble(timeStr);

                    double interest = (principal * rate * time) / 100;

                    out.println("<div class='result'>Simple Interest = <strong>" + interest + "</strong></div>");
                } catch (NumberFormatException e) {
                    out.println("<div class='error'>Please enter valid numeric values.</div>");
                }
            }
        %>
    </div>
</body>
</html>
