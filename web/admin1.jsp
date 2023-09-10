<%@page import="java.sql.*" %>
<%
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		
		
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_password="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from admin where name='"+s1+"' AND password='"+s2+"' ");
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
            
            

            
	response.sendRedirect("admin3.jsp");
	}
	else
	{
		out.println("<center><p style= position:absolute;right:650px;top:100px;color:red>invalid user name and pass...</p></center>");
		RequestDispatcher dis = request.getRequestDispatcher("login.html");
		dis.include(request,response);

	}
	con.close();
	 }           
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
		
		
		
%>}
