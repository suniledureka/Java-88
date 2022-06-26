package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values("+emp.getEmployeeNo()+",'"+emp.getEmployeeName()+"', "+emp.getEmployeeSalary()+")";
		Integer rowsInserted = jt.update(sql);
		return rowsInserted;
	}

	public Integer updateEmployee(Employee emp) {
		String sql = "update emp set ename='"+emp.getEmployeeName()+"', sal="+emp.getEmployeeSalary()+" where empno="+emp.getEmployeeNo();
		Integer rowsUpdated = jt.update(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployeeById(Integer eno) {
		String sql = "delete from emp where empno="+eno;
		return jt.update(sql);
	}

	public Employee findEmployeeById(final Integer eno) {
		String sql = "select ename, sal from emp where empno="+eno;
		Employee emp = jt.queryForObject(sql, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(1);
				float sal = rs.getFloat(2);
				Employee emp = new Employee(eno, name, sal);
				return emp;				
			}			
		});
		
		return emp;
	}

	public List<Employee> findAllEmployees() {
		String sql = "select * from emp";
		List<Employee> emps = null;
		
		emps = jt.query(sql, new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				
				while(rs.next()) {
					Integer eno = rs.getInt(1);
					String name=rs.getString(2);
					Float sal = rs.getFloat(3);
					
					Employee emp = new Employee(eno, name, sal);
					list.add(emp);
				}
				return list;
			}
			
		});
		return emps;
	}

}
