package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// initialize spring container (IoC)
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("---------------------------------------------------------");
		int beansCount = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + beansCount);
		System.out.println("---------------------------------------------------------");
		
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("bean ids ==>");
		for(String beanName : beanNames) {
			System.out.println("  ---> "+beanName);
		}
	}

}
