package com.toy;

import com.pet.Pet;

public class Tamagochi implements Pet {
	private String name;

	public Tamagochi(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String trick() {
		return "Toi chiquito y si no como cada 30 min muero";
	}
}
