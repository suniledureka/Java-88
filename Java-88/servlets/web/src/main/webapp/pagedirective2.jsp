<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y = 5;
 //int y = 0;
 int[] marks = new int[7];
%>
<h2>
<%
 int res = x / y;
 out.println("result = " + res + "<br>");
 out.println(marks[7]);
%>
</h2>