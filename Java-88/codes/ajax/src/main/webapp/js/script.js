var xhr;

function getEmployeeDetails(empid)
{
	xhr = new XMLHttpRequest();
	
	xhr.open("GET", "searchemp?eno="+empid, true); //true - asynchronous communication
	
	xhr.onreadystatechange = stateChanged;
	
	xhr.send();
}

function stateChanged(){
	var name_data = 'NO MATCH';
	var sal_data = 'NO MATCH';
	
	if(xhr.readyState == 4 && xhr.status == 200){
		var response = xhr.responseText;
		if(response.length > 0){
			var empObj = JSON.parse(response); //to convert JSON String to JSON object
			
			name_data = empObj.ename;
			sal_data = empObj.esal; 
		}	
		
		document.getElementById("emp-name").innerText = name_data;
		document.getElementById("emp-sal").innerText = sal_data;
	}
}