package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body style=\"background-image:url(a9.jpg); background-repeat: no-repeat\">\n");
      out.write("<div id=\"data\"style=\"font-size:35; color: white; background-repeat: no-repeat\">\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h4>ADMIN PANEL</h4>\n");
      out.write("    <div class=\"col-3 \">\n");
      out.write("        <a href=\"adminprofile.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a12.png\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write("        <a href=\"course.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a1.jpg\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write("        <a href=\"showall.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a2.png\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write("    <a href=\"phptest.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a11.png\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-3 \">\n");
      out.write("            <label class=\"row\" style=\"margin-left:5px\"> Profile</label></a>\n");
      out.write("            <label class=\"row\" style=\"margin-left:120px\">Course</label></a>\n");
      out.write("        <label class=\"row\" style=\"margin-left:120px\">Users</label></a>\n");
      out.write("    <label class=\"row\" style=\"margin-left:120px\"> Results</label></a>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-3\">\n");
      out.write("     <a href=\"index.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a5.jpg\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write(" <a href=\"index.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a7.jpg\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write(" <a href=\"logout.jsp\"><button class=\"row\" style=\"margin:50px; border-radius: 10%\"><img src=\"a6.jpg\" height =\"100\" width=\"100\" ></button></a>\n");
      out.write("</div>\n");
      out.write("         <div class=\"col-3 \">\n");
      out.write("           <label class=\"row\" style=\"margin-left:5px\">Verified</label></a>\n");
      out.write("        <label class=\"row\" style=\"margin-left:100px\">Password</label></a>\n");
      out.write("    <label class=\"row\" style=\"margin-left:100px\">Logout</label></a>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write(" </center>\n");
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
