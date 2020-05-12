package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Collections {

	public static void main(String[] args) throws IOException {
		String fileName = "stations-depth.csv";
		FileInputStream stream = new FileInputStream(fileName);
		
		int length = stream.available();
		byte  data[] = new byte[length];
		stream.read(data);
		
		String text = new String(data);
		//System.out.println(text);
		
		String lines[] = text.split("\n");
		
		ArrayList<String[]> lineWords = new ArrayList<>();
		for(String line:lines) {
			String words[] = line.split(",");
			lineWords.add(words);
		}
		
		//wordsWith100(lineWords);
		
		//hashMapUsage(lineWords);
		
		TreeMap<String, Integer> map = new TreeMap<>();
		for(String words[]: lineWords) {
			String str = words[4].trim();
			if(map.containsKey(str)) {
				Integer k= map.get(str);
				k = k + 1;
				map.put(str, k);
			}else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map.get("190"));
		
		for(String str:map.keySet()) {
			System.out.println("Время проезда в метро: " + str + ", count: " + map.get(str));
		}
	}

	private static void hashMapUsage(ArrayList<String[]> lineWords) {
		HashMap<String, Integer> map = new HashMap<>();
		for(String words[]: lineWords) {
			String str = words[4].trim();
			if(map.containsKey(str)) {
				Integer k= map.get(str);
				k = k + 1;
				map.put(str, k);
			}else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map.get("190"));
		
		for(String str:map.keySet()) {
			System.out.println("Время проезда в метро: " + str + ", count: " + map.get(str));
		}
	}

	private static void wordsWith100(ArrayList<String[]> lineWords) {
		for(String[] words:lineWords) {
			if(words[4].trim().equals("100")) {
				for(String word:words) {
					System.out.print(word);
					System.out.print("|");
				}
				System.out.println("------------------------------");
			}
		}
	}

}
