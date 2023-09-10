<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<html>
<head>
<link rel="stylesheet" href="xyz.css"/>
</head>
<body style="background-image: url(a19.jpg)">
<center>
    <h1 style="margin-top: 150px;color: white">Reset Your Password</h1>

<form method="post" action="forgot.jsp">
    <table cellpadding="20px">
<tr style="font-size: 20;">
		<td>
                    <label>Enter Email Id: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
            <input type="text" placeholder="Email Id" name="n1" required style="font-size: 25;"><br>
		</td>	
		</tr>
                
                <tr>
                    <td>
               <br><br> <center>       <input type="submit" style="width: 300; height: 30" name="us"> </center>
                    </td>
                </tr>
      
    </table>
</form>
</center>
</body>
</html>
 