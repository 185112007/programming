package ru.specialist;

public class App1 {

	public static void main(String[] args) {
		{// 1. static nested class
			System.out.println("1. static nested class:");
			_01_Outer.Nested n = new _01_Outer.Nested();
			
			_01_Outer o = new _01_Outer(10);
			n.increment(o);
			
			System.out.println(o.getData());
		}
		
		{// 2. inner class
			System.out.println("2. inner class:");
			
			_01_Outer o = new _01_Outer(10);
			_01_Outer.Inner i = o.new Inner();
			
			i.increment();
			
			System.out.println(o.getData());
		}
		
		{// 3. inner usage
			_02_Invoice inv = new _02_Invoice("Roga&Kopyta");
			
			inv.new Line("Roga", 10, 100);
			inv.new Line("Kopyta", 20, 40);
			
			System.out.println(inv);
			
			
		}
	}

}
