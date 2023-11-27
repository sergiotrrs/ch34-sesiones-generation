

// Función suma que tenga de entradas dos parámetros
// salida con la sumatoria.


//const suma = (a,b) => a + b ; // Errores de precisiòn con num. decimales
const suma = (a,b) => {          // a: .1 , b: .2
    const numAEntero = a * 1000; // .1 * 1000 = 100
    const numBEntero = b * 1000; // .2 * 1000 = 200
    const result = numAEntero + numBEntero; // 100 + 200 = 300
    return result / 1000; //   300 / 1000 = .30 
    
    // return (a * 1000 + b * 1000) / 1000;
} ;

console.log( suma(5,3) ); // 8

module.exports = { suma } ;