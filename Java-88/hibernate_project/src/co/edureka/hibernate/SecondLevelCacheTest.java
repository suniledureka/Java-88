package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Student;

public class SecondLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); 
		SessionFactory sfactory = config.buildSessionFactory();	
		
		Session session1 = sfactory.openSession();
		Session session2 = sfactory.openSession();
		
		Student st1 = session1.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println();
		Thread.sleep(3000);
		
		Student st2 = session2.get(Student.class, 101);
		System.out.println(st2);
		
		session1.close();
		session2.close();
		sfactory.close();
	}

}
