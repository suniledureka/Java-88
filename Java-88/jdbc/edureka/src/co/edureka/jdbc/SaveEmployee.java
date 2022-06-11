package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil Joseph', 2500.5)";
		String sql = "insert into emp values (102,'Praveen', 3500), (103,'Sanjay',4500), (104, 'Kiran',5500),"
				+ "(105, 'Shankar', 6500)";
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("employees saved - " + rows_affected);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}

}
