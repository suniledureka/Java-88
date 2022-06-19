<%!
 String company = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
my company name = <%=company %>
<br>
<%="Sum = " + add(12,9) %>
</h2>