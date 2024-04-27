package com.jspider.practiseprogram.base.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspider.practiseprogram.base.resource.User;

public class Desrilazition {
public static void main(String[] args) {
	
	File file=new File("user.txt");
	
	if (file.exists()) {
		
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			User user=(User)objectInputStream.readObject();
			System.out.println(user);
			
			System.out.println("data read from file");
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}else {
		System.out.println("file does not exists");
	}
}
}
