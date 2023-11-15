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
