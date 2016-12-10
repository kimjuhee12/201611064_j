package com.sd.io;

import java.io.FileWriter;
import java.io.IOException;
 
public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test1.txt");
			fw.write("test");
			fw.close();
		} catch (IOException e) {
		}
	}
}