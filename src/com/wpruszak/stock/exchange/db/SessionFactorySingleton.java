package com.wpruszak.stock.exchange.db;

import java.nio.file.Paths;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleton {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private SessionFactorySingleton() {
	}
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration()
					.configure(Paths.get("resources/hibernate.cfg.xml").toFile())
					.buildSessionFactory();
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getInstance() {
		return sessionFactory;
	}
}
