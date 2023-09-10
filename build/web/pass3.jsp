<%@page import="java.sql.*"%>
<html>
<head>
<link rel="stylesheet" href="xyz.css"/>
</head>
<body style="background-image: url(a19.jpg)">
<center>
    <h1 style="margin-top: 150px;color: white"> Change Password</h1>

<form method="post" action="pass3.jsp">
    <table cellpadding="20px">

<tr style="font-size: 20;">
		<td>
                    <label>New-password:</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
            <input type="text" placeholder="New Password" name="p1" required style="font-size: 20;"><br>
		</td>	
		</tr>
<tr style="font-size: 20;">
		<td>
                    <label>Re-Enter Password: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
            <input type="text" placeholder="Re-Enter New Password"  name="p2" required style="font-size: 20"><br>
		</td>	
		</tr>
                <tr>
                    <td>
                <center>       <input type="submit" style="width: 300; height: 30"> </center>
                    </td>
                </tr>
                
    </table>
</form>
     
    <%
    

	String s21=request.getParameter("email");
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
   
   			
	st.executeUpdate("update regis set password='"+s31+"' where  email=' "+s21+" ' ");
        
              //  out.println("Your Password Change Successfully!!!");
                    //    out.println(s21+" ");
    
    
  
           con.close();
	 }  


	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
      

%>
    
</center>
</body>
</html>