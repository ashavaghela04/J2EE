package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leapyear_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Leap Year Checker</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Check if a Year is a Leap Year</h2>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"leapyear.jsp\">\n");
      out.write("        Enter a year: <input type=\"text\" name=\"year\" />\n");
      out.write("        <input type=\"submit\" value=\"Check\" />\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

        String yearStr = request.getParameter("year");
        if (yearStr != null && !yearStr.trim().isEmpty()) {
            try {
                int year = Integer.parseInt(yearStr);
                boolean isLeap = false;

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    isLeap = true;
                }

                if (isLeap) {
                    out.println("<p>" + year + " is a <strong>Leap Year</strong>.</p>");
                } else {
                    out.println("<p>" + year + " is <strong>Not a Leap Year</strong>.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Please enter a valid numeric year.</p>");
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
