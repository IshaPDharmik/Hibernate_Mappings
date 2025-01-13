package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EntitiesClass.Laptop;
import com.EntitiesClass.Student;

public class Delect_MainClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");  
        cfg.addAnnotatedClass(Laptop.class);
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        
        int l_id=13;
        Laptop l = ss.get(Laptop.class,l_id);
        ss.remove(l);
        
        int s_id=130000;
        Student s = ss.get(Student.class,s_id );
        ss.remove(s);
        
        tr.commit();
        ss.close();
        
        System.out.println("Delete Data Successfully...!");
    }
}



