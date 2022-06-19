<%!
 String company = "edureka limited"; //instance variable

 public int add(int x, int y){
	 return x+y;
 }
%>
<h2>
<%
 out.println("my company name = " + company + "<br>");

 int n = 25; //local variable
 out.println("n = " + n+"<br>");
 
 out.println("sum = " + add(11,24));
%>
</h2>