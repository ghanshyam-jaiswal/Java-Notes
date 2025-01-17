package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByName {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query= entityManager.createQuery("from Person s where s.id=?10");
//		Query query= entityManager.createQuery("select s from Person s where s.id=:gk");
		query.setParameter(10, 2);
//		query.setParameter("gk", 2);
		Person person= (Person) query.getSingleResult(); //Throws NoResultException : if data is not available.
		System.out.println(person);
		
	}
}
