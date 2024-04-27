package com.jspider.practiseprogram.base.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteRead {

	public static void main(String[] args) throws IOException {
		
		File file=new File("wejm5.txt");
		
		if (file.exists()) {
			FileInputStream fileInputStream=new FileInputStream(file);
            System.out.println(fileInputStream.read());
			System.out.println("successfullly readable");
			fileInputStream.close();
		}
	}
}
