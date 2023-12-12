package org.generation;

import com.citibanamex.Atm;

public class Bank {

	public static void main(String[] args) {
		
		Atm cajero01 = new Atm();
		Atm cajero02 = new Atm(2_000);
		Atm cajero03 = new Atm("3000");
		
		System.out.println("Cajero01: " + cajero01.getSerialNumber() );
		System.out.println("Cajero02: " + cajero02.getSerialNumber() );
		System.out.println("Cajero03: " + cajero03.getSerialNumber() );
		
		cajero01.deposit("3000"); // 13000
		// cajero02.deposit(-400);
		// cajero03.deposit( cajero03.getBalance() - 1_000_000 );
		cajero01.withdraw(5000); // 8000
		cajero02.withdraw(-5000); // Cantidad menor o igual a cero
		cajero03.withdraw(5_000_000); // Fondos insuficientes
		
		System.out.println("Cajero01: " + cajero01.getBalance() ); // 8000
		System.out.println("Cajero02: " + cajero02.getBalance() ); // 2000
		System.out.println("Cajero03: " + cajero03.getBalance() ); // 3000
		

		
	}

}
