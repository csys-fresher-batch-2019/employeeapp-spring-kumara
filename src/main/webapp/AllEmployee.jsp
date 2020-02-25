<%@page import="com.employee.EMP_t2.empdetailsDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.employee.EMP_t2.empdetailsDAOImpl" %>
    <%@page import=  "com.employee.model.EmployeeDetail" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>fields</title>
</head>
<body><center>
<style>


body
{

  background-image: url('assets/images/images.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}</style>
 
  <%String msgs = (String) request.getParameter("res1");%>
<%if(msgs!=null){
     out.println("<center> <font color=blue><br>" + msgs + "</font></center>");
	}%>
 <B> <big>  
    <br>  <a href = "listempServlet">AllEmployees</a>  <br>
    <br> <a href ="Insertemp.jsp">Add new employees</a><br>
    <br> <a href ="update.jsp">Set department</a><br/>
    <br>   <a href = "bloodsearch.jsp">Blood Search</a>         <br>
  <br> <a href ="dept.jsp">EmployeeDepartment</a></br>
     <br> <a href ="delete.jsp">Remove Employee</a><br/>
    
    
   <br><br> <form action="LogoutServlet">
    
    </script>
 
    <button type="Submit">Logout</button></br></br></form>  
  </B></big></body>
    </center>
   

</html>