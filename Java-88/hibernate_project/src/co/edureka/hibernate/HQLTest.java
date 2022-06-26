package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.hibernate.util.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		Query<Student> query = session.createQuery(hql, Student.class);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 101);
		query.setParameter(1, 106);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minid and :maxid"; //named parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minid", 102);
		query.setParameter("maxid", 108);
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
		}
		*/
		
		//-- to perform DML operations
		Transaction tx = session.beginTransaction();
		
		String hql = "update co.edureka.hibernate.entity.Student stud set stud.studentName='Sunil Joseph', "
				+ "stud.studentEmail='sunil@gmail.com' where stud.studentId=101";
		Query query = session.createQuery(hql);
		Integer rowsAffected = query.executeUpdate();
		System.out.println("Students Updated = " + rowsAffected);
		
		tx.commit();
		
		session.close();
	}

}
