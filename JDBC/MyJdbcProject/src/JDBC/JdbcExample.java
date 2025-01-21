package JDBC;
import java.sql.*;

public class JdbcExample {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver"); //1 register the driver
	 
	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning","root","berojgar45");
	 System.out.println("connection successful");
	 Statement statement =connection.createStatement();
	 
	 String sql="INSERT INTO studentinfo(id,sname,sage,scity) VALUES(1,'sahil',21,'pune')";
	 // for non select operation means insertion,update  and deletion we have to use executeUpdate it will return rows affected;
	 statement.executeUpdate(sql); 
	 statement.close();
	 connection.close();
	 }
}
