package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"contact.css\"/>\n");
      out.write("<script type=\"text/css\" src=\"xyz.js\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<div id=\"logo\"></div>\n");
      out.write("<div id=\"nav\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("<li><a href=\"contactus.html\">CONTACT US</a></li>\n");
      out.write("<li style=\"float: right;padding-right: 20px\"><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("</ul>\n");
      out.write("<div id=\"bodypart\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"contact\" style=\"margin-top: 90px;width: 800px\">\n");
      out.write("<h2>Contact Us</h2>\n");
      out.write("<p>Our website will provide you to give online examination and view your result immediately that will reduce students anxiety.By the help of giving such type of examination students can save a lot of their time.They can check their abilities and improve them.Students can give exams of their selected subjects.\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
