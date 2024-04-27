package com.jspider.practiseprogram.base.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspider.practiseprogram.base.resource.User;

public class Seralization {
public static void main(String[] args) {
	
	File file=new File("user.txt");
	
	if (file.exists()) {
		System.out.println("already exists");
	}else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	User user=new User();
	user.setId(1);
	user.setName("patil");
	user.setJob("Manager");
	
	try {
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		System.out.println("successfully written");
		objectOutputStream.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
