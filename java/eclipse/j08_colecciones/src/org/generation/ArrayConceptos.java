package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o después de la variable
		 * ej.  int[] myArray;
		 *      int myArray[];
		 * Para los arrglos se debe asignar la cantidad de elementos que contendrá
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 * 
		 * Se instancia un arreglo con new tipoDato[ n.elementos ];
		 */
		
		// Definimos un arreglo de 3 elementos tipo int.
		// Instanciando un objeto(array) de tipo Array, con 4 elementos
		// El índice es base 0, es decir, el primer elemento es el índice 0
		int[] codigoColores = new int[4];
		// Definir un array(4 elementos) de String con el nombre de variable nombreColores
		String[] nombreColores = new String[4];
		
		// Para agregar elementos en un arreglo, se indica dentro del corchete el índice.
		// El primer elemento es el índice 0
		nombreColores[0] = "Azul";
		// Agregar el código hexadecimal del color azul en el array codigoColores, index 0
		codigoColores[0] = 0x00_00_FF;
		
		// Agregar el amarillo en el índice 1 de los dos arrays
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xFF_FF_00;
		
		// Agregar el color negro en el índice 2 de los dos arrays
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x00_00_00;
		
		// Iterar elementos en un arreglo usando for loop
		for(int i=0 ; i < nombreColores.length; i++ ) {
			String texto = String.format("El color: %s tiene RGB: 0x%06X" ,
					nombreColores[i], codigoColores[i]  );
			System.out.println( texto );
//			System.out.printf();
		}
		
		// Agregamos un elemento en índice 10
		// Se genera una excepción indicando que estamos fuera de los límites
		// nombreColores[10] = "Morado"; // Index 10 out of bounds for length 4
		
		// Iterar elementos usando "for each loop"
		
		for (String nombreColor : nombreColores) {
			System.out.println("El color " + nombreColor);
		}
		
		// Iterar los códigos de colores con "for each loop"
		for (int codigoColor : codigoColores) {
			//System.out.println("El hexadecimal es: " + codigoColor);
			System.out.printf("El hexadecimal es: 0X%06X %n", codigoColor);
			System.out.println("El hex es: " + Integer.toHexString(codigoColor));
		}
		
		// Iniciar un arreglo al asignarlo a la variable
		// String[] frutas = new String[4];
		String[] frutas = {"Uva", "Mandarina", "Mangos", "Fresa"};
		
		// Instanciar un array de 2 dimensiones
		String[][] participantes = new String[3][5];
		
		
	}

}
