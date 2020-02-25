<nav class="navbar navbar-expand-sm bg-dark">
<a class="navbar-brand" href="index.jsp">Emp</a>
 <!-- Links -->
 <ul class="navbar-nav">
  <li class="nav-item">
   <a class="nav-link" href="login.jsp">Home</a>
</li>

   </ul>


  <ul class="navbar-nav ml-auto">
  <li class="nav-item">
   <a class="nav-link" href="LogoutServlet">Logout</a>
   <%
session.invalidate();
response.sendRedirect("login.jsp");
%>
  </li>
   </ul>
 <!--   <script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script> --> 
</nav>
