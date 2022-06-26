package co.edureka.hibernate;


import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.util.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		Session session = HibernateUtils.getSession();
		
		Student st1 = session.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println();
		Thread.sleep(3000);
		
		Student st2 = session.get(Student.class, 101);
		System.out.println(st2);
		
		session.close();
	}
}
