package org.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		// dato inmutable: No se puede modificar 
		// datos primitivos so inmutables
		int cuentaBancaria = 6890;
		cuentaBancaria = 2345;
		
		String nombre = "Kim";
		nombre = "Alex";
		nombre = null;
		String participante = new String("Kim");
		
		if ( participante.equals("Kim")  ) {
			System.out.println("Agregó la canción 1/2");
		} else {
			System.out.println("La persona no se llama Kim");
		}

	}

}
