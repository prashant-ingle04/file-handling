package com.jspider.practiseprogram.base.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {
	public static void main(String[] args) throws IOException {
		File file=new File("wejm5.txt");
		
		if (file.exists()) {
			System.out.println("file already exists");
		}else {
			file.createNewFile();
		}
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		fileOutputStream.write(44);
		System.out.println("Data written successfully");
		fileOutputStream.close();
		
	}

}
