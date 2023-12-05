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
		
		// 
		
	}

}
