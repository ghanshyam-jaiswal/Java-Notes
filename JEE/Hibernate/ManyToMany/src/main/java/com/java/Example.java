package com.java;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Example {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Subject subject1=entityManager.find(Subject.class,101);
		Subject subjec2=entityManager.find(Subject.class,102);
		Subject subjec3=entityManager.find(Subject.class,103);

		Subject subject4=new Subject(104,"ReactJs");
		Student student=new Student(2,"gk",Arrays.asList(subject1,subjec2,subjec3,subject4));
		
		Subject subject5=new Subject(105,"jee");
		Student student2=new Student(3,"ghannu",Arrays.asList(subject1,subjec2,subjec3,subject5));
		
		
		entityTransaction.begin();
		entityManager.persist(subject4);
		entityManager.persist(subject5);
		
		entityManager.persist(student);
		entityManager.persist(student2);
		entityTransaction.commit();
		
		
		
		
	}
}
