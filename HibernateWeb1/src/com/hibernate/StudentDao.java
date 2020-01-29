package com.hibernate;
import java.util.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;
import org.hibernate.*;

public class StudentDao {
	public static int register(student s) {
		int i=0;
	
	SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	/*i=(Integer)session.save(s);*///to insert
	/*Query q=session.createQuery("update student set name=:n where id=:i");//for updation
	q.setParameter("n",s.getName());
	q.setParameter("i", s.getId());
	int status=q.executeUpdate();
	System.out.println(status);
	t.commit();*/
/*	Query query=session.createQuery("from student");
	List<student> list=query.list();*/
	/*Criteria c=session.createCriteria(student.class);
	List<student> list=c.list();*/
	//int a=list.size();
	//while(a!=0)
	Criteria c=session.createCriteria(student.class);
	/*c.setFirstResult(2);
	c.setMaxResults(5);*/
	c.add(Restrictions.gt("id",103));//greater then given
	
			List<student> list=c.list();
		for(student s1:list)
	{
		System.out.println(s1);
	}
			session.close();
	return i;
}
}