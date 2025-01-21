package JDBC;

import java.sql.*;

public class jdbcexample4 {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); //1 register the driver
		 
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning","root","berojgar45");
//		 System.out.println("connection successful");
		 Statement statement =connection.createStatement();
		 boolean status=statement.execute("update studentinfo set sage=15 where id=1");
		 //it is common method for both the type of queries 
		 //for non select operation means insertion,update  and deletion it will give false
		 // otherwise for select operation it will give true
		 if(status) {
			 ResultSet rs=statement.getResultSet();
			 while(rs.next()) {
			 System.out.println(rs.getInt("id")+" "+(rs.getString("sname"))+" "+(rs.getInt("sage"))+" "+ rs.getString("scity"));
			 }
		 }else {
			 int rowAffected=statement.getUpdateCount();
			 if(rowAffected==0) {
				 System.out.println("Operation unsuccessful");
			 }else {
				 System.out.println("Operation Susccessful");
			 }
		 }
		 statement.close();
		 connection.close();
		 
		 }
}
