<!--<html>
<head>
<link rel="stylesheet" href="xyz.css"/>
</head>
<body style="background-image: url(a.jpg);">
 <%@include file="menubar1.jsp" %> 
<div id="data">
<center>
<Form action="login2.jsp">
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
                      Forgot <a href="pass.jsp"> password? </a>
                 <br><br>
               <center><input type="submit" value="Login"  style="height:35px; width:500px; font-size:20" ><br>
           </center>
		    
                
         
             
        </td>
        </tr>

</table>
</Form>
</center>
</div>
</body>
</html>-->



<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body 
{
    background-image:url(a.jpg);
    background-size: 1550px 800px;
background-repeat: no-repeat;
    font-family: Arial, Helvetica, sans-serif;
}
/*form
{border: 3px solid #f1f1f1;
}*/

input[type=text], input[type=password] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 30%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 15%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.up {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<center>
<body>

    <h1 style="color:white;">Login Form</h1>
<br>
<br>
<form action="login2.jsp" method="post">
  <div class="imgcontainer">
    <img src="a12.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="un"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="un" required><br>

    <label for="up"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="up" required>
        <br>
<!--    <button type="submit">Login</button>
   
        <br>-->
 
                   <input type="checkbox" checked="checked"  style="font-size: 30;" > Remember pass
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   
                      Forgot <a href="pass.jsp"> password? </a>
                      <br>
                      <button type="submit">Login</button>
                      <br>
                      Back to home page <a href="index.jsp"> click here ? </a>
   
  
</form>

</body>
</center>
</html>
