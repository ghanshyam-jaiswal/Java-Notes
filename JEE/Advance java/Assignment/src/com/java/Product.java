package com.java;

import java.io.Serializable;

public class Product implements Serializable {

	private String productName;
	private double productPrice;
	private String productCompany;
	
	@Override
	public String toString() {
		return productName+" "+productPrice+" "+productCompany;
	}
	public Product(String productName, double productPrice, String productCompany) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCompany = productCompany;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	
}
