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
		
		Author author=new Author(101,"shyam");
		Book book1=new Book();
		book1.setId(1);
		book1.setTitle("jeene ki rah");
		book1.setAuthor(author);
		
		Book book2=new Book();
		book2.setId(2);
		book2.setTitle("jindagi ek tamasha");
		book2.setAuthor(author);
		
		Book book3=new Book();
		book3.setId(3);
		book3.setTitle("IT jhhand hai");
		book3.setAuthor(author);
		
		author.setBooks(Arrays.asList(book1,book2,book3));
		
		entityTransaction.begin();
		entityManager.persist(author);
		entityManager.persist(book1);
		entityManager.persist(book2);
		entityManager.persist(book3);
		entityTransaction.commit();
	}
}
