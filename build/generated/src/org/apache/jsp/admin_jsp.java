package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menubar1.jsp");
  }

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
      out.write("<body style=\"background-image: url(a13.jpg);\">\n");
      out.write(" ");
      out.write("<div id=\"mymenu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"login1.jsp\">Login</a></li>\n");
      out.write("<li><a href=\"regis1.jsp\">Registration</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("    <form action=\"admin1.jsp\">\n");
      out.write("<table cellpadding=\"20px\">\n");
      out.write("         \n");
      out.write("    <tr style=\"font-size: 30;\">\n");
      out.write("\t\t<td>\n");
      out.write("                    <label>Username : </label>   \n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"un\" required style=\"font-size: 25;\"><br>\n");
      out.write("\t\t</td>\t\n");
      out.write("\t\t</tr>\t\n");
      out.write("\t\t\n");
      out.write("\t\t<tr style=\"font-size: 30;\">\n");
      out.write("\t\t<td>\n");
      out.write("            <label>Password : </label>   \n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"up\" required style=\"font-size: 25;\"><br>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t</tr>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t<tr>\t\n");
      out.write("\t\t<td>\n");
      out.write("                 \n");
      out.write("                   <input type=\"checkbox\" checked=\"checked\"  style=\"font-size: 30;\" > Remember pass\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      Forgot <a href=\"#\"> password? </a>\n");
      out.write("                 <br><br>\n");
      out.write("               <center><input type=\"submit\" value=\"Login\"  style=\"height:35px; width:500px; font-size:20\" ><br>\n");
      out.write("           </center>\n");
      out.write("\t\t    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
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
