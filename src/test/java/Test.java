import mio.tutorial.entities.Event;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
											.configure() // configures settings from hibernate.cfg.xml
											.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Event e = new Event();
		e.setName("event");
		
		session.save(e);
		
		session.getTransaction().commit();
		session.close();
	}

}
