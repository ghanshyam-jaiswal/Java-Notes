package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;


public class PersonDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		System.out.println(emf);
		
//		Person p=new Person();
		
//		p.setId(2);
//		p.setName("b");
//		p.setEmail("b@gmail.com");
		
//		et.begin();
//		em.persist(p);
//		et.commit();
		
		
//		et.begin();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter details:");
//		System.out.println("Enter id");
//		p.setId(sc.nextInt());
//		System.out.println("Enter name");
//		p.setName(sc.next());
//		System.out.println("Enter email");
//		p.setEmail(sc.next());
//		em.persist(p);
//		et.commit();
		
//		et.begin();
//		Person person=em.find(Person.class,2);
//		person.setName("shyam");
//		em.merge(person);
//		System.out.println(person);
//		et.commit();
		
//		et.begin();
//		Person person=em.find(Person.class,0);
//		em.remove(person);
//		
		et.commit();
		
//		Query query= em.createQuery("from Person s");
//		List list=query.getResultList();
//		System.out.println(list);
		
		
//	Query query = em.createQuery("select s from Person s where s.email=?2");
//	query.setParameter(2,"b@gmail.com");
//		Person pp=(Person) query.getSingleResult();
//		System.out.println(pp);
		
		
		
	}
}
