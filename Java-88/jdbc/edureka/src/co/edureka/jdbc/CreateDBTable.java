package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDBTable {

	public static void main(String[] args) throws Exception{
		//-- initialize jdbc driver for mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to myql db_edureka db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root","root");
		
		//-- create an instance for passing SQL to connected DB
		Statement st = con.createStatement();
		
		//-- create db table - emp
		String sql = "create table emp(empno int(5), ename varchar(25), sal float(10,2), primary key(empno))";
		try {
			st.execute(sql);
			System.out.println("$$$--- DB Table Created ---$$$");
		}catch(Exception ex) {
			System.out.println("DB Table is NOT created --> " + ex.toString());
		}
		
		//-- close connection
		st.close();
		con.close();
	}

}
