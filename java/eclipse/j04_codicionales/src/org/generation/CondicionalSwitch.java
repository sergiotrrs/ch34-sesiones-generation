package org.generation;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 *  switch( expresión ){ 
		 *    case valor1 : expresión; 
		 *                  break; 
		 *    case valor2 : expresión;
		 *                  break; 
		 *    default: expresión; 
		 *             break; 
		 *   }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */

		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 
		 * salida-> Naciste en diciembre.
		 * 
		 */
		Scanner myScan = new Scanner(System.in);
		// Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu numero de mes: ");
		if (myScan.hasNextInt()) { // Verifica si existe un valor numerico
			int numeroMes = myScan.nextInt();
			String nombreMes;
			switch (numeroMes) {
			case 1:
				nombreMes = "ENERO";
				break;
			case 2:
				nombreMes = "FEBRERO";
				break;
			case 3:
				nombreMes = "MARZO";
				break;
			case 4:
				nombreMes = "ABRIL";
				break;
			case 5:
				nombreMes = "MAYO";
				break;
			case 6:
				nombreMes = "JUNIO";
				break;
			case 7:
				nombreMes = "JULIO";
				break;
			case 8:
				nombreMes = "AGOSTO";
				break;
			case 9:
				nombreMes = "SEPTIEMBRE";
				break;
			case 10:
				nombreMes = "OCTUBRE";
				break;
			case 11:
				nombreMes = "NOVIEMBRE";
				break;
			case 12:
				nombreMes = "DICIEMBRE";
				break;
			default:
				nombreMes = "NO EXISTE ESE MES";
				break;
			}
			System.out.println("Tu mes de nacimiento es: " + nombreMes);
			myScan.nextLine(); // limpiar la terminal
			
			// Verificar la estación del mes.
			// ej: La estación es invierno.
			// 12, 1, 2 : invierno
			// 3, 4, 5 : primavera
			// 6, 7, 8 : verano
			// 9, 10, 11 : otoño
			if(numeroMes == 12 || numeroMes == 1 || numeroMes == 2 ) {
            	System.out.println("La estación es invierno");
            }else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5 ) {
            	System.out.println("La estación es primavera");
            }else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8 ) {
            	System.out.println("La estación es verano");
            }else if(numeroMes == 9 || numeroMes == 10 || numeroMes == 11 ) {
            	System.out.println("La estación es otoño");
            } else {
            	System.out.println("Número introducido incorrecto");
            }
			
			String estacion;
			switch(numeroMes) {
			case 12, 1, 2:
				estacion = "Invierno"; break;
			case 3, 4, 5:
				estacion = "Primavera"; break;
			case 6, 7, 8:
				estacion = "Verano"; break;
			case 9, 10, 11:
				estacion = "Otoño"; break;
			default: 
				estacion = "Mes incorrecto"; break;
			}
			System.out.println("La estación correspondiente es: " + estacion);
			
			
			
		} else {
			System.out.println("No introdujiste un numero entero ");
			myScan.nextLine(); // limpiar la terminal
		}
		
		
		myScan.close();
		
		

	}

}
