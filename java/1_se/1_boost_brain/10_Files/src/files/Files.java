package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws FileNotFoundException,  IOException{
		
		// 1. list files
		System.out.println("1. list files");
		File dir = new File("."); // tekushiy katalog
		
		String names[] = dir.list();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 2. file length
		System.out.println("\n2. file length");
		File file = new File(".classpath");
		System.out.println(file.length());
		
		// 3. FileInputStream
		System.out.println("3. FileInputStream");
		FileInputStream input = new FileInputStream(file);
		int length = input.available();
		byte data[] = new byte[length];
		
		input.read(data);
		
		String text = new String(data);
		System.out.println(text);
		
		// 4. FileOutputStream
		FileOutputStream output = new FileOutputStream(file, true);
		String newText = "<!-- Hello world files -->";
		byte bytes[] = newText.getBytes();
		output.write(bytes);
		output.close();
	}

}
