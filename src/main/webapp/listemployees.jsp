<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.chainsys.employeeapp.model.EmployeeDetail"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDate"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<center>
		<h3>EMPLOYEE DETAILS</h3>
		<thead>
			<tr>
				<table border="2">
					<b>
						<th>EID></th>
						<th>EmployeeName</th>
						<th>Gender</th>
						<th>BirthDate</th>
						<th>JoiningDate</th>
						<th>pancard</th>
						<th>email</th>
						<th>Bloodgroup</th>
					</b>
					</tr>
					<c:forEach items="${empp}" var="b">

						<tr>
							<td>${b.eId}</td>
							<td><a href="AddressdetailServlet?name=${b.employeeName}">${b.employeeName}</a>
							</td>
							<td>${b.gender}</td>
							<td><c:set var="startDate" value="${b.birthDate}" /> <fmt:parseDate
									var="parsedStartDate" value="${b.birthDate}" type="date"
									pattern="yyyy-MM-dd" /> <fmt:formatDate pattern="dd-MM-yyyy"
									value="${parsedStartDate}" /></td>
							<td><c:set var="startDate" value="${b.joiningDate}" /> <fmt:parseDate
									var="parsedStartDate" value="${b.joiningDate}" type="date"
									pattern="yyyy-MM-dd" /> <fmt:formatDate pattern="dd-MM-yyyy"
									value="${parsedStartDate}" /></td>
							<td>${b.panCard}</td>
							<td>${b.gmail}</td>
							<td>${b.bloodGroup}</td>
						</tr>
					</c:forEach>
				</table>
				<br>
				<big>
					<form action="AllEmployee.jsp">
						<button>
							<type="Submit" >Back 
						</button>
				</big>
				</br>
				</form>
	</center>
	</thead>
</body>
</html>