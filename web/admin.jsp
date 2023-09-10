<html>
<head>
<link rel="stylesheet" href="xyz.css"/>
</head>
<body style="background-image: url(a13.jpg);">
 <%@include file="menubar1.jsp" %> 
<div id="data">
<center>
    <form action="admin1.jsp">
<table cellpadding="20px">
         
    <tr style="font-size: 30;">
		<td>
                    <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="un" required style="font-size: 25;"><br>
		</td>	
		</tr>	
		
		<tr style="font-size: 30;">
		<td>
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="up" required style="font-size: 25;"><br>
		</td>
		</tr>	
			
		<tr>	
		<td>
                 
                   <input type="checkbox" checked="checked"  style="font-size: 30;" > Remember pass
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      Forgot <a href="#"> password? </a>
                 <br><br>
               <center><input type="submit" value="Login"  style="height:35px; width:500px; font-size:20" ><br>
           </center>
		    
                
                
        </td>
        </tr>

</table>
    </form>
</center>
</div>
</body>
</html>