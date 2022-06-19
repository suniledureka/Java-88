package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.util.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		//Student st = session.get(Student.class, 101);
		Student st = session.get(Student.class, 1015);
		
		if(st != null)
			System.out.println(st);
		else
			System.out.println("no matching student found!!!");
		
		session.close();
	}

}
