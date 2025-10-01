package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Get parameters from request (with default values if not provided)
    String strNum1 = request.getParameter("num1");
    String strNum2 = request.getParameter("num2");

    double num1 = 0, num2 = 0;
    boolean validInput = true;

    try {
        if (strNum1 != null) num1 = Double.parseDouble(strNum1);
        if (strNum2 != null) num2 = Double.parseDouble(strNum2);
    } catch (NumberFormatException e) {
        validInput = false;
    }

    // Set attributes to use EL for calculations
    if (validInput && strNum1 != null && strNum2 != null) {
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
    } else {
        request.setAttribute("num1", null);
        request.setAttribute("num2", null);
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>JSP Calculator using Expression Language</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Simple Calculator</h2>\n");
      out.write("\n");
      out.write("    <form action=\"calculator.jsp\" method=\"get\">\n");
      out.write("        Number 1: <input type=\"text\" name=\"num1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.num1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\n");
      out.write("        Number 2: <input type=\"text\" name=\"num2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.num2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br/>\n");
      out.write("        <input type=\"submit\" value=\"Calculate\"/>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <hr/>\n");
      out.write("\n");
      out.write("    <c:choose>\n");
      out.write("        <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num1 != null and num2 != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <p>Addition: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num1 + num2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Subtraction: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num1 - num2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Multiplication: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num1 * num2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Division: \n");
      out.write("                <c:choose>\n");
      out.write("                    <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num2 != 0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num1 / num2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </c:when>\n");
      out.write("                    <c:otherwise>\n");
      out.write("                        Division by zero not allowed\n");
      out.write("                    </c:otherwise>\n");
      out.write("                </c:choose>\n");
      out.write("            </p>\n");
      out.write("        </c:when>\n");
      out.write("        <c:otherwise>\n");
      out.write("            <p>Please enter valid numbers to calculate.</p>\n");
      out.write("        </c:otherwise>\n");
      out.write("    </c:choose>\n");
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
