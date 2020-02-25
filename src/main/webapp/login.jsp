
    
    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>


 <form action="loginServlet">
<table align="center">
<center><b>
<h3> Login </h3>
<br><br>
<tr><br>
<td>UserName</td>
<td><input type="text" name="Username" /></td>
</tr>
<br>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr></b><br/>
</center>
<tr>

<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></input><input type="reset" value="Reset"></input></td>
</br>
</tr>
</table>
</form>
</body>
</html> 
    
