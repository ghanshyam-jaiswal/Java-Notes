package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

			try {
				FileInputStream fis=new FileInputStream("Shyam.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Student s=(Student) ois.readObject();
				System.out.println(s);
				Student s1=(Student) ois.readObject();
				System.out.println(s1);
				Student s2=(Student) ois.readObject();
				System.out.println(s2);
//				Student s3=(Student) ois.readObject();
//				System.out.println(s3);
//				
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
