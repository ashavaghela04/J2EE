package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.Cookie;

public final class theme_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String selectedTheme = request.getParameter("theme");
    if (selectedTheme != null) {
        // Create a cookie with the selected theme, expires in 7 days
        Cookie themeCookie = new Cookie("userTheme", selectedTheme);
        themeCookie.setMaxAge(7 * 24 * 60 * 60); // 7 days
        response.addCookie(themeCookie);

        // Redirect to welcome page after setting cookie
        response.sendRedirect("welcome.jsp");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Select Theme</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Select Your Preferred Theme</h2>\n");
      out.write("    <form method=\"post\" action=\"theme.jsp\">\n");
      out.write("        <input type=\"radio\" name=\"theme\" value=\"light\" id=\"light\" checked />\n");
      out.write("        <label for=\"light\">Light</label><br/>\n");
      out.write("\n");
      out.write("        <input type=\"radio\" name=\"theme\" value=\"dark\" id=\"dark\" />\n");
      out.write("        <label for=\"dark\">Dark</label><br/><br/>\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Save Theme\" />\n");
      out.write("    </form>\n");
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
