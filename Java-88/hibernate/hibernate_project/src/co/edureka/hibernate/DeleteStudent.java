package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.util.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		
		/*
		Student st = new Student(101,"Sunil Joseph", "sunil@edureka.co", "9898989898");
		session.delete(st);
		*/
		
		Student st = session.get(Student.class, 111);
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else {
			System.out.println("no matching student found!");
		}
		
		session.getTransaction().commit();
		session.close();		

	}

}
