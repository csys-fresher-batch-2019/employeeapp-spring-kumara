<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<form action="updateServlet">
		<center>
			<b> <br> Enter Employee_id :<input type="number" name="ID"
				required></br> <br>Enter department_id : <input
				type="number" name="dept"><br /> <br>
			<button type="Submit">Added</button>
				</br>

			</b>
		</center>
	</form>
	<%
		String msgs = (String) request.getParameter("res1");
	%>
	<%
		if (msgs != null) {
			out.println("<center> <font color=blue><br>" + msgs + "</font></center>");
		}
	%>
</body>
</html>