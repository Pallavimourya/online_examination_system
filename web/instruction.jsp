<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="xyz.css"/>
<script type="text/javascript" src="delete.js">

</script>

        <title>Online Exam</title>
    </head>
    <body style="background-image: url(a21.jpg);">
       <center> 
           <h1 style="margin-top:5px">Instruction..!!!</h1>
       </center>            
  
    <h2 style="margin-left: 50px;margin-top: 40px"> During the exam:</h2>  
      <!--<h4>-->
        <p style="margin-left: 50px; color: white;">

1. Do not resize or minimise the browser during the online exam.<br><br>
2. Do not close the browser during the test before your exam is complete.<br><br>
3. Do not click the ‘BACK’ button of browser during exam.<br><br>
4. Keep an eye on the TIMER CLOCK on top left of the online exam page of the browser to keep a track of
the time left.<br><br>
7. On the window that pops up on clicking the pre-confirm button, cross check your ‘admission number’ and
the total number of questions attempted.<br><br>
8. If the number of questions attempted shown is not correct, press on CANCEL to go back to the main
question paper and check for any anomaly.<br><br>
9. If the number of questions attempted shown is correct, click the checkbox ‘Match as per attempted’ and
click the ‘SUBMIT’ button.<br><br>
10. Once submitted, a message shall be displayed “Your Exam has been submitted successfully’ and you
can logout from the student online portal.<br><br>
              <!--</h4>-->
           </p>
           <h2 style="margin-left: 50px"> General instructions:</h2>
           <p style="margin-left: 50px;color: white;">
1. Make sure you appear for the online exam sitting alone in a well lit room with no background noise during
the entire process of the exam.<br><br>
2. For subjects that requires rough work, make sure you do the rough works on blank sheet and not on any
notebook.<br><br>
3. If any student is found to use unfair means or if the student is not visible on camera during the entire
course of the online exam, that student’s exam will be disqualified.<br>
           </p>
           <form action="javatest.html" style="margin-left: 50px">              
   <h4><input type="checkbox"  name="c1" value="accept">
  <label>I have read all the instrution carefully.</label><br>   <br>
       
  <input type="submit" value="Submit" name="as" onclick="demo1() ">
   </h4></form>   
    </body>
</html>













<%--<%! 
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://192.168.10.13/data";
String uid = "root";
String psw = "root";
Connection con;
ResultSet rs;
PreparedStatement ps;
%>
<%
try
{
Class.forName(driver);
con = DriverManager.getConnection(url,uid,psw);
}
catch(ClassNotFoundException cx)
{
out.println(cx);
}
String option = request.getParameter("dish");
if(option !=(null))
{ 
try{

String sql = "INSERT INTO cuisine(favoriteCuisine) VALUES(?)";
ps= con.prepareStatement(sql);
ps.setString(1, option);
int i = ps.executeUpdate();
if(i != 0)
{
out.println("Your order has been made successfully");
}
else
out.println("Sorry your order can not be made try again later");

%>
<p>You Cuisine order is for 
<%= option %></p>
<%
}
catch(Exception e)
{
out.println(e);
}
finally
{
if(rs != null)
{
rs.close();
}
if(ps != null)
{
ps.close();
}
if(con != null)
{
con.close();
}
}
} 
%>--%>
