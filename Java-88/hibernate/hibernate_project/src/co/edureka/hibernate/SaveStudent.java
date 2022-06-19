package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		//-- initialize SessionFactory
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //DOM Parser
		SessionFactory sfactory = config.buildSessionFactory();
		
		//-- get a Session (connection with DB)
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Sunil");
		st.setStudentEmail("sunil@gmail.com");
		st.setStudentMobile("9848586878");
		
		session.save(st);
		
		System.out.println("-----------------------------------------------------");
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}
