<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.employee.EMP_t2.empdetailsDAOImpl" %>
    <%@page import=  "com.employee.model.addressmodel" %>
   <%@page import= "java.util.ArrayList" %>
    <%@page import = "java.util.List" %>
    
    <%@page import="com.employee.EMP_t2.empdetailsDAOImpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>EmployeeAddress</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<% 		List<addressmodel> ne= (ArrayList) request.getAttribute("addres");%>
<center>
<br>
<br>
<br></br></br></br>
			
<thead>
          <%   for (addressmodel ee : ne) { %>
          <b><big>
            	 <tr><tr><table border="4"></tr>
            	 <th>EID</th>
            	 <td> <%=ee.geteId() %></td>
            	 </tr>
            	 <tr>
            	 <th>EmployeeName</th>
            	 <td><a href ="AddressdetailServlet?name=<%=ee.getEmployeeName()%>"><%=ee.getEmployeeName() %></a> </td>
            	</tr><tr><th>AddressType</th><td><%=ee.getAddressType() %></td></tr>
            	 <tr><th>AddressLine1</th><td> <%=ee.getAddressLine1() %></td></tr>
            	 <tr> <th>CityName</th><td><%=ee.getCityName() %></td></tr>
                 <tr> <th>pinCode</th>	 <td> <%=ee.getPinCode() %></td></tr>
            	
            	 </tr>
            	 </b></big>
            <% }  %>
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

</body>
</html>