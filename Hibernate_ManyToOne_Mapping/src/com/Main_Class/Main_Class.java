package com.Main_Class;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Home;
import com.entity.Peoples;

public class Main_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Home.class);
		cfg.addAnnotatedClass(Peoples.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Home h = new Home();
		h.setH_id(4);
		h.setH_name("Om-Namsh-shivay Bhawan");
		ss.persist(h);

		Peoples p = new Peoples();
		p.setP_id(1);
		p.setHome(h);
		p.setP_name("Shree");
		ss.persist(h);
		ss.persist(p);

		Peoples p1 = new Peoples();
		p1.setP_id(2);
		p1.setP_name("Rucha");
		p1.setHome(h);

		ss.persist(h);
		ss.persist(p1);

		Peoples p2 = new Peoples();
		p2.setP_id(3);
		p2.setP_name("Avdut");
		p2.setHome(h);

		ss.persist(h);
		ss.persist(p2);
		List<Peoples>list= new ArrayList<Peoples>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		h.setPeople(list);
		ss.persist(h);
		

		System.out.println("Table is Created Successfully!");
	    tr.commit();
	    ss.close();
	}
}
