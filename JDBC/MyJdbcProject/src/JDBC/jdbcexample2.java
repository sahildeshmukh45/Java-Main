package JDBC;

import java.sql.*;


public class jdbcexample2 {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver"); //1 register the driver
	 
	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning","root","berojgar45");
	 System.out.println("connection successful");
	 Statement statement =connection.createStatement();
	 int rowAffected=statement.executeUpdate("UPDATE studentinfo set sage=22 where id=1 ");
	 String sql1="INSERT INTO studentinfo(id,sname,sage,scity) VALUES(2,'saurabh',22,'Mumbai')";
	 statement.executeUpdate(sql1);
	 statement.close();
	 connection.close();
	 
	 }
}
