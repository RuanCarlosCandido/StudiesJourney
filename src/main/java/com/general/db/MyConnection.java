package com.general.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.general.apiGeneral.Astronaut;


public class MyConnection {

	private static Configuration con = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Astronaut.class);
	
	private static ServiceRegistry registry = new StandardServiceRegistryBuilder()
			.applySettings(con.getProperties())
			.build();

	private static SessionFactory sessionFactory = con.buildSessionFactory(registry);

	private static Session session = sessionFactory.openSession();

	public static Session getSession() {
		return session;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
