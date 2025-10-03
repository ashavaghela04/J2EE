package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class division_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
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
      out.write("    <title>Division Calculator</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f3f4f6;\n");
      out.write("            padding: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 450px;\n");
      out.write("            margin: auto;\n");
      out.write("            background: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 15px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: #3498db;\n");
      out.write("            color: white;\n");
      out.write("            padding: 12px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #2980b9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .result {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 15px;\n");
      out.write("            background-color: #ecf0f1;\n");
      out.write("            border-left: 5px solid #2ecc71;\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error {\n");
      out.write("            color: red;\n");
      out.write("            margin-top: 15px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Division Calculator</h2>\n");
      out.write("        <form method=\"post\" action=\"division.jsp\">\n");
      out.write("            <label>Enter Dividend:</label>\n");
      out.write("            <input type=\"text\" name=\"num1\" />\n");
      out.write("\n");
      out.write("            <label>Enter Divisor:</label>\n");
      out.write("            <input type=\"text\" name=\"num2\" />\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Divide\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("    </div>\n");
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
