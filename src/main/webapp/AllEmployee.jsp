<%@page import="com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl" %>
    <%@page import=  "com.chainsys.employeeapp.model.EmployeeDetail" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>fields</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body><center>


<jsp:include page="logoutheader.jsp"></jsp:include>

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
     <br> <a href ="dept.jsp">EmployeeDepartment</a></br>
    <br>   <a href = "bloodsearch.jsp">Blood Search</a>         <br>
 <br> <a href="calculatetax.jsp">Taxcalculation</a></br>
 <br> <a href ="promotionSalary.jsp">promotionSalary</a></br>
     <br> <a href ="delete.jsp">Remove Employee</a><br/>
     
  </B></big></body>
    </center>
   

</html>