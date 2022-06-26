package co.edureka.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee emp) {
		Integer rowsSaved = dao.saveEmployee(emp);
		if (rowsSaved > 0) {
			System.out.println("$$$---- EMPLOYEE SAVED ----$$$");
		}
	}

	public void updateEmployee(Employee emp) {
		Integer rowsUpdated = dao.updateEmployee(emp);
		if (rowsUpdated > 0) {
			System.out.println("$$$---- EMPLOYEE UPDATED ----$$$");
		} else {
			System.out.println("$$$---- NO MATCHING EMPLOYEE FOR UPDATION ----$$$");
		}
	}

	public void deleteEmployeeById(Integer eno) {
		Integer rowsDeleted = dao.deleteEmployeeById(eno);
		if (rowsDeleted > 0) {
			System.out.println("$$$---- EMPLOYEE DELETED ----$$$");
		} else {
			System.out.println("$$$---- NO MATCHING EMPLOYEE FOR DELETION ----$$$");
		}
	}

	public Employee searchEmployeeById(Integer eno) {
		return dao.findEmployeeById(eno);

	}

	public void getAllEmployees() {
		List<Employee> emps = dao.findAllEmployees();
		for (Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}
		} 
	}

}
