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
		deposit( cajero01, 400  );
		deposit( cajero01, 800  );
		deposit( cajero01, -600  );
		deposit( cajero02, 50_000  );
		

		System.out.println("Cajero01: " + cajero01.getBalance() ); // 8000
		System.out.println("Cajero02: " + cajero02.getBalance() ); // 2000
		System.out.println("Cajero03: " + cajero03.getBalance() ); // 3000
		
		cajero01.printLog();
		
	}
	
	static void deposit(Atm atm ,double amount ) {
		try {
			atm.deposit(amount);
		} catch (Exception e) {
			System.out.println("cajero: "+ atm.getSerialNumber() 
			+ " Operación rechazada: " + e.getMessage());
		}
	}

}
