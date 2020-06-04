package ua.rba;

public class App1 {

	public static void main(String[] args) {
		// 1. fields of interfaces
		System.out.println("1:");
		System.out.println(I1.YES);
		System.out.println(I1.NO + "\n");

		// 2. using enum
		System.out.println("2:");
		System.out.println(SeasonEnum.Rain + "\n");

		// 3.
		System.out.println("3:");
		System.out.println(SeasonEnum.Soft + "\n");

		// 4.
		
		System.out.println("4:");
		System.out.println(SeasonEnum.Winter.get_id() + "\n");

		// 5.
		System.out.println("5:");
		I3 i3;
		i3 = new A3();
		i3.m1();
	}

}
