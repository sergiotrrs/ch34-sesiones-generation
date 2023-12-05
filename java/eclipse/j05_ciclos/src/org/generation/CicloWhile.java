package org.generation;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 * Ciclo Do While()
		 * 
		 * Sintaxis:
		 *     do{
		 *      instrucciones;
		 *     }while(condicion);
		 *   
		 * 
		 */
		
		// preguntar al usuario usado la consola
		// si desea cotinuar iterando
		// si la persona escriba "s" cotinuamos con nueva iteración
		// caso contrario, finalizamos.
		Scanner sc = new Scanner(System.in);
		
		boolean isActive = false;
		char response;
		
		while( isActive ) {
			System.out.println("Bievenido While");
			System.out.print("Quieres continuar s/n? " );
			response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's' ) isActive = false;			
		}
		System.out.println("Hasta pronto, termina while");


		do {
			System.out.println("Bievenido Do-While");
			System.out.print("Quieres continuar s/n? " );
			response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's' ) isActive = false;
			else isActive = true;
		} while( isActive );
		System.out.println("Hasta pronto, termina do-while");
	}

}
