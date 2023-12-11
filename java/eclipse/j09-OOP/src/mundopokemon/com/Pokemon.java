package mundopokemon.com;

public class Pokemon {
	String nombre;
	String tipo;
	int puntosPoder = 999;
	int numPokedex;
	
	static int counter = 500;
	
	// bloque de inicialización de atributos no estáticos
	{
      this.nombre = "---";
      this.tipo = "---";
      this.puntosPoder = 100;
	}
	
	static {
		counter = 200;
	}
	
	// bloque de inicialización de atributos estáticos
	Pokemon(){
		this.numPokedex = ++counter;
	}
	
	Pokemon(String nombre, String tipo, int puntosPoder){
		this();
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntosPoder = puntosPoder;
	}
	
	String detalles() {
		return this.numPokedex + ": " + this.nombre 
				+ ", tipo: " + this.tipo + ", puntosPoder: " + this.puntosPoder;
	}

}
