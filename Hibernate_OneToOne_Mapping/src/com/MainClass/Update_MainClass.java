package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EntitiesClass.Laptop;
import com.EntitiesClass.Student;


public class Update_MainClass {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Laptop.class);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
        int l_id=10;
        Laptop l1= ss.get(Laptop.class, l_id);
		l.setL_name("Lenovo");
         ss.merge(l1);
         
		ss.update(l);
		tr.commit();
		ss.close();
		
		System.out.println("Data Update Successfully..!");

	}
}

