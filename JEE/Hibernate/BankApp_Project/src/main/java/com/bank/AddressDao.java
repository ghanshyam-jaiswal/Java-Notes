package com.bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AddressDao {

EntityManagerFactory entityManagerFactory=DatabaseConfig.getEntityManagerFactory();
	
	public Address saveAddress(Address address) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.persist(address);
		eTransaction.commit();
		return address;
	}
	public Address updateAddress(Address address) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.merge(address);
		eTransaction.commit();
		return address;
	}
	public Address findAddressById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.find(Address.class,id);
	}
	public List<Address> findAllAddress() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		return entityManager.createQuery("select u from User u").getResultList();
	}
	public Address deleteAddress(Address address) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		eTransaction.begin();
		entityManager.remove(address);
		eTransaction.commit();
		return address;
	}
//	updateUser
//	deleteUser
//	findUserById
//	findAllUser
	
}
