package ua.rba;

import ua.rba.util.Print;	// external class

public class App1 {

	public static void main(String[] args) {
		// 1.
		System.out.println(int.class);
		
		// 2. add to run conf. Arguments => VM arguments: -verbose
		// look at the console
		System.out.println(long.class);
		
		// 3.
		System.out.println(void.class);
		
		// 4. it does not load A1
		A1 a;
		
		// 5. upload A1 to Static Context
		System.out.println(A1.class);
		
		// 6. load external class to Static Ctx
		//    (set classpath in project properties->JavaBuildPath->Libraries->Classpath)
		System.out.println(Print.class);
		
		// 7. another way loading classes
		try {
			Class.forName("ua.rba.A2");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 8. call public static method
		System.out.println(A2.m1(2, 2));
		
		// 9.
		//Print.m1();		// ERROR!!! these is conflict with external class
		
		// 10. this runs 
		A3.m1(2, 3);
	}

}
