<%@page import="java.util.Date" info="page directive example" language="java"%>
<%!
 Date today = null;
%>
<h2 style="text-align:center">
<%
 today = new Date();
 out.println(today);
%>
<hr>
<%=getServletInfo() %>
</h2>