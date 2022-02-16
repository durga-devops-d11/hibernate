package com;
//2 ways of saving is save and persist. 

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession(); // we need session to work with a database.
		session.beginTransaction();
		//========== above 3 lines are fixed==============
		
		Student s1=new Student("ben","jackson","ben@gmail.com",new Date());
		Student s2=new Student("carly","smith", "carly@gmail.com", new Date());
		
		Long key=(Long) session.save(s1); // returns primary key
		System.out.println(key+ " of "+ s1.getFirstName());
		
//		session.persist(s2); // doesnot return anything
		
		
		
		
		
		//===========below 2 lines are fixed==================
				session.getTransaction().commit();
				session.close();
				

	}

}
