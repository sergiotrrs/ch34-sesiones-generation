package test.org.generation.math;

import static org.junit.jupiter.api.Assertions.*;

import org.generation.math.MathOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathOperationsTest {

	MathOperations op;
	
	@BeforeEach
	void setUp() {
		op = new MathOperations(10);
	}
	
	@Test
	@DisplayName("Sumatória de números")
	void additionTest() {
		assertEquals( 15 , op.addition(5)  );
		assertEquals( 30 , op.addition(15)  );
		assertEquals( 130 , op.addition(100)  );
		assertEquals( 110 , op.addition(-20)  );
		
	}
	
	// Pruebas unitarias con la resta
	@Test
	void subtractionTest() {
		assertEquals(9, op.subtraction(1));
		assertEquals(5, op.subtraction(4));
		assertEquals(0, op.subtraction(5));

	}
	
	/**
	 *  Si no deseamos tener perdica de presición tenemos que usar
	 *  otra api, como la de BigDecimal
	 */
	
	@Test
	void subtractionDecimalTest() {
		final double DELTA = 0.001;
		assertEquals( 9.9 , op.subtraction(.1) , DELTA  );
		assertEquals( 9.7 , op.subtraction(.2) , DELTA  );
		assertEquals( 9.4 , op.subtraction(.3) , DELTA  );
		assertEquals( 9.0 , op.subtraction(.4) , DELTA  );
		
	}

}
