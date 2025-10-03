package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class simpleinterest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Simple Interest Calculator</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Simple Interest Calculator</h2>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"simpleinterest.jsp\">\n");
      out.write("        Principal (P): <input type=\"text\" name=\"principal\" /><br/><br/>\n");
      out.write("        Rate of Interest (R): <input type=\"text\" name=\"rate\" /><br/><br/>\n");
      out.write("        Time (T in years): <input type=\"text\" name=\"time\" /><br/><br/>\n");
      out.write("        <input type=\"submit\" value=\"Calculate\" />\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

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

                out.println("<p>Simple Interest = <strong>" + interest + "</strong></p>");
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Please enter valid numeric values.</p>");
            }
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
