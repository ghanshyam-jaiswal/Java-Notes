package com.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarSerializable {

	public static void main(String[] args) {

			File file=new File("Car.txt");
			try {
//				file.createNewFile();
				FileOutputStream fos=new FileOutputStream(file);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				Car c1=new Car(10000,"tata",2023);
				Car c2=new Car(20000,"audi",2022);
				Car c3=new Car(30000,"suzuki",2020);
				oos.writeObject(c1);
				oos.writeObject(c2);
				oos.writeObject(c3);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
