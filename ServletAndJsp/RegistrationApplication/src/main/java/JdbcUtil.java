import java.beans.Statement;
import java.io.Closeable;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/personalinfo","root","berojgar45");
	}
	public static void closeResource(Connection connect,PreparedStatement statement)throws SQLException{
		if(connect!=null) {
			connect.close();
		}
		if(statement!=null) {	
			statement.close();
		}
	}
		
}
