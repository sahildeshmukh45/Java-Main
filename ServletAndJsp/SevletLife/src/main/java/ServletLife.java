
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

@jakarta.servlet.annotation.WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {

    public ServletLife() {
    	System.out.println("Object is created");
    }
	public void init(ServletConfig config) throws ServletException {
    	System.out.println("Server intilliazed");

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("httpservlet request and response ");
	}
	public void destroy() {
		
	}

}
