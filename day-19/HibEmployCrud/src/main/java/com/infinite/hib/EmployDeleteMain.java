package com.infinite.hib;

import java.util.List;
import java.util.Scanner;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployDeleteMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ Where empno="+empno);
		List<Employ> employList = query.list();
		if (employList.size()==1) {
			Transaction trans = session.beginTransaction();
			
			session.delete(employList.get(0));
			trans.commit();
			System.out.println(employList.get(0));
			trans.commit();
			System.out.println("Record Deleted");
		} else {
			System.out.println("****Record Not Found***");
		}
		// TODO Auto-generated method stub

	}

		// TODO Auto-generated method stub

	}


