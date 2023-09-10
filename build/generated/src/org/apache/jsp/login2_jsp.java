package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

		String s1=request.getParameter("un");
		String s5=request.getParameter("up");
	
		  try
                       {
               
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_password="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from regis where name='"+s1+"' AND password='"+s5+"' ");
        
	if(rs.next())
	{  
          //  Cookie ck=new Cookie(s1,"");
           Cookie ck=new Cookie("name",s1);
          ck.setMaxAge(60*60);
            response.addCookie(ck);
//            
//             Cookie ck1=new Cookie("upass",s2);
//            ck.setMaxAge(60*60);
//            Response.addCookie(ck1);
            
	response.sendRedirect("mymenu.jsp");
	}
	else
	{
		
//		out.println("<center><h1 style= position:absolute;right:550px;top:150px;color:black>Invalid UserName And Password....</h1></center>");
//		RequestDispatcher dis = request.getRequestDispatcher("login.html");
//		dis.include(request,response);

                                       request.setAttribute("errorMessage", "Invalid username or password"); 
              RequestDispatcher dispatcher = request.getRequestDispatcher("/login1.jsp");
              dispatcher.forward( request, response);

	}
	con.close();
	 }           
	   catch(Exception e1)
	   {
		  out.println(e1);
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
