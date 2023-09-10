package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phptest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/");
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
      out.write("<body style=\"background-image: url(a.jpg);\">\n");
      out.write(" ");
      out.write("a.jpg\n");
      out.write("a1.jpg\n");
      out.write("a10.png\n");
      out.write("a11.png\n");
      out.write("a12.png\n");
      out.write("a13.jpg\n");
      out.write("a14.jpg\n");
      out.write("a15.jpg\n");
      out.write("a16.jpg\n");
      out.write("a17.jpg\n");
      out.write("a18.jpg\n");
      out.write("a19.jpg\n");
      out.write("a2.png\n");
      out.write("a3.png\n");
      out.write("a5.jpg\n");
      out.write("a6.jpg\n");
      out.write("a7.jpg\n");
      out.write("a8.png\n");
      out.write("a9.jpg\n");
      out.write("admin.jsp\n");
      out.write("admin1.jsp\n");
      out.write("admin3.jsp\n");
      out.write("admin-icon-png-12.jpg\n");
      out.write("adminprofile.jsp\n");
      out.write("b1.jpg\n");
      out.write("back.jpeg\n");
      out.write("contact.css\n");
      out.write("contactus.jsp\n");
      out.write("course.jsp\n");
      out.write("delete.js\n");
      out.write("delete.jsp\n");
      out.write("exam1.png\n");
      out.write("exam7.jpg\n");
      out.write("gfv3ee6.dpf\n");
      out.write("index.jsp\n");
      out.write("insert1.jsp\n");
      out.write("insert2.jsp\n");
      out.write("javatest.jsp\n");
      out.write("login1.jsp\n");
      out.write("login2.jsp\n");
      out.write("logout.jsp\n");
      out.write("menubar1.jsp\n");
      out.write("menubar2.jsp\n");
      out.write("META-INF\n");
      out.write("mymenu.jsp\n");
      out.write("online-exam.png\n");
      out.write("p1.png\n");
      out.write("p2.png\n");
      out.write("p3.jpg\n");
      out.write("p4.png\n");
      out.write("p5.png\n");
      out.write("p6.png\n");
      out.write("p7.png\n");
      out.write("p8.png\n");
      out.write("pass.jsp\n");
      out.write("pass2.jsp\n");
      out.write("phptest.jsp\n");
      out.write("r1.jpeg\n");
      out.write("r2.png\n");
      out.write("regis1.jsp\n");
      out.write("regis2.jsp\n");
      out.write("search.jsp\n");
      out.write("showall.jsp\n");
      out.write("update.jsp\n");
      out.write("updatepass2.jsp\n");
      out.write("w4.jpg\n");
      out.write("WEB-INF\n");
      out.write("xyz.css\n");
      out.write("xyz.js\n");
      out.write(" \n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("<!--<Form action=\"\">-->\n");
      out.write("       <table cellpadding=\"20px\">\t    \n");
      out.write("         <!--<tbody>-->  \n");
      out.write("\n");
      out.write("             \n");
      out.write("        \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<!--</Form>-->\n");
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
