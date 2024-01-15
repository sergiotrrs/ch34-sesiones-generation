package org.generation.app.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="product_order")
public class Order {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="monto_total")
	private double totalAmount;
	@Column(name="fecha_compra")
	private Timestamp purchaseDate;
	
	@ManyToOne
	@JoinColumn(name="fk_user_id", nullable=false)
	@JsonIgnoreProperties({"role", "birthdate"})
	private User user;
	
	
	
}
