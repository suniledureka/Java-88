package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form2")
public class Form2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor=cyan>");
		out.println("<form action=form3>");
		out.println("<h2>");
		out.println("Years of Exp <input type=text name=t4 size=25> <br><br>");
		out.println("Prog Lang Known <input type=text name=t5 size=25> <br><br>");
		out.println("<input type=submit value=submit>");
		out.println("</form></body>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
