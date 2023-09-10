<%@page import="java.sql.*" %>
<%
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
		
		out.println("<center><h1 style= position:absolute;right:550px;top:150px;color:black>Invalid UserName And Password....</h1></center>");
//		RequestDispatcher dis = request.getRequestDispatcher("login.html");
//		dis.include(request,response);

	}
	con.close();
	 }           
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
		
		
		
%>
