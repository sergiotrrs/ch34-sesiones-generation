package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relación clave(key):valor(value)
		 * que forma una tabla de datos.
		 */
		
		// Definimos una colección HashMap
		// < key, value   >
		// < matrícula , nombre   >
		HashMap<Integer, String > students = new HashMap<>();
		
		// agregamos calores con put()
		students.put( 1234, "Migue O");
		students.put( 1235, "Olivia R");
		students.put( 1236, "Fernando J");
		students.put( 1250, "Mirta T");
		
		System.out.println( students );
		
		// reemplazar un elemento
		students.put( 1250, "Liliana O" );
		System.out.println( students );
		
		// mostrar un element con get( key )
		System.out.println("Persona con n. 1235 : " + students.get(1235)); // Olivia R
		
		// removiendo un elemento remove(key)
		System.out.println("Elemento eliminado: " + students.remove(1234) ); // Miguel
		System.out.println( students );
		
		// Iterar la colección con sus keys
		for( int matricula : students.keySet()  ) {
			System.out.println( matricula + " - " + students.get(matricula));
		}
		
		// Iterar la colección con sus valores
		for (String student : students.values() ) {
			System.out.println("Estudiante: " + student);
		}
		
		students.forEach( (key,value) -> System.out.println( key + " - " + value ));
		
	}

}
