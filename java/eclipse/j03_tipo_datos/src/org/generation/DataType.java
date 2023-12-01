package org.generation;

public class DataType {

	public static void main(String[] args) {
		// Este es un comentario de línea
        /*
         * Este es un comentario de bloque
         * 
         * Reglas para el nombre de las variables:
		 *  - Se distingue entre minúsculas y mayúsculas
		 *  - La longitud del nombre es ilimitada
		 *  - Puedes utilizar cualquier caracter Unicode
		 *  - La variable puede comenzar:
		 *    > una letra ej. miVariable
		 *    > signo de dolar $miVariable
		 *    > caracter de subrayado _miVariable
		 *  
         */
		
		int $myVar; // Es válido, no se recomienda
		int _numEngranes; // Es válido, no se recomienda
		// int #numPersonas; // No es válido
		int myVarEnEspañol; // Es válido, Se recomienda nombres enn inglés
		// int 5comentarios; // No es válido
		int sinC0m3nt4r10s; // Es válido, o se recomienda
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
		
		
		/**
		 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 *  Tipos de datos en Java
		 *  - Objetos
		 *  - Datos primitivos
		 *  	8 datos primitivos
		 *   > byte
		 *   > shorte
		 *   > int
		 *   > long
		 *   > float
		 *   > double
		 *   > boolean
		 *   > char
		 *      
		 */
		
		// El tipo byte es de 8 bits, almacena datos numéricos enteros
		byte myVarByte; // declarando la variable
		myVarByte = 12; // asignarle un valor a la variable
		/*
		 *  2^8 = 256
		 *  Para Obtener el valor máximo y mínimo del tipo byte
		 *  usando su wrapper (clase envolvete) Byte.
		 */
		System.out.println("byte Max value: " + Byte.MAX_VALUE ); // 127 -> 0... 127 = 128 valores
		System.out.println("byte Min value: " + Byte.MIN_VALUE ); // -128 -> -1...-128 = 128 valores
		
		/*
		 *  Tipo de dato short
		 *  Dato de 16 bits, alamacena valores enteros
		 *  2^16 = 65536
		 *  Valores positivos:  0... 32767
		 *  Valores Negativos: -1... -32668
		 *  Obtener el MAX_value y MIN_VALUE usando el warapper Short
		 */
		System.out.println("short Max Value: " + Short.MAX_VALUE ); // 32767
		System.out.println("short Min Value: " + Short.MIN_VALUE ); // -32668
		
		/*
		 * Tipo de dato int
		 * Dato de 32 bits, almacena datos enteros
		 * El wrapper de int es Integer
		 */
		System.out.println("int Max Value: " + Integer.MAX_VALUE ); // 2147483647
		System.out.println("int Min Value: " + Integer.MIN_VALUE ); // -2147483648
		
		/*
		 * Tipo de dato long
		 * Dato de 64 bits, alamcena datos enteros
		 * El wrapper de log es Long
		 */
		System.out.println("long Max Value: " + Long.MAX_VALUE ); // 9223372036854775807
		System.out.println("long Min Value: " + Long.MIN_VALUE ); // -9223372036854775808
		
		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numética de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 */
		long edadPlaneta = 2_147_483_648L;
		
		// ==================================================================
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 */
		System.out.println("float Max Value: " + Float.MAX_VALUE ); // 3.4028235E38
		System.out.println("float Min Value: " + Float.MIN_VALUE ); // 1.4E-45
		
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 */
		System.out.println("double Max Value: " + Double.MAX_VALUE ); // 1.7976931348623157E308
		System.out.println("double Min Value: " + Double.MIN_VALUE ); // 4.9E-324
		
		/*
		 *  Las literales de punto flotante son por default double
		 *  ej. 123.567, 0.012, -0.989
		 */
		float myVarFloat = 1500.6523F;
		
		/*
		 * Dato Boolean
		 * Almacea valores true o false
		 */
		boolean myVarBoolea = true;
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo alamacea caracteres de la tabla unicode(16 bits).
		 * puede alacenar del 0 al 65535
		 */
		
		char primeraLetraDeNombre = 'S';
		// Se puede alacenar por su valor unicode
		char letraL = '\u004C'; //L
		// También se puede definir por su valor numérico
		char letraM = 77;
		System.out.println("Letra L : " + letraL );
		System.out.println("Letra M : " + letraM );
		
		/*
		 * Formas de representar un número
		 */
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 );
		System.out.println("Representación binaria: " + 0b0010_0010 );
		System.out.println("Representación octal: " + 042 );
		
		/*
		 *  Conversión de tipo de datos
		 */
		byte coquita350ml = 60;
		
		// upcasting
		short coquita2000ml = coquita350ml;
		
		short pozoleGrande1l = 259;
		// downcastig
		byte pozoleBurbuja = (byte)pozoleGrande1l;
		System.out.println(pozoleBurbuja); // 3
		
		//====================================================
		/*
		 * Tipo de dato String
		 * Es un objeto que se define con comillas dobles.
		 * 
		 * Si deseas imprimir comillas dobles,se usa el 
		 * caracter de escape \
		 *   \b backspace
		 *   \t tab
		 *   \n line feed
		 *   \r carriage return
		 *   \" double quote
		 *   \' single quote
		 *   \\ backslash
		 */
		String message = "No te metas en mi vida. "
				+ "\n\tLa vida es como una caja de \"chocolate\"";
		
		System.out.println( message );
		
		// Convertir string a números
		String edadMascotaStr = "8";		
		System.out.println("Edad mascota + 1 : " + ( edadMascotaStr + 1  ) );
		byte edadMascota = Byte.parseByte(edadMascotaStr);
		
		// Convertir números a String 
		String numSuerte = String.valueOf( 123 );
		System.out.println("Primer caracter de mi numSuerte " + numSuerte.charAt(0)  );
		System.out.println("Número de dígitos: " + numSuerte.length() );
	
		// ==================================================================
		// Operadores numéricos
		int opA = (int)5.2;
		int opB = 6;
		int suma = opA + opB; // 11
		System.out.println( suma );
		int resta = opA - opB ; // -1
		System.out.println(resta);
		
		int multiplica = (int)(opA * 1.1); // 5
		double multiplicaDouble = opA * 1.1; // 5.5
		System.out.println(multiplica);
		
		int division = opA /opB; // 0
		System.out.println(division);
		
		// double divisionDouble = opA / opB; // 0.83333 -> trunca a int -> 0
		// double divisionDouble = (double)opA / opB; // 0.8333333333333334
		
		 double divisionDouble = 1.0 * opA / opB; // 0.8333333333333334		 
		// double divisionDouble = opA / opB * 1.0; // 0.0
				
		System.out.println(divisionDouble ); // 0.0
		// opA = 5
		int residuo = opA % 2; //1
		System.out.println(residuo);
		
		// Operadores de pre incremento, post decremento
		int valorInicial = 10;
		
		System.out.println("Preincremeto: " + ++valorInicial ); // 11
		System.out.println("Postincremeto: " + valorInicial++ ); // 11
		System.out.println("Valor final: " + valorInicial); // 12
		
		valorInicial = 50;
		System.out.println("Predecremeto: " + --valorInicial ); // 49
		System.out.println("Postdecremeto: " + valorInicial-- ); // 49
		System.out.println("Valor final: " + valorInicial); // 48
		
		// Operadores Comparativos
		// El resultado es un booleano
		// <, <=, >, >=, == , !=
		// System.out.println( 5 == "5" ); // No se puede comparar, hay que hacer una conversión
		int numEmpleados = 1000;
		System.out.println("Empleados > 1000 " + ( numEmpleados > 1000 ) ); // false
		System.out.println("Empleados >= 1000 " + ( numEmpleados >= 1000 ) ); // true
		System.out.println("Empleados <= 1000 " + ( numEmpleados <= 1000 ) ); // true  
		System.out.println("Empleados == 1000 " + ( numEmpleados == 1000 ) ); // true
		System.out.println("Empleados != 1000 " + ( numEmpleados != 1000 ) ); // false
		
		// Operadores lógicos
		   // && (AND) retorna true si ambos operadores son true
		   // || (OR) retorna true si cualquiera de los operandos es true
		   // !  (NOT) invierte el resultado booleano
		   boolean a = true;
		   boolean b = false;
		   boolean c = true;
		   System.out.println( (a && b) || (a && c) );   // true
		   System.out.println( a || b || c && a );       // true
		   System.out.println( !(a || b) && (!a || c) ); // false	   	  
		   System.out.println( a || b && c || a && b  ); // true
		   
		   // 45/0 -> Genera una excepción
	}

}
