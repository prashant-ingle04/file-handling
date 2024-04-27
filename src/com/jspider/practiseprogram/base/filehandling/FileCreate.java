package com.jspider.practiseprogram.base.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) throws IOException {
		
		File file=new File("wejm5.txt");
		
		if (file.exists()) {
			System.out.println("file already exists");
		}else {
			file.createNewFile();
		}
		
		System.out.println("The name of the file is " + file.getName());
		System.out.println("The path of the file is " + file.getAbsolutePath());
		System.out.println("The length of the file is "+ file.length());
		
		if (file.canRead()) {
			System.out.println("file can readable ");
		}else {
			System.out.println("file can not be readble");
		}
		
		if (file.canWrite()) {
			System.out.println("file can be writable");
		}else {
			System.out.println("file can not be writable");
		}
		
		if (file.canExecute()) {
			System.out.println("file can be excutable");
		}else {
			System.out.println("file can not be executable");
		}
	}

}
