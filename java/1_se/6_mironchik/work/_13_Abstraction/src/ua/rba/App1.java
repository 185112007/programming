package ua.rba;

public class App1 {

	public static void main(String[] args) {
		// 1.
//		new _4_MakeReport();		// cannot instantiate abstract class
		
		// 2. we cannot make private abstract method!!!!
		
		// 3.
//		new _5_MakeSalary().countSalary();
		
		// 4. parent = child ==> polymorphizm 
		_1_Salary sal = new _5_MakeSalary();
		sal.reports();
	
	}

}
