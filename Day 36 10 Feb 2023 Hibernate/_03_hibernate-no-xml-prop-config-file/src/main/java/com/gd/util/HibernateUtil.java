package com.gd.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	static {
		// Creating StandardServiceRegistryBuilder 
		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
		
		// Hibernate settings which is equivalent to hibernate.cfg.xml's properties
		Map<String, String> dbSettings = new HashMap<>();
		dbSettings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		dbSettings.put(Environment.URL, "jdbc:mysql://localhost/gd");
		dbSettings.put(Environment.USER, "root");
		dbSettings.put(Environment.PASS, "admin");
		dbSettings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		dbSettings.put(Environment.HBM2DDL_AUTO, "update");
		dbSettings.put(Environment.SHOW_SQL, "true");
		dbSettings.put(Environment.FORMAT_SQL, "true");
		
		// Apply database settings
		registryBuilder.applySettings(dbSettings);
		
		// Creating registry
		standardServiceRegistry = registryBuilder.build();
		
		// Creating MetadataSources
		MetadataSources sources = new MetadataSources(standardServiceRegistry);
		
		// Creating Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		
		// Creating SessionFactory
		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}
	//Utility method to return SessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}