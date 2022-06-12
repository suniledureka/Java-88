package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	private static PreparedStatement pst = null;
	
	public void init(ServletConfig config) throws ServletException {
		//connect to database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root","root");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data
		String uname = request.getParameter("txt_uid");
		String pass = request.getParameter("txt_pwd");
		
		try {
			pst.setString(1, uname);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				//authenticated user - forward to welcome
				RequestDispatcher rd = request.getRequestDispatcher("welcome");
				rd.forward(request, response);
			}else {
				//not an authenticated user - include login.html
				PrintWriter out = response.getWriter();
				out.println("<p style=color:yellow;font-size:20px;text-align:center> Invalid User Name/ Password</p>");
				
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);				
			}
			
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
