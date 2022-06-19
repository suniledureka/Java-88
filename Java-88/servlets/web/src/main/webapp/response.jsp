<%
 String uid = request.getParameter("txt_uid");
 String pwd = request.getParameter("txt_pwd");
 
 if(uid.equals("admin") && pwd.equals("123"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid User Name / Password");
%>