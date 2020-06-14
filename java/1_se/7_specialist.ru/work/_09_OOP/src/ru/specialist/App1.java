package ru.specialist;

import ru.specialist._01_stuff.Person_v1;
import ru.specialist._01_stuff.Person_v2;
import ru.specialist._01_stuff.Person_v3;
import ru.specialist._01_stuff.Person_v4;
import ru.specialist._01_stuff.Person_v5;
import ru.specialist._01_stuff.Person_v6;

public class App1 {

	public static void main(String[] args) {
		
		{// 1
			System.out.println("----1:----");
			// 1.1 create reference
			Person_v1 p1;
			
			// 1.2  create object
			p1 = new Person_v1();
			
			// 1.3 use
			p1.name = "Gafur";
			p1.age = 35;
			p1.show();	// this == p1
			
			Person_v1 p2 = new Person_v1();
			p2.name = "Nataliya";
			p2.age = 29;
			p2.show();	// this == p2
			
			// default value of properties
			Person_v1 p3 = new Person_v1();
			p3.show();	// this == p3
		}
		
		{// 2
			System.out.println("----2:----");
			Person_v2 p1 = new Person_v2();
			p1.show();
		}
		
		{// 3
			System.out.println("----3:----");
			Person_v3 p1 = new Person_v3("Gafur", 35);
			p1.show();
			
			Person_v3 p2= new Person_v3("Gafur");
			p2.show();
			
			Person_v3 p3 = new Person_v3();
			p3.show();
		}
		
		{// 4
			System.out.println("----4:----");
			Person_v4.showConter();
			
			Person_v4 p1 = new Person_v4("Gafur", 35);
			p1.show();
			
			Person_v4 p2= new Person_v4("Gafur");
			p2.show();
			
			Person_v4 p3 = new Person_v4();
			p3.show();
			
			Person_v4.showConter();
		}
		
		{// 5
			System.out.println("----5:----");
			
			new Person_v5("Gafur", 35);
			
			new Person_v5("Gafur");
			
			new Person_v5();
			
			Person_v5.showAllPersons();
		}
		
		{// 6
			System.out.println("----6:----");
			
			Person_v6.create("Gafur1", 35);
			Person_v6.create("Gafur2", 36);
			Person_v6.create("Gafur3", 37);
			
			Person_v6.showAllPersons();
		}
	}

}
