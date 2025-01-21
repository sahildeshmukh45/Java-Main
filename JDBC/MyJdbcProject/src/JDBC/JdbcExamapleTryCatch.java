package JDBC;
import java.sql.*;

public class JdbcExamapleTryCatch {
	public static void main(String[] args){
		Connection connection=null;
		Statement statement=null;
		try {	 
		 connection=JdbcUtil.getConnection();
		 statement =connection.createStatement();
		 boolean status=statement.execute("INSERT INTO studentinfo(id,sname,sage,scity) VALUES(3,'abc',29,'bengluru')");
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
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				JdbcUtil.closeConnection(connection, statement);
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
	}
		 
}
