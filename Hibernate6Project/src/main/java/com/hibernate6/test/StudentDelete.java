package com.hibernate6.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

import com.hibernate6.entity.Student;
import com.hibernate6.utility.HibernateUtil;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //method 1
       // Student stud = new Student();
       // stud.setSno(111);
        //session.remove(stud);
        //tx.commit();
        //session.close();
        SelectionQuery<Student> query= session.createSelectionQuery("from Student where marks >= :marks",Student.class);
        query.setParameter("marks",400);
        List<Student> studList =query.list();
        for(Student stud : studList)
        	session.remove(stud);
        tx.commit();
        session.close();
        
	}

}
