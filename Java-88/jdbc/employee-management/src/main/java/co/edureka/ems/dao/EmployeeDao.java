package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.entity.Employee;

public interface EmployeeDao {
	public Integer saveEmployee(Employee emp) throws Exception;
	
	public Integer updateEmployee(Employee emp) throws Exception;
	
	public Integer deleteEmployeeById(Integer eno) throws Exception;
	
	public Employee findEmployeeById(Integer eno) throws Exception;
	
	public List<Employee> findAllEmployees() throws Exception;
}
