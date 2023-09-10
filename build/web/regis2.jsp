<%@page import="java.sql.*" %>
<%
    	        String s1=request.getParameter("un");
		String s2=request.getParameter("uc");
	        String s3=request.getParameter("ua");
                 String s4=request.getParameter("ue");
                  String s5=request.getParameter("up");
		
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_name="root";
			String db_password="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("insert into regis (name,contact,address,email,password)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
	con.close();
          response.sendRedirect("login1.jsp");
	 }
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
  %>             
