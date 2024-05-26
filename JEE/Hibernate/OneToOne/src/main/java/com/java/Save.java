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
		
	
//		PanCard panCard=new PanCard(103,"abc123");
//		Person person=new Person(2,"shyam",panCard);
//		
//		entityTransaction.begin();
//		entityManager.persist(panCard);
//		entityManager.persist(person);
//		entityTransaction.commit();
//		
		
//		Person person=entityManager.find(Person.class,2);
//		if(person!=null) {
//			System.out.println(person.getId());
//			String panCard=person.getName();
//			System.out.println(panCard);
//			System.out.println(person.getP());
//		}
//		else {
//			System.out.println("not available");
//		}
//		PanCard panCard=entityManager.find(PanCard.class,103);
//		System.out.println(panCard.getPanNo());
		
		PanCard panCard=new PanCard(110,"pan110");
		Person person=new Person(112,"person112",panCard);
		
		panCard.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(panCard);
		entityManager.persist(person);
		entityTransaction.commit();
		
		
	}
}
