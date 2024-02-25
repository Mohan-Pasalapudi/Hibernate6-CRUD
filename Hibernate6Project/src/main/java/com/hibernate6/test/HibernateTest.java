package com.hibernate6.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate6.utility.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String version = (String)session.createNativeQuery("select version()").getSingleResult();
		System.out.println("MySQL Version : "+ version);

	}

}
