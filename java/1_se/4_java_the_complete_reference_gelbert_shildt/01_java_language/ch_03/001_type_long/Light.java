// Vycislit passtoyanie, prohodimoe svetom
// ispolzuya peremennye tipa long
class Light{
	public static void main(String args[]){
		int lightspeed;
		long days;
		long seconds;
		long distance;

		// priblizitelnaya skorost sveta, mil v sekundu
		lightspeed = 186000;

		// ukazat kolicestvo dney
		days = 1000; 

		// preobrazovat v sekundy
		seconds = days * 24 * 60 * 60;

		// vyceslit rasstoyanie
		distance = lightspeed * seconds;

		System.out.print("Za " + days);
		System.out.print(" dney svet proydet okolo ");
		System.out.println(distance + " mil.");
	}
}