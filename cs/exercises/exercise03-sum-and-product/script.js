/*
Exercise #3

Write a program to compute the sum and product (multiplication) 
of an array of numbers. Print out the sum and the product.

Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
*/


const numbers = [1, 2, 3, 4];


// ==================== Solution 1 ============================
/**
 * Calcula la sumatoria de un array de números.
 *
 * @param {number[]} numbers - Array de números a sumar.
 * @returns {number} - Suma de los números en el array.
 */
function calculateSum(numbers) {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum += numbers[i]; // sum = suma + numbers[i]
  }
  return sum;
}

/**
 * Calcula el producto (multiplicación) de un array de números.
 *
 * @param {number[]} numbers - El array de números a multiplicar.
 * @returns {number} - El producto de los números en el array.
 */
function calculateProduct(numbers) {
  let product = 1;
  for (let i = 0; i < numbers.length; i++) {
    product *= numbers[i]; // product = product * numbers[i]
  }
  return product;
}

const sum = calculateSum(numbers);
const product = calculateProduct(numbers);

console.log(`The sum is ${sum}.`); // The sum is 10.
console.log(`The product is ${product}.`); // The product is 24.

// ==================== Solution 2 ============================

/**
 * Calculate the sum of an array of numbers using the reduce method.
 *
 * @param {number[]} numbers - The array of numbers to sum.
 * @returns {number} - The sum of the numbers in the array.
 */
function calculateSumUsingReduce(numbers) {
  const initialValue = 0;
  return numbers.reduce((accumulator, currentValue) => accumulator + currentValue, initialValue);
}

/**
 * Calculate the product (multiplication) of an array of numbers using the reduce method.
 *
 * @param {number[]} numbers - The array of numbers to multiply.
 * @returns {number} - The product of the numbers in the array.
 */
function calculateProductUsingReduce(numbers) {
  const initialValue = 1;
  return numbers.reduce((accumulator, currentValue) => accumulator * currentValue, initialValue);
}


const sumUsingReduce = calculateSumUsingReduce(numbers);
const productUsingReduce = calculateProductUsingReduce(numbers);

console.log(`The sum is ${sumUsingReduce}.`);
console.log(`The product is ${productUsingReduce}.`);
