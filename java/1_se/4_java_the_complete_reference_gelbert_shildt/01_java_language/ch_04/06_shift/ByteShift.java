// Sdvig vlevo znaceniya tipa byte
class ByteShift{
	public static void main(String args[]){
		byte a = 64, b;
		int i;

		i = a << 1;
		b = (byte) (a << 1);
		System.out.println("\na << 1:");
		System.out.println("a: " + a);
		System.out.println("i: " + i);
		System.out.println("b: " + b);

		i = a << 2;
		b = (byte) (a << 2);
		System.out.println("\na << 2:");
		System.out.println("a: " + a);
		System.out.println("i: " + i);
		System.out.println("b: " + b);
	}
}