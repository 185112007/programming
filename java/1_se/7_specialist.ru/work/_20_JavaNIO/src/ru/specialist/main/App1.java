package ru.specialist.main;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class App1 {

	private static final String fileName1 = "test1.txt";

	public static void main(String[] args) throws IOException, InterruptedException {
		{// 1. read file
			System.out.println("1. read file");
			Files.readAllLines(Paths.get(fileName1)).forEach((s) -> {
				System.out.println(s);
			});
		}

		{// 2. read file
			System.out.println("\n2. read file");
			Files.readAllLines(Paths.get(fileName1)).forEach(System.out::println);
		}
		
		{// 3. list directory
			System.out.println("\n3. list directory");
			Path dir = Paths.get("..");
			Files.newDirectoryStream(dir).forEach(System.out::println);
		}
		
		{// 4. watch service for specified dir
			System.out.println("----4. watch service for specified dir:----");
			Path dir = Paths.get("..");
			WatchService watchDog = FileSystems.getDefault().newWatchService();
			
			WatchKey key = dir.register(watchDog, StandardWatchEventKinds.ENTRY_CREATE);
			
			key = watchDog.take();
			
			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent<Path> ev = (WatchEvent<Path>)event;
				Path filename = ev.context();
				System.out.println(filename);
			}
		}
	}

}
