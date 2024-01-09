package org.generation.app.model;

import org.springframework.stereotype.Component;

import lombok.*;

@AllArgsConstructor // contructor con parámetros
@NoArgsConstructor // contructor vacío
@Setter
@Getter
@ToString
@Component
public class User {
	
	private long id;
	private String firstname;
	private String lastname;
	private static int counter;
	
	{
		this.id = ++counter;
		System.out.println("Se inicializa el User id: " + this.id);
	}
	
	public String greeting() {
		return "Hola soy Usuario general";
	}
	
	
	
}
