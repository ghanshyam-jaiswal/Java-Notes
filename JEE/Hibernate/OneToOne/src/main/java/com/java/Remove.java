package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		PanCard panCard=entityManager.find(PanCard.class,112);
		if(panCard!=null) {
			entityTransaction.begin();
			System.out.println(panCard.getPanNo());
			Person person=panCard.getPerson();
			System.out.println(person.getName());
			
			entityManager.remove(panCard);
			entityManager.remove(person);
			
			entityTransaction.commit();
		}
		else {
			System.out.println("not available");
		}
		
		
	}
	
}
