/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KSC55
 */
public class calculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
         PrintWriter out = response.getWriter();
          try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;
            String symbol = "";

            if (operation.equals("add")) {
                result = num1 + num2;
                symbol = "+";
            } else if (operation.equals("subtract")) {
                result = num1 - num2;
                symbol = "-";
            } else if (operation.equals("multiply")) {
                result = num1 * num2;
                symbol = "*";
            } else if (operation.equals("divide")) {
                if (num2 == 0) {
                    out.println("<html><body>");
                    out.println("<h3 style='color:red;'>Error: Division by zero is not allowed.</h3>");
                    out.println("<a href='CalculatorServlet'>Try Again</a>");
                    out.println("</body></html>");
                    return;
                } else {
                    result = num1 / num2;
                    symbol = "/";
                }
            } else {
                out.println("<html><body>");
                out.println("<h3 style='color:red;'>Invalid operation selected.</h3>");
                out.println("<a href='CalculatorServlet'>Try Again</a>");
                out.println("</body></html>");
                return;
            }

            // Output the result
            out.println("<html><body>");
            out.println("<h2>Result:</h2>");
            out.printf("<p>%.2f %s %.2f = %.2f</p>", num1, symbol, num2, result);
            out.println("<br><a href='index.html'>Perform Another Calculation</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h3 style='color:red;'>Invalid input. Please enter valid numbers.</h3>");
            out.println("<a href='CalculatorServlet'>Try Again</a>");
            out.println("</body></html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
