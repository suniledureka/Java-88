package co.edureka.ems;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.services.EmployeeService;

public class EMSApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("emp-service");
		
		while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Update Employee" );
			System.out.println("3. Delete Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.println("-------------------------------------------------------");
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				Employee employee = createEmployee();
				service.saveEmployee(employee);
				break;
			 case 2:
				break;
			 case 3:
				System.out.print("enter employee no: ");
				int empno = sc.nextInt();
				service.deleteEmployeeById(empno);
				break;
			 case 4:
				System.out.print("enter employee no: ");
				int eno = sc.nextInt();
				Employee emp = service.searchEmployeeById(eno);
				System.out.println(emp);
				break;
			 case 5:
				service.getAllEmployees(); 
				break;
			 case 6:
				System.out.println("@@@--- application designed & developed by ---@@@");
				System.out.println("@@@--- team@edureka ---@@@");
				sc.close();
				return; 
			 default:
				 System.out.println("@@@--- INVALID OPTION **** TRY AGAIN ---@@@");				
			}//switch
			System.out.println("-------------------------------------------------------");			
		}//while		
	} //main
	
	private static Employee createEmployee() {
		System.out.print("enter employee no: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float salary = sc.nextFloat();
		
		return new Employee(no, name, salary);
	}	
}
