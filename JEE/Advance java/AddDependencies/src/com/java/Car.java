package com.java;

import java.io.Serializable;

public class Car implements Serializable {
	private double price;
	private String brand;
	private int model ;
	public double getPrice() {
		return price;
	}
	public Car(double price, String brand, int model) {
		super();
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	public Car() {
		super();
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return price+" "+brand+" "+model;
	}
	
}
