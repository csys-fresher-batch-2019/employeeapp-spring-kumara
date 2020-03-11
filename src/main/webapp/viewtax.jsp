<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="com.chainsys.employeeapp.dao.impl.salaryDAOImpl" %>
    <%@page import=  "com.chainsys.employeeapp.model.EmployeeSalary" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body><jsp:include page="head.jsp"></jsp:include>
<%
	List<EmployeeSalary> ne= (ArrayList) request.getAttribute("taxx");
%>
<center>
<thead>
<tr><table border="2">
<br><br><br>
<br/></br></br>
	
</tr>
          <%
          	for (EmployeeSalary ee : ne) {
          %>
            	<b> <tr><th>Emp_ID</th>
            	 <td> <%=ee.geteId() %></td><tr/>
            	 <tr>	<th>Department_ID</th>
            	 <td> <%=ee.getDepartmentId() %></td></tr>
            	 <tr> <th>EmployeeName</th>
            	 <td> <%=ee.getEmployeeName() %></td></tr>
            	 <tr>
            		<th>Annualsalary</th>
            	 <td> <%=ee.getAnnualSalary() %></td></tr>
            	 	<tr><th>tax</th>
            	 <td> <%=ee.getTax() %> </td><tr/>
            	 <tr>	<th>year</th>
            	 <td> <%=ee.getSalaryYear()%></td>
            	 </tr></b>
            	 
            <% }  %>
</table>
<br><big>
<form action="AllEmployee.jsp">
<button> <type ="Submit" >Back </button>
</big>
</br>
</form></center>
</thead>
</body>
</html>
