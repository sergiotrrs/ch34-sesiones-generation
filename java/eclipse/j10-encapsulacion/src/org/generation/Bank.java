package org.generation;

import com.citibanamex.Atm;

public class Bank {

	public static void main(String[] args) {
		
		Atm cajero01 = new Atm();
		Atm cajero02 = new Atm(2_000);
		Atm cajero03 = new Atm("3000");
		
		System.out.println("Cajero01: " + cajero01.serialNumber);
		System.out.println("Cajero02: " + cajero02.serialNumber);
		System.out.println("Cajero03: " + cajero03.serialNumber);
		
		cajero01.serialNumber = 2;
		cajero03.serialNumber = 2;

		System.out.println("Cajero01: " + cajero01.serialNumber);
		System.out.println("Cajero02: " + cajero02.serialNumber);
		System.out.println("Cajero03: " + cajero03.serialNumber);
		
	}

}
