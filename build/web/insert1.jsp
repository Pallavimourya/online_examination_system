<html>
<head>

<link rel="stylesheet" href="xyz.css"/>
</head>


<body>
    <%@include file="menubar2.jsp" %>
<div id="data">
<center>

<Form action="insert2.jsp">
<table cellpadding="20px" style="font-size: 30;" >
    
 <tr>
     <td>Enter rollno:</td>
     <td><input type="number" name="u1" placeholder="Enter rollno."></td>
</tr>
<br>
<tr>
<td>Enter name:</td>
    <td><input type="text"  placeholder="Enter name" name="u2"></td>
</tr>
<br>
<tr>
    <td>Enter physics:</td>
    <td><input type="number"  placeholder="Enter physics" name="u3"></td>
</tr>
<br>
<tr>
<td>Enter chemistry:</td>
    <td><input type="number"  placeholder="Enter chemistry" name="u4"></td>
</tr>
<br>
<tr>
<td>Enter maths:</td>
    <td><input type="number"  placeholder="Enter maths" name="u5"></td>
</tr>

<th colspan="2">
<input type="submit" class="B" value="insert"> 
</th>
</table>
</Form>
</center>

</div>
</body>
</html>