package com.hibernate6.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate6.entity.Employee;
import com.hibernate6.utility.HibernateUtil;


public class EmployeeTest {
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		//emp.setEmpId(111);
		emp.setEmpName("Venkatesh");
		emp.setEmpSalary(99999999);
		session.persist(emp);
		tx.commit();
		
		
	}

}
