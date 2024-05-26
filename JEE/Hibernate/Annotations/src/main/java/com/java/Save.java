package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Example2 e2=new Example2();
		
//		e2.setId(1);
//		e2.setName("shyam");
		
//		e2.setName("gk");
//		entityManager.merge(e2);
		
		
		e2.setName("shyam");
		
		
		entityTransaction.begin();
		entityManager.persist(e2);
		entityTransaction.commit();
		
	}
}
