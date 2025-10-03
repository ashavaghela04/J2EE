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
import java.sql.*;

/**
 *
 * @author KSC55
 */
public class database extends HttpServlet {

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
            try
            {
                
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
                    String query="insert into student(rollno,firstname,lastname,course,semester) values (?,?,?,?,?)";
                    PreparedStatement st=con.prepareStatement(query);
                    st.setInt(1, Integer.parseInt(request.getParameter("rollno")));
                    st.setString(2, request.getParameter("firstname"));
                    st.setString(3, request.getParameter("lastname"));
                    st.setString(4, request.getParameter("course"));
                    st.setInt(5, Integer.parseInt(request.getParameter("semester")));
                   int rowsInserted = st.executeUpdate();
                    if (rowsInserted > 0) 
                    {
                        response.getWriter().println("Student record inserted successfully.");
                        String table="select *from student";//desplay all data
             
                    ResultSet r_s=st.executeQuery(table);
                    out.println("<table border=1>");
                    out.println("<tr><th>Roll No</th><th>First Name</th><th>Last Name</th><th>Course</th><th>Semester</th></tr>");
                    while(r_s.next())
                    {
                        out.println("<tr><td>"+r_s.getInt(1)+"</td>");
                        out.println("<td>"+r_s.getString(2)+"</td>");
                        out.println("<td>"+r_s.getString(2)+"</td>");
                        out.println("<td>"+r_s.getString(2)+"</td>");
                        out.println("<td>"+r_s.getInt(1)+"</td></tr>");
                    }
                    out.println("</table>");
                    }
                    
            }
            catch(Exception e)
            {
                out.println(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
