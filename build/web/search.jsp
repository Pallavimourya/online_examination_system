<%@page import= "java.sql.*" %>
<html>
<head>

<link rel="stylesheet" href="xyz.css"/>
</head>


<body>
 <%@include file="menubar2.jsp" %> 
<div id="data">
<center>

<Form action="search.jsp">
<table cellpadding="20px">
    <tr style="font-size: 30;">
<td>Enter rollno</td><td><input type="text" name="un" placeholder="Enter rollno " style="font-size: 20;"></td>
</tr>
<th colspan="2">
<input type="submit" class="B" value="Search"  name="b1"> 
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
			
	ResultSet rs=st.executeQuery("select * from ins where rollno='"+s1+"' ");
	if(rs.next())
	{
            
        %>
        <form action="search.jsp">
            <table>
                <tr>
                    <td>Rollno</td>
                    <td><%= rs.getString(1)%></td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><%= rs.getString(2)%></td>
                </tr>
                 <tr>
                    <td>physics</td>
                    <td><%= rs.getString(3)%></td>
                </tr>
                 <tr>
                    <td>chemistry</td>
                    <td><%= rs.getString(4)%></td>
                </tr>
                 <tr>
                    <td>maths</td>
                    <td><%= rs.getString(5)%></td>
                </tr>
                 <%
        }
        con.close();
           }
            catch(Exception e1)
         {
             out.println(e1);
         }
       }
         %>
<!--                <tr>
                <th colspan="2">
                    <input type="submit" class="B" value="Search"  name="b2"> 
                     </th>
                </tr>
            </table>

            
       
   -->