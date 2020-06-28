package ru.specialist.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class App1 {

	private static final String fileName1 = "test1.txt";
	
	private static final String fileName2 = "test2.txt";
	
	// File.separator = /
	private static final String dir1 = ".." + File.separator;
	
	public static void main(String[] args) throws IOException {
		{// 1. create files
			System.out.println("----1. create file:----");
			File f1 = new File(fileName1);
			
			if (!f1.exists()) {
				f1.createNewFile();
			}
			
			Date lm = new Date(f1.lastModified());
			System.out.println(lm.toLocaleString());
			System.out.println(f1.getCanonicalPath());
		}
		
		{// 2. list files in directory
			System.out.println("\n----2. list files----");
			File d1 = new File(dir1);
			
			System.out.println(d1.getCanonicalPath());
			
			File[] files = d1.listFiles();
			
			for (File file : files) {
				Date l = new Date(file.lastModified());
				
				if (file.isDirectory()) {
					System.out.printf("%-30s %2$tH:%2$tM:%2$tS\n",
							file.getName().toUpperCase(), l);
				}
				if (file.isFile()) {
					System.out.printf("%-30s %2$tH:%2$tM:%2$tS\n",
							file.getName().toLowerCase(), l);
				}
			}
		}
		
		{// 3. FileInputStream: read
			System.out.println("\n----3. FileInputStream----");
			FileInputStream fs = new FileInputStream(fileName1);
			byte[] buf = new byte[1000];
			fs.read(buf);
			System.out.println(new String(buf, StandardCharsets.UTF_8));
			fs.close();
		}
		
		{// 4. BufferedReader: read
			System.out.println("\n----4. BufferedReader----");
			try (FileInputStream fs = new FileInputStream(fileName1);
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(fs, Charset.forName("cp1251")))){
				String line = null;
				int lineCounter = 0;
				int charCounter = 0;
				int wordCounter = 0;
				
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
					lineCounter++;
					charCounter += line.length();
					wordCounter += line.split("\\s").length;
				}
				
				System.out.println("---------------------------------");
				System.out.printf("Total lines: %d, words: %d, chars: %d\n",
						lineCounter, wordCounter, charCounter);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		{// 5. FileOutputStream: write
			System.out.println("----5. FileOutputStream----");
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(fileName2);
				PrintWriter writer = new PrintWriter(fos);
				
				writer.printf("%15s - %d\r\n", "G1", 35);
				writer.flush();
				writer.printf("%15s - %d\r\n", "G2", 30);
				writer.printf("%15s - %d\r\n", "G3", 7);
				
				writer.close();
				
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}finally {
				if (fos != null) {
					fos.close();
				}
			}
		}
		
		{// 6. RandomAccessFile: write and read
			System.out.println("----6. RandomAccessFile:----");
			try(RandomAccessFile rnd = new RandomAccessFile(fileName2, "rw")){
				rnd.seek(0);
				rnd.writeChars("line 1");
				System.out.println(rnd.length()); 	// length of this file
				
				rnd.close();
			}
		}
	}

}
