<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.chainsys.employeeapp.dao.impl.salaryDAOImpl" %>
    <%@page import=  "com.chainsys.employeeapp.model.incrementmodel" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<body>
<jsp:include page="head.jsp"></jsp:include></head>
<br><br><br></br></br></br>

<% 		List<incrementmodel> ne= (ArrayList) request.getAttribute("promote");%>
<center>
<thead>
<tr><table border="5">
	<b>
	<th>Emp_ID</th>
	<th>Department_ID</th>
	<th>EmployeeName</th>
	<th>OldSalary</th>
	<th>NewSalary</th>
	<th>No_of_year</th>
	
	
		
	</b>
</tr>
          <%   for (incrementmodel ee : ne) { %>
            	 <tr>
            	 <td> <%=ee.geteId() %></td>
            	 <td> <%=ee.getDepartmentId() %></td>
            	 <td><%=ee.getEmployeeName() %></td>
            	 <td> <%=ee.getOldSalary() %></td>
            	 <td> <%=ee.getNewSalary() %>
            	 <td> <%=ee.getNoofyear() %></td>
            	 </tr>
            	 
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