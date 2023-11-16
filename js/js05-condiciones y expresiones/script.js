console.log("JS05 Condiciones y expresiones");

/*
 Precedencia de operadores
 https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Operators/Operator_Precedence
*/

// -------------- Operadores aritméticos -----------------
/*
  Adición +
  Multiplicación *
  Substracción -
  División /
  Exponencial **
  Resto %
*/

let dinero = 20 + 30; // 50
console.log("Potencia", 2 ** 3  ); // 8
console.log("Potencia", 2 ** 3 ** 2  ); // 512

// --------------- Operadores de asigación ------------------
// Asigna un valor a su operado izquiero, basándose
// en el valor de su operando derecho
dinero = 100;

// Operadores de asignación simplificados
// dinero = dinero + 40; // 140
dinero += 40;
// restar a dinero 50
dinero -= 50; // 90
 // multiplicar dinero al doble
 dinero *= 2; // 180

 dinero %= 3; // 0    dinero = dinero % 3;


// ----------------- Operadores unarios -----------------------
// Operador que realiza uina operación en un solo operando

// Negación ( - )
dinero = 10
dinero = -dinero; // -10
console.log( dinero );

// Conversión a numérico ( + )
const cuentaBancaria = +dinero; // -10
console.log( dinero );

let cambio = +"100";
console.log( cambio + 20  ); // 120

// typeof
console.log( typeof cambio ); // number

// Operador lógico not ( ! )
let valorBooleano = true;
console.log( !valorBooleano  ); // false

//-------- Operadores de incremento y decremento en unidad ---------
/*
   Operador de pre-incremento y pre-decremento
   ++ valor
   -- valor

   Operador de post-incremento y post-decremento
   valor ++
   valor --
*/

let numero = 10;
numero ++; // 11
++ numero; // 12
console.log( numero ) // 12

/*
  Comportamiento de post incremento
  let nuevoValor = numero;
  numero = numero + 1;
*/
let nuevoValor = numero ++;
  
console.log("nuevoValor: ", nuevoValor); // 12
console.log("numero: ", numero); // 13

// numero = 13
/*
 Comportamiento de pre incremento
 numero = numero + 1;
 let nuevoDato = numero;
*/
let nuevoDato = ++ numero;

console.log( "nuevoDato", nuevoDato); // 14
console.log( "numero ", numero); // 14


// ------ Ejercicio -------------

let x = 3;
let y = ++x;  // x: 4, y: 4

console.log(`x: ${x++} y: ${++y}`); //  x: 4,  y: 5    
                                    //  x: 5,  y: 5

console.log(`x: ${x} y: ${y}`);     //  x: 5,  y: 5

// ==============================================
let x1 = 3;
let y1 = x1++; //  x: 3   y: 3
               //  x: 4   y: 3

console.log(`x1: ${x1++} y1: ${++y1}`); // x: 4 , y: 4
                                        // x: 5 , y: 4
console.log(`x1: ${x1} y1: ${y1}`);     // x: 5 , y: 4   


let a=2; 
let b="2"; 
console.log(a++ + -  +b  ); // 0

// ==============================================

x= 2;
y= "2";
console.log(x++     +     -   +y); // 0
console.log(x); // 3
console.log(y); // "2"

// ---------------- Conparación estricta
/*
  === estrictamente igual, debe ser igual en el valor y el tipo
  !== estrictamente diferente, debe ser diferente el valor y tipo

*/

console.log( "23" == 23  ); // true
console.log( "23" === 23  ); // false 