package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-car-beans.xml");
		
		User usr = (User)context.getBean("customer");
		
		System.out.println(usr.getFirstName()+" "+usr.getLastName() + ", owns a " +
						usr.getCar().getModel()+", which costs Rs."+usr.getCar().getCost());
	}

}
