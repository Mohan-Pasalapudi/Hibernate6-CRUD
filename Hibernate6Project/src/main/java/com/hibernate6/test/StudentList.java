package com.hibernate6.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.hibernate6.entity.Student;
import com.hibernate6.utility.HibernateUtil;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		SelectionQuery<Student> query = session.createSelectionQuery("from Student",Student.class);
		List<Student> studList = query.list();
		for(Student stud : studList)
		{
			System.out.println(stud);
		}
		session.close();
		
		

	}

}
