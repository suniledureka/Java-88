<h2>
<%
 String uid = request.getParameter("txt_uidd");
 out.println("User Name = " + uid);
%>
<hr>
User Name = ${param.txt_uidd}
</h2>