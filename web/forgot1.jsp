<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
    

	String s21=request.getParameter("n1");
                      String s31=request.getParameter("p1");
                      String s32=request.getParameter("p2");
                     
                      try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_name="root";
			String db_password="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_name,db_password);
			
			Statement st=con.createStatement();
    if(s31.equals(s32))
    {
   			
	st.executeUpdate("update regis set password='"+s31+"' where  email=' "+s21+" ' ");
        
                        out.println("Your Password Change Successfully!!!");
                        out.println(s21+" ");
    }
    else
    {
        out.println("Password doesnot Change..Try Again?!!!"); 
        
    }
 
con.close();
	 }  
        
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
      

%>