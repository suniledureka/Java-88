package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/form3")
public class Form3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t4");
		String s2 = request.getParameter("t5");
		
		HttpSession session = request.getSession();
		session.setAttribute("experience", s1);		
		session.setAttribute("languages", s2);
		
		/*
		Cookie c1 = new Cookie("experience", s1);
		Cookie c2 = new Cookie("language", s2);
		
		c1.setMaxAge(60*60*24*30);
		
		response.addCookie(c1);
		response.addCookie(c2);		
		*/
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId() + " - " + session.isNew()+"</h2><hr>");
		
		out.println("<form action=form4>");
		out.println("<h2>");
		out.println("Exp Salary <input type=text name=t6 size=25> <br><br>");
		
		/* out.println("<input type=hidden name=t1 value=\""+s1+"\">"); */
		
		out.println("<input type=submit value=submit>");
		out.println("</form></body>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
