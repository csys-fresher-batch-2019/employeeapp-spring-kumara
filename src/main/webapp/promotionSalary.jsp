<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<jsp:include page="head.jsp"></jsp:include>
<form action= "promotionServlet">	
<center><big><b>
<br><br></br></br>
<br> Enter increment : <input type="number" name="num" step="0.01" min="0" max="1" required></br>

<br>Enter YearPromotion :<input type="number" name="number" required></br> 
<br><button type="Submit">submit</button></br>

</b></big></center></form></body>
</html>