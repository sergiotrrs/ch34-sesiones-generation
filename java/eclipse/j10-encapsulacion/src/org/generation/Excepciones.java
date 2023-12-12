package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Una excepción es una situación no esperada
 * durante la ejecución de un programa.
 * 
 * Existen dos tipos de excepciones.
 * 
 * A) Checked Exceptions: Son  excepciones que se heredan
 * de la clase Exceptions. Se tiene que declarar la excepción
 * en la firma del método o bien manejar la excepción con 
 * el bloque try-catch.
 * 
 * B) Unchecked Exceptions: Son excepciones que se heredan
 * de la clase RuntimeException. No se está obligado a procesarlas.
 * Es opcional el uso de try-catch o declar en la firma del método.
 * 
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar.
 * 
 * Manejo de excepciones con el bloque try-catch
 * 
 * Sintaxis:
 * 
 *  try{
 *  
 *  }
 *  catch(exception e  ){
 *  
 *  }
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try
 * finally: se ejecutará después de try o catch.
 * 
 * El stacktrace de una excepción es el conjunto
 * de mensajes desde el origen de la excepción
 * hasta la última clase que recibe la excepción.
 * 
 * 
 */
public class Excepciones {

	public static void main(String[] args) {
		
		System.out.println("Inicio del programa");
		double division;
		int[] myArray = {4,6};
		
		try {
			division = 5/2.0;    // 5 / 0; Exception / by zero
			System.out.println(division);
			myArray[1] = 10;
			readFileWithException();
			
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
			e.printStackTrace();
		} 
//			catch ( ArrayIndexOutOfBoundsException e ) {
//			System.out.println("Problemas con el array");
//			e.printStackTrace();
//		} catch ( FileNotFoundException e ) {
//			System.out.println("No se puede leer el archivo");
//			e.printStackTrace();
//		}
		catch(Exception e ) {
			System.out.println("Algo pasó, no lo sé, pero ya tenemor que irnos a comer");
			e.printStackTrace();
		}
		
		
		

		System.out.println("Fin de mi programa");		
		
	}
	
	static void readFile() {
		File file = new File("myFile.txt");
		try {
			Scanner myReader = new Scanner( file  );			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static void readFileWithException() throws FileNotFoundException {
		File file = new File("myFile.txt");
		Scanner myReader = new Scanner( file  );			

	}

}
