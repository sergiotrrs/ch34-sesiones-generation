package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) 
		 *    instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ 
		 *    instrucciones; 
		 *  }
		 * 
		 */
		
		for(int i = 0 ; i<=5 ; i++)
			System.out.println("Hola " +  i); // imprime 6 veces
		
//		for(byte i = 0 ; i<=5 ; i--)
//			System.out.println("Hola Lili, que comience el juego " + i);
		
		int iteraciones = 1;
		for (  ;   ;  ) {
			if( iteraciones > 5 ) { 
				break;
			}	
			System.out.println("Iteración: " + iteraciones ++);		
		}
		// n. iteraciones = 4
		
		outerLoop:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.println(i +" "+ j);
					if ( i== 2 && j == 2) break outerLoop;
				}			
			}
		
		// FizzBuzz
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		String frase;
		for(int i = 0; i<=20; i++) {
			frase = "";
			if( i % 3 == 0 ) frase = "Fizz";			
			if( i % 5 == 0 ) frase += "Buzz";
			
			if( frase.equals("") ) System.out.println(i);
			else System.out.println(frase);
		}
		
	}

}
