package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\"/>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(a.jpg);\">\n");
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
      out.write("<Form action=\"login2.jsp\">\n");
      out.write("<table cellpadding=\"20px\">\n");
      out.write("    \n");
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
      out.write("                      Forgot <a href=\"pass.jsp\"> password? </a>\n");
      out.write("                 <br><br>\n");
      out.write("               <center><input type=\"submit\" value=\"Login\"  style=\"height:35px; width:500px; font-size:20\" ><br>\n");
      out.write("           </center>\n");
      out.write("\t\t    \n");
      out.write("                \n");
      out.write("         \n");
      out.write("             \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</Form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body \n");
      out.write("{\n");
      out.write("    background-image:url(a.jpg);\n");
      out.write("    background-size: 1550px 800px;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("/*form\n");
      out.write("{border: 3px solid #f1f1f1;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 25%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("  width: 15%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.up {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<center>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1 style=\"color:white;\">Login Form</h1>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<form action=\"login2.jsp\" method=\"post\">\n");
      out.write("  <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"a12.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <label for=\"un\"><b>Username</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"un\" required><br>\n");
      out.write("\n");
      out.write("    <label for=\"up\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"up\" required>\n");
      out.write("        <br>\n");
      out.write("<!--    <button type=\"submit\">Login</button>\n");
      out.write("   \n");
      out.write("        <br>-->\n");
      out.write(" \n");
      out.write("                   <input type=\"checkbox\" checked=\"checked\"  style=\"font-size: 30;\" > Remember pass\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                   \n");
      out.write("                      Forgot <a href=\"pass.jsp\"> password? </a>\n");
      out.write("                      <br>\n");
      out.write("                      <button type=\"submit\">Login</button>\n");
      out.write("                      <br>\n");
      out.write("                      Back to home page <a href=\"index.jsp\"> click here ? </a>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</center>\n");
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
