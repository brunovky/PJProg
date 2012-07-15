package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private SessionFactory sessionFactory;
	private ServiceRegistry serviceRegistry;
	
	private SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();  
	    configuration.configure();  
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();          
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
	    return sessionFactory;
	}
	
	public Session getSession() {
		sessionFactory = getSessionFactory();
		return sessionFactory.openSession();
	}
}
