package com.santander;

public class BranchTest {

	public static void main(String[] args) {
		
		Branch sucPolanco = new Branch("Polancho 999");
		
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(15000) );

		System.out.println( sucPolanco.details() );

		// Crear nueva sucursal con 3 cajeros
	}
}
