package mundopokemon.com;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		Pokemon charizard = new Pokemon("Charizard", "Fuego Volador", 500); 
		
		System.out.println( pikachu.detalles() ); // serie:1, poder:100
		System.out.println( charizard.detalles() ); //  serie: 2, poder: 500
		
		
	}

}
