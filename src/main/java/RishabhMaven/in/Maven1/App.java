package RishabhMaven.in.Maven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import RishabhMaven.in.Maven1.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=new Student("sham","nagpur");
		
		Transaction tx = session.beginTransaction();
		
		session.save(s);

		tx.commit();
		session.close();
		
		System.out.println("Data inserted");
		
		
    	    }
}
