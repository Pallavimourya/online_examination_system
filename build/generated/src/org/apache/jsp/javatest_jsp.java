package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javatest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"xyz.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"page-wrap\">\n");
      out.write("\n");
      out.write("\t\t<h1>Core Java</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"Result_All_Quiz\" method=\"post\" id=\"quiz\">\n");
      out.write("\t\t\n");
      out.write("            <ol>\n");
      out.write("            \n");
      out.write("                <li>\n");
      out.write("                \n");
      out.write("                    <h3>Java is...</h3>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-1-answers\" id=\"qus\" value=\"A\" />\n");
      out.write("                        <label for=\"question-1-answers-A\">A) Object oriented programming language </label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-1-answers\" id=\"question-1-answers-B\" value=\"B\" />\n");
      out.write("                        <label for=\"question-1-answers-B\">B) partially object oriented programming language</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-1-answers\" id=\"question-1-answers-C\" value=\"C\" />\n");
      out.write("                        <label for=\"question-1-answers-C\">C) scripting  programming language</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-1-answers\" id=\"question-1-answers-D\" value=\"D\" />\n");
      out.write("                        <label for=\"question-1-answers-D\">D) None of the above</label>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                \n");
      out.write("                    <h3>What is the size of short variable ?...</h3>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-2-answers\" id=\"question-2-answers-A\" value=\"A\" />\n");
      out.write("                        <label for=\"question-2-answers-A\">A)  8 bit</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-2-answers\" id=\"question-2-answers-B\" value=\"B\" />\n");
      out.write("                        <label for=\"question-2-answers-B\">B)  16 bit</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-2-answers\" id=\"question-2-answers-C\" value=\"C\" />\n");
      out.write("                        <label for=\"question-2-answers-C\">C) 32 bit</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-2-answers\" id=\"question-2-answers-D\" value=\"D\" />\n");
      out.write("                        <label for=\"question-2-answers-D\">D) 64 bit</label>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                \n");
      out.write("                    <h3>What is the default value of short variable...</h3>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-3-answers\" id=\"question-3-answers-A\" value=\"A\" />\n");
      out.write("                        <label for=\"question-3-answers-A\">A) 0.0</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-3-answers\" id=\"question-3-answers-B\" value=\"B\" />\n");
      out.write("                        <label for=\"question-3-answers-B\">B) 0</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-3-answers\" id=\"question-3-answers-C\" value=\"C\" />\n");
      out.write("                        <label for=\"question-3-answers-C\">C) undefined</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-3-answers\" id=\"question-3-answers-D\" value=\"D\" />\n");
      out.write("                        <label for=\"question-3-answers-D\">D) All</label>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                \n");
      out.write("                    <h3>What is the default value of Boolean variable?...</h3>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-4-answers\" id=\"question-4-answers-A\" value=\"A\" />\n");
      out.write("                        <label for=\"question-4-answers-A\">A) true</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-4-answers\" id=\"question-4-answers-B\" value=\"B\" />\n");
      out.write("                        <label for=\"question-4-answers-B\">B)  false</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-4-answers\" id=\"question-4-answers-C\" value=\"C\" />\n");
      out.write("                        <label for=\"question-4-answers-C\">C) null</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"radio\" name=\"question-4-answers\" id=\"question-4-answers-D\" value=\"D\" />\n");
      out.write("                        <label for=\"question-4-answers-D\">D) not defined</label>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </ol>\n");
      out.write("            \n");
      out.write("                    <input type=\"submit\" value=\"Submit Quiz\"  name=\"btnext\"/>\n");
      out.write("\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tvar gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\n");
      out.write("\tdocument.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tvar pageTracker = _gat._getTracker(\"UA-68528-29\");\n");
      out.write("\tpageTracker._initData();\n");
      out.write("\tpageTracker._trackPageview();\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    </body>\n");
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
