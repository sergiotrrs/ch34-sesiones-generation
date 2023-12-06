package org.generation;

public class OperacionesMathTest {

	public static void main(String[] args) {
		
		System.out.println( saludo() );
		OperacionesMath operaciones;
		operaciones = new OperacionesMath();
		
		operaciones.sumaSiRetorno(4, 5);
		
		int resultado = operaciones.sumaConRetorno(5, 7);
		System.out.println("Resultado: " + resultado);
		
		double valorPi = OperacionesMath.valorPI();
		System.out.println(valorPi);
		
		

	}
	
	static String saludo() {
		return "Hola Ch34";
	}

}
