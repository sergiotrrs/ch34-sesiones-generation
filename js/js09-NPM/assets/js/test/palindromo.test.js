
/*
 TDD, o Desarrollo Guiado por Pruebas (Test-Driven Development, en inglés), 
 es una metodología de desarrollo de software que pone un fuerte énfasis 
 en la creación de pruebas automatizadas antes de escribir el código de 
 producción.

*/

// importar la función
// palíndromo: Palabra o frase que se lee igual de derecha a izquierda, ej. oso

const { esPalindromo} = require("../palindromo");

test ("Verificar si una palabra es palíndromo en minusculas", ()=>{
    expect ( esPalindromo("oso") ).toBe(true) ;
    expect ( esPalindromo("solos") ).toBe(true);
    expect ( esPalindromo("hola") ).toBe(false);
});

test ("Verificar si una palabra es palíndromo en tipo Titulo", ()=>{
    expect ( esPalindromo("Bob") ).toBe(true);
    // expect ( esPalindromo("Radar") ).toBe(true);
    expect ( esPalindromo("Radar") ).toBeTruthy();
    expect ( esPalindromo("Ciruela") ).toBeFalsy();
});

test ("Verificar si una frase es palíndromo", ()=>{
    expect ( esPalindromo("Luz azul") ).toBe(true);
    expect ( esPalindromo("Anita lava la tina") ).toBe(true);
    expect ( esPalindromo("La ruta natural") ).toBeTruthy();
    expect ( esPalindromo("La Ch34 rifa") ).toBeFalsy();
});