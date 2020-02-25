<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList"%>
<%@ page import="com.employee.model.Empdept"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		ArrayList<Empdept> list = (ArrayList) request.getAttribute("empp");
	%>
<big><br><center>
<h3>Dept Details</h3></br>
	<table border="1">
		<thead>
			<tr>
				<th>S.No</th>
				<th>EID></th>
				<th>DepartmentId</th>
				<th>department_name</th>
				<th>employee_name</th>
				<th>department_location</th>
			</tr>
			<%
				int i = 1;
				for (Empdept obj : list) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=obj.geteId()%></td>
				<td><%=obj.getDepartmentId()%></td>
				<td><%=obj.getDepartmentName()%></td>
				<td><%=obj.getEmployeeName()%></td>
				<td><%=obj.getDepartmentLocation()%></td>
				
				
			</tr>
			<%
				}
			%></big>
		</table></thead>
		<br>
		<big></big><form action="AllEmployee.jsp">
<button> <type ="Submit" >Back </button></form></big>
	</br>	</center>
		</form>
</body>
</html>