package org.generation.math;

public class MathOperations {
	private double value;
	
	public MathOperations( double value) {
		this.value = value;
	}
	
	public double addition( double addend ) {
		return this.value += addend; // value = value + addend
	}
	
	public double subtraction(double substrahend )  {
		return this.value -= substrahend;
	}
	
	

}
