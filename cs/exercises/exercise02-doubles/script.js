/*
Exercise #2

Write a function that:
•	Takes in an array of numbers.
•	Doubles the value of each number in the array.
•	Prints out the new updated array.
Example: Given an array [1, 2, 4, 5]. The output should be [2, 4, 8, 10]
*/

const originalArray = [1, 2, 4, 5];


// ==================== Solution 1 ============================
/**
 * Duplica los valores de un array y devuelve un nuevo array 
 * con los valores duplicados.
 *
 * @param {number[]} arr - Array de entrada que se duplicará.
 * @returns {number[]} - Nuevo array con los valores duplicados.
 */
function duplicateArrayValues(arr) {
  // Crea un nuevo array para almacenar los valores duplicados.
  const duplicatedArray = [];

  // Recorre el array original y duplica cada elemento.
  for (let i = 0; i < arr.length; i++) {
    duplicatedArray.push(arr[i] * 2); // Duplica el elemento
  }
  return duplicatedArray;
}

const duplicated = duplicateArrayValues(originalArray);
console.log(duplicated); // Mostrará [2, 4, 8, 10]

// ==================== Solution 2 ============================
/**
 * Duplicates the values of an array and returns a new array 
 * with the duplicated values using the map method.
 *
 * @param {number[]} arr - The input array to be duplicated.
 * @returns {number[]} - A new array with the duplicated values.
 */
function duplicateArrayValuesUsingMap(arr) {
  // Utiliza el método map para duplicar cada elemento del array.
  // La función map crea un nuevo array con los valores duplicados.
  const duplicatedArray = arr.map ( value => value * 2 );

  return duplicatedArray
}

const duplicatedArray = duplicateArrayValuesUsingMap(originalArray);
console.log(duplicatedArray); // Mostrará [2, 4, 8, 10]