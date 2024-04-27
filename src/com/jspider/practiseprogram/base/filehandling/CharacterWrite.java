package com.jspider.practiseprogram.base.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("Prashant.txt");
		
		if (file.exists()) {
			System.out.println("file already exists ");
		}else {
			file.createNewFile();
		}
		
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("This is from file character data");
		System.out.println("Successfully written");
		fileWriter.close();
	}

}
