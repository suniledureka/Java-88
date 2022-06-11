package co.edureka.ems.services;

import co.edureka.ems.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp) throws Exception;
	
	public void updateEmployee(Employee emp) throws Exception;
	
	public void deleteEmployeeById(Integer eno) throws Exception;
	
	public void searchEmployeeById(Integer eno) throws Exception;
	
	public void getAllEmployees() throws Exception;
}
