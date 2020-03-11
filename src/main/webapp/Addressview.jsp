<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@page import="com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl" %>
    <%@page import=  "com.chainsys.employeeapp.model.EmployeeAddress" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
    
    <%@page import="com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>EmployeeAddress</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>

<center>
<br>
<br>
<br></br></br></br>
			
<thead>

            <c:forEach items="${addres}" var = "b"  >
          <b><big>
            	 <tr><tr><table border="4"></tr>
            	 <th>EID</th>
            	 <td> ${b.eId}</td>
            	 </tr>
            	 <tr>
            	 <th>employeeName</th>
            	 <td>${b.employeeName}</td>
            	<tr><th>AddressType</th><td>${b.addressType}</td></tr>
            	 <tr><th>AddressLine1</th><td> ${b.addressLine1}</td></tr>
            	 <tr> <th>CityName</th><td>${b.cityName}</td></tr>
                 <tr> <th>pinCode</th>	 <td> ${b.pinCode}</td></tr>
            	
            	 </tr>
            	 </b></big>
           </c:forEach>
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