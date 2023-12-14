package test.org.generation.math;

import static org.junit.jupiter.api.Assertions.*;

import org.generacion.palabras.CasiPalindromo;
import org.junit.jupiter.api.Test;
/**	
 * 
 * Ejercicio Casi Palíndromo
 * 
 * Verificar si una palabra es casi palíndromo,
 * con el cambio de una sola letra.
 * 
 * La función debe aceptar un texto y retornar
 * con true si la palabra es casi palíndromo,
 * de lo contrario retornar false.
 * 
 * Ej.
 *  Oso -> false ( por que ya es un palíndromo)
 *  Ver -> true (si reemplazo la v por r -> vev)
 *  Hola -> false (no es casi un palíndromio: holh, hooa)
 *  Ocho -> true ( occo)
 *  Veronica -> false ( veronicv, veroniea, veronrca, verooica)
 *  Anita lavó la tina - > true (  Anita L[a]v[a] la tina )
 * 
 */


class CasiPalindromoTest {
    CasiPalindromo casiPalindromo = new CasiPalindromo();
	
	@Test
	void casiPalindromoTest() {
		assertEquals( false, casiPalindromo.almostPalindrome("Oso"), "Verifca Oso"   );
		assertEquals( true, casiPalindromo.almostPalindrome("Ver"), "Verifica Ver"   );
		assertEquals( false, casiPalindromo.almostPalindrome("Hola"), "Verifica Hola"   );
		assertEquals( true, casiPalindromo.almostPalindrome("Ocho"), "Verifica Ocho"   );
		assertEquals( false, casiPalindromo.almostPalindrome("Veronica"), "Verifica Veronica"   );
		assertEquals( true, casiPalindromo.almostPalindrome("Anita lavó la tina"), "Verifica Anita"   );
	}
}
