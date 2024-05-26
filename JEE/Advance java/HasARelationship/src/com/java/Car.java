package com.java;

public class Car {

		int price;
		String modelName;
		Engine e;
		
		public Car(int price, String modelName, Engine e) {
			super();
			this.price = price;
			this.modelName = modelName;
			this.e = e;
		}

		public Car(int price, String modelName) {
			super();
			this.price = price;
			this.modelName = modelName;
		}
}
