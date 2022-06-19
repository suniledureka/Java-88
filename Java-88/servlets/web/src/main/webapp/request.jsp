<h2>
<%
 String uname = request.getParameter("txt_uid");
 String pass = request.getParameter("txt_pwd");
 
 out.println("User Name = " + uname + "<br>");
 out.println("Password = " + pass);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Method = <%=request.getMethod() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Application Name = <%=request.getContextPath() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Size = <%=request.getContentLength() %>
</h2>