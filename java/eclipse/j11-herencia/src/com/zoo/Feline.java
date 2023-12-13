package com.zoo;

public class Feline extends Mammal {
	
	private double clawLength;
	
	public Feline(String commonName, String scientificName, double age, double clawLength ) {
		super(commonName, scientificName, age, true );
		this.clawLength = clawLength;
	}
	
	
}
