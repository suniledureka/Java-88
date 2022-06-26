package co.edureka.spring.core;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Hospital;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital apollo = (Hospital)context.getBean("yasodha");
		
		System.out.println("Hospital Name ---> " + apollo.getHospitalName());
		
		Map<String,String> depts = apollo.getDeptHeads();
		System.out.println(depts);
		System.out.println();
		
		Set<String> dnames = depts.keySet();
		
		for(String dept : dnames) {
			String hod = depts.get(dept);
			//System.out.println(dept+" ---> "+hod);
			String output = String.format("%-17s ---> %s", dept, hod);
			System.out.println(output);
		}

	}

}
