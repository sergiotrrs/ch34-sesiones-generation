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
	
	
	
}
