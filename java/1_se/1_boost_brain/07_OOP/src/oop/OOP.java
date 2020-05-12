package oop;

import oop.encapsulation.CatEnc;
import oop.encapsulation.DogEnc;
import oop.inheritance.CatInh;
import oop.inheritance.DogInh;
import oop.polymorphism.AnimalPoly;
import oop.polymorphism.CatPoly;
import oop.polymorphism.DogPoly;

public class OOP {

	public static void main(String[] args) {
		// 1. inheritance
		System.out.println("1.inheritance:");
		DogInh dogInh = new DogInh();
		CatInh catInh = new CatInh();

		dogInh.name = "Layka";
		catInh.name = "Murka";

		System.out.println(dogInh.name);
		System.out.println(catInh.name);

		// 2. encapsulation
		System.out.println("\n2. encapsulation");
		DogEnc dogEnc = new DogEnc();
		CatEnc catEnc = new CatEnc();

//		dogEnc.name = "Layka";
//		catEnc.name = "Murka";
		dogEnc.setName("Layka-2");
		catEnc.setName("Murka-2");

//		System.out.println(dogEnc.name);
//		System.out.println(catEnc.name);
		System.out.println(dogEnc.getName());
		System.out.println(catEnc.getName());

		// 3. polymorphism
		System.out.println("\n3. polymorphism");
		AnimalPoly dogPoly = new DogPoly();
		AnimalPoly catPoly = new CatPoly();

		dogPoly.setName("Layka-3");
		catPoly.setName("Murka");

		System.out.println(dogPoly.voice());
		System.out.println(catPoly.voice());

	}

}
