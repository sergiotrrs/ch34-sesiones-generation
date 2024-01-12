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
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name="id_rol")
	private Long id;
	@Column(name="nombre_rol", nullable=false, length=70)
	private String name;
	@Column(name="descripcion", nullable=true, length=70)	
	private String description;

}
