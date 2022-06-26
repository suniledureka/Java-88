package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.entity.Employee;

public interface EmployeeDao {
	public Integer saveEmployee(Employee emp);
	
	public Integer updateEmployee(Employee emp);
	
	public Integer deleteEmployeeById(Integer eno);
	
	public Employee findEmployeeById(Integer eno);
	
	public List<Employee> findAllEmployees();
}
