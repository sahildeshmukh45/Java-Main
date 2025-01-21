package JDBC;

import java.sql.*;
import java.util.Scanner;
public class PreparedStatementRetrive {
	public static void main(String[] args) {
		// we can use batchupdate for multiple querires for only non select query
		// for adding queries in batch statement.addBatch() is used
		Connection connect=null;
		PreparedStatement statement=null;
		ResultSet rs=null;
		try {
			connect=JdbcUtil.getConnection();
			statement=connect.prepareStatement("select id,sname,sage,scity from studentinfo where id =?");
			Scanner input=new Scanner(System.in);
			int id=input.nextInt();
			statement.setInt(1, id);
			rs=statement.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		finally {
			try {
				JdbcUtil.closeConnection(connect, statement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
