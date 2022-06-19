<h2>
<%
 String uname = request.getParameter("txt_uid");
 out.println("Hello, "+ uname);
 pageContext.setAttribute("user_name", uname, PageContext.SESSION_SCOPE);
%>
</h2>
<br>
<a href="pagecontext2.jsp">Next Page</a>
