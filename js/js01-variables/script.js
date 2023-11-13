console.log("Sesion Js01");

/*
  Principales tipos de datos en JS:

  Datos primitivos:
  String
  Boolean
  Number
  Undefined
  Null
  
  Datos Objetos.
  Array
  Object

*/

// String
console.log("Tipos de dato String: " + "Hola " + " 2345");

// Number: 12, -45, 56.892, +Infinity, -Infinity, NaN
// Los datos numéricos usan 64 bits para almacenar, pero solo usan 53 bits
// para representar el número.

console.log("Tipos de datos number: ", 12, -45, 56.892, 5/0, -23/0, 4*"hola");
console.log("Valor máximo representado en JS: " , Number.MAX_VALUE); // 1.7976931348623157e+308
console.log("Valor seguro: ", Number.MAX_SAFE_INTEGER); // 9007199254740991

console.log("1.7976931348623157e+308", 1.7976931348623157e+308); // 1.7976931348623157e+308
console.log("1.7976931348623157e+309", 1.7976931348623157e+309); // Infinity

console.log("MAX_SAFE_INTEGER + 1 ", Number.MAX_SAFE_INTEGER + 1 ); // 9007199254740992
console.log("MAX_SAFE_INTEGER + 2 ", Number.MAX_SAFE_INTEGER + 2 ); // 9007199254740993
console.log("MAX_SAFE_INTEGER + 3 ", Number.MAX_SAFE_INTEGER + 3 ); // 9007199254740994
console.log("MAX_SAFE_INTEGER + 4 ", Number.MAX_SAFE_INTEGER + 4 ); // 9007199254740995

// BigInt
// Representa valores númericos enteros, de los que el tipo number
// no pueda representar(MAX_VALUE) o no es seguro (MAX_SAFE_INTEGER).
// Para que se un BigInt se le agarega al final la letra n.
// El límite de BigInt está determinado por la memoria disponible del sistema.
let myBigInt =  9007199254740991n;
console.log( myBigInt );
console.log( "myBigInt + 1 :" , myBigInt + 1n ); // 9007199254740992n
console.log( "myBigInt + 2 :" , myBigInt + 2n ); // 9007199254740993n
console.log( "myBigInt + 3 :" , myBigInt + 3n ); // 9007199254740994n
console.log( "myBigInt + 4 :" , myBigInt + 4n ); // 9007199254740995n

// Boolean
// Tenemos 2 estados: true /false
console.log("Boolean en true: ", true );
console.log("Boolean en false: ", false );

// Undefined
// Un dato que es declarado (var, let, const), pero no está definido
let myVar; // Solo está declarado
console.log( "Tipo de dato undefined: ", myVar); // undefined

// null
// Intensionalmente se borra el tipo de dato
let myVarNull; // solo se declara
console.log(myVarNull); // undefined
myVarNull = "Quiero que Tan nos cuente como le fue en su concierto";
console.log(myVarNull); // string
myVarNull = null;
console.log(myVarNull); // null

// -------------------------------------------------------------------
// Tipos de datos Object

// Object.
// const misDatosDePerfil = { clave: valor, clave2 : valor2 };
const misDatosDePerfil = { 
    /* atributos */
    nombre: "Peso", 
    apellido: "Pluma" ,
    edad: 23,
    isBelicoso: true,
    "23": "Lo que sea" ,
    /* métodos */
    nombreCompleto: function fullName() {
        return this.nombre +" "+ this.apellido;
    },

    numCanciones :  {
        2020: 5,
        2021: 30,
        2023: 56,
        total: 91
     }
};

console.log( `Nombre ${ misDatosDePerfil.nombre }`); // Peso
console.log( `Apellido ${ misDatosDePerfil["apellido"] }`); // Pluma
console.log( `Lo que sea: ${ misDatosDePerfil["23"] }`); // Lo que sea
console.log( `El nombre completo es ${ misDatosDePerfil.nombreCompleto() }`) // Peso Pluma

// Arrays
// Tipo de objetos especiales que su forleza radica en los métodos con los que cuenta.
// Almacena diferentes tipos de datos, su primer elemento es el índice 0.
const cancionesPesoPluma = [
    "Ella Baila Sola",
    "Lady Gaga",
    "Lou Lou",
    "Laguna",
    "El Gavilán",
     {
        2020: 5,
        2021: 30,
        2023: 56,
        total: 91
     }
];

console.log("Canciones por años: " + cancionesPesoPluma[5] ); // [Object Object]
// índice del objeto de número de canciones del año 2020}
console.log("Canciones por año 2020: " + cancionesPesoPluma[5]["2020"] ); // 5
// Mostrar el "total" de canciones de PP.
console.log("Total de canciones: " + cancionesPesoPluma[5]["total"]);
console.log("Total de canciones: " + cancionesPesoPluma[5].total);

// Coversión de datos (casting)

// Conversión implícita:
console.log( "Hola CH " +  34 ); // Hola Ch 34
console.log( "3" + 5 + 6 ); // "356" string
console.log( "3" * 3 ); // 9 number

// Conversioes explícitas
// String a number
// Number, parseInt, parseFloat
console.log(  "3" + 5 + 6  ); // "356"
console.log( Number("3") + 5 + 6 ); // 14
console.log( parseInt("3") + 5 + 6 ) ; // 14
console.log( parseInt("$3") ); // NaN
console.log( parseInt("3 MxN") ); // 3 
console.log( Number("3 MxN") ); // NaN

console.log( "$3MNX" + 5 + 6   ); // 14
console.log( parseInt("$3MNX") + 5 + 6 ); // NaN

console.log( "$3MNX".slice(1) + 5 + 6 ); // 3MNX56
console.log( parseInt("$3MNX".slice(1)) + 5 + 6   ); // 14
console.log( Number("$3MNX".slice(1)) + 5 + 6   ); // NaN

console.log( parseInt("$3MXN".replace('$','')) + 5 + 6 ); // 14
console.log( parseInt("$3333MXN".replace('$','')) + 5 + 6 ); // 3344

console.log( parseInt("$3333MXN".replace( /[^0-9.]/g ,'')) + 5 + 6 ); // 3344

console.log( parseInt("1000")) // 1000
console.log( parseInt("1000", 2)) // 8

/*
 Number()
  - Convierte directamente una cadena a números
  - Si el string tiene caracteres no numéricos ( 12,56 ), devuelve NaN 
  - Puede manejar decimales y exponentes (3e3)
  - Puede convertir booleans y object a numbers

  ParseInt()
  - Convierte una cadena a números enteros
  - Ignora los caracteres no numéricos después del primer número ( 12,56 -> 12)
  - Puede aceptar como argumeto, la base numérica parseInt( "1000", 2 ) -> 8 decimal

  parseFloat()
  - Convierte una cadena a números de punto flotante
  - Maneja decimales y exponentes
  
*/


// Conversión a String
console.log( String( 23.4 ) ); // 23.4
console.log( String(true) ); // true
console.log( String( [3,4,5,6] )); // 3,4,5,6
console.log( String( {a:1,b:2} )); // [object Object]

console.log( JSON.stringify( {a:1,b:2} ) ); // {a":1,"b":2}



// Conversión a Boolean
/*
  Para que sea false, debe ser: "", 0, null, undefined
*/

console.log( Boolean("Hola") ); // true
console.log( Boolean("false" ) ); // true
console.log( Boolean(" ") ); // true

console.log( Boolean( undefined ) ); // false
console.log( Boolean( [] )); // true

// Conversión a Number()
/*
 [] = 0;
 [30] = 30
 [40,23, 45] = NaN
 false = 0
 true = 1
*/
console.log( Number( [] ) ); // 0
console.log( Number( [9] ) ); // 9
console.log( Number( [3,6,7] ) ); // NaN


// Conversión a String()
/*
  [] = ""
  [1,2] = 1,2
  function(){} = function(){}
  {} = [object Object]

*/
