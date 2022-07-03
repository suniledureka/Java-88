package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.entity.Employee;

public interface EmployeeDao {
	public Employee findEmployeeById(Integer eno);
}
