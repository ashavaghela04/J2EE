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
public class form_post extends HttpServlet {

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
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        try (PrintWriter out = response.getWriter()) 
        {
            String[] hobbies = request.getParameterValues("hobbies");
        out.println("<html><body>");
        out.println("<h2>Student Registered Successfully!</h2>");
        out.println("<p><strong>Roll No:</strong> " + request.getParameter("rollno")+ "</p>");
        out.println("<p><strong>Name:</strong> " + request.getParameter("name") + "</p>");
        out.println("<p><strong>Course:</strong> " + request.getParameter("course") + "</p>");
        out.println("<p><strong>Semester:</strong> " + request.getParameter("semester") + "</p>");
         out.println("<p><strong>Hobbies:</strong> ");
        if (hobbies != null && hobbies.length > 0) {
            for (String hobby : hobbies) {
                out.print(hobby + " ,");
            }
        } else {
            out.print("None");
        }
        out.println("</p>");
        out.println("</body></html>");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
