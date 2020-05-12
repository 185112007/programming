package _010_donguler;

public class _1_While {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		boolean donguKosulu = a < b;
		
		System.out.println(donguKosulu);
		
		while(donguKosulu) {
			a++;
			
			if(a > b) {
				donguKosulu = false;
			}
			
			System.out.println(a);
		}
		
	}

}
