import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Set the content type
		response.setContentType("text/html");
		
//		Get the writer
		PrintWriter out = response.getWriter();
		
//		Get the userName from the request
		String uName = request.getParameter("username");
		String pass=request.getParameter("password");
		
//		Get a reference to the HttpSession object
		HttpSession theSession = request.getSession();
		
//		Validate the username
		if(uName.trim().equals("anil") && pass.trim().equals("Anil")) {
//			Save the username in the session
			theSession.setAttribute("username", uName);
			theSession.setAttribute("password", pass);
//			Redirect to the Dashboard
//			response.sendRedirect("dashboard");
			response.getWriter().println("welcome "+uName);
		}
		else {
			response.getWriter().println("please enter the valid username or password!!!");
//			
}		
		
	}

}










