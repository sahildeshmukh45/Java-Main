00000

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("uname");
		String city=request.getParameter("ucity");
		RequestDispatcher reqDis=request.getRequestDispatcher("/SecondServlet");
		HttpSession session=request.getSession(); // session data can be use in anywhere after setting session 
		session.setAttribute("name", name);  // here we set the session and we set the attribute
		
		//we can also set the time for which session should run
		session.setMaxInactiveInterval(10000);
		reqDis.forward(request, response);
//		reqDis.include(request, response);
		
		PrintWriter writer=response.getWriter();
		writer.write("Request from servlet one");
		
		writer.close();
		
	}

}
