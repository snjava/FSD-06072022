

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-details")
public class DisplayDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fn = request.getParameter("fname");
		String mn = request.getParameter("mname");
		String ln = request.getParameter("lname");
		String fullName = fn + " " + mn + " " + ln;
		
		// Insert the Data into DB
		
		
		out.print("<div align='center'>");
			out.print("<h1>Display Details Page</h1>");
			out.print("<h2>Full Name : "+fullName+"</h2>");
		out.print("</div>");
	}

}
