package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mymenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menubar2.jsp");
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
      out.write("\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\"/>\n");
      out.write("</head>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"insert1.jsp\">Insert</a></li>\n");
      out.write("<li><a href=\"search.jsp\">Search</a></li>\n");
      out.write("<li><a href=\"update.jsp\">Update</a></li>\n");
      out.write("<li><a href=\"delete.jsp\">Delete</a></li>\n");
      out.write("<li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write(" \n");
      out.write("\n");
      out.write("<style>\n");
      out.write("   .button\n");
      out.write("{\n");
      out.write("  color: black;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body style=\"background-image:url(a18.jpg)\">\n");
      out.write("<div id=\"data\"style=\"font-size:35; color: white;\">\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write(" ");
   
  Cookie ck[]=request.getCookies();
   
            
     
                if(ck!=null)
                {
                               
                     	 out.println("welcome " +ck[1].getValue());
                     // out.println("welcome "+c[1].getName());  
                }
	
                else
                {
                    response.sendRedirect("login.html");
                }
                
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <center>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px; margin-top: 50px;\"><img src=\"p1.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write("        <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px;\"><img src=\"p2.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write("        <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px;\"><img src=\"p8.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\" style=\"margin:30px;\">\n");
      out.write(" <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px;\"><img src=\"p4.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write(" <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px;\"><img src=\"p5.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write(" <a href=\"instruction.jsp\"><button class=\"col\" style=\"margin:20px;\"><img src=\"p6.png\" height =\"150\" width=\"150\" ></button></a>\n");
      out.write("</div>\n");
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
