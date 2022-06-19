<jsp:useBean class="co.edureka.web.Employee" id="emp"></jsp:useBean>
<h2>
Employee No: <jsp:getProperty property="empno" name="emp"/> <br>
Employee Name: <jsp:getProperty property="empname" name="emp"/> <br>
Employee Salary: <jsp:getProperty property="empsal" name="emp"/> 

<hr>
<jsp:setProperty property="empname" name="emp" value="Sunil Joseph"/>
Employee Name: <jsp:getProperty property="empname" name="emp"/> <br>
</h2>