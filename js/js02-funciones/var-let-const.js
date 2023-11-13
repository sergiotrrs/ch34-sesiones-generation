console.log("var vs let vs const");
// ================ Reassigment and Redeclaration========
/*
 Declarar una variable significa que se reserva el nombre 
 en memoria en el scope actual. 
 
 Inicializar una variable es establecer el valor de la variable

*/
// Pueden ser reasignadas y redeclaradas dentro del 
// mismo contexto de función.
var userName = 10;
userName = 20; // Reasignación válida
var userName = 30; // Redeclaración válida en el mismo contexto de función

// Pueden ser reasignadas dentro del mismo bloque y no pueden 
// ser redeclaradas en el mismo ámbito.
let age = 10;
age = 20; // Reasignación válida
// let age = 30; // Error: No se puede redeclarar en el mismo ámbito

// No pueden ser reasignadas después de su inicialización y tampoco 
// pueden ser redeclaradas en el mismo ámbito.
const address = 10;
// address = 20; // Error: No se puede reasignar
// const address = 30; // Error: No se puede redeclarar

const myArray = [2,5,6];
// myArray = "Valor string"; Error: Estamos reasignando
// myArray = [7,9]; Error: Estamos reasignando
myArray[3] = 5; // Se puede,por que los objetos son mutables.

// ================ Function Scope ====================
/*
  Variables declaradas con var, let y const tienen un alcance de función. 
  Esto significa que están limitadas al contexto de la función 
  en la que se declaran.
*/
function functionScope(){
    var myVar = 10;
    let myLet = 20;
    const myConst = 30;

    console.log(myVar);
    console.log(myLet);
    console.log(myConst);
    
}
functionScope();

// console.log(myVar); // myVar is not defined
// console.log(myLet); // myLet is not defined
// console.log(myConst); // myConst is not defined
