package com.bank;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConfig {

	public static EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("java");
	}
}
