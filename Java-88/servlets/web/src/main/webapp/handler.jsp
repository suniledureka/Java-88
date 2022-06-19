<%@page isErrorPage="true"%>
<body style="background-color:lightblue;color:red">
<h2>
 <%
  if(exception instanceof ArithmeticException)
	  out.println(exception.toString());
  else if(exception instanceof ArrayIndexOutOfBoundsException)
	  out.println("Exception ---> " + exception.getMessage());
  else
	  out.println("Internal Server Error");
 %>
</h2>
</body>