package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_jsp extends org.apache.jasper.runtime.HttpJspBase
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


String username=(String)session.getAttribute("username"); 
if(username==null){
	out.print("Not logged in. Log in again after 3 seconds");
	response.setHeader("refresh", "3;url='Index.jsp'");
}
else{
	
      out.write("\n");
      out.write("\t\n");
      out.write("\texaminee:");
      out.print(session.getAttribute("username") );
      out.write("\n");
      out.write(" \n");
      out.write("<h3>Online test questions</h3>\n");
      out.write("<form action=\"submit.jsp\" onsubmit=\"return confirm('Are you sure to submit?')\">\n");
      out.write("\t\tThe capital of Hubei Province\n");
      out.write("\t\t<input type=\"text\" name=\"q1\" />\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\tQuestion 2: who was the founding emperor of the Song Dynasty\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"radio\" value=\"founder of the Song dynasty\" name=\"q2\">\n");
      out.write("\t\tfounder of the Song dynasty\n");
      out.write("\t\t<input type=\"radio\" value=\"Zhu Yuanzhang\" name=\"q2\">\n");
      out.write("\t\tZhu Yuanzhang\n");
      out.write("\t\t<input type=\"radio\" value=\"Li Yuan\" name=\"q2\">\n");
      out.write("\t\tLi Yuan\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\tQuestion 3: what are the four famous works\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"checkbox\" value=\"The Dream of Red Mansion\" name=\"q3\">\n");
      out.write("\t\tThe Dream of Red Mansion\n");
      out.write("\t\t<input type=\"checkbox\" value=\"Water Margin\" name=\"q3\">\n");
      out.write("\t\tWater Margin\n");
      out.write("\t\t<input type=\"checkbox\" value=\"J2EE Programming technology\" name=\"q3\">\n");
      out.write("\t\tJ2EE Programming technology\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\t<button type=\"submit\">Submit</button>\n");
      out.write("</form>\n");
      out.write("\t\n");
}
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
