package com.mudopokemon;

public class ArenaPokemon {

	public static void main(String[] args) {
		Pokemon.gritaPokemon();
		// Instanciando la clase Pokemon 		
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.tipo= "Electrico";

		Pokemon charmander = new Pokemon();
		charmander.nombre = "Charmander";
		charmander.tipo= "Fuego";
		
		Pokemon squirtle = new Pokemon();
		squirtle.nombre = "Squirtle";
		squirtle.tipo= "Agua";
		
		// Hacemos comer a Pikachu
		// pikachu.comer("bayas"); //imprime detro del método
		System.out.println(pikachu.comer("bayas", 100));
		
		// Hacemos dormir a Charmander
		charmander.dormir();
		
		// Mostrar el fabricante de los Pokemones
		System.out.println( Pokemon.nombreFabricante() );
		System.out.println( charmander.nombreFabricante() );
		
		
		

		

	}

}
