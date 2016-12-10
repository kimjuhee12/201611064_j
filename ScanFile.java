package com.sd.io;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScanFile {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("test.txt"));
				while (sc.hasNext()) {
					String line = sc.nextLine();
					System.out.println(line);
				}
		} catch(FileNotFoundException e) {}
	}
}