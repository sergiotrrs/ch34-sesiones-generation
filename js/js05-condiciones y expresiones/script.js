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

// ---------------- Comparación estricta
/*
  === estrictamente igual, debe ser igual en el valor y el tipo
  !== estrictamente diferente, debe ser diferente el valor y tipo

*/

console.log( "23" == 23  ); // true
console.log( "23" === 23  ); // false 

// ----------------- Operadores de comparación --------------
/*
  Comparar sus operandos  y devuelve un calor booleano.

  < menor que
  > mayor que
  <= menor igual que
  >= mayor igual que
  == igual

  Estos comparadores realizan una conversión implícita a numéricos
  cuando los operandos son de diferente tipo de dato.

  En el caso de que los dos operandos sean string, con los comparadores
  <, >, >=, <= se compara caracter por caracter con su valor númerico
  de la tabla unicode.

  Valos en tabla unicode:
   Números
   Mayúsculas
   Minúsculas

*/

console.log( 3 == "3" ); // true
console.log( 3 == "tres" ); // false

console.log( "Veinte" > "20" ); // true
            // 86     >   50   posición del caracter en la tabla Unicode
console.log( "Veinte" > 20 ); // false

// ============= ejercicios ================


console.log( true == "true"  );  // false
         //    1  == NaN

console.log(  23 < "40" );       // true

console.log(  "b" < "A" );       // false 
          //  98  <  65 

console.log(  "Hola" < "HOLA");  // false
          // 101(o)  <  79(O)        

console.log(  "Hola" < "123");   // false
          //   72(H) <  49(1)

console.log(  "Hola" < "KeHace" + 1000 ); // true
         //          9          11         prioridad    
         //   "Hola" < "KeHace1000"  
         //    72(H) <  75(K)   

console.log(  "23" == 23  ); // true


// --------------- Operadores lógicos AND (&&) y OR (||)

const valueA = true, valueB = false, valueC = true;
// const valueB = false;
// const valueC = true;
// const valueX = valueY = valueZ = true; <- Y y Z con declaradas con 'var'

console.log( valueA || valueB && valueC ); // true
          //        3          4        prioridad de operadores
          // valueA ||     false   
          //   true ||     false
          //        true

// Operadores de corto circuito
/*
  Cuando los operadores lógicos AND y OR actuan sobre operandos
  diferentes a booleanos.
 
  OP1 && OP2 -> Si OP1 es verdadero, se realiza la OP2 y este sería el resultado (OP2)
  OP1 || OP2 -> Si OP1 es verdadero, el resultado es OP1, no se evalua OP2

  Se considera falso: "", 0, NaN, null, undefined

*/


const varA = true;
const varB = false;
const varC = true;
// OP1 && OP2    Si OP1 es verdadero, se ejecuta OP2
console.log( varA && "Ya te la sabes" ); // Ya te la sabes
console.log( varB && "Cámara, pivote y llanta" ); // false
console.log( NaN && "Cámara, llanta y rin, mi Cheko"  ); // NaN
console.log( "" && "Arre, carnal, gracias" ); // ""

// OP1 || OP2    Si OP1 es verdadero, se ejecuta OP 1
console.log( "false" || "Simona la mona" ); // "false"
console.log( varA || "Ya te la sabes" ); // true
console.log( varB || "Cámara, pivote y llanta" ); // "Cámara, pivote y llanta" 
console.log( NaN  || "Cámara, llanta y rin, mi Cheko" ); // "Cámara, llanta y rin, mi Cheko"

// Quiero imprimir  "Te la rifas" Si la
// variable isOnline y isActive son true
const isOnline = false;
const isActive = true;

if ( isOnline ){
  if( isActive ){
    console.log("Te la rifas ");
  }
}

if ( isOnline && isActive ) console.log("Te la rifas");

// Solución utilizando solo operados lógicos
console.log(isOnline && isActive && "Te la rifas");

isActive && isOnline && console.log("Te la rifas");