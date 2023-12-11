package com.santander;

public class BranchTest {

	public static void main(String[] args) {
		
		Branch sucPolanco = new Branch("Polanco n.999");
		
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(true) );
		sucPolanco.addAtm( new Atm(15000) );

		System.out.println( sucPolanco.details() );

		// Crear nueva sucursal con 3 cajeros
		Branch sucAvellanas = new Branch("Avellanitas 9723");
		
		sucAvellanas.addAtm(new Atm(true) );
		sucAvellanas.addAtm(new Atm(true) );
		sucAvellanas.addAtm(new Atm(2_000) );
		
		System.out.println( sucAvellanas.details() );
	}
}
