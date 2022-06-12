package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		
		CallableStatement cst = con.prepareCall("{call performance_hike(?,?,?)}");
		
		cst.setInt(1, 101);
		cst.setInt(2, 10);
		
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("updated salary = " + cst.getFloat(3));
		
		cst.close();
		con.close();
	}

}
