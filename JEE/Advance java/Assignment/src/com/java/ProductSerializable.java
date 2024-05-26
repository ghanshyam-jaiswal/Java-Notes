package com.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerializable {

	public static void main(String[] args) {

		File f=new File("Product.txt");
		try {
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Product p1=new Product("mobile", 10000, "Nokea");
			Product p2=new Product("Laptop", 50000, "HP");
			Product p3=new Product("Camera", 20000, "Cannon");
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
