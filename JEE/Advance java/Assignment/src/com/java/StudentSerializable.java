package com.java;
import java.io.*;
public class StudentSerializable {

	public static void main(String[] args) {
		File f=new File("Student.txt");
		try {
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Student s1=new Student(1,"shyam","BTech");
			Student s2=new Student(2,"ghannu","Commerse");
			Student s3=new Student(3,"gk","Bsc");
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
