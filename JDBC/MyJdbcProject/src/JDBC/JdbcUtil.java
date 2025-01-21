package JDBC;
import java.sql.*;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws SQLException {
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning","root","berojgar45");
	}
	public static void closeConnection(Connection connect,Statement statement) throws SQLException {
		statement.close();
		connect.close();
		
	}
}
