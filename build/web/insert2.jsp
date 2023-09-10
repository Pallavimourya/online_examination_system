<%@page import="java.sql.*" %>
<%
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		String s4=request.getParameter("u4");
		String s5=request.getParameter("u5");
		
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("insert into ins(rollno,uname,phy,chem,maths) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
	con.close();
	response.sendRedirect("showall.jsp");
	 }
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
		
		
		
%>