package com.gd.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	static {

		// Creating StandardServiceRegistryBuilder
		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
		
		// Creating registry
		standardServiceRegistry = registryBuilder.loadProperties("hibernate.properties").build();
		
		// Creating MetadataSources
		MetadataSources sources = new MetadataSources(standardServiceRegistry);
		
		// Creating Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		
		// Creating SessionFactory
		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}

	// Utility method to return SessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}