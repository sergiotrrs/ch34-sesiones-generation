package org.generation.app.entity;


import org.generation.app.entity.compositeKey.OrderProductKey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
@Table(name="order_has_product")
public class OrderHasProduct {

//	@Id
//	@GeneratedValue( strategy=GenerationType.IDENTITY)
//	@Column( name = "id_ohp")
//	private Long idOrderHasProducts; // TODO cambiar por clave compuesta
	
	// Llave Compuesta
	@EmbeddedId // representa una clave primaria compuesta.
	OrderProductKey id;
	
	@Column( name = "quantity")
	private int quantity;
	
	@ManyToOne
	@MapsId("orderId" )
	@JsonIgnoreProperties("user")
	private Order order;
	
	@ManyToOne
	@MapsId("productId" )
	private Product product;
	
	
}
