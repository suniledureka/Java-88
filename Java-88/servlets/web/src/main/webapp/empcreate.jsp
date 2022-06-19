<jsp:useBean class="co.edureka.web.Employee" id="emp"></jsp:useBean>

<jsp:setProperty property="*" name="emp"/>

<h2>
Employee No: <jsp:getProperty property="empno" name="emp"/> <br>
Employee Name: <jsp:getProperty property="empname" name="emp"/> <br>
Employee Salary: <jsp:getProperty property="empsal" name="emp"/> 

</h2>