
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.chainsys.employeeapp.model.bloodmodel"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Donors</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


</head>
<body>


<jsp:include page="header.jsp"></jsp:include>
<%
String bloodGroup = request.getParameter("bloodgroup");
%>
	<%
		ArrayList<bloodmodel> list = (ArrayList) request.getAttribute("blood");
	%>
<h1><center>Blood Donors</center></h1>
<form action=SendMaill.jsp>	
<input type="text" name="bloodGroup" value="<%=bloodGroup %>" readonly/>
	<center><table border="1">
		<thead>
			<tr>
				<th>S.No</th>
				<th>empId</th>
				<th>Name</th>
				<th>DepartmentId</th>
				<th>Employeemob</th>
				<th>MailAddress</th>
			</tr>
			<%
				int i = 1;
				for (bloodmodel obj : list) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=obj.geteId() %>
				<td><%=obj.getEmployeeName()%></td>
				<td><%=obj.getDepartmentId() %>
				<td><%=obj.getEmployeeMobnum()%></td>
				<td><%=obj.getGmail()%></td>
				
			</tr>


			<%
				}
			%>
		</thead>
	</table></center></br>
	<center><button> <type="submit">SendMail</a></button></center>
</form>
</body>
</html>