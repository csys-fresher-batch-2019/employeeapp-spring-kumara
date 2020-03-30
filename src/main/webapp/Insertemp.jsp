<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employees</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<body>
	<jsp:include page="head.jsp"></jsp:include>
</head>
<style>
body {
	background-image: url('assets/images/images.png');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
<form action="InsertEmpServlet" action="get">
	<center>
		<b>
			<h2>
				Insert New Employee
				<h2 />
				<small><br>Enter EmployeeName :<input type="text"
					name="name" placeholder="Enter EmployeeName" required autofocus><br />
					<br>&nbsp;&nbsp;&nbsp; Enter Gender : <input type="radio"
					name="gender" value="male">male <input type="radio"
					name="gender" value="female">female <input type="radio"
					name="gender" value="others">others <br /> <br>Enter
					DOB :<input type="date" name="dob" placeholder="YYYY-MM-DD"
					max="2020-03-30" / required><br /> <br>Enter
					JoiningDate :<input type="date" name="joindate"
					placeholder="YYYY-MM-DD" max="2020-03-30" /><br /> <!--  <br> Enter panCard : <input type="text" name="pancard">
</br>
&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;--> <br> Enter AdharNumber :<input type="number"
					name="adhar" required></br> <br>
				<label for="phone">Enter Mobile Number :</label> <input type="tel"
					id="phone" name="phone" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required>
					</br> <br>Enter Email : <input type="email" name="email" required><br />
					<br> Enter BloodGroup: <input type="text" name="bloodGroup"
					required> </br> <br>
				<button type="Submit">Submit</button>
					</br>
		</b></small>
	</center>
</form>
</body>
</html>