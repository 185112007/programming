/*
	Bezznakovyy sdvig dvoicnyh razryadov znaceniya tipa byte
*/
class ByteUShift {
	public static void main(String[] args) {
		char hex[] = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};

		byte b = (byte) 0xf1;										// b       			= 1111 1111 1111 0001 = (byte)fff1 = 0xf1
		byte c = (byte) (b >> 4);									// b >> 4  			= 1111 1111 1111 1111 = (byte)ffff = 0xff
		byte d = (byte) (b >>> 4);									// b >>> 4 			= 0000 1111 1111 1111 = (byte)0fff = 0xff
		byte e = (byte) ((b & 0xff) >> 4);							// (b & 0xff) >> 4 	= 0000 0000 1111 1111 >> 4 = 0000 0000 0000 1111 = (byte)000f = 0x0f

		System.out.println(" b \t\t\t= 0x"
		                   + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
		System.out.println(" b >> 4 \t\t= 0x"
		                   + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
		System.out.println(" b >>> 4 \t\t= 0x"
		                   + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
		System.out.println(" (b & 0xff) >> 4 \t= 0x"
		                   + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
	}
}