<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%
         

//           PrintWriter out=response.getWriter();
          
           String n1,v1[];
           
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
                                                                                n1=(String)paramNames.nextElement();
                                                                                v1=request.getParameterValues(n1);
                                                                                for(int i=0; i<v1.length; i++)
                                                                                {
                                                                                ans=v1[i];
                                                                                }
                                                                                if(s1.equals(ans))
                                                                                {
                                                                                    count++;
                                                                                }
                                                                               else
                                                                                {
                                                                                    
                                                                                }
                                                                                }
                                                                   out.println("<center><h1>You Have Scored "+count+" Marks out of  10</h1></center>");
                                                                     RequestDispatcher dis = request.getRequestDispatcher("index.html");
                                                                   con.close();                                  
         }
         catch(Exception e)
                 {
                     out.println("Sorry!!! Try Again...");
                 }
         

%>
