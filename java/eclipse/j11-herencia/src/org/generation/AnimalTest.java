package org.generation;

import java.util.ArrayList;
import java.util.List;

import com.pet.Pet;
import com.toy.Tamagochi;
import com.zoo.Animal;
import com.zoo.Cat;
import com.zoo.Leopard;
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
		System.out.println( wero.trick() );
		
		// ========================================================
		ArrayList< Animal > arca = new ArrayList<>();
		arca.add(pelusa);
		arca.add(tecate);
		arca.add(wero);
		arca.add( new Leopard(3) );

		Animal solovino = new Leopard(4);
		solovino = null;
		solovino = new Cat("Jinata", 2);
		
		List <Pet> mascotas = new ArrayList<>();
		mascotas.add( pelusa );
		mascotas.add( new Tamagochi("Memetchi"));
		
		// --- Polimorfismo en tiempo de ejecución
		eat( arca  );
		
	}
	
	public static void eat( ArrayList<Animal> animals ) {
		for(Animal animal : animals ) {
			System.out.println( animal.eat("tortilla") );
			System.out.println( animal.sleep() );			
			// System.out.println( animal.getCommonName() );
			
			if(animal instanceof Cat ) {
				System.out.println("petName: " + ((Cat)animal).getPetName() );				
			}
		}
	}
	

}
