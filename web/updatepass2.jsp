<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%

 String s11 = request.getParameter("n1");
 
   String s31=request.getParameter("n2");
   String s32=request.getParameter("n3");
 
    if(s31.equals(s32))
    {
   	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("update admin set password='"+s31+"' where  password='"+s11+"' ");
        
                        out.println("Your Password Change Successfully!!!");
	//response.sendRedirect("showall.jsp");
        con.close();
           }
            catch(Exception e1)
         {
             out.println(e1);
         }
    }
    else
    {
        out.println("New Password Is Not Match.."); 
        
    }
 


%>