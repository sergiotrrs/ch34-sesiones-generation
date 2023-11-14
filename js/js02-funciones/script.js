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

const power = ( base, exponent ) => base ** exponent;

// ---------------- Función autoinvocadas-------------
//    ( selft-incokinng functions)
// Se autoinvocan, no encesitan un llamado.
// Se pueden definir con funciones anónimas

( function setUp(){ 
    const configuracion = "conectarse a la api";
    const numPort = 8080;
    console.log("Me autoinvoco");
    console.log("Puedo servirte como inicializador de tu programa");
 } )();

// ---------------- Función flecha -------------
//    ( arrow functions)
/*
  Son similares a las funciones expresadas, pero:
  - No requieren la palabra function.
  - Si tiene una sola instrucción, no requiere las llaves { }.
  - Si la instrucción es el mismo retorno, no requiere la palabra return.

*/

// Área de rectángulo con función expresada.
const areaRectangulo= function(base, altura){
    return base * altura;
}

// Área de rectángulo con arrow function
const areaRectanguloArrowFunc = (base, altura) => base * altura;

console.log(areaRectangulo(10,6)); // 60

console.log( areaRectanguloArrowFunc(4, 5)); //20

const saludo = persona => `Hola ${persona}`;
const ellaBailaSola = () => `Compa, que le parece esa chica?`;

console.log( saludo("Peso pluma"));
console.log( ellaBailaSola() );

// ---------------- Parámetros default -------------

const saludoGeneration = ( persona = "persona", cohorte= "cohorte Mx") => 
                          `Hola ${persona}, que gusto que estés en la ${cohorte}`;

console.log( saludoGeneration("Joseph", "Ch-34") );
console.log( saludoGeneration() );  // Hola persona, que gusto que estés en la cohorte Mx
console.log( saludoGeneration("Chino") );  // Hola Chino, que gusto que estés en la cohorte Mx

// ---------------- Rest Parameters -------------
/*
  Nos permite representar una serie ed valores indefinidos
  en los argumentos.
  Estos se presentan como un array.
  El rest parameter debe estar al final de la lista de parámetros.

*/

const sumatoriaVariosNumeros = ( a , b , ...manyMoreArgs) => {
  let suma = a + b;  

/*   for (let index = 0; index < manyMoreArgs.length; index++) {
    suma = suma + manyMoreArgs[index]; // suma += mamanyMoreArgs[index];
  } */
 
  suma += manyMoreArgs.reduce(  (accumulator, currentValue)=> accumulator+currentValue, 0 );

  return suma;
}

console.log( `Sumatoria de 2 números 4 + 6 = ${ sumatoriaVariosNumeros(4,6)}` ); // 10
console.log( `Sumatoria de 4 números 4 + 6 + 5 + 7 = ${ sumatoriaVariosNumeros(4,6,5,7)}` ); // 22

// ---------------- Funciones de callback -------------
