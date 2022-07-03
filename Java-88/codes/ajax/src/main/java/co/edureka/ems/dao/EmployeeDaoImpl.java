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

	public Employee findEmployeeById(final Integer eno) {
		String sql = "select ename, sal from emp where empno=" + eno;
		try {
			Employee emp = jt.queryForObject(sql, new RowMapper<Employee>() {

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);
					Employee emp = new Employee(eno, name, sal);
					return emp;
				}
			});

			return emp;
		} catch (Exception ex) {
			return null;
		}
	}
}
