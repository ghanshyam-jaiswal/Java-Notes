package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		PanCard panCard=entityManager.find(PanCard.class,109);
		if(panCard!=null) {
			System.out.println(panCard.getPanNo());
			Person person=panCard.getPerson();
			System.out.println(person.getName());
		}
		else {
			System.out.println("not available");
		}
		
		
	}
}
