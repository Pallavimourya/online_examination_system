package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .container {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 97vh;\n");
      out.write("            overflow: hidden;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container .result {\n");
      out.write("            min-width: 600px;\n");
      out.write("            border: 4px solid white;\n");
      out.write("            border-top-left-radius: 4px solid #fff;\n");
      out.write("            border-bottom-right-radius: 4px solid #fff;\n");
      out.write("            border-top-right-radius: 0px solid #fff;\n");
      out.write("            border-bottom-left-radius: 0px solid #fff;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 50%;\n");
      out.write("            top: 50%;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container .result span {\n");
      out.write("            font-size: 38px;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 3rem 1rem;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container .result .totalQ {\n");
      out.write("            color: yellow;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container .result .totalA {\n");
      out.write("            color: chartreuse;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container .result .statusResult {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .green {\n");
      out.write("            color: chartreuse;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .red {\n");
      out.write("            color: red;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"result\">\n");
      out.write("            <span class=\"totalQ\">Total Question 10</span>\n");
      out.write("            <span class=\"totalA\">Total Attempt </span>\n");
      out.write("            <span class=\"statusResult\">Result: <b class=\"green\">Pass</b> <b class=\"red\">Fail</b></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
