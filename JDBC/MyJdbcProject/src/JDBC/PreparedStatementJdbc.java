package JDBC;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementJdbc {
	public static void main(String[] args) {
		//prepareStatemen is child of statement class
		Connection connection=null;
		PreparedStatement pStatement=null;
		try {
			connection=JdbcUtil.getConnection();
			pStatement=connection.prepareStatement("insert into studentinfo(id,sname,sage,scity) values(?,?,?,?)");
			Scanner input=new Scanner(System.in);
			int id=input.nextInt();
			String sname =input.next();
			int sage=input.nextInt();
			String scity=input.next();
			pStatement.setInt(1, id);
			pStatement.setString(2, sname);
			pStatement.setInt(3, sage);
			pStatement.setString(4, scity);
			pStatement.executeUpdate(); 
			System.out.println("Successfull uploaded the data");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JdbcUtil.closeConnection(connection, pStatement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
