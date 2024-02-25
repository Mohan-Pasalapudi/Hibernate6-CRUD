package com.hibernate6.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate6.entity.Student;
import com.hibernate6.utility.HibernateUtil;


public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student stud = new  Student();
		stud.setSno(111);
		stud.setSname("Mohan");
		stud.setMarks(500.0);
		session.persist(stud);
		tx.commit();
		session.close();
		

	}

}
