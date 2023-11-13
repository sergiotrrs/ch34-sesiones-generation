console.log("Sesion JS02 - funciones");

// ---------------- Función declarada, funciones definidas-------------
//    ( function declaration, function statement)
/*
  Una de las características de las funcioens declaradas
  es que tienen hoisting (pueden ser llamadas antes de su declaració).
*/

multiplica(5, 3); // 15

/**
 * Comentario de función.
 * Multiplica dos números e imprime en consola.
 * @param {number} a valor de multiplicando.
 * @param {number} b valor de multiplicador.
 */
function multiplica( a, b ){
    const resultado = a * b;
    console.log(resultado);
}

function divide( dividendo , divisor){
    return dividendo / divisor;
}

console.log( divide(5 , 2) ); // 2.5
console.log( divide(5 , "2") ); // 2.5
console.log( divide("5" , "2") ); // 2.5 
console.log( divide("5 0" , "2") ); // NaN

// ---------------- Función expresadas-------------
//    ( function expressions)
/*
  Funciones que son declaradas dentro de la asignación de una variable.
  Estas funciones pueden ser anónimas ( no tiene nombre).

  Las funciones expresadas no tiene hoisting, por que no se carga
  en memoria hasta que se utilice.
*/

const sum = function sumaDeEnteros( a , b) {
    return a + b;
};

console.log( sum( 6, 20)); // 26

const potencia = function( base, exponente){
    return base**exponente;
};

console.log( potencia(2,3)); // 8

