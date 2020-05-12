package _029_collection_yapilari.ex_02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUygulamasi {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Ankara", 2515);
		map.put("Istanbul", 5343);
		map.put("Izmir", 855);
		map.put("Van", 3755);
		map.put("Samsun", null);
		
		//.........
		map.put("Samsun", 9579);
		map.put(null, 0);
		
		//key lere erisim
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}
		
		//value erisim
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		//hem key hem de value ikilisine erisim
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "-" + value);
		}
		
		//map boyutunu ogrenme
		int size = map.size();
		
		//map'in bos olup olmadigini kontrol etme
		map.isEmpty();
		
		//belli bir anahtar olup olmadigini kontrol etme
		if (map.containsKey("Ankara")) {
			System.out.println("Ankara - " + map.get("Ankara"));
		}
		
		//belli bir value sahip olup olmadigini kontrol etmek
		if (map.containsValue(2516)) {
			System.out.println("Ankara - " + map.get("Ankara"));
		}
		
		//bir eleman silme
		map.remove("Ankara");
		
		//temizlemek
		map.clear();
	}

}
