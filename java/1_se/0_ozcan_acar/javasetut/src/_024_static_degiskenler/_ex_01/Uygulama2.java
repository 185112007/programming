package _024_static_degiskenler._ex_01;

import static _024_static_degiskenler._ex_01.BirInterface.X;

public class Uygulama2 {

	public static void main(String[] args) {
		Uygulama.i = 200;
		
		System.out.println(Uygulama.i);
		
//		Uygulama.j = 400;
		
		System.out.println(Uygulama.j);
		
		System.out.println(BirInterface.X);
//		BirInterface.X = 500;
		
		System.out.println(X);//static import
	}

}
