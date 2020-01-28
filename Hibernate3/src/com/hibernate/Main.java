package com.hibernate;
import org.hibernate.cfg.*;
import org.hibernate.*;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		student s = new student();
		s.setId(1001);
		s.setName("Gayathri");
		session.save(s);
		t.commit();
		System.out.println("Inserted");
	}

}
