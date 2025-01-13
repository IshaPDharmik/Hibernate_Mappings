package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Students_123;


public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students_123.class);
		cfg.addAnnotatedClass(Courses.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
    	Courses c= new Courses();
		c.setC_id(206);
		c.setC_name("BootStrap");
		ss.persist(c);
		
		Students_123 s= new Students_123();
		s.setS_id(11);
		s.setName("vayu");
		s.setcour(c);
		ss.persist(s);
		
		Students_123 s1= new Students_123();
		s1.setS_id(12);
		s1.setName("Yug");
		s1.setcour(c);
		ss.persist(s1);
		
		Students_123 s2= new Students_123();
		s2.setS_id(13);
		s2.setName("Om");
		s2.setcour(c);
		ss.persist(s2);
		
		System.out.println("Tables is created...");
		tr.commit();
		ss.close();
	}

}
