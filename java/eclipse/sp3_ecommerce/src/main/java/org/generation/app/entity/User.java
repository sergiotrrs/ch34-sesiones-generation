package org.generation.app.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

/*
 *  @Entity se usa para marcar una clase como una entidad
 *  que se puede persistir en una base de datos relacional.
 *  Se indica a JPA que la clase representa una tabla
 *  en la base de datos y que los objetos de esta clase
 *  puedan ser almacenados, actualizados o eliminados en 
 *  dicha tabla. Además, cada instancia se la clase se considera
 *  una fila en la tabla.
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="usuarios")
public class User {
	
	@Id // Indica que el atributo será la clave primaria de la entidad
	// Indica como se generarán automáticamente las claves primarias
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "El nombre no debe ser nulo o vacío")
	@Size(min = 3, max= 70, message="El nombre debe ser mayor a 3 y menor a 70 caracteres" )
	@Column(name="nombre", nullable=false, length=70)
	private String firstName;
	
	@Column(name="apellido", nullable=false, length=70)	
	private String lastName;
	
	@NotEmpty(message = "E-mail should not be null or empty")
	@Email(message = "Email address should be valid", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,10}")
	@Size(min= 5, max= 100, message = "E-mail must be between 5 and 100 characters")
	@Column(name="email", nullable=false, length=100, unique=true)
	private String email;
	
	@Column(name="password", nullable=false, length=150)
	private String password;
	@Column(name="activo")
	private boolean active;
	@Column(name="fecha_nacimiento")
	private Timestamp birthdate;
	@ManyToOne
	@JoinColumn(name="fk_role", nullable=false)
	@JsonIgnoreProperties("description")
	private Role role;
}

/*
GenerationType.AUTO: Esta estrategia le permite al proveedor de JPA 
elegir automáticamente la estrategia de generación más adecuada según 
la base de datos y la configuración. El comportamiento exacto puede 
variar dependiendo del proveedor utilizado.

GenerationType.IDENTITY: Esta estrategia utiliza una columna de identidad 
de la base de datos para generar automáticamente los valores de la clave primaria. 
Es compatible con bases de datos como MySQL que admiten columnas de autoincremento. 
En este caso, la base de datos se encarga de generar y asignar el valor de la clave primaria.

GenerationType.SEQUENCE: Esta estrategia utiliza una secuencia de la base 
de datos para generar automáticamente los valores de la clave primaria. 
Se requiere que la base de datos admita secuencias. El proveedor de JPA 
utiliza la secuencia definida en la base de datos para obtener los valores 
de la clave primaria.

GenerationType.TABLE: Esta estrategia utiliza una tabla especial en la base 
de datos para generar los valores de la clave primaria. Se crea una tabla 
separada que registra los valores generados para cada entidad. El proveedor 
de JPA consulta esta tabla para obtener el próximo valor de la clave primaria.

 */
