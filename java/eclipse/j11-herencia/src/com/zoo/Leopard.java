package com.zoo;

public class Leopard extends Feline {

	public Leopard(double age) {
		super("Leopardo", "Panthera pardus", age, 2);
		
	}

	@Override
	public String sleep() {
		return "Soy un Leopardo y duermo siempre alerta";
	}

}
