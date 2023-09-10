<html>

<head>
<link rel="stylesheet" href="xyz.css"/>
</head>
    <%@include file="menubar2.jsp" %> 

<style>
   .button
{
  color: black;
  padding: 10px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
}

</style>
<body style="background-image:url(a18.jpg)">
<div id="data"style="font-size:35; color: white;">
    <center>
        
 <%   
  Cookie ck[]=request.getCookies();
   
            
     
                if(ck!=null)
                {
                               
                     	 out.println("welcome " +ck[1].getValue());
                     // out.println("welcome "+c[1].getName());  
                }
	
                else
                {
                    response.sendRedirect("login.html");
                }
                %>
    </center>
    <center>
    <div class="row">
        <a href="instruction.jsp"><button class="col" style="margin:20px; margin-top: 50px;"><img src="p1.png" height ="150" width="150" ></button></a>
        <a href="instruction.jsp"><button class="col" style="margin:20px;"><img src="p2.png" height ="150" width="150" ></button></a>
        <a href="instruction.jsp"><button class="col" style="margin:20px;"><img src="p8.png" height ="150" width="150" ></button></a>
    </div>
    <div class="row" style="margin:30px;">
 <a href="instruction.jsp"><button class="col" style="margin:20px;"><img src="p4.png" height ="150" width="150" ></button></a>
 <a href="instruction.jsp"><button class="col" style="margin:20px;"><img src="p5.png" height ="150" width="150" ></button></a>
 <a href="instruction.jsp"><button class="col" style="margin:20px;"><img src="p6.png" height ="150" width="150" ></button></a>
</div>
        
 </center>
</div>
</body>
</html>