                     // frase: Anita lava la tina
const esPalindromo = ( frase ) => {
    // toLowerCase():  Normalizando a minúsculas
    // replace(/\s/g, '')  quitar los espacios
    // replaceAll(" ", "")
    frase = frase.toLowerCase().replace(/\s/g, '');
    // frase: anitalavalatina

    // split() : convierte el texto en array, con el separador
    //          [ a, n, ,i , t ....., n, a]
    // reverse() : intercambia el orden de los elementos
    //          [ a, n ..... t, i, n, a]
    // join(): Convierte un arreglo a string, usando un separador
    //          fraseAlRevez : anitalavalatina                
    fraseAlRevez = frase.split('').reverse().join('')
            
    return frase === fraseAlRevez ;
}

module.exports = { esPalindromo };