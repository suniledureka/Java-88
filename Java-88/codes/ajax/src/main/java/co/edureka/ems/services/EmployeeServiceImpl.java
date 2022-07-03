package co.edureka.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public Employee searchEmployeeById(Integer eno) {
		return dao.findEmployeeById(eno);

	}
}
