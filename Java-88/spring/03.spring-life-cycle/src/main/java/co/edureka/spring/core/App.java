package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// initialize spring container (IoC)
		//ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("---------------------------------------------------------");
		
		//((ConfigurableApplicationContext)context).close();
		context.close();
	}

}
