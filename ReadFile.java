package com.sd.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ReadFile {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.println((char)i);
			fr.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}
}