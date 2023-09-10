<%@page import= "java.sql.*" %>
<html>
<head>

<link rel="stylesheet" href="xyz.css"/>
<script type="text/javascript" src="delete.js">

</script>
</head>


<body>
 <%@include file="menubar2.jsp" %> 
<div id="data">
<center>

<Form action="delete.jsp">
<table cellpadding="20px">
<tr style="font-size: 30;">
    <td>Enter rollno:</td>
  <td>  <input type="text" name="un" placeholder="Enter rollno " style="font-size: 20;"></td>
</tr>
<th colspan="2">
    <input type="submit" class="B" value="Delete"  name="b1" onclick="demo()"> 
</th>
</table>
</Form>
    
<%
    String s = request.getParameter("b1");
    if(s!=null)
    {
        String s1=request.getParameter("un");
    
   	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("delete  from ins where rollno='"+s1+"' ");
	
          	response.sendRedirect("showall.jsp");
  
        
        con.close();
           }
            catch(Exception e1)
         {
             out.println(e1);
         }
       }
         %>
</center>

</div>
</body>
</html>

