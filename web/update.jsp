<%@page import= "java.sql.*" %>
<html>
<head>

<link rel="stylesheet" href="xyz.css"/>
</head>


<body>
 <%@include file="menubar2.jsp" %> 
<div id="data">
<center>

<Form action="update.jsp">
<table cellpadding="20px">
<tr style="font-size: 30;">
    <td>Enter rollno:</td><td><input type="text" name="un" placeholder="Enter rollno " style="font-size: 20;"></td>
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
        <form action="update.jsp">
            <table>
                <tr>
                    <td>Rollno</td>
                    <td><input type="text" name="n1" value=<%= rs.getString(1)%>></td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><input type="text" name="n2" value=<%= rs.getString(2)%>></td>
                </tr>
                 <tr>
                    <td>physics</td>
                    <td><input type="text" name="n3" value=<%= rs.getString(3)%>></td>
                </tr>
                 <tr>
                    <td>chemistry</td>
                    <td><input type="text" name="n4" value=<%= rs.getString(4)%>></td>
                </tr>
                 <tr>
                    <td>maths</td>
                    <td><input type="text" name="n5" value=<%= rs.getString(5)%>></td>
                </tr>
                <tr>
                <th colspan="2">
                    <input type="submit" class="B" value="Submit"  name="b2"> 
                     </th>
                </tr>
            </table>
        </form>
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
</center>

</div>
</body>
</html>

<%
    String s11 = request.getParameter("b2");
    if(s11!=null)
    {
        String s21=request.getParameter("n1");
        String s31=request.getParameter("n2");
        String s41=request.getParameter("n3");
        String s51=request.getParameter("n4");
        String s61=request.getParameter("n5");
    
   	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/onlinedb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("update ins set uname='"+s31+"',phy='"+s41+"',chem='"+s51+"',maths='"+s61+"' where rollno='"+s21+"' ");
	
	response.sendRedirect("showall.jsp");
        con.close();
           }
            catch(Exception e1)
         {
             out.println(e1);
         }
       }
 
%>
            
       
   