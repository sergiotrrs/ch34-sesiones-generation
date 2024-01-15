package org.generation.app.entity.compositeKey;

import java.io.Serializable;

import org.springframework.stereotype.*;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
/*
 * 
 *  @Embeddable Esta anotación se utiliza para marcar 
 *  una clase como una clase incrustable, 
 *  lo que significa que sus instancias pueden 
 *  ser incrustadas directamente en la tabla de otra entidad.
 * 
 */

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class OrderProductKey implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Column( name = "order_id" )
	Long orderId;
	@Column( name = "product_id" )
	Long productId;

}
