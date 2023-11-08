/*
Exercise #1

Copy the code below into your workspace:

let arr = ["This", "is", "a", "sentence."];
    function printOutString() {
    // your code here
    }

printOutString();

Complete the function to print out the string: This is a sentence.
*/

const arr = ["This", "is", "a", "sentence."];

// ==================== Solution 1 ============================
/**
 * Se itera el arreglo usando el ciclo for y concatenado cada
 * uno de las palabras, sin embargo, para evitar que quede un
 * espacio al inicio o al final de la frase, se realiza
 * una evaluación para que antes de concatenar la siguiente palabra
 * se agregue un espacio excepto en el índice 0 (inicio de la oración).
 * 
 * @param {string[]} arr - Array de entrada con las palabras que se concatenarán.
 * @returns {string} - Frase final con las palabras concatenadas, separadas por un espacio.
 */
function printOutStringUsingFor(array) {
  let phrase = "";
  for (let index = 0; index < array.length; index++) {
    if (index != 0) {
      phrase = phrase + " ";
    }
    phrase = phrase + array[index];
  }
	return phrase;
}

console.log(printOutStringUsingFor(arr));
console.log(printOutStringUsingFor(arr).length);


// ==================== Solution 2 ============================
/**
 *  El método join() en JavaScript se utiliza para combinar todos los elementos
 *  de un arreglo en una sola cadena y devolver esa cadena como resultado.
 *  Este método toma un argumento opcional que especifica el separador que
 *  se utilizará para unir los elementos del arreglo.
 * 
 *  @param {string[]} arr - Array de entrada con las palabras que se concatenarán.
 *  @returns {string} - Frase final con las palabras concatenadas, separadas por un espacio.
 * 
 */
function printOutString(array) {
  return array.join(" ");
}

console.log(printOutString(arr));
console.log(printOutString(arr).length);


