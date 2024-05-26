package com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {

		File file=new File("Shyam.txt");
		
		try {
			
				file.createNewFile();
			
//				System.out.println(file.exists());
//				if(!file.exists()){
//				
//				}
			
				Student student=new Student(1,"gk","gk@gmail.com");
				Student student2=new Student(2,"shyam","shyam@gmail.com");
				Student student3=new Student(3,"ghannu","ghannu@gmail.com");
			
				FileOutputStream fos=new FileOutputStream(file); //true is used to concat data with older data
//				fos.write("okgood".getBytes());
				
//				FileInputStream fis=new FileInputStream(file);
//				System.out.println(fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(student);
				oos.writeObject(student2);
				oos.writeObject(student3);
				oos.flush();
				oos.close();
			
			}catch (IOException e) {
			e.printStackTrace();
		}		
		
		
				
				
		
	}

}
