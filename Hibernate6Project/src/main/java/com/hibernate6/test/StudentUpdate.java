package com.hibernate6.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.hibernate6.entity.Student;
import com.hibernate6.utility.HibernateUtil;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//Method1
		//Student stud = session.get(Student.class,111);
		//stud.setMarks(550);
		//session.merge(stud);
		//tx.commit();
		
		//Method2 
		MutationQuery query = session.createMutationQuery("update Student set marks =:marks where sname =:sname");
		query.setParameter("marks",790);
		query.setParameter("sname","mohan");
		query.executeUpdate();
		tx.commit();
		session.close();
	
		
	}

}
