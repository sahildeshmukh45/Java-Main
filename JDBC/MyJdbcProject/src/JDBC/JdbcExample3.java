package JDBC;

import java.sql.*;


public class JdbcExample3 {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver"); //1 register the driver
	 
	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning","root","berojgar45");
	 System.out.println("connection successful");
	 Statement statement =connection.createStatement();

	 //for 	fetching the data 
	 ResultSet rs=statement.executeQuery("SELECT * FROM studentinfo");
	 while(rs.next()) {
//		 System.out.println(rs.getInt(1)+" "+(rs.getString(2))+" "+(rs.getInt(3))+" "+ rs.getString(4));
		 System.out.println(rs.getInt("id")+" "+(rs.getString("sname"))+" "+(rs.getInt("sage"))+" "+ rs.getString("scity"));
	 }
	 
	 }
}
