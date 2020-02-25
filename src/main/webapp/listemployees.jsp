<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.employee.EMP_t2.empdetailsDAOImpl" %>
    <%@page import=  "com.employee.model.EmployeeDetail" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
    <%@page import = "java.time.LocalDate" %>
    <%@page import="com.employee.EMP_t2.empdetailsDAOImpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<center>
<h3> EMPLOYEE DETAILS </h3>


<% 		List<EmployeeDetail> ne= (ArrayList) request.getAttribute("empp");%>

<thead>
<tr><table border="2">
	<b>
	<th>EID></th>
	<th>EmployeeName</th>
	<th>Gender></th>
	<th>BirthDate</th>
	<th>JoiningDate</th>
	<th>pancard</th>
		<th>email</th>
		<th>Bloodgroup</th>
	</b>
</tr>
          <%   for (EmployeeDetail ee : ne) { %>
            	 <tr>
            	 <td> <%=ee.geteId() %></td>
            	 <td><a href ="AddressdetailServlet?name=<%=ee.getEmployeeName()%>"><%=ee.getEmployeeName() %></a> </td>
            	 <td> <%=ee.getGender() %></td>
            	 <td> <%=ee.getBirthDate() %></td>
            	 <td> <%=ee.getJoiningDate() %></td>
            	 <td> <%=ee.getPanCard() %></td>
            	 <td> <%=ee.getGmail() %></td>
            	 <td> <%=ee.getBloodGroup() %></td>
            	 </tr>
            	 
            <% }  %>
</table>
<br><big>
<form action="AllEmployee.jsp">
<button> <type ="Submit" >Back </button>
</big>
</br>
</form>
</center>
</thead>
</body>
</html>