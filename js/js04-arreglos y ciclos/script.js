console.log("Sesión JS04 arreglos y ciclos");

/*
   ========== Array ==========================
   Es un tipo de estructura de datos que se utiliza
   para almacenar una colección ordenada de elementos.
   Estos elementos pueden ser de cualquier tipo.

   Los arrays son objetos especiales con propiedades y
   métodos específicos para trabajar con datos ordenados.

*/
// Declarar un arreglo usando corchetes
const nombresCh34 = ["Misael", "Luis", "Meli"];

// Declarar un arreglo usando el constructor de la clase Array
const apellidosCh34 = new Array("Navarro", "Ortega", "Flores");

console.log( nombresCh34 ); // ["Misael", "Luis", "Meli"]
console.log( apellidosCh34); // ["Navarro", "Ortega", "Flores"]

const numCajonesEstacionamiento = new Array(4); // [ , , , ]
console.log(numCajonesEstacionamiento);
console.log( new Array(2,5,7)); // [2,5,7]

// ================ Arreglos anidados ===================
// Matrices (Arreglo de 2 dimensiones)
// [  [Arr0]   , [arr1]  , [arr2]   ]

const equiposIntegrador = [     
    ["Misael", "Mirta" , "Jocelyn", "Jorge" , "Yaz"     , "Tony"   , "Itzel" ] ,  /* 3 de pastor*/
    ["Chino" , "Victor", "Nalle"  , "Lili"  , "Fernanda", "Cinthia" ] ,  /* Javadictos*/
    ["Gaby"  , "Charly", "Alan"   , "Sebas" , "Andrew"  , "Arlene" , "Arely"]   /* HTaMaLeros*/
];

// Imprimir al equipo de Javadictos
const javadictosPersonas = equiposIntegrador[1];
console.table( javadictosPersonas );
// Imprimir a Lili de Javadictos
const personaLili = javadictosPersonas[3]; // Lili
console.log( personaLili );

// Imprimir a sebas
console.log( equiposIntegrador[2][3] ); // Sebas
// Mirta
console.log( equiposIntegrador[0][1] ); // Mirta
// Arlene
console.log( equiposIntegrador[2][5] ); // Arlene 

// ================= Iterar un arreglo ================
// Mostrar en consola todas las personas de los proyectos
// usando ciclo for
/*
const equiposIntegrador = [     
    ["Misael", "Mirta" , "Jocelyn", "Jorge" , "Yaz"     , "Tony"   , "Itzel" ] , 
    ["Chino" , "Victor", "Nalle"  , "Lili"  , "Fernanda", "Cinthia" ] , 
    ["Gaby"  , "Charly", "Alan"   , "Sebas" , "Andrew"  , "Arlene" , "Arely"]  
];
*/
for (let equipo = 0 ; equipo < equiposIntegrador.length; equipo++){
   console.log(equiposIntegrador[equipo] );
   for (let persona = 0; persona< equiposIntegrador[equipo].length; persona++ ){
     console.log( equiposIntegrador[equipo][ persona ]);
   }
}

// Usando el método forEach
console.log("======== forEach========")

function imprimirFilas( element, index, array ){
    console.log( element );
}

// equiposIntegrador.forEach( imprimirFilas );
// equiposIntegrador.forEach( function impEquipos(element, index, array){ console.log( element );});
// equiposIntegrador.forEach( function (element, index, array){ console.log( element );});
// equiposIntegrador.forEach( (element, index, array) => console.log( element ) );

equiposIntegrador.forEach( element => console.log( element ) );

// equiposIntegrador.forEach( fila => fila.forEach( columna => console.log(columna) ));
equiposIntegrador.forEach( equipo => equipo.forEach( persona => console.log(persona) ));

equiposIntegrador.forEach( (equipo, indiceEquipo) => {
    equipo.forEach( persona => console.log(indiceEquipo, persona) )
});

// ======== Iterar usando For of ============
// Se usa en elementos iterables como arreglos o strings
console.log("====== for of ========");
for(let fila of equiposIntegrador ){
    for(let columna of fila){
        console.log( columna );
    }
}

const myName = "Alejandro";
for (let char of myName){
    console.log(char);
}

// ============== break y continue ==========
/*
  Consideraciones con el ciclo for:
  No es necesario indicar la expresión inicial, la evaluación y la expresión final

for (inicio; compración; ExpFinal){
    sentecias;
}

for( ; ; ){

}

break : rompe con la iteración en curso y finaliza el ciclo for

*/
const numbers = [3,6,8,1];
// Detener la iteración si encontramos el número 8
for (let number of numbers ){
    console.log( number );
    if( number === 8 ) break;
}

const matrix = [ 
    [2     ,4  ,6  ,999], 
    [10_000,6  ,8  ,9  ], 
    [2     ,6  ,8  ,3  ] 
];
// Detener la iteración cuando encontremos un 6, no mostrar más números
// label: indicar que ciclo romperá el break

console.log("======= uso de break y label======")
rompeMatriz:
for (let row of matrix ){
    rompeFila:
   for ( let column of row){
    console.log( column );
    if( column === 6 ) break rompeMatriz;
   }
}

// Imprimir todos los elementos excepto el 6(de cualquier fila)
console.log("======= imprimir excepto el 6 ======")
for (let row of matrix ){
    for ( let column of row){
     if (column === 6) continue;
     console.log(column);                  
    }
 }

 const ages = [18,34,55];
 for (let index = 0; index < ages.length; index++) console.log( ages[index]);

// prueba chiquita
 let jiteracion = 0;
 for( ; jiteracion < 5; jiteracion++ )/*instrucciones de for */   //<--- Ojo
 {
     console.log(jiteracion); // 0,1,2,3,4
 };
 console.log(jiteracion); // 5
 console.log("Fin de jiteración"); // "Fin de jiteración""

// for sin elemento internos
let x = 0;

for (   ;   ;   ){
    console.log("x: " + x);
    if( x >= 6 ) break;
    x++;
}

// ==========================================

for ( let y = 0;    ; y++  ){
    if( y >= 6 ) break;
    console.log("y: " + y ); // 0,1,2,3,4,5    
}

// console.log( y ); // excepción, y no está definida

// qué números imprime la línea 160? 


for (let x = 0; x <= 6; x++) {
    console.log("x de Monse: " + x); // solo imprimirí: 0
    break;
}



 // =================== ciclo While ====================
 /*
   Crea un bucle que ejecuta una sentencia
   mientras la condición especificada sea verdadera

   Sintaxis:
   while( condición) sentencia;

   while( condición ){
    sentencias;
   }

 */
/*   let counter = 1;
   while(  confirm("¿Quieres cotinuar?") ){
        console.log(`Num. de veces que has entrado: ${counter}`);
        counter++;
   }
 */
   
   //
   const nombreMascotas = [ "Junior", "Tomy", "Fify", "Canela", "Pelusa", "Freya", "Nana", "Cuco"];

   // Imprimir los nombres de las mascotas, y detenerse cuando se encuentre a "Canela"
   // Resolver utilizando ciclo While
   // No se imprime a Canela

   const imprimirMascotasHastaLlegarA = (mascotas, mascotaAEncontrar) => {
    let i = 0;
    while( mascotas[i] !== mascotaAEncontrar ) {
      console.log(mascotas[i]);
      i++;
    }
  }
  
  imprimirMascotasHastaLlegarA (nombreMascotas,"Canela");

// =================== ciclo do-while ====================
/*
  Crea un bucle que ejecuta una sentencia hasta que la
  condición de comprobación se evalue como falsa.

  La condición se evalua después de ejecutar la sentencia.
  Esto significa que la sentencia se ejecuta por lo menos una vez.

  sintaxis:

  do {
    sentencia;
  } while( evalución );

*/

/* let counter = 0;

do {
    counter++;
    console.log(`N. iteración: ${counter}`)

} while( confirm("¿Deseas continuar?") );
 */

// ====================================


let valor = -2;
while ( valor < 5) {
    console.log("While " + valor ); // -2... 4
    valor ++;
}

valor = 4;
do {
    console.log("Do-While " + valor ); // 4
    valor ++;
} while ( valor < 5);

/*
FIFO: first input, first output
LIFO: last input, first output
*/