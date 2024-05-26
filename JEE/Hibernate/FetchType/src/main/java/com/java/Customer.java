package com.java;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int id;
	private String cusName;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer(int id, String cusName, Product product) {
		super();
		this.id = id;
		this.cusName = cusName;
		this.product = product;
	}
	public Customer() {
		
		
	}
	public Customer(int id, String cusName) {
		super();
		this.id = id;
		this.cusName = cusName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	
}
