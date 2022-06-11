package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private Statement st = null;
	
	public EmployeeDaoImpl() throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		st = con.createStatement();
	}

	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmployeeNo()+",'"+emp.getEmployeeName()+"',"+emp.getEmployeeSalary()+")";
		int n = st.executeUpdate(sql);
		return n;
	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "update emp set ename='"+emp.getEmployeeName()+"',sal="+emp.getEmployeeSalary()+" where empno="+emp.getEmployeeNo();
		int n = st.executeUpdate(sql);
		return n;
	}

	public Integer deleteEmployeeById(Integer eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		return st.executeUpdate(sql);
	}

	public Employee findEmployeeById(Integer eno) throws Exception {
		String sql = "select ename,sal from emp where empno="+eno;
		Employee emp = null;
		
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			emp = new Employee();
			emp.setEmployeeNo(eno);
			emp.setEmployeeName(rs.getString("ename"));
			emp.setEmployeeSalary(rs.getFloat(2));
		}
		return emp;
	}

	public List<Employee> findAllEmployees() throws Exception {
		List<Employee> emps = new ArrayList<Employee>();
		
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(eno, name, sal);
			emps.add(emp);
		}
		return emps;
	}

}
