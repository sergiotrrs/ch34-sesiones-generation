package com.santander;

public class Atm {
	
	// atributo de instancia (non-static fields)
	double balance;
	int serialNumber;
	
	// atributos de clase (static fields)
	static String bankName = "BBVA";
	
	// método constructor
	
	// métodos de instancia
	
	// métodos de clase 
	public static void main(String[] args) {
		
		// Creamos el cajero01 y asignarle $1000 al balance
		Atm cajero01 = new Atm();
		cajero01.balance = 1000;
		cajero01.serialNumber = 1;
		System.out.println( cajero01.bankName );
		System.out.println( Atm.bankName ); // recomendable
		
		// Creamos el cajero02 y asignarle $2000 al balance
		Atm cajero02 = new Atm();    
		cajero02.balance = 2000;
		cajero02.serialNumber = 2;
		System.out.println( cajero02.bankName );
		
	}
}
