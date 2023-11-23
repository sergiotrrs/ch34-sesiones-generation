console.log("JS08- Objetos");


// ------------- Uso  de  symbol --------------------------------------
/*
 Se utiliza para añadir claves de propiedades únicas y que estén ocultas
 a otros mecanismos como la iteración y stringify.

 Esto nos sirve para realizar el concepto de encapsulación.
*/
const escondite = Symbol();

// ----------- Crear un objeto en JS -----------

const natsu = {
    nombre: "Natsu",    
    color: ["blanco", "beige"],
    esterilizado: true,
    raza: "criollo",
    tamanioCm: 25,
    edad: 8,
    [escondite]: "Cama de meli",
    maullar: function(){
        return "miiiiaaau";
    },
    comer: function( comida ){
        return `${this.nombre} come ${comida}`
    }
}

console.log(`Meli tiene de mascota a ${natsu.nombre} de edad ${natsu.edad} años`);
// Se le de comida: pescado
console.log( natsu.comer("pescado"));

// Iterar los atributos de un objeto
for( let atributo in natsu){
    console.log(` ${atributo} : ${ natsu[atributo]    } `   )
}

// Guardar los valores en el localStorage
localStorage.setItem("datosNatsu", JSON.stringify(natsu) );

console.log(`El escondite de Natsu es: ${ natsu[escondite]}`);