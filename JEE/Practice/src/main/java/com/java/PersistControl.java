package com.java;


import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersistControl {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Practice p=new Practice();
		p.setId(101);
		p.setName("practice1");
		
		Practice p2=new Practice();
		p2.setId(102);
		p2.setName("practice2");
		
		Practice p3=new Practice();
		p3.setId(103);
		p3.setName("practice3");
		
		Person person =new Person(1,"shyam",Arrays.asList(p,p2,p3));
		
//		p.setEmail("shyam@gmail.com");
//		p.setContact(7000365544L);
//		p.setLocation("gurgaon");
		
//		Person person =new Person();
//		person.setId(1);
//		person.setName("syam");
//		et.begin();
//		em.persist(person);
//		et.commit();
		
//		et.begin();
//		em.persist(person);
//		em.persist(p);
//		em.persist(p2);
//		em.persist(p3);
//		et.commit();
//		System.out.println(p.getName());	
		
//		et.begin();
//		Person per=em.find(Person.class, 1);
//		em.remove(per);
//		et.commit();
		
//		et.begin();
//		Query query=em.createQuery("select s from Practice s where s.id=?1 and s.name=?2");
//		query.setParameter(1, 111);
//		query.setParameter(2, "ggggg");
//		et.commit();
//		Practice list=(Practice)query.getSingleResult();
//	System.out.println(list);	
//		
		
	}
}
