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
  Nos permite representar una serie de valores indefinidos
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
/*
  Función que se pasa a otra función como argumento, para
  luego invocarla para complementar algún tipo de rutina o acción.

*/

/*
 Realizar 3 funciones.
  1 función que reciba un mensaje e imprima en consola
  1 función que reciba un mensaje e imprima en alert
  1 función que reciba un mensaje e imprima en el DOM, en H2
*/

const printToConsole = message => console.log(message);

const printToAlert = message => alert(message);

const printToH2 = message => {
  const refH2 = getH2Message();
  refH2.innerHTML = message;
};
const getH2Message = ()=> document.getElementById("message");

// Función que obtenga un mensaje e imprima en consola o alert o DOM o lo que se me ocurra.
function getMessageAndPrint( fncPrint  ){
  const message = getUserMessage();
  fncPrint( message );
}

const getUserMessage = () => `Martes de frescura`;

getMessageAndPrint( printToConsole );
// getMessageAndPrint( printToAlert );
getMessageAndPrint( printToH2 );

// Imprimir en el DOM en un paragraph
getMessageAndPrint( function( message){ 
  document.getElementById("p-message").innerHTML = message;
});

getMessageAndPrint( message => document.getElementById("p-message2").innerHTML = message );

// -------------------------------------------------------------------
/*
    Ejercicio 2
    Escribe una función que tome un arreglo de números,
    duplique el valor de cada número del arreglo,
    e imprima el nuevo arreglo actualizado.
    [5, 10, 15, 20, 25] -> [10, 20, 30, 40, 50]
*/

const double = (array) => {
  const doubleNumbers = [];
  for (let index = 0; index < array.length; index++) {
    doubleNumbers.push( array[index] * 2 );
  }
  return doubleNumbers;  
}
const numbers = [5, 10, 15, 20, 25];
console.log( double( numbers) ); // [10, 20, 30, 40, 50]

// Usando callback con map
const fncCallBackforMap = (element, index, array) => element * 2;

const dobleUsingMap = (array) => array.map( fncCallBackforMap );

              //[5, 10, 15, 20, 25];

console.log( dobleUsingMap( numbers) ); // [10, 20, 30, 40, 50]

const doubleUsingMapAndArrowFunction = (array) => array.map( element => element * 2 );
console.log( doubleUsingMapAndArrowFunction(numbers) ); // [10, 20, 30, 40, 50]

/*
  Ejercicio 4
  Crear un programa que itere sobre dos arreglos;
  si hay cursos en común, imprimirlos en la consola.

  salida: "Cursos en común: Programming, Music"
*/

const student1Courses = ["Math", "English", "Programming", "Biology", "Physics", "Music"];
const student2Courses = ["Geography", "Spanish", "Programming", "Music"];
const student3Courses = ["Spanish", "Music"];

const cursosEnComun = ( student1Courses, student2Courses  ) => {
  const commonCourses = [];
  for (let i = 0; i < student1Courses.length; i++) {
    for (let j = 0; j < student2Courses.length; j++) {
      if(student1Courses[i] === student2Courses[j]){
        commonCourses.push( student1Courses[i] );
      }
    }
  }
 return commonCourses;
}

console.log(`Cursos en común: ${ cursosEnComun( student1Courses, student2Courses ) }`);

// Resolviendo el ejercicio usando el método filter() y el método includes()
const commonCoursesUsingFilter = ( student1, student2) => student1.filter( 
    (course, i, arr) => student2.includes( course )
  );

console.log(`Cursos en común: ${ commonCoursesUsingFilter( student1Courses, student2Courses ) }`);

// Comparando 3 arreglos de cursos
const commonCoursesStudent1And2 = commonCoursesUsingFilter( student1Courses, student2Courses );
const commonCoursesStudet1And2And3 = commonCoursesUsingFilter( commonCoursesStudent1And2, student3Courses );
console.log(`Cursos en común: ${ commonCoursesStudet1And2And3 }`);

// ------------------- Contar la cantidad de caracteres de una frase -----------
// "pepe pecas pica papas con un pico y una pala"
// la cantidad de letras 'p': 8
// resolverlo usando arrow function}
// Convertir el texto a Array( split("")   ) y usar el método filter de arreglos.

const phrase = "pepe pecas pica papas con un pico y una pala";
// const phrase = "Pepe Pecas Pica Papas Con Un Pico y Una Pala";

// const countChar = (phrase, character) => phrase.split("").filter( element => element === character ).length;
const countChar = (phrase, character) => {
  const characters = phrase.split(""); //[p,e,p,e, , p... ]
  const filterCharacters = characters.filter(  (element, index, arr)=> element === character ); // [p..p,p]
  return filterCharacters.length; // 8
} 

console.log( countChar( phrase, "p"));

// ------------------- Funciones Recursivas -----------
/*
  Es una técnica de programación en donde la función se llama así misma.
  Se debe tener precausión de no entrar en un ciclo infinito.

  En algunos casos, la recursividad puede ser más legible y clara
  ya que refleja de manera directa la naturaleza recursiva del problema.

  function funcionRecursiva ( valor ){
     if( condicionParo ){

     } else {
        funcionRecursiva( nuevoValor ); // llamada recursiva
     }
  }

*/

// Realizar una función que calcule el factorial de un número
// Mostrar en consola el factorial de 5.
/*
  El factorial de un número se calcula multiplicando 
  el número por cada número que lo precede hasta el 1. 
  Por ejemplo: 3!=3x2x1=6.
*/
function factorialAscendente( number ){
  let factorial = 1;
  for(let i = 1; i <= number; i++){
    factorial = factorial * i;
  }
  return factorial;
}

function factorialDescendente( number ){
  let factorial = 1;
  for(let i = number; i > 0 ; i--){
    factorial = factorial * i;
  }
  return factorial;
}

const factorialArrowFunction = ( number ) => {
  let factorial = 1;
  for(let i = number; i > 0 ; i--){
    factorial = factorial * i;
  }
  return factorial;
}

console.log(`El factorial de 5 es : ${ factorialAscendente(5)}`);
console.log(`El factorial de 5 es : ${ factorialDescendente(5)}`);

// Solución del ejercico con recursividad

function factorialRecursivo ( number ) {
  if( number < 1 ){
    return 1;
  } else {
    return number * factorialRecursivo( number - 1 );
  }
}

console.log(`Factorial recursivo de 5: ${factorialRecursivo(5)}`);

/*
  Calcular suma de números pares.
  Realizar una función recursiva que sume los números pares
  de un número determinado, hasta el número 1.

  número: 12.
  Resultado: 12 + 10 + 8 + 6 + 4 + 2 = 42

  número: 7
  Resultado: 6 + 4 + 2  = 12

  Recomendación: usar módulo %2
*/

function sumEvenNumbers( number ){
  if (number % 2 !== 0) { // si el núm es impar le resta ua unidad
     number--;
  }

  if( number <= 2){
    return 2;
  } else {
    return number + sumEvenNumbers( number - 1 )
  }
}

console.log(`Suma de pares desde 12: ${sumEvenNumbers(12)}`); // 42
console.log(`Suma de pares desde 7: ${sumEvenNumbers(7)}`); // 12