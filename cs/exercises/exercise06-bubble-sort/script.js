/*
Exercise # 6
Realizar una función que realice el algoritmo de burbuja.
Entrada [3, 6, 12, 5, 100, 1 ]
Salida [1, 3, 5, 6, 12, 100]

*/

const originalNumbers = [34, 22, 7, 2, 0];

function bubbleSort(numbers) {
  for (let i = 0; i < numbers.length - 1; i++) {
    for (let j = 0; j < numbers.length - 1; j++) {
      const outputTxt = `i:${i} j:${j} | ${numbers[j]} > ${numbers[j + 1]} \t\t| `;
      if (numbers[j] > numbers[j + 1]) {
        const temporal = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = temporal;
        // Opción 2 usando desestructuración:  [ a, b ] = [ b , a];
        // [ numeros[j], numeros[j+1] ] = [ numeros[j+1] , numeros[j] ] ;
      }
      console.log(outputTxt + numbers);
    }
  }
  return numbers;
}

console.log(originalNumbers);
console.log(bubbleSort(originalNumbers));

/*
La función `bubbleSort` implementa el algoritmo de ordenamiento de burbuja, 
que es un algoritmo de ordenamiento simple pero ineficiente. 
Su nombre proviene de la forma en que los elementos más pequeños "burbujean" 
gradualmente hacia la parte superior del arreglo a medida que el algoritmo avanza.

Aquí está una explicación de cómo funciona la función:

1. Se recibe como argumento un arreglo llamado `numbers` 
que contiene los elementos que se desean ordenar.

2. La función utiliza dos bucles `for` anidados. 
El bucle externo, controlado por la variable `i`, 
itera desde 0 hasta la longitud del arreglo menos 1. 
Este bucle controla el número de pasadas que se deben 
realizar a través del arreglo. En cada pasada, 
el elemento más grande se moverá a su posición final.

3. El bucle interno, controlado por la variable `j`, 
también itera desde 0 hasta la longitud del arreglo menos 1. 
Este bucle se utiliza para comparar elementos adyacentes 
y realizar el intercambio si es necesario.

4. Dentro del bucle interno, se compara si `numbers[j]` 
es mayor que `numbers[j + 1]`. Si es así, se realiza un 
intercambio de esos elementos utilizando una variable 
temporal llamada `temporal`. 
Esto asegura que el elemento más grande se mueva hacia 
la derecha en cada pasada.

5. Se imprime un mensaje que muestra la posición actual de `i` y `j`, 
junto con una representación visual de la comparación y 
el estado actual del arreglo.

6. La función continúa realizando pasadas a través del 
arreglo hasta que todos los elementos estén en su posición ordenada.

7. Finalmente, la función devuelve el arreglo ordenado.

Es importante destacar que el algoritmo de ordenamiento 
de burbuja no es eficiente para arreglos grandes y suele 
ser superado por otros algoritmos más eficientes, 
como el ordenamiento rápido o el ordenamiento por mezcla. 
Sin embargo, es un buen ejemplo para comprender 
los conceptos básicos de los algoritmos de ordenamiento.

************** Nota del uso de numbers.length - 1 ******************

La razón por la que se realiza numbers.length - 1 en el bucle for 
es porque el algoritmo de ordenamiento de burbuja compara elementos 
adyacentes en el arreglo, y no es necesario comparar 
el último elemento con el elemento siguiente a él.

Dado que estamos comparando el elemento actual con 
el siguiente (por ejemplo, numbers[j] con numbers[j + 1]), 
al llegar al último elemento del arreglo, no hay un "siguiente" 
elemento para comparar. Por lo tanto, no es necesario 
realizar la última comparación, ya que ya se ha colocado 
el elemento más grande en su posición correcta durante las iteraciones anteriores.

Entonces, numbers.length - 1 se utiliza para asegurarse de que no se 
realice una comparación innecesaria en la última posición del arreglo, 
lo que ahorra tiempo y optimiza el rendimiento del algoritmo.

*/