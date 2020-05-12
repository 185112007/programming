package _010_donguler;

public class _4_Break_Continue {

	public static void main(String[] args) {
		// 1.break
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		//2.continue
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
