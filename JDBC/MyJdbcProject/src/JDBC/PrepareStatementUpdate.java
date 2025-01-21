package JDBC;
import java.sql.*;
import java.util.Scanner;

public class PrepareStatementUpdate {
	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement statement=null;
		try {
			connect=JdbcUtil.getConnection();
			statement=connect.prepareStatement("update studentinfo set sage=? where id=?");
			Scanner input=new Scanner(System.in);
			int sage=input.nextInt();
			int id=input.nextInt();
			statement.setInt(1, sage);
			statement.setInt(2, id);
			statement.executeUpdate();
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
