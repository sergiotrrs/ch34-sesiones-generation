package com.mudopokemon;

public class Pokemon {
	// atributos de instancia(de objeto)
	String nombre;
	String tipo;
	
	// atributos estáticos (de clase)
	static String nombreGenerico = "Pokemon";
	static String fabricante = "Ch34";
	
	// métodos de instancia
    void dormir() {
        System.out.println(nombre + " duermiendo....");
    }
    
    void comer() {
        System.out.println(nombre + " comiendo....");
    }
    
    //metodos de clase
    static String nombreGenerico() {
        return nombreGenerico;
    }
    static void gritaPokemon() {
        System.out.println("Gritandooooo " + nombreGenerico);
    }
    
    static String nombreFabricante() {
    	return "El nombre del fabricante es " + fabricante;
    }

}
