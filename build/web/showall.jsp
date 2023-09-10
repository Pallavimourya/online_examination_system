<%@page import= "java.sql.*" %>
<html>
<head>

<link rel="stylesheet" href="xyz.css"/>
</head>


<body>
 <%@include file="menubar2.jsp" %> 
<div id="data">
<center>
  <%
              try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from regis");
%>  1
<table cellspacing="20px">
    <tr>
        <td>Rollno</td>
         <td>Name</td>   
         <td>Physic</td>
         <td>Chemistry</td>
         <td>Math</td>
    </tr>
    <%
        while(rs.next())
        {
    %>
       
    <tr>
        <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
          <td><%=rs.getString(3)%></td>
           <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
    </tr> 
    <%
        }
        con.close();
           }
              catch(Exception e1)
              {
                  out.println(e1);
                  
              }
  %>            
</table>
</center>

</div>
</body>
</html>