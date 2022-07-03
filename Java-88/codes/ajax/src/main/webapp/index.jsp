<html>
<head>
 <link rel="stylesheet" href="css/styles.css"/>
</head>
<body>
 <table>
  <tr>
   <td>
    <label>Emp No</label>
   </td>
   <td>
     <input type="text" size=25 autofocus id="empid" onblur="getEmployeeDetails(this.value)" />
   </td>   
  </tr>
  
  <tr>
   <td>Name</td>
   <td><span id="emp-name"></span></td>
  </tr>
  
  <tr>
   <td>Salary</td>
   <td><span id="emp-sal"></span></td>
  </tr>
  
 </table>
 <script src="js/script.js"></script>
</body>
</html>
