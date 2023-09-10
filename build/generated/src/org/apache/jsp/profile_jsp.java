package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("      {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background-color: #000\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    width: 350px;\n");
      out.write("    background-color: #efefef;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: all 0.5s\n");
      out.write("}\n");
      out.write("\n");
      out.write(".image img {\n");
      out.write("    transition: all 0.5s\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover .image img {\n");
      out.write("    transform: scale(1.5)\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    height: 140px;\n");
      out.write("    width: 140px;\n");
      out.write("    border-radius: 50%\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name {\n");
      out.write("    font-size: 22px;\n");
      out.write("    font-weight: bold\n");
      out.write("}\n");
      out.write("\n");
      out.write(".idd {\n");
      out.write("    font-size: 14px;\n");
      out.write("    font-weight: 600\n");
      out.write("}\n");
      out.write("\n");
      out.write(".idd1 {\n");
      out.write("    font-size: 12px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".number {\n");
      out.write("    font-size: 22px;\n");
      out.write("    font-weight: bold\n");
      out.write("}\n");
      out.write("\n");
      out.write(".follow {\n");
      out.write("    font-size: 12px;\n");
      out.write("    font-weight: 500;\n");
      out.write("    color: #444444\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn1 {\n");
      out.write("    height: 40px;\n");
      out.write("    width: 150px;\n");
      out.write("    border: none;\n");
      out.write("    background-color: #000;\n");
      out.write("    color: #aeaeae;\n");
      out.write("    font-size: 15px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text span {\n");
      out.write("    font-size: 13px;\n");
      out.write("    color: #545454;\n");
      out.write("    font-weight: 500\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icons i {\n");
      out.write("    font-size: 19px\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr .new1 {\n");
      out.write("    border: 1px solid\n");
      out.write("}\n");
      out.write("\n");
      out.write(".join {\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: #a0a0a0;\n");
      out.write("    font-weight: bold\n");
      out.write("}\n");
      out.write("\n");
      out.write(".date {\n");
      out.write("    background-color: #ccc\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container mt-4 mb-4 p-3 d-flex justify-content-center\">\n");
      out.write("    <div class=\"card p-4\">\n");
      out.write("        <div class=\" image d-flex flex-column justify-content-center align-items-center\"> <button class=\"btn btn-secondary\"> <img src=\"https://i.imgur.com/wvxPV9S.png\" height=\"100\" width=\"100\" /></button> <span class=\"name mt-3\">Eleanor Pena</span> <span class=\"idd\">@eleanorpena</span>\n");
      out.write("            <div class=\"d-flex flex-row justify-content-center align-items-center gap-2\"> <span class=\"idd1\">Oxc4c16a645_b21a</span> <span><i class=\"fa fa-copy\"></i></span> </div>\n");
      out.write("            <div class=\"d-flex flex-row justify-content-center align-items-center mt-3\"> <span class=\"number\">1069 <span class=\"follow\">Followers</span></span> </div>\n");
      out.write("            <div class=\" d-flex mt-2\"> <button class=\"btn1 btn-dark\">Edit Profile</button> </div>\n");
      out.write("            <div class=\"text mt-3\"> <span>Eleanor Pena is a creator of minimalistic x bold graphics and digital artwork.<br><br> Artist/ Creative Director by Day #NFT minting@ with FND night. </span> </div>\n");
      out.write("            <div class=\"gap-3 mt-3 icons d-flex flex-row justify-content-center align-items-center\"> <span><i class=\"fa fa-twitter\"></i></span> <span><i class=\"fa fa-facebook-f\"></i></span> <span><i class=\"fa fa-instagram\"></i></span> <span><i class=\"fa fa-linkedin\"></i></span> </div>\n");
      out.write("            <div class=\" px-2 rounded mt-4 date \"> <span class=\"join\">Joined May,2021</span> </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
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
