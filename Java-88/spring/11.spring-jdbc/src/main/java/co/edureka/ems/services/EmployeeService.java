package co.edureka.ems.services;

import co.edureka.ems.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployeeById(Integer eno);
	
	public Employee searchEmployeeById(Integer eno);
	
	public void getAllEmployees();
}
