package com.zoo;

public abstract class Mammal extends Animal {
	
	private boolean viviparous;
	
	public Mammal(String commonName, String scientificName, double age, boolean viviparous ) {
		super(commonName, scientificName , age);		
		this.viviparous = viviparous;
	}

	public boolean isViviparous() {
		return viviparous;
	}

	public void setViviparous(boolean viviparous) {
		this.viviparous = viviparous;
	}
	
	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 *  
	 */
	@Override
	public String eat(String food) {
		return "El mamífero " + super.getCommonName() + " come delicioso " + food;
	}


	
}
