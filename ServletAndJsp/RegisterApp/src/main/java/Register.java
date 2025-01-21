

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String emailId=request.getParameter("email");
		String password=request.getParameter("password");
		String ucity=request.getParameter("ucity");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/personalinfo","root","berojgar45");
				PreparedStatement pStatement =connect.prepareStatement("insert into pinfo(uname,email,password,ucity) values(?,?,?,?)");
				pStatement.setString(1, uname);
				pStatement.setString(2, emailId);
				pStatement.setString(3, password);
				pStatement.setString(4, ucity);
				
				int rowAffected =pStatement.executeUpdate();
				PrintWriter writer=response.getWriter();
				if(rowAffected!=0) {
					writer.println("Registration Successful");
				}else {
					writer.println("Registration Failed");
				}
				pStatement.close();
				connect.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
