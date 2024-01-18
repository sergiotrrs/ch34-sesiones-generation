package org.generation.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	@Column(name="nombre", nullable=false, length=70)
	private String name;	
	@Column(name="description", nullable=false, length=150)
	private String description;
	@Column(name="precio")
	private Double price;
	@Column(name="url-image", length=100)
	private String urlImage;
	@Column(name="activo")
	private boolean active;
	
}
