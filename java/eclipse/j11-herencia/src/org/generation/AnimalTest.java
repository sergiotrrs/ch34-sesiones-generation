package org.generation;

import com.zoo.Cat;
import com.zoo.Mammal;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Mammal mamifero = new Mammal("Mamifero", "Mamiferous Gigantescus", 2, true);
		// System.out.println( mamifero.eat("tamalitos de ayer") );
		
		Cat wero = new Cat("Wero", 10);
		Cat tecate = new Cat("Tecate", 1);
		Cat pelusa = new Cat("Pelusa", .9);
		
		System.out.println( wero.sleep() ); // El michi Wero duerme 10 h
		// El mamífero Gato come delicioso croquetas de pescado
		// El michi Wero come deliciosas coquetas de pescado cuando se le da la gana
		System.out.println( wero.eat("croquetas de pescado")); 
		

	}

}
