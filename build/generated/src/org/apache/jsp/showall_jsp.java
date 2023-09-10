package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showall_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" ");
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
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("  ");

              try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from regis");

      out.write("  1\n");
      out.write("<table cellspacing=\"20px\">\n");
      out.write("    <tr>\n");
      out.write("        <td>Rollno</td>\n");
      out.write("         <td>Name</td>   \n");
      out.write("         <td>Physic</td>\n");
      out.write("         <td>Chemistry</td>\n");
      out.write("         <td>Math</td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        while(rs.next())
        {
    
      out.write("\n");
      out.write("       \n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("          <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("           <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("    </tr> \n");
      out.write("    ");

        }
        con.close();
           }
              catch(Exception e1)
              {
                  out.println(e1);
                  
              }
  
      out.write("            \n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("\n");
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
