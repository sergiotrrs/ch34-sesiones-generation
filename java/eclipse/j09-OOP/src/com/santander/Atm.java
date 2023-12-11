package com.santander;

public class Atm {
	
	// atributo de instancia (non-static fields)
	double balance;
	int serialNumber;
	
	// atributos de clase (static fields)
	static String bankName = "BBVA";
	static int counter = 0;
	
	/**
	 * Método constructor
	 * 
	 * El método constructor se utiliza para iniciar 
	 * objetos de una clase.
	 * El constructor se llama automáticamente cuando 
	 * se crea una instancia
	 * de la clase utilizando la pabra reservada new.
	 * Su propósito es asignar valores iniciales a 
	 * los objetos.
	 * 
	 * Características:
	 *  - Su nombre es idéntico al de la clase.
	 *  - No tiene un tipo de retorno explícito.
	 *  - Puede tener parámetros
	 *  - Puede ser sobrecargado (method Overloading)
	 *  
	 *  Constructor por default: no tiene parámetros.
	 *  Si no se agrega algún constructor
	 *	java proporciona este método.
	 */
	 Atm(){		 
		 this.serialNumber = ++counter;		 
	 }
	 
	 Atm(String message){
		 this();
		 System.out.println(message);
	 }
	 
	 /**
	  * Constructor sobrecargado
	  * Los métodos sobrecargados tienen el mismo nombre
	  * pero diferentes parámetros.
	  * 
	  *  this: palabra reservada que se utiliza para 
	  *  hacer referencia al objeto en el que se encuentra
	  *  el contexto de la ejecución.
	  *  
	  *  Para invocar a un constructor, desde otro contructor
	  *  se utiliza this y se envía los argumentos del
	  *  contructor deseado.
	  *  
	  *  El llamado a un constructor debe ser la primera
	  *  línea.
	  * 
	  * @param balance cantidad disponible del cajero
	  */
	 Atm(double balance){
		 this("Estoy iniciando mi balance");
		 this.balance = balance;		 
	 }
	 
	 Atm(boolean isComercialPlace){
		 this( isComercialPlace? 50_000 : 10_000);
		 
	 }
	 
	// métodos de instancia
	
	// métodos de clase 
	public static void main(String[] args) {
		
		// Creamos el cajero01 y asignarle $1000 al balance
		Atm cajero01 = new Atm();
		cajero01.balance = 1000;
		// cajero01.serialNumber = 1;
		System.out.println( cajero01.bankName );
		System.out.println( Atm.bankName ); // recomendable
		
		// Creamos el cajero02 y asignarle $2000 al balance
		Atm cajero02 = new Atm();    
		cajero02.balance = 2000;
		// cajero02.serialNumber = 2;
		System.out.println( cajero02.bankName );
		
		// Creamos el cajero 03 y asignamos $3000 al balance
		Atm cajero03 = new Atm(3_000);
		Atm cajero04 = new Atm(true); // balance = 50000
		Atm cajero05 = new Atm(false); // balance = 10000
		
	}
}
