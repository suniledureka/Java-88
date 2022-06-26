package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Employee;
import co.edureka.hibernate.util.HibernateUtils;

public class SaveEmployee {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee("Sunil Joseph", 2500.75f);
		session.save(emp);
		
		tx.commit();
		session.close();
		session.getSessionFactory().close();
	}

}
