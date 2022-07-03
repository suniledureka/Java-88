package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.services.EmployeeService;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");
		service = (EmployeeService) context.getBean("emp-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		
		Employee emp = service.searchEmployeeById(Integer.parseInt(eno));
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		if(emp != null) {
			JSONObject obj = new JSONObject();
			
			obj.put("ename", emp.getEmployeeName());
			obj.put("esal", emp.getEmployeeSalary());
			
			out.print(obj);
		}
		else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
