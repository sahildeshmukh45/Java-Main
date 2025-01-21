

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String ucity=request.getParameter("ucity");
		
		 Model model=new Model();
		 model.setUname(uname);
		 model.setEmail(email);
		 model.setUpassword(password);
		 model.setUcity(ucity);
		int row= model.register();	
		HttpSession session=request.getSession();
		session.setAttribute("name", uname);
				if(row==0) {
			 response.sendRedirect("/RegistrationApplication/failure.jsp");
		 }else {
			 response.sendRedirect("/RegistrationApplication/success.jsp");
		 }
	}
}
