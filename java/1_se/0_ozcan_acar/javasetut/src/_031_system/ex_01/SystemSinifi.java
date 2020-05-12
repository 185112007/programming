package _031_system.ex_01;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemSinifi {

	public static void main(String[] args) {
		
		final String javaVersion = System.getProperty("java.version");
		final String javaVendor = System.getProperty("java.vendor");
		final String javaHome = System.getProperty("java.home");
		final String javaClassPat = System.getProperty("java.class.path");
		final String username = System.getProperty("user.name");
		final String userHome = System.getProperty("user.home");
		
		System.out.println(javaVersion);
		System.out.println(javaVendor);
		System.out.println(javaHome);
		System.out.println(javaClassPat);
		System.out.println(username);
		System.out.println(userHome);
		System.out.println();
		
		Properties properties = System.getProperties();
		Set<Entry<Object,Object>> entrySet = properties.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.print(entry.getKey());
			System.out.print("=");
			System.out.println(entry.getValue());
		}
		
		System.out.println("\n" + System.getProperty("name"));
		System.setProperty("degisken", "1");
		System.out.println("\n" + System.getProperty("degisken"));
		
		
	}

}
