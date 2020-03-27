
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<style>
body {
	background-image: url('assets/images/1.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>

	<form action="loginServlet">
		<table align="center">
			<center>
				<b>

					<h3>Login</h3> <br>
				<br> <br> <%
 	String errorMessage = request.getParameter("errorMessage");
 	if (errorMessage != null) {
 		out.println("<font color='red'>" + errorMessage + "</font>");
 	}
 %>
					<tr>
						<td>UserName</td>
						<td><input type="text" name="Username" /></td>
					</tr> <br>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" /></td>
					</tr>
				</b><br />
			</center>
			<tr>


				<td><span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></input><input
					type="reset" value="Reset"></input></td>
				</br>
			</tr>
		</table>

	</form>
</body>
</html>

