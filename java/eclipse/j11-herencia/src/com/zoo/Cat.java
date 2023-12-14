package com.zoo;

import com.pet.Pet;

public class Cat extends Feline implements Pet {
	private String petName;
	
	public Cat(String petName, double age) {
		super("Gato", "Felis catus ", age, .50);
		this.petName = petName;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	@Override
	public String sleep() {
		return "El michi " + this.petName + " duerme 10 h. ";
	}
	
	@Override
	public String eat(String food) {
		return "El michi " + this.getPetName() 
		+ ", que tiene las garras de " + super.getClawLength() + " cm y tiene " 
				+ super.getAge() + " años, come deliciosas " + food + " cuando se le da la gana.";
	}
	
	public boolean eat( boolean isHungry) {		
		return isHungry;
	}

	@Override
	public String trick() {
		return "El michi " + this.getPetName() + " ronronea y deja que le acaricies" ;
	}

	
}
