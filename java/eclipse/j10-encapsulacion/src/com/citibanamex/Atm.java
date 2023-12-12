package com.citibanamex;

public class Atm {
	
	private int serialNumber;
	private double balance;
	
	static int counter = 0;
	
	public Atm(){
		this.serialNumber = ++counter;
		this.balance = 10_000;
	}
	
	public Atm(double balance){
		this();
		this.balance = balance;
	}
	
	public Atm(String balance){
		this( Double.parseDouble(balance)  );
		
	}
	
	public int getSerialNumber(){
		return this.serialNumber;
	}
	
	private void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	private void setBalance(double balance) { 
		this.balance = balance;
	}
	
	public void setBalance(String balance) {
		setBalance( Double.parseDouble(balance) );
	}
	
	public void deposit(double amount ) {
		if ( amount > 0  ) {
			setBalance( getBalance() + amount );
		} else {
			System.out.println("No se permite depósitos igual o menor a cero");
		}		
	}
	
	public void deposit(String amount) {
		deposit(Double.parseDouble(amount));
	}
	
	// Verificar que el amount no sea negativo o mayor al balance
	// enviar un mensaje en consola de acuerdo a la situación.
	public void withdraw(double amount ) {
		if( amount <= 0 ) {
			System.out.println("Cantidad menor o igual a cero");
		} else if( amount > getBalance() ) {
			System.out.println("Fondos insuficientes");
		} else {
			setBalance( getBalance() - amount  );
			// this.balance -= amount;
		}
		
	}
	
}
