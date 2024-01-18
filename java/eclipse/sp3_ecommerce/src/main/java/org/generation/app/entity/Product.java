package org.generation.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="productos")
public class Product {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "El nombre no debe ser nulo o vacío")
	@Size(min = 3, max= 70, message="El nombre debe ser mayor a 3 y menor a 70 caracteres" )
	@Column(name="nombre", nullable=false, length=70)
	private String name;
		
	@Size(min = 3, max= 150, message="La descripción debe ser mayor a 3 y menor a 150 caracteres" )
	@Column(name="description", nullable=false, length=150)
	private String description;
	
	@Column(name="precio")
	private Double price;
	
	@Column(name="url-image", length=100)
	private String urlImage;
	
	@JsonIgnore
	@Column(name="activo")
	private boolean active;
	
}
