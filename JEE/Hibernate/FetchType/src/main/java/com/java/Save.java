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
		
		Customer customer=new Customer(06,"shyam");
		Product product=new Product(106,"mobile",customer);
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(product);
		entityTransaction.commit();
		
		
	}
}
