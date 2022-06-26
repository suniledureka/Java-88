package co.edureka.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static Session getSession() {
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //DOM Parser
		SessionFactory sfactory = config.buildSessionFactory();		

		Session session = sfactory.openSession();
		return session;
	}
}
