package com.java;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Subject subject1=new Subject(101,"HTML");
		Subject subject2=new Subject(102,"CSS");
		Subject subject3=new Subject(103,"Java");
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("shyam");
		student1.setSubject(Arrays.asList(subject1,subject2,subject3));
		
		
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(student1);
		entityTransaction.commit();
	}
}
