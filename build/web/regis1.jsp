<paltt<html>
<head>
<link rel="stylesheet" href="xyz.css"/>
<script type="text/javascript" src="xyz.js">

</script>
</head>
<body style="background-image: url(r1.jpeg);">

<body>
    
<%@include file="menubar1.jsp" %>  
    
<div id="data">
<center>

<Form action="regis2.jsp" id="form">
    <table cellpadding="25px"  style="font-size: 20;">
    
<tr>
<td>Enter Name</td>
<td><input type="text" placeholder="Enter Name" name="un" style="font-size: 20;"></td><br>
</tr>

<tr>
<td>Enter Contact</td>
<td><input type="text" placeholder="10-digits" name="uc" style="font-size: 20;"></td><br>
</tr>

<tr>
<td>Enter Address</td>
<td><input type="text" placeholder="parmanent Address" name="ua" style="font-size: 20;"></td><br>
</tr>

<tr>
<td>Enter Email</td>
<td><input type="text" placeholder="***@gmail.com" name="ue" style="font-size: 20;"></td><br>
</tr>

<tr>
<td>Enter Password</td>
<td><input type="password" placeholder="Enter Password" name="up" id="t1" style="font-size: 20;"></td><br>
</tr>

<tr style="font-size: 25;">
<th colspan="2"><input type="button" value="Registration" class="B"  onclick="demo()"></th><br>
</tr>

</table>
</Form>
</center>
</div>

</body>
</html>