<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Registration</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>

<style>

body
{

  background-image: url('assets/images/images.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<body>
<jsp:include page="header.jsp"></jsp:include>

<center>
<big>
<h3>Registration form</h3>
<form action="RegisterServlet">
 <br><label for="your-name">Name:</label> 
    <input type="text" name="name" id="name" minlength="3" placeholder="(your name here)" required></br>
    <br> <label for="email">Enter Email:</label> 
    <input type="email" name="email" id="email" placeholder="(your email address)" required></br>
<!--  Enter Name  :<input type="text" name="name"
placeholder = "Enter Name" required autofocus/><br/>
<br>Enter Email : <input type="email"  name="email"
required><br/> -->
<br>Enter Password :<input type="password" name="password" required><br>

<br>Enter DOB  :<input type="date" name="dob" placeholder="YYYY-MM-DD" max="2020-02-20"/><br/>
<br>
Enter Mobile Number :
<input type="text" name="number" required
placeholder="Enter Mobile Number">
<br/>
<br>
Enter Gender :
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Others">Others
<br/>

<pre><button type="Submit" > submit </button></pre>

</big>
</form>
</center>
</body>
</html>
  
   