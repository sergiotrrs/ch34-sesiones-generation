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
		
		

	}

}
