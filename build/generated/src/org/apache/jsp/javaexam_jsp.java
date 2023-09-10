package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public final class javaexam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String NO;
            String question;String A; String B; String C; String D;String Answer; String email;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        var sessionTimeout = 1800;\t\n");
      out.write("        \n");
      out.write("        function DisplaySessionTimeout()\n");
      out.write("        {\n");
      out.write("            window.history.go(+1);\n");
      out.write("            sessionTimeout = sessionTimeout - 1;\n");
      out.write("            //document.getElementById(\"val\").innerHTML=sessionTimeout;\n");
      out.write("            \n");
      out.write("            //if session is not less than 0\n");
      out.write("            if (sessionTimeout >= 0)\n");
      out.write("                {\n");
      out.write("                //call the function again after 1 minute delay\n");
      out.write("                \n");
      out.write("               window.setTimeout(\"DisplaySessionTimeout()\",1000);\n");
      out.write("                }    \n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                //show message box\n");
      out.write("                //document.getElementById(\"val\").innerHTML=\"TIME OUT\";\n");
      out.write("                alert(\"Your current Session is over.\");\n");
      out.write("                setTimeout(document.form1.sub.click());\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write(" \n");
      out.write("\n");
      out.write("// \n");
      out.write(" var milisec=0 \n");
      out.write(" var seconds=1 \n");
      out.write(" document.form1.d2.value='10' \n");
      out.write("\n");
      out.write("function display()\n");
      out.write("{ \n");
      out.write(" if (milisec<=0){ \n");
      out.write("    milisec=60 \n");
      out.write("    seconds-=1 \n");
      out.write(" } \n");
      out.write(" if (seconds<=-1){ \n");
      out.write("    milisec=0 \n");
      out.write("    seconds+=1 \n");
      out.write(" } \n");
      out.write(" else \n");
      out.write("    milisec-=1 \n");
      out.write("    document.form1.d2.value=seconds+\"M : \"+milisec+\" S\"\n");
      out.write("    setTimeout(\"display()\",1000) \n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <body onLoad=\"javascript:display();DisplaySessionTimeout();\">\n");
      out.write("             \n");
      out.write("             <form name=\"form1\" action=\"Result.jsp\" method=\"post\">\n");
      out.write("                <div class=\"clock\">\n");
      out.write("                 <input type=\"text\" name=\"d2\" value=\"\" size=\"8\"><br>\n");
      out.write("                </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");
 email=request.getParameter("email"); 
      out.write("\n");
      out.write("            <h1>Java  Quiz</h1><br>\n");
      out.write("            ");

              PreparedStatement st;  
                 Connection conn;
           ResultSet res;
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Quiz","root","root");
           
           try
           {
               st=conn.prepareStatement("SELECT * FROM sawal");
               res=st.executeQuery();
               
               while(res.next())
               {
                NO=res.getString(1);
               question=res.getString(2);
              
               out.println("Question : <pre>" +question+"</br>");
               
               A=res.getString(3);//3
               B=res.getString(4);//4
               C=res.getString(5);//5
               D=res.getString(6);//6
               Answer=res.getString(7);
               
               out.println("<input type='checkbox' value='A' name='K'>" +A+"</br>");
               out.println("<input type='checkbox' value='B' name='K'>" +B+"</br>");
               out.println("<input type='checkbox' value='C' name='K'>" +C+"</br>");
               out.println("<input type='checkbox' value='D' name='K'>" +D+"</br>");
               out.println("</pre>");
               }
              
               conn.close();
           }
           catch (SQLException s)
           {
               
           }
           }
           catch (Exception e)
           {
           }
           
           
           
      out.write("\n");
      out.write("   \n");
      out.write("    <input type=\"submit\">\n");
      out.write("    <input type=\"reset\">\n");
      out.write("        </form>\n");
      out.write("     </body>\n");
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
