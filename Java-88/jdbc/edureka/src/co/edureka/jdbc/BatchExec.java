package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(106,'Shankar',2500)");
		st.addBatch("insert into emp values(107,'Charles',2500)");
		//st.addBatch("insert into emp values(101,'Marks',3500)");
		st.addBatch("insert into emp values(108,'Marks',3500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] rows = st.executeBatch();
			for(int row : rows) {
				System.out.println("employees updated = " + row);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		st.close();
		con.close();
	}
}
