console.log("JS08 - CatClass");

/**
 *  Clase Felio
 * El nombre de la case se recomienda la convenció UpperCamelCase
 */
class Felino {
    // nombre
   // numPatas
   // tieneGarras
   // size

   // El método constructor nos ayuda a inicializar los atributos de un objeto
   constructor ( name, numPatas, tieneGarras, size ) {
      this.nombre = name;
      this.numPatas = numPatas;
      this.tieneGarras = tieneGarras;
      this.size = size;
      console.log(`Soy ${this.nombre} y tengo vida, ja - ja- ja`)
   }

   comer() {
    return `Soy ${this.nombre} y estoy comiendo`;
   }
}

/**
 *  Usando la palabra reservada extends podemos heredar 
 *  atributos y métodos de otra clase.
 */
class Gato extends Felino {
    
   constructor( nombre, size, domesticado ) {
      super(nombre, 4, true, size);
      this.domesticado = domesticado;
   }
}


// Instanciar la clase Felino
const chicharron = new Felino("Chicharron", 4, true, "grande");
const wero = new Felino("Wero", 4, true, "grande");
const pelusa = new Felino("Pelusa", 4, true, "chica");

// Uso de la función comer
console.log(  chicharron.comer()  );
console.log(  wero.comer()  );
console.log(  pelusa.comer()  );

// Instanciar la clase gato
const naranjo = new Gato("Naranjo", "grande");

