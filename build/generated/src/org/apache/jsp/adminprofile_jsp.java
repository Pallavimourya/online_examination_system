package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>ADMIN  PROFILE...</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(a8.png) \"> \n");
      out.write("        \n");
      out.write("        <img src=\"a15.jpg\" width=\"350\" height=\"400\" alt=\"pallavi mourya\" style=\"float: right; margin-right: 100px; \n");
      out.write("             margin-top: 150px; border:2px solid white\" >\n");
      out.write("     <center>\n");
      out.write("         <table cellpadding=\"10px\"  style=\"font-size: 20; color: white; margin-top: 30px\">\n");
      out.write("             <h2 style=\"color:white;margin-top: 30px\">ADMIN PROFILE</h2>\n");
      out.write("<tr>\n");
      out.write("<td>Name:</td>\n");
      out.write("<td>Pallavi Mourya</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>DOB:</td>\n");
      out.write("<td>11th-Sep-1999</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Contact No. </td>\n");
      out.write("<td>9770726088/7489961391</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Email Id:</td>\n");
      out.write("<td>Pallavimourya99@gmail.com</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Gender:</td>\n");
      out.write("<td>Female</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Country/State/City:</td>\n");
      out.write("<td>India/Madhya Pradesh/Indore</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Skills:</td>\n");
      out.write("<td>JAVA</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>STD:</td>\n");
      out.write("<td>B.Tech</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Stream:</td>\n");
      out.write("<td>CSE(Computer Science)</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Projects:</td>\n");
      out.write("<td>Online Examination System</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Profession:</td>\n");
      out.write("<td>Student</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Marital Status :</td>\n");
      out.write("<td>Single</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("     </center>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
