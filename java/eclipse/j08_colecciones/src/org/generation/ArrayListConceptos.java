package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección List es una colección ORDENADA, en la que
		 * se permiten elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su tamaño,
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis:
		 *  ArrayList<object> varName;
		 */
		
		int edad = 25;
		Integer age = 25;

		// Definimos una colección de datos numéricos.
		// ArrayList<int> calificaciones;
		ArrayList<Integer> calificaciones;
		
		// Definir una variable de tipo ArrayList de Strings
		// variable con el nombre "nombreLibros"
		ArrayList<String> nombreLibros;
		nombreLibros = new ArrayList<>();
		// ArrayList<String> nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el método add()
		// El rpimer elemeto es el índice 0
		nombreLibros.add( "Piedra Filosofal" ); // Joseph
		nombreLibros.add( "Mujercitas" );
		nombreLibros.add( "El Ramayana" );
		nombreLibros.add( "La Tregua" );
		nombreLibros.add( "La Mecánica del Corazón" ); // Livi
			
		System.out.println( nombreLibros );
	  
		// Agregamos valores duplicados
		nombreLibros.add( "La Mecánica del Corazón" ); // Cinthia
		nombreLibros.add( "Piedra Filosofal" ); // Rafa
				
		System.out.println( nombreLibros );
		
		// Mostrar un elemento en particular
		// Indicamos el n.índice usando el método get()
		System.out.println("Misael recomienda: " + nombreLibros.get(2)); // El Ramayana
		
		// Obtener el tamaño de la colección con el método size()
		System.out.println("N. Libros: " + nombreLibros.size()); // 7

		// Elimiar un elemento con el método remove()
		System.out.println("Elemento eliminado: " + nombreLibros.remove(3) ); // La tregua
		System.out.println( nombreLibros );
		
		// Saber si un elemento está la colección con contains()
		System.out.println("Está \"Mujercitas\" ? " + nombreLibros.contains("Mujercitas")); // true
		System.out.println("Está \"Vaqueros\" ? " + nombreLibros.contains("Vaqueros")); // false
	}

}
