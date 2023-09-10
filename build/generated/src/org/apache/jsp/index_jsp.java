package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\"/>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(online-exam.png);\">\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"login1.jsp\">Login</a></li>\n");
      out.write("<li><a href=\"regis1.jsp\">Register</a></li>\n");
      out.write("<li><a href=\"adminpanel.jsp\">About</a></li>\n");
      out.write("<li><a href=\"#\">Contact</a></li>\n");
      out.write("<li><a href=\"admin.jsp\">Admin</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<center><h1><font color=\"blue\">\n");
      out.write("WORK hard DREAM big NEVER give UP!!\n");
      out.write("</font>\n");
      out.write("</h1><br>\n");
      out.write("<h1>Online Examination System</h1>\n");
      out.write("</center>\n");
      out.write("<center>\n");
      out.write("<table cellpadding=\"15px\">\n");
      out.write("<pall>\n");
      out.write("<p>\n");
      out.write("\"YOU are capable of more than you know.<br>\n");
      out.write("Choose a goal that seems right for you and strive to be the best,however\n");
      out.write("hard the path.<br>Aim high.Behave Honorably.Prepare to be alone at times,and \n");
      out.write("to endure failure.<br>Persist!The world needs all you can give.\"\n");
      out.write("</pall><br>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</font>\n");
      out.write("<br><br><br>\n");
      out.write("<center><h1><font color=\"brown\">MISTAKES are PROOF that you are TRYING</h1>\n");
      out.write("</center>\n");
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
