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
		
		cajero01.setBalance("3000");
		cajero02.setBalance(-400);
		cajero03.setBalance( cajero03.getBalance() - 1_000_000 );
		
		

		
	}

}
