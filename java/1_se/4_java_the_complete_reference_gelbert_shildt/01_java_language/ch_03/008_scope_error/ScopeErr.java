// Skompilirovat etu programmu nelzya
class ScopeErr{
	public static void main(String args[]){
		int bar = 1;
		{	// sozdaetsa novaya oblast vidimosti
			int bar = 2;	// osibka vo vremya kompilyasii
							// peremennaya bar uje opredelena!
		}
	}
}