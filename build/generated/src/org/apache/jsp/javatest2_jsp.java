package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;
import java.util.*;
import java.io.*;

public final class javatest2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

         

          // PrintWriter out=response.getWriter();
           String paramName,paramValue[];
           
           Connection con=null;
           Statement stmt=null;
          ResultSet rs=null;
           
         int count=0;
         String ans=" ";
         
         Enumeration paramNames=request.getParameterNames();
         try
         {
             
             Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_password="root";
			
			 con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			stmt=con.createStatement();
                                                                   rs=stmt.executeQuery("Select ans from java");
                                                                   
                                                                   while(rs.next() && paramNames.hasMoreElements())
                                                                           {
                                                                                String s1=rs.getString(1);
                                                                                paramName=(String)paramNames.nextElement();
                                                                                paramValue=request.getParameterValues(paramName);
                                                                                for(int i=0;i<paramValue.length;i++)
                                                                                {
                                                                                ans=paramValue[i];
                                                                                }
                                                                                if(s1.equals(ans))
                                                                                {
                                                                                    count++;
                                                                                }
                                                                                else
                                                                                {
                                                                                     
                                                                                }
                                                                                }
                                                                   out.println("<center><h1 style=position:absolute;right:550px;top:150px;color:black>You Have Scored "+count+" Marks out of 4</h1></center>");
                                                                     RequestDispatcher dis = request.getRequestDispatcher("index.html");
                                                                   con.close();                                  
         }
         catch(Exception e)
                 {
                     out.println("Sorry!!! Try Again...");
                 }
         


      out.write('\n');
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
