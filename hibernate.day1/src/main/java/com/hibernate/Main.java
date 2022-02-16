package com.hibernate;

// pom.xml for downloading jars and propetries.
//hibernate.cfg.xml (src/main/resource)to build the hibernate connection with data base
// Main class has SessionFactory because of line number 4.
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession(); // we need session to work with a database.
		session.beginTransaction();
		//========== above 3 lines are fixed==============
		
		
		Employee e1=new Employee(100,"durga maharjan", "durga@gmail.com", new Date());
		Employee e2=new Employee(101,"durga maharjan", "durga@gmail.com", new Date());
		
		session.save(e1);
		session.save(e2);

		
		
		
		
		
		//===========below 2 lines are fixed==================
		session.getTransaction().commit();
		session.close();
		
		
	}

}
