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
   for ( let column of row){
    console.log( column );
    if( column === 6 ) break rompeMatriz;
   }
}

// Imprimir todos los elementos excepto el 6(de cualquier fila)
console.log("======= imprimir excepto el 6 ======")
for (let row of matrix ){
    for ( let column of row){
     if (column !== 6){
        console.log(column);   
        console.log("Muchas instrucciones");
     }    
    }
 }