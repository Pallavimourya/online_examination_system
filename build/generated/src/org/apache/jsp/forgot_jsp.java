package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\"/>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(a19.jpg)\">\n");
      out.write("<center>\n");
      out.write("    <h1 style=\"margin-top: 150px;color: white\">Reset Your Password</h1>\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"forgotpass.jsp\">\n");
      out.write("    <table cellpadding=\"20px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr style=\"font-size: 20;\">\n");
      out.write("\t\t<td>\n");
      out.write("                    <label>New-password:</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    \n");
      out.write("            <input type=\"text\" placeholder=\"New Password\" name=\"p1\" required style=\"font-size: 20;\"><br>\n");
      out.write("\t\t</td>\t\n");
      out.write("\t\t</tr>\n");
      out.write("<tr style=\"font-size: 20;\">\n");
      out.write("\t\t<td>\n");
      out.write("                    <label>Re-Enter Password: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    \n");
      out.write("            <input type=\"text\" placeholder=\"Re-Enter New Password\"  name=\"p2\" required style=\"font-size: 20\"><br>\n");
      out.write("\t\t</td>\t\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                <center>       <input type=\"submit\" style=\"width: 300; height: 30\"> </center>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
