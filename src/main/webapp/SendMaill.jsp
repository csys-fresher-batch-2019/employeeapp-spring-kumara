<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<form action= "SendMaill">
<h3>Details</h3><b>
<br>Enter Hospital Name  :<input type="text" name="Hosname"
placeholder = "Enter HospitalName" required autofocus/><br/>
<br>Enter PatientName : <input type="name"  name="name"
required><br/>
<br>Enter patientDiagonsis :<input type="text" name="reason" ><br/>
<br> Enter location:<input type ="text" name="locate" ><br/>
<br>Enter MobileNumber<input type="tel" id="phone" name="phone"
       pattern="[0-9]{3}[0-9]{3}[0-9]{4}"
       required> </br>
       <br>
       <button type="submit">
      <svg version="1.1" class="send-icn" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="100px" height="36px" viewBox="0 0 100 36" enable-background="new 0 0 100 36" xml:space="preserve">
        <path d="M100,0L100,0 M23.8,7.1L100,0L40.9,36l-4.7-7.5L22,34.8l-4-11L0,30.5L16.4,8.7l5.4,15L23,7L23.8,7.1z M16.8,20.4l-1.5-4.3
	l-5.1,6.7L16.8,20.4z M34.4,25.4l-8.1-13.1L25,29.6L34.4,25.4z M35.2,13.2l8.1,13.1L70,9.9L35.2,13.2z" />
      </svg>
      <small>send</small>
    </button></b></br>
<!--  <br><button type= "Submit" >Send Mail</button><br/></b>-->
</form></center>
</body>
</html>