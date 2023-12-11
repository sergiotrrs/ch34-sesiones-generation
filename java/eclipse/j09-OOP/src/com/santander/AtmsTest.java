package com.santander;

public class AtmsTest {

	public static void main(String[] args) {
		Atm cajero01 = new Atm(true);
		Atm cajero02 = new Atm(true);
		Atm cajero03 = new Atm(true);
		Atm cajero04 = new Atm(true);
		
		System.out.println(cajero01.serialNumber);
		System.out.println(cajero02.serialNumber);
		System.out.println(cajero03.serialNumber);
		System.out.println(cajero04.serialNumber);

	}

}
