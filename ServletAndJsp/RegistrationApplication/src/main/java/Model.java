import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	private String uname;
	private String upassword;
	private String email;
	private String ucity;
	Connection connect;
	PreparedStatement pStatement;
	int rowAffected;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	 public int register() {
		 try {
		 connect=JdbcUtil.getConnection();
		 String sql="insert into pinfo(uname,email,password,ucity)VALUES(?,?,?,?)";
		 pStatement=connect.prepareStatement(sql);
		 pStatement.setString(1,uname);
		 pStatement.setString(2,email);
		 pStatement.setString(3,upassword);
		 pStatement.setString(4,ucity);
		 
		 
		 rowAffected=pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcUtil.closeResource(connect, pStatement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 return rowAffected;
	 }

}
