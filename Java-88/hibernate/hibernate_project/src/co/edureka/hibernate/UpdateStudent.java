package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.util.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		
		/*
		Student st = new Student(101,"Sunil Joseph", "sunil@edureka.co", "9898989898");
		session.update(st);
		*/
		
		Student st = session.get(Student.class, 101);
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Sunil"); //dirty object
		}
		else {
			System.out.println("no matching student found!");
		}
		
		tx.commit();
		session.close();
	}

}
