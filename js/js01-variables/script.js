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
    }
};

console.log( `Nombre ${ misDatosDePerfil.nombre }`); // Peso
console.log( `Apellido ${ misDatosDePerfil["apellido"] }`); // Pluma
console.log( `Lo que sea: ${ misDatosDePerfil["23"] }`); // Lo que sea
console.log( `El nombre completo es ${ misDatosDePerfil.nombreCompleto() }`) // Peso Pluma



