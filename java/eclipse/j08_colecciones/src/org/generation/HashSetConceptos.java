package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ORDENADA.
		 * No se permite elementos duplicados
		 * Cualquier elemento duplicado no se insertará en la colección.
		 * 
		 * Sintaxis:
		 *  HashSet<Object> varName;
		 */

		// Definimos una colección HashSet
		HashSet<String> paises = new HashSet<>();
		
		// Agregar valores con add()
		paises.add("Genovia");
		paises.add("Wakanda");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Japón");
		paises.add("Cuba");
		
		System.out.println( paises );
		
		// agregar valores duplicados
		paises.add("Wakanda"); // los valores duplicados no se insertan
		paises.add("Genovia");
		
		System.out.println( paises );
		
		// Desplegar el tamaño de la colección usando size()
		System.out.println( "N. de paises: " + paises.size() );
		
		// Verificar si existe el pais "Wakanda", "Guatemala"
		System.out.println("Está Wakanda? " + paises.contains("Wakanda") );
		System.out.println("Está Guatemala? " + paises.contains("Guatemala") );
		
		// Remover un elemento con remove()
		// Se indica el elemento a remover con el objeto
		System.out.println("Eliminados: " + paises.remove("México"));
		System.out.println(paises);
		
		// Iteramos la colección con for each
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		// Iteramos la colección con for each y lambda expressions
		paises.forEach(pais -> System.out.println(pais));
		
		// Iterando con  Double Colon Operator (Operador de referencia)
		/*
		 *  El operador double colon :: u operador de referencia 
		 *  de metodo es algo que se introdujo con java 8 para 
		 *  hacer que el código sea mas simple y legible. 
		 *  Lo que hace es abreviar una expresión lambda 
		 *  para llamar a cualquier método.
		 */
		System.out.println("===== Double Colon Operator =====");
		// paises.forEach(pais -> System.out.println(pais));
		paises.forEach( System.out :: println);
		
				
		// Usando Streams con colecciones:
		/*
		 *  Los streams proporcionan una forma de trabajar con 
		 *  secuencias de elementos de datos de manera eficiente y 
		 *  funcional. Java introdujo el concepto de streams en Java 8 
		 *  como parte del paquete java.util.stream.
		 *  
		 *  Un stream en Java tiene las siguientes características clave:
		 *  
		 *  - Secuencialidad: Los elementos se procesan uno a la vez 
		 *  en orden, de principio a fin.
		 *  
		 *  - Funcionalidad: Los streams proporcionan una interfaz funcional 
		 *  para realizar operaciones sobre los datos, como filtrado, mapeo 
		 *  y reducción. Esto permite un estilo de programación más funcional.
		 *  
		 *  - Perezoso (Lazy): Los streams son perezosos, lo que significa 
		 *  que no realizan ninguna operación hasta que se les solicita. 
		 *  Esto permite la optimización de recursos al evitar el 
		 *  procesamiento innecesario.
		 *  
		 *  - Pipeline: Los streams admiten operaciones en cadena, 
		 *  conocidas como pipelines, donde se pueden realizar varias 
		 *  operaciones en una secuencia.
		 *  
		 *  
		 */
		paises
			.stream() // Conversión a clase Stream
			.map(String::length) // Obteniendo la longitud de cada elemento String
			.forEach(System.out::println); // Imprimiendo en consola
		
		// Lo anterior usando lambda expression
		System.out.println("---> lambda expressions <---");
		paises
			.stream()
			.map( pais -> pais.length() )
			.forEach( paisLength -> System.out.println("País : " + paisLength));
                         // con la expresión lambda se permite personalizar la salida
	}

}
