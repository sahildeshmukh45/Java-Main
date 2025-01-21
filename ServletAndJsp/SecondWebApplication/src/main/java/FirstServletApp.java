

import java.io.IOException;
import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.*;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {

    public FirstServletApp() {
    	System.out.println("Servler object is created");
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname =request.getParameter("uname");
		String ucity=request.getParameter("ucity");
	
		
		PrintWriter writer=response.getWriter();
		writer.write("Hello "+uname);
		writer.write("\n");
		writer.write("I know yor from "+ucity);
		
		writer.close();
			 
	}
}
