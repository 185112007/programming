package _030_yardimci_siniflar.ex_04;

public class StringTokenizerSinifi {

	public static void main(String[] args) {
		
		//1. StringTokenizer sinifi ile
		final java.util.StringTokenizer st = new java.util.StringTokenizer("bu bir test");
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		System.out.println();
		
		//2. string sinifi ile split
		final String testString = "bu bir test";
		final String[] split = testString.split(" ");
		for (final String word : split) {
			System.out.println(word);
		}
		
	}

}
