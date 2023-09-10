<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
                            String s2=request.getParameter("n1");
                       try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_name="root";
			String db_password="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from regis where email='"+s2+"' ");
	response.sendRedirect("pass3.jsp");
	  
        con.close();
           }
            catch(Exception e1)
         {
             out.println(e1);
         }
       


%>