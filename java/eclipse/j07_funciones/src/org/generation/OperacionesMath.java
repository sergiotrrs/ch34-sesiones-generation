package org.generation;

public class OperacionesMath {
	
	// atributos de instancia (non-static fields)
	// atributos de clase (static fields)
	
	// métodos constructores
	
	// métodos de instancia
	void sumaSiRetorno(int a, int b){
		System.out.println("Resultado: " + (a + b) );
	}
	
	int sumaConRetorno(int a, int b) {
		return a + b ;
	}
	
	// métodos de clase
	static double valorPI(){
		// return 3.141592;		
		return Math.PI;  
	}
    
}
