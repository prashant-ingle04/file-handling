package com.jspider.practiseprogram.base.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterRead {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("Prashant.txt");
		
		if (file.exists()) {
			
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
		    
			Scanner scanner=new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("Successfully readble");
			fileReader.close();
			scanner.close();
		}
	}

}
