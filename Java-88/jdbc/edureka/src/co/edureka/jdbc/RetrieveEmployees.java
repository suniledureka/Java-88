package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			int empno = rs.getInt(1); //1 - column index
			String name = rs.getString(2);
			//float salary = rs.getFloat(3);
			float salary = rs.getFloat("sal");
			
			//System.out.println(empno + " | " + name + " | " + salary);
			
			String employee = String.format("%d | %-15s | %.2f", empno, name, salary);
			System.out.println(employee);
			
			
			Thread.sleep(1500);
		}//while
		
		rs.close();
		st.close();
		con.close();
	}

}
