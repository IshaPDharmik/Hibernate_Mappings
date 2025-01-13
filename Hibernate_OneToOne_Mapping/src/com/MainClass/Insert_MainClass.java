package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EntitiesClass.Laptop;
import com.EntitiesClass.Student;

public class Insert_MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setL_id(1600);
		l.setL_name("Apple");
		ss.persist(l);

		Student s = new Student();
		s.setS_id(6);
		s.setS_name("Geeta");
		s.setLaptop(l);
		ss.persist(s);
		
		System.out.println("Inserted Successfully...!");
		tr.commit();
		ss.close();
	}
}